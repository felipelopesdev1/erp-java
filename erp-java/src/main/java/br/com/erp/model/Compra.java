package br.com.erp.model;
import java.time.LocalDate;

public class Compra {

    // =====================
    // ATTRIBUTES
    // =====================

    private static Long proximoId = 1L;

    private Long id;
    private LocalDate data;
    private Cliente cliente;

    public Compra(Cliente cliente){

        this.id = proximoId++;
        this.data = LocalDate.now();

        setCliente(cliente);
    }

    // =====================
    // GETTERS
    // =====================

    public Long getId(){
        return id;
    }

    public LocalDate getData(){
        return data;
    }

    public Cliente getCliente(){return cliente;}

    // =====================
    // SETTERS
    // =====================

    public void setCliente(Cliente cliente){
        if(cliente == null){
            throw new IllegalArgumentException(
                    "A compra deve ter um cliente"
            );
        }
        this.cliente = cliente;
    }

}
