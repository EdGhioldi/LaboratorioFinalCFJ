package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private static int contadorOrdenes;
    private Computadora[] computadoras;
    private int contadorComputadora;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadoras){
        if(this.contadorComputadora < MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadora++] = computadoras;
        }else{
            System.out.println("Orden Completa" + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println( "\n" + "Id Orden: " + idOrden);
        System.out.println("Computadoras de la orden: " + "\n");
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
