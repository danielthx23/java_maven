package br.com.fiap.to;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class ItemVendidoTO {

    @NotNull
    private Long codVenda;

    @NotNull
    private Long codRemedio;

    @PositiveOrZero
    private int quantidade;

    public ItemVendidoTO() {
    }

    public ItemVendidoTO(int quantidade, Long codRemedio, Long codVenda) {
        this.quantidade = quantidade;
        this.codRemedio = codRemedio;
        this.codVenda = codVenda;
    }

    public Long getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Long codVenda) {
        this.codVenda = codVenda;
    }

    public Long getCodRemedio() {
        return codRemedio;
    }

    public void setCodRemedio(Long codRemedio) {
        this.codRemedio = codRemedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
