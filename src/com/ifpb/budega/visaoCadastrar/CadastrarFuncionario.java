package com.ifpb.budega.visaoCadastrar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarFuncionario {
    private JButton btnCadastrar;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel jTextCpf;
    private JLabel jTextNome;

    public CadastrarFuncionario() {
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Meu ovo!");
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

