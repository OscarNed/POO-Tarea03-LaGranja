package lagranja;

/**
 * @author OscarNedzelsky
 */
public class GanadoEquino extends Ganado{
    //Atributos
    final double costoPorKilo;
    final boolean macho;
    
    /**
     * Constructor
     * @param pesoAnterior - peso del caballo cuando fue comprado
     * @param pesoActual - peso actual del caballo
     * @param nombre - nombre del animal
     * @param tipo - tipo de animal (vaca, caballo, etc.)
     * @param costoPorKilo - costo por cada kilo que pesa el animal
     * @param macho - booleano que indica si el animal es macho o no
     */
    public GanadoEquino(double pesoAnterior, double pesoActual, double costoPorKilo, String nombre, String tipo, boolean macho){
        super(pesoAnterior, pesoActual, nombre, tipo);
        this.costoPorKilo = costoPorKilo;
        this.macho = macho;
    }
    
    /**
     * Método que calcula cuánto costó el animal cuando se compró y lo muestra
     */
    @Override
    public void getCosto(){
        double costo;
        if (macho == true){
            costo = pesoAnterior * costoPorKilo;
        } else {
            costo = (pesoAnterior * costoPorKilo);
            costo = costo + (costo * .30);
        }
        System.out.println("Costo del animal: $" + costo);
    }
    
    /**
     * Méteodo que calcula el precio actual del animal y lo muestra
     */
    @Override
    public void getPrecio(){
        double precio;
        if (macho == true){
            precio = pesoActual * costoPorKilo;
        } else {
            precio = (pesoActual * costoPorKilo);
            precio = precio + (precio * .30);
        }
        System.out.println("Precio actual del animal: $" + precio);
    }
}
