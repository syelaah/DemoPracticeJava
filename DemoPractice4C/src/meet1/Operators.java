package meet1;

class Operators {
    public static void main(String[] args) {
        byte thisIsByte = 50;
        int thisIsInt = 100;
        System.out.println("Modulus\t: " + (thisIsByte % thisIsInt));
        
        float thisIsFloat = 3.14f;
        double thisIsDouble = 3.14;
        System.out.println("Jumlah\t: "+(thisIsInt + thisIsDouble));
        
        //Binary: Comperation
        // ==, >, <, >=, <=, !=
        System.out.println(50 == 50);
        System.out.println(30 > 15);
        System.out.println(11 != 11);
        
        System.out.println(false == false);
    }
}
