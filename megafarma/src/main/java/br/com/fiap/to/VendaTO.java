package br.com.fiap.to;

import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class VendaTO {

    private Long codigo;

    @PastOrPresent
    private LocalDate dataDeVenda;

    private Long codCliente;

    public VendaTO() {
    }

    public VendaTO(Long codigo, LocalDate dataDeVenda, Long codCliente) {
        this.codigo = codigo;
        this.dataDeVenda = dataDeVenda;
        this.codCliente = codCliente;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataDeVenda() {
        return dataDeVenda;
    }

    public void setDataDeVenda(LocalDate dataDeVenda) {
        this.dataDeVenda = dataDeVenda;
    }

    public Long getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }
}
