package meet6;

/**
 *
 * @author sye
 */
public class WhileLoopApp {
    public static void main(String[] args) {
        int total_ganjil = 0, total_genap = 0;
        int i = 20;
        
        System.out.println("While Loop (0 - 20)");
        
        while(i >= 0){
            System.out.print(i + " , ");
            
            if (i % 2 == 0){
                total_genap += i;
            } else {
                total_ganjil += i;
            }
            
            i--;
        }
        
        System.out.println("");
        System.out.println("Deret Genap: " + total_genap);
        System.out.println("Deret Ganjil: " + total_ganjil);
    }
    
}
