package com.ifpb.budega.visao;

import com.ifpb.budega.conexao.Conexao;
import com.ifpb.budega.visaoCadastrar.CadastrarFuncionario;

import javax.swing.*;
import java.sql.ResultSet;
import java.time.LocalDate;

public class teste {

    public static void main(String [] args){
        Conexao con = new Conexao();
        JFrame tela = new JFrame();
        tela.setContentPane(new CadastrarFuncionario().getPanel1());
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }

    public void Cadastrar(String cpf, String nome, LocalDate ingresso, Conexao con){
        String sql = "INSERT INTO funcionario(cpf, nome, ingresso) values(" + cpf + ", " + nome + ", " + ingresso + ")";
        int res = con.executaSQL(sql);
        if (res > 0){
            System.out.println("Cadastrado com sucesso!!!");
        }else{
            System.out.println("Erro ao cadastrar!!!");
        }
    }

//    public void Buscar(Conexao con){
//        String sql = "SELECT * FROM funcionario";
//        ResultSet rs = con.executaBusca(sql);
//
//        try{
//            while (rs.next()) {
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                String ingresso = rs.getString("ingresso");
//                System.out.println("Nome:" + nome + "\nCPF:" + cpf + "\nData de ingresso" + ingresso + "\n");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    public void Alterar(Conexao con){
//        String sql = "SELECT * FROM funcionario";
//        ResultSet rs = con.executaBusca(sql);
//
//        try{
//            while (rs.next()) {
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                String ingresso = rs.getString("ingresso");
//                System.out.println("Nome:" + nome + "\nCPF:" + cpf + "\nData de ingresso" + ingresso + "\n");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void Deletar(String nome, Conexao con){
//        String sql = "DELETE * FROM funcionario WHERE nome ="+nome+"";
//        ResultSet rs = con.executaBusca(sql);
//
//        try{
//            System.out.println("Funcionario deletado com sucesso");
//            }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
