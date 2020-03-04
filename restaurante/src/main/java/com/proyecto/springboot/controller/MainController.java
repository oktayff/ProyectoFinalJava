package com.proyecto.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.springboot.dto.CarritoDTO;
import com.proyecto.springboot.dto.CategoriasDTO;
import com.proyecto.springboot.dto.PedidosProductosDTO;
import com.proyecto.springboot.dto.ProductosDTO;
import com.proyecto.springboot.dto.RestaurantesDTO;
import com.proyecto.springboot.service.CategoriasService;
import com.proyecto.springboot.service.EmailService;
import com.proyecto.springboot.service.PedidosProductosService;
import com.proyecto.springboot.service.ProductosService;
import com.proyecto.springboot.service.RestaurantesService;

/**
 * 
 * @author Oktay
 * 
 */

// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
@RestController
public class MainController {
	
	/** The next. */
	String next = null;
	
	/** The cat service. */
	// Import servicios
	@Autowired
	CategoriasService catService;
	
	/** The res service. */
	@Autowired
	RestaurantesService resService;
	
	/** The pro service. */
	@Autowired
	ProductosService proService;
	
	/** The pp service. */
	@Autowired
	PedidosProductosService ppService;
	
	/** The es. */
	@Autowired
	EmailService es;
	
	/** The cart. */
	CarritoDTO cart = new CarritoDTO();
	
	/**
	 * Home.
	 *
	 * @param model the model
	 * @return the model and view
	 */
	// Método que dirige a la pagina principal.
	@RequestMapping(value="/")
	public ModelAndView home(Model model) {
		RestaurantesDTO resDTO = new RestaurantesDTO();
		model.addAttribute("restaurantes", resDTO);
	
		return new ModelAndView("index");
	}
	
	/**
	 * Lista categorias.
	 *
	 * @param resDTO the res DTO
	 * @param request the request
	 * @return the model and view
	 */
	// Método que muestra la lista de todas las categorías disponibles en nuestra aplicación.
	@PostMapping("/listaCategorias")
	public ModelAndView listaCategorias(@ModelAttribute("restaurantes") RestaurantesDTO resDTO, HttpServletRequest request) {
		
		HttpSession session = request.getSession(true);
		RestaurantesDTO restDTO = resService.obtenerUsuario(resDTO);
		List<CategoriasDTO> cateDTO = null;
		if(restDTO != null) {
			session.setAttribute("user", restDTO);
			cateDTO = catService.getAllCategorias();
			request.setAttribute("categorias", cateDTO);
			next = "listaCategorias";
		}else {
			request.setAttribute("msg", "Usuario inexistente");
			next = "index";
		}
		
		return new ModelAndView(next);
	}
	
	/**
	 * Ver categorias.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	// Método que se usa para la redirecció a la sección "Home".
	@GetMapping("/verCategorias")
	public ModelAndView verCategorias(HttpServletRequest request) {
		
		List<CategoriasDTO> cateDTO = catService.getAllCategorias();
		request.setAttribute("categorias", cateDTO);
		
		return new ModelAndView("listaCategorias");
	}
	
	/**
	 * Productos categoria.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param request the request
	 * @return the model and view
	 */
	// Método que muestra los productos que pertenecen a una categoría determinada.
	@GetMapping("/productosCategoria")
	public ModelAndView productosCategoria(@RequestParam int id, String nombre, String descripcion, HttpServletRequest request) {
		List<ProductosDTO> prodDTO = proService.getAllProductosByCategoria(new CategoriasDTO(id, nombre, descripcion));
		request.setAttribute("productos", prodDTO);
		request.setAttribute("categorias", new CategoriasDTO(id, nombre, descripcion));
		
		return new ModelAndView("productos", "productos", prodDTO);
	}
	
	/**
	 * Anadir producto.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	// Método que sirve para poder añadir un producto.
	@PostMapping("/anadirProducto")
	public ModelAndView anadirProducto(HttpServletRequest request) {
		cart.anadirProducto(new ProductosDTO(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"), request.getParameter("descripcion"), Integer.parseInt(request.getParameter("peso")), Integer.parseInt(request.getParameter("stock"))), Integer.parseInt(request.getParameter("unidades")));
		this.productosCategoria(Integer.parseInt(request.getParameter("idCategoria")), request.getParameter("nombreCategoria"), request.getParameter("descripcionCategoria"), request);
		System.out.println(cart);
		
		return new ModelAndView("productos");	
	}
	
	/**
	 * Mostrar carrito.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	// Método que muestra los productos que hemos añadido a nuestro pedido o carrito.
	@GetMapping("/mostrarCarrito")
	public ModelAndView mostrarCarrito(HttpServletRequest request) {
		List<PedidosProductosDTO> carritoConProductos = cart.obtenerCarritoCompra(); 
		request.setAttribute("carrito", carritoConProductos);
		
		return new ModelAndView("carrito");
	}
	
	/**
	 * Eliminar unidades.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	// Método que nos permite elegir las unidades que queremos eliminar de un producto añadido al carrito.
	@PostMapping("/eliminarUnidades")
	public ModelAndView eliminarUnidades(HttpServletRequest request) {
		cart.eliminarProducto(new ProductosDTO(Integer.parseInt(request.getParameter("id")), request.getParameter("nombre"), request.getParameter("descripcion"), Integer.parseInt(request.getParameter("peso")), Integer.parseInt(request.getParameter("stock"))), Integer.parseInt(request.getParameter("unidades")));
		this.mostrarCarrito(request);
		
		return new ModelAndView("carrito");
	}
	
	/**
	 * Realizar pedido.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	// Método que introduce el pedido en la base de datos una vez que el usuario presiona "Realizar pedido".
	@GetMapping("/realizarPedido")
	public ModelAndView realizarPedido(HttpServletRequest  request) {
		
		List<PedidosProductosDTO> carrito = cart.obtenerCarritoCompra();
		HttpSession session = (HttpSession) request.getSession();
		RestaurantesDTO user = (RestaurantesDTO) session.getAttribute("user");
		
		try {
			
			ppService.insertarPedidoBD(user, carrito);
			request.setAttribute("msg", "Pedido realizado con éxito");
			es.enviarCorreo(user.getCorreo());
			cart.vaciarCarritoCompra();
		}catch(RuntimeException e) {
			e.printStackTrace();
			request.setAttribute("msg", "Se ha producido un error al tramitar su pedido, disculpe las molestias");
		}
		
		return new ModelAndView("pedido");
	}
	
	
	/**
	 * Close session.
	 *
	 * @param request the request
	 * @param model the model
	 * @return the model and view
	 */
	// Método que cierra la sesión del usuario
	@GetMapping("/closeSession")
	public ModelAndView closeSession(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		 	
		session.invalidate();
		
		model.addAttribute("restaurantes", new RestaurantesDTO());
		
		request.setAttribute("msg", "La sesión se cerró correctamente, hasta la próxima");
		
		return new ModelAndView("index");
			
	}
}