package aplicacion;

import com.mycompany.notamedia.Ejecutable;
import personal.Personal;

/**
 *
 * @author jaimg
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personal alu = new Personal("674832763","jgarcia@gmail.com");
        Ejecutable nota1 = new Ejecutable();
        float nota=(nota1.calcularNotaMedia());
        Academia aca1 = new Academia("Jaime",nota,alu);

        System.out.println(aca1.toString());
    }
    
}







