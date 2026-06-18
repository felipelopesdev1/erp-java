package br.com.erp.model;

public class Cliente extends Pessoa {

    // =====================
    // ATTRIBUTES
    // =====================

    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String email, boolean ativo,
                    String cpf, String telefone, String endereco){
        super(nome, email, ativo);

        setCpf(cpf);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    // =====================
    // GETTERS
    // =====================

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    // =====================
    // SETTERS
    // =====================

    public void setCpf(String cpf){

        if (cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException(
                    "CPF nao pode estar vazio");
        }

        if (cpf.length() != 11){
            throw new IllegalArgumentException(
                    "CPF deve conter 11 digitos"
            );
        }

        this.cpf = cpf;
    }

    public void setTelefone(String telefone){

        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException(
                    "Telefone nao pode estar vazio"
            );
        }

        if (telefone.length() != 11){
            throw new IllegalArgumentException(
                    "Telefone deve conter 11 digitos"
            );
        }

        this.telefone = telefone;
    }

    public void setEndereco(String endereco){

        if(endereco == null || endereco.isBlank()){
            throw new IllegalArgumentException(
                    "Endereco nao pode ser vazio"
            );
        }

        this.endereco = endereco;
    }

}
