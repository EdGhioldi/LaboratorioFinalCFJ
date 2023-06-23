package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;

    public Raton(){
        this.idRaton = ++this.contadorRaton;
    }
    public Raton(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", tipoEntrada='").append(tipoEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
