package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("Oracle DB");
		OracleDBFactory oracleDBFactory = new OracleDBFactory();
		DB oracleDB = oracleDBFactory.getDatabase();
		oracleDB.query("SELECT * FROM PRODUTCS");

		System.out.println("Postgres DB");
		DBFactory postgresDBFactory = new PostgresDBFactory();
		DB postgresDB = postgresDBFactory.getDatabase();
		postgresDB.update("UPDATE PRODUCTS SET NAME = 'Teste' WHERE ID = 10");

	}
}
