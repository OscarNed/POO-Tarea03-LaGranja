package lagranja;

/**
 * @author OscarNedzelsky
 */
public class GanadoOvino extends Ganado{
    //Atributos
    final double costoPorKilo;
    final boolean lana;
    
    /**
     * Constructor
     * @param pesoAnterior - peso del borrego cuando fue comprado
     * @param pesoActual - peso actual del borrego
     * @param nombre - nombre del animal
     * @param costoPorKilo - costo por cada kilo que pesa el animal
     * @param lana - booleano que indica si el animal tiene lana o no
     */
    public GanadoOvino(double pesoAnterior, double pesoActual, double costoPorKilo, String nombre, String tipo, boolean lana){
        super(pesoAnterior, pesoActual, nombre, tipo);
        this.costoPorKilo = costoPorKilo;
        this.lana = lana;
    }
    
    /**
     * Método que calcula cuánto costó el animal cuando se compró y lo muestra
     */
    @Override
    public void getCosto(){
        double costo;
        if (lana == true){
            costo = pesoAnterior * costoPorKilo;
        } else {
            costo = (pesoAnterior * costoPorKilo);
            costo = costo - (costo * .40);
        }
        System.out.println("Costo del animal: $" + costo);
    }
    
    /**
     * Méteodo que calcula el precio actual del animal y lo muestra
     */
    @Override
    public void getPrecio(){
        double precio;
        if (lana == true){
            precio = pesoActual * costoPorKilo;
        } else {
            precio = (pesoActual * costoPorKilo);
            precio = precio - (precio * .40);
        }
        System.out.println("Precio actual del animal: $" + precio);
    }
}
