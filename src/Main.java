public class Main {

    public static void main(String args[]){
        Cotxe ford1 = new Cotxe("Mondeo", 100);

        System.out.println("\n");
        System.out.println("Cotxe marca: " + Cotxe.marca + ", model 1: " + ford1.getModel() + ", potencia :" +  ford1.getPotencia());
        System.out.println("\n");

        // Crida al métode no static, per la instancia.
        ford1.accelerar();
        // Crida al métode static, per la classe.
        Cotxe.frenar();

        System.out.println("\n");

        Cotxe ford2 = new Cotxe("Mondeo GTX", 250);
        Cotxe ford3 = new Cotxe("Mondeo RTX", 450);

        // Els atributs static afecten a la classe, no a la instancia. Tot i que son modificables a nivell d'instancia.
        // El model queda modificat per a totes les instancies, la potencia resta igual.
        System.out.println("Cotxe marca: " + Cotxe.marca + ", model 1: " + ford1.getModel() + ", potencia :" +  ford1.getPotencia());
        System.out.println("Cotxe marca: " + Cotxe.marca + ", model 2: " + ford2.getModel() + ", potencia :" +  ford2.getPotencia());
        System.out.println("Cotxe marca: " + Cotxe.marca + ", model 3: " + ford3.getModel() + ", potencia :" +  ford3.getPotencia());

        System.out.println("\n");

        // La crida s'ha de realitzar a nivell de Class
        System.out.println("Darrer model inserit: " + Cotxe.getModel());

    }

}
