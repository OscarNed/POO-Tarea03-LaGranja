package lagranja;

/**
 * @author OscarNedzelsky
 */
public class GanadoBovino extends Ganado{
    //Atributos
    final double costoPorKilo;
    
    /**
     * Constructor
     * @param pesoAnterior - peso de la vaca cuando fue comprada
     * @param pesoActual - peso actual de la vaca
     * @param nombre - nombre del animal
     * @param tipo - tipo de animal (vaca, caballo, etc.)
     * @param costoPorKilo - costo por cada kilo que pesa el animal
     */
    public GanadoBovino(double pesoAnterior, double pesoActual, String nombre, String tipo, double costoPorKilo){
        super(pesoAnterior, pesoActual, nombre, tipo);
        this.costoPorKilo = costoPorKilo;
    }
    
    /**
     * Método que calcula cuánto costó el animal cuando se compró y lo muestra
     */
    @Override
    public void getCosto(){
        double costo;
        costo = pesoAnterior * costoPorKilo;
        System.out.println("Costo del animal: $" + costo);
    }
    
    /**
     * Méteodo que calcula el precio actual del animal y lo muestra
     */
    @Override
    public void getPrecio(){
        double precio;
        precio = pesoActual * costoPorKilo;
        System.out.println("Precio de venta del animal: $" + precio);
    }
}