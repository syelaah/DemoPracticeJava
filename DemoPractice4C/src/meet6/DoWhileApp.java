package meet6;

/**
 *
 * @author sye
 */
public class DoWhileApp {
    public static void main(String[] args) {
        int total_ganjil = 0, total_genap = 0;
        int i = 20;
        
        System.out.println("Do While (0 - 20)");
        
        do{
            System.out.print(i + " , ");
            
            if (i % 2 == 0){
                total_genap += i;
            } else {
                total_ganjil += i;
            }
            
            i--;
        } while (i >= 0);
        
        System.out.println("");
        System.out.println("Deret Genap: " + total_genap);
        System.out.println("Deret Ganjil: " + total_ganjil);
    
    }
}
