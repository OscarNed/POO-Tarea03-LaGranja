package lagranja;

/**
 * @author OscarNedzelsky
 */
public class LaGranja {

    public static void main(String[] args) {
        GanadoBovino Herminia = new GanadoBovino(658.34, 710.22, "Herminia", "vaca", 10.5);
        Herminia.getNombreYTipo();
        Herminia.getPesoAnterior();
        Herminia.getPesoActual();
        Herminia.getCosto();
        Herminia.getPrecio();
        
        System.out.println("------------------------------------------------");
        
        GanadoEquino Jerry = new GanadoEquino(500.03, 510.43, 20.83, "Jerry", "caballo", true);
        Jerry.getNombreYTipo();
        Jerry.getPesoAnterior();
        Jerry.getPesoActual();
        Jerry.getCosto();
        Jerry.getPrecio();
        
        System.out.println("------------------------------------------------");
        
        GanadoEquino Lisa = new GanadoEquino(480.56, 499.89, 20.83, "Lisa", "yegua", false);
        Lisa.getNombreYTipo();
        Lisa.getPesoAnterior();
        Lisa.getPesoActual();
        Lisa.getCosto();
        Lisa.getPrecio();
        
        System.out.println("------------------------------------------------");
        
        GanadoOvino Lalo = new GanadoOvino(102.30, 98.45, 5.87, "Lalo", "borrego", true);
        Lalo.getNombreYTipo();
        Lalo.getPesoAnterior();
        Lalo.getPesoActual();
        Lalo.getCosto();
        Lalo.getPrecio();
        
        System.out.println("------------------------------------------------");
        
        GanadoOvino Lola = new GanadoOvino(98.45, 102.30, 5.87, "Lola", "borrego", false);
        Lola.getNombreYTipo();
        Lola.getPesoAnterior();
        Lola.getPesoActual();
        Lola.getCosto();
        Lola.getPrecio();
    }
    
}
