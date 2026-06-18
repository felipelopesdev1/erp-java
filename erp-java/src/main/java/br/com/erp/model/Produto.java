package br.com.erp.model;

import java.math.BigDecimal;

public class Produto {

    // =====================
    // ATTRIBUTES
    // =====================

    private static Long proximoId = 1L;

    private Long id;
    private String nome;
    private BigDecimal preco;
    private int estoque;

    public Produto(String nome, BigDecimal preco, int estoque){
        this.id = proximoId++;

        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    }

    // =====================
    // GETTERS
    // =====================

    public Long getId(){
        return id;
    }

    public String getNome(){
        return  nome;
    }

    public BigDecimal getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
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

    public void setPreco(BigDecimal preco){
        if (preco == null){
            throw new IllegalArgumentException(
                    "Preco nao pode ser nulo");
        }

        if(preco.compareTo(BigDecimal.ZERO) <=0){
            throw new IllegalArgumentException(
                    "O preco deve ser maior que 0"
            );
        }

        this.preco = preco;
    }

    public void setEstoque(int estoque){
        if(estoque < 0){
            throw new IllegalArgumentException(
                    "O estoque nao pode ser negativo"
            );
        }

        this.estoque = estoque;
    }

}
