package com.ifpb.budega.visaoCadastrar;

import com.ifpb.budega.conexao.Conexao;
import com.ifpb.budega.visao.teste;
import com.ifpb.budega.modelo.Funcionario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class CadastrarFuncionario {
    private JButton btnCadastrar;
    private JPanel panel1;
    private JTextField jTextCpf;
    private JTextField jTextNome;
    private JLabel labelCpf;
    private JLabel labelNome;

    public CadastrarFuncionario() {

        Funcionario funcionarios = new Funcionario();
        teste testar = new teste();
        Conexao con = new Conexao();

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = jTextCpf.getText();
                String nome = jTextNome.getText();
                String ingresso = "02/04/2012";

                funcionarios.setCpf(cpf);
                funcionarios.setNome(nome);
                funcionarios.setIngresso(ingresso);


                String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                boolean ehValido = true;

                String[] numeros = cpf.split("");
                for (String numero : numeros) {
                    System.out.println(numero);
                    for (String a : num) {
                        System.out.println(num);
                        if (!numero.equals("-") && !numero.equals(".")) {
                                try {
                                    int numeral = Integer.parseInt(numero);
                                } catch (Exception b) {
                                    ehValido = false;
                                }
                        }
                    }
                }
//                for (int i = 0; i< resultado.length; i++) {
//                    try {
//                        int num = Integer.parseInt(resultado[i]);
//                        System.out.println(num);
//                    } catch (Exception b) {
//                        ehValido = false;
//                    }
//                }
                System.out.println(ehValido);


                boolean nomeEhValido = true;
                String[] letras = nome.split("");
                for (String letra : letras) {
                    for (String a : num) {
                        if (letra.equals(a)) {
                            nomeEhValido = false;
                            break;
                        }
                    }
                }

                if (!nomeEhValido){
                    JOptionPane.showMessageDialog(null, "Nome inválido",
                            "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
                }else if (!(ehValido)|| cpf.length()!=14){
                    JOptionPane.showMessageDialog(null, "CPF inválido",
                            "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
                }else if (cpf.equals("") || nome.equals("")){
                    JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios",
                            "Preencha os campos", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    testar.Cadastrar(cpf, nome, ingresso, con);
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
}

