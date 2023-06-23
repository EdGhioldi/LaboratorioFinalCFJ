package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" { ");
        sb.append(" Id Raton: ").append(idRaton);
        sb.append(", Tipo de Entrada: '").append(tipoEntrada).append('\'');
        sb.append(", Marca: '").append(marca).append('\'');
        sb.append(" } ");
        return sb.toString();
    }
}
