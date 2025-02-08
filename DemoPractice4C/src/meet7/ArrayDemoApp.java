package meet7;

/**
 *
 * @author sye
 */
import java.util.Scanner;
public class ArrayDemoApp {
    public static void main(String[] args) {
        // Declare
        String[] studentNames;
        
        // Allocate memory
        studentNames = new String[3];
        
        // Initialize
        // Start from 0
        studentNames[0] = "Syela";
        studentNames[1] = "Herdina";
        studentNames[2] = "Naibaho";
        
        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);
        
        // ----------------------------------
        
        // Declare and Initialize
        var input = new Scanner(System.in);
        String[] cities = new String[3];
        
        for(int i = 0; i < cities.length; i++){
            System.out.print("City " + (i+1) + " : ");
            cities[i] = input.nextLine();
        }
        
        // for each
        // Python similar form:
//        for city in cities
//                print(city)

        for(String city : cities){
            System.out.println(city);
        }
    }
}
