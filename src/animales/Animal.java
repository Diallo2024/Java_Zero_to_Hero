package animales;

public class Animal {
   protected void hacerSonido(){
       System.out.println("El animal hace un sonido");
   }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wouf");
    }
}

class Gato extends Animal{
   @Override
    protected void hacerSonido(){
       System.out.println("El gato hace miau");
   }
}

class pruebaAnimal{

        //Este es el método polimorfico
   static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //var animal = new Animal();
       // var animal = new Perro(); // Caso 2
        var animal = new Gato();
        imprimirSonido(animal);

    }
}


