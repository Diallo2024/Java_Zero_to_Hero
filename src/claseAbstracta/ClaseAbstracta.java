package claseAbstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {

        ClaseAbstracta instancia = new ClaseAbstracta();

        // Instancia de Rectangulo
        FiguraGeometrica figuraRectangulo = instancia.new Rectangulo();
        figuraRectangulo.dibujar();

        // Instancia de Circulo
        FiguraGeometrica figuraCirculo = instancia.new Circulo();
        figuraCirculo.dibujar();
    }

    // Clase abstracta
    abstract class FiguraGeometrica {
        public abstract void dibujar();
    }

    class Rectangulo extends FiguraGeometrica {
        @Override
        public void dibujar() {
            System.out.println("Se debe dibujar un rectángulo");
        }
    }

    class Circulo extends FiguraGeometrica {
        @Override
        public void dibujar() {
            System.out.println("Se debe dibujar un círculo");
        }
    }
}
