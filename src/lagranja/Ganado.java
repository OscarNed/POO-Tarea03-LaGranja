package lagranja;

/**
 * @author OscarNedzelsky
 */
public abstract class Ganado implements iGanado{
    //Atributos
    protected double pesoAnterior;
    protected double pesoActual;
    protected String nombre, tipo;
    
    /**
     * Constructor
     * @param pesoAnterior - peso del animal cuando fue comprado
     * @param pesoActual - peso actual del animal
     * @param nombre - nombre del animal
     * @param tipo - tipo de animal (vaca, caballo, etc.)
     */
    public Ganado (double pesoAnterior, double pesoActual, String nombre, String tipo){
        this.pesoAnterior = pesoAnterior;
        this.pesoActual = pesoActual;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    /**
     * Método que imprime el peso anterior del animal
     */
    public void getPesoAnterior(){
        System.out.println("Peso anterior: " + this.pesoAnterior);
    }
    
    /**
     * Método que imprime el peso actual del animal
     */
    public void getPesoActual(){
        System.out.println("Peso actual: " + this.pesoActual);
    }
    
    /**
     * Método que imprime el nombre y tipo del animal.
     */
    public void getNombreYTipo(){
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Tipo de animal:" + tipo);
    }
}
