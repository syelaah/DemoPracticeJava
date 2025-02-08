package meet7;

/**
 *
 * @author sye
 */
public class ArrayMultidimensionApp {
    public static void main(String[] args) {
        
        String[][] names = {
         {"Sir", "Maam", "Sis"},
         {"Mark", "Siti"}
     };
    
        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }
    }
}
