package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	/*
	 * metodo para retornar uma conexao com
	 * o banco de dados do postgreSQL
	 * 
	 */
	public Connection getConnection() {
		
		//variaveis
		var host = "jdbc:postgresql://localhost:5432/bdpedidos";
		var user = "postgres";
		var pass = "coti";
		
		//abrir e retornar a conexao com o banco de dados
		try {
			
			return DriverManager.getConnection(host, user, pass);
			
		}
		catch (Exception e) {
			System.out.println("\nFalha ao conectar com o PostgreSQL: " + e.getMessage());
			return null;
		}
	}

}
