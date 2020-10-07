package cellit.proyectos.ejemplos.proyecto02;

import java.util.Scanner;

import com.google.gson.Gson;

import Tienda.*;

/**
 * CELL IT!
 * Vamos a transformar objetos a json, usando la libreria de Gson de Google.
 * Nos Conectaremos a la base de datos de MongoDB.
 * Configuremos el JDK 1.8 
 * Importemos el proyecto a un repositorio Git Hub 
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	//TODO vamos a crear una tienda
    	
    	
    	System.out.println("Bienvenido a miTienda");
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese su nombre");
    	String name_cliente = scanner.nextLine();
    	System.out.println("Ingrese su apellido");
    	String apellido_cliente = scanner.nextLine();
    	System.out.println("Cree una clave");
    	String clave_cliente = scanner.nextLine();
    	System.out.println("Gracias, Datos Guardados");
    	
    	//Tienda   tda  = new Tienda();
    	Cliente  cli  = new Cliente();
    	
    	cli.setNombre(name_cliente);
    	cli.setApellido(apellido_cliente);
    	cli.setClave(clave_cliente);
    	
    	//Producto prod = new Producto();
    	
    	//Ahora crearemos el objeto en formato json
    	
    	System.out.println("Creando json..");
    	Gson gson = new Gson();
    	String jsonString = gson.toJson(cli);
    	System.out.println(jsonString);
    	
    	
    	
    	
    	
    	
    }
}
