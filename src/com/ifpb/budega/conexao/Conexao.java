package com.ifpb.budega.conexao;

import java.sql.*;

public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    public Conexao() {
        this.url = "jdbc:postgresql://localhost:5432/Budega";
        this.usuario = "postgres";
        this.senha = "admin123";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conectado meu patraum!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int executaSQL(String sql){
        try{
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet executaBusca(String sql){
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            return rs;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
