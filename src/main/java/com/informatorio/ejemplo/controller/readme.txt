Esta clase es muy importante es como la view en Django, es aquella la cual me devuelve el metodo
con una logica incorporada que haga "algo" a traves de una URL que definimos nosotros.

Supongamos que queremos sacar un listado de ofertas del mes. 
Así, el esqueleto básico de nuestro Controller sería: 



import es.ua.jtech.spring.negocio.IGestorOfertas;
 
@Controller
@RequestMapping("/listaOfertas.do")
public class ListaOfertasController  {
   @Autowired
   private IGestorOfertas miGestor;
    
   ...
}

--> La anotación @Controller indica que la clase es un bean controlador y 
nos ahorra el trabajo de definir en XML el bean correspondiente. 

--> Con @RequestMapping asociamos una URL a este controlador.

