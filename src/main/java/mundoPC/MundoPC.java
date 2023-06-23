package mundoPC;
import com.gm.mundopc.*;
public class MundoPC {
    public static void main(String[] args) {

        Raton raton1 = new Raton("USB", "Genius");
        Raton raton2 = new Raton("PS/2", "Genius");
        Raton raton3 = new Raton("USB", "Dell");
        Raton raton4 = new Raton("USB","Microsoft");

        Teclado teclado1 = new Teclado("USB", "Genius");
        Teclado teclado2 = new Teclado("USB","Microsoft");
        Teclado teclado3 = new Teclado("PS/2", "Dell");

        Monitor monitor1 = new Monitor("Samsung", 27.00);
        Monitor monitor2 = new Monitor("LG", 27.00);

        Computadora computadoraAmecro1 = new Computadora("AmecroMutual", monitor1, teclado1, raton1);
        Computadora computadoraAmecro2 = new Computadora("AmecroMutual", monitor2, teclado1, raton1);
        Computadora computadoraAmecro3 = new Computadora("AmecroMutual", monitor1, teclado1, raton4);
        Computadora computadoraAmecro4 = new Computadora("AmecroMutual", monitor2, teclado1, raton4);
        Computadora computadoraAmecro5 = new Computadora("AmecroMutual", monitor2, teclado1, raton2);
        Computadora computadoraAmecro6 = new Computadora("AmecroMutual", monitor1, teclado1, raton3);
        Computadora computadoraAmma1 = new Computadora("AMMA",monitor1, teclado3, raton2);
        Computadora computadoraAmma2 = new Computadora("AMMA",monitor1, teclado3, raton2);
        Computadora computadoraAec1 = new Computadora("Aec", monitor2, teclado2, raton4);
        Computadora computadoraAec2 = new Computadora("Aec", monitor1, teclado2, raton3);
        Computadora computadoraAec3 = new Computadora("Aec", monitor2, teclado2, raton3);
        Computadora computadoraAec4 = new Computadora("Aec", monitor2, teclado1, raton4);
        Computadora computadoraAec5 = new Computadora("Aec", monitor1, teclado3, raton2);
        Computadora computadoraAec6 = new Computadora("Aec", monitor2, teclado1, raton1);
        Computadora computadoraZavalla1 = new Computadora("Zavalla",monitor1, teclado2, raton4);
        Computadora computadoraZavalla2 = new Computadora("Zavalla",monitor2, teclado1, raton2);
        Computadora computadoraZavalla3 = new Computadora("Zavalla",monitor2, teclado3, raton3);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        orden1.agregarComputadora(computadoraAmecro1);
        orden1.agregarComputadora(computadoraAmecro2);
        orden1.agregarComputadora(computadoraAmecro3);
        orden1.agregarComputadora(computadoraAmecro4);
        orden1.agregarComputadora(computadoraAmma1);
        orden1.agregarComputadora(computadoraAec1);
        orden1.agregarComputadora(computadoraAec2);
        orden1.agregarComputadora(computadoraAec3);
        orden1.agregarComputadora(computadoraAec4);
        orden1.agregarComputadora(computadoraAec5);
        orden2.agregarComputadora(computadoraZavalla1);
        orden2.agregarComputadora(computadoraZavalla2);
        orden2.agregarComputadora(computadoraZavalla3);
        orden3.agregarComputadora(computadoraAmecro5);
        orden3.agregarComputadora(computadoraAmecro6);
        orden3.agregarComputadora(computadoraAmma2);
        orden3.agregarComputadora(computadoraAec6);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();

    }
}
