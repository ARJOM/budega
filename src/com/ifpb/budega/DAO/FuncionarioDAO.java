package com.ifpb.budega.DAO;

import com.ifpb.budega.modelo.Funcionario;
import java.util.HashSet;
import java.util.Set;

public class FuncionarioDAO {

    private Set<Funcionario> funcionarios;

    public FuncionarioDAO() {
        funcionarios = new HashSet<>();
    }

    public boolean Cadastrar(Funcionario funcionario){
        return funcionarios.add(funcionario);
    }

}
