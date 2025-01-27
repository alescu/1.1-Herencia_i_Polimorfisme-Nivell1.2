import jdk.jfr.Experimental;

public class Cotxe {
    static final String marca = "Ford";
    private static String model;
    private Integer potencia;

    public static void frenar(){
        System.out.println("El vehicle està accelerant");
    };

    public void accelerar(){
        System.out.println("El vehicle està frenant");
    };

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Cotxe(String model, Integer potencia) {
        this.model = model;
        this.potencia = potencia;
    }

}
