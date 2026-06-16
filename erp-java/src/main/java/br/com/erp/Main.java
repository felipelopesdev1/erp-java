package br.com.erp;

import br.com.erp.model.Cargo;

import br.com.erp.model.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "felipe",
                "felipe@gmail.com",
                "12345a",
                Cargo.GERENTE,
                true
        );
   
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getCargo());
        System.out.println(usuario.isAtivo());

    }


}
