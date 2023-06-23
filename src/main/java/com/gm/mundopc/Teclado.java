package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados;

    private Teclado() {
        this.idTeclado = ++this.contadorTeclados;
    }

    public Teclado(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" { ");
        sb.append(" Id Teclado: ").append(idTeclado);
        sb.append(", Tipo de Entrada: '").append(tipoEntrada).append('\'');
        sb.append(", Marca: '").append(marca).append('\'');
        sb.append(" } ");
        return sb.toString();
    }
}
