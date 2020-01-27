package teste;

import java.sql.Connection;

import conexao.DB;

public class PrincipalTeste {
    public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
	}
}
