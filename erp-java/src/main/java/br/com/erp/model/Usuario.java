package br.com.erp.model;

public class Usuario extends Pessoa {

    // =====================
    // ATTRIBUTES
    // =====================

    private String senha;
    private Cargo cargo;

    public Usuario(String nome, String email, boolean ativo,
                   String senha, Cargo cargo) {

        super(nome, email, ativo);

        setSenha(senha);
        setCargo(cargo);
    }

    // =====================
    // GETTERS
    // =====================

    public Cargo getCargo() {
        return cargo;
    }

    public String getSenha() {
        return senha;
    }

    // =====================
    // SETTERS
    // =====================

    public void setCargo(Cargo cargo) {
        if (cargo == null) {
            throw new IllegalArgumentException("O cargo não pode ser nulo");
        }
        this.cargo = cargo;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("A senha não pode estar vazia");
        }

        if (senha.length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres");
        }

        this.senha = senha;
    }
}