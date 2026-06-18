package br.com.erp.model;

public abstract class Pessoa {

    private String nome;
    private String email;
    private boolean ativo;

    // =====================
    // CONSTRUCTOR
    // =====================

    public Pessoa(String nome, String email, boolean ativo) {
        setNome(nome);
        setEmail(email);
        setAtivo(ativo);
    }

    // =====================
    // GETTERS
    // =====================

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // =====================
    // SETTERS
    // =====================

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O e-mail não pode estar vazio");
        }

        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("E-mail inválido");
        }

        this.email = email;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}