package cellit.proyectos.ejemplos.proyecto02;

import com.mongodb.*;

public class MongoConexion {

	public static void main(String[] args) {
		// TODO ahora nos conectaremos a MongoDB.

		try {
			System.out.println("Iniciando conexion a la base de datos...");
			MongoClient mongoCliente = new MongoClient("localhost",27017);
			System.out.println("Conexion a localhost establecida");
			
			DB db = mongoCliente.getDB("miTienda");
			DBCollection coll = db.getCollection("cliente");
			DBCursor cursor = coll.find();
			
			while(cursor.hasNext()) {
				int i=1;
				System.out.println(cursor.next());
				i++;
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
