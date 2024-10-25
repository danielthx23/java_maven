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
}
