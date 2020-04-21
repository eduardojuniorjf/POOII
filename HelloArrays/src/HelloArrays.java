
public class HelloArrays {

    public static void main(String[] args) {

        //Array literal
        int[] onlyIntNumbers = new int[]{1, 2, 3, 4, 5, 6}; //int é um tipo primitivo
        System.out.println(onlyIntNumbers[2]);
        System.out.println(onlyIntNumbers.length);
        onlyIntNumbers[1] = 10;
        System.out.println(onlyIntNumbers[1]);

        //Array of Objects
        String[] onlyDogNames = new String[]{"Lady", "Clara", "Magali"};
        System.out.println(onlyDogNames.length);
        System.out.println(onlyDogNames[1]);
        //We can access the String methods for each item of Array
        System.out.println(onlyDogNames[0].equals("Lady"));

    }

}


