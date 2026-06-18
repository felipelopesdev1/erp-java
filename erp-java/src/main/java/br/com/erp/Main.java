package br.com.erp;

import br.com.erp.model.Cargo;
import br.com.erp.model.Usuario;
import br.com.erp.model.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "João Silva",
                "joao@gmail.com",
                true,
                "12345678901",
                "11999999999",
                "Rua A, 123"
        );

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEndereco());
    }
}