package br.com.erp.model;

public class Usuario {


    private String nome;
    private String email;
    private String senha;
    private Cargo cargo;
    private boolean ativo;

    public Usuario(String nome, String email, String senha, Cargo cargo, boolean ativo){
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setCargo(cargo);
        this.ativo = ativo;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public Cargo getCargo(){
        return cargo;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setNome(String nome){

        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException(
                    "O nome não pode ser vazio"
            );
        }

        this.nome = nome;
    }

    public void setEmail(String email){

        if(email == null || email.isBlank()){
            throw new IllegalArgumentException(
                    "O e-mail não pode estar vazio"
            );
        }

        if(!email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException(
                    "E-mail invalido"
            );
        }

        this.email = email;
    }

    public void setCargo(Cargo cargo){

        if(cargo == null ){
            throw new IllegalArgumentException(
                    "Não pode estar vazio"
            );
        }

        this.cargo = cargo;
    }

    public void setSenha(String senha){

        if(senha == null || senha.isBlank()) {
            throw new IllegalArgumentException(
                    "A senha não pode ter espacos"
            );
        }

        if(senha.length()<6){
            throw new IllegalArgumentException(
                    "A senha deve conter pelo menos 6 caracteres"
            );
        }

        this.senha=senha;

    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
