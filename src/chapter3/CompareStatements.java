package chapter3;

public class CompareStatements {
    public static void main(String[] args) {

        /*
        COMPARE STRINGS
         */
        String a = "a";
        String A = "A";

        if(a.equals(5)){
            System.out.println("Yes 1");
        }

        if(!a.equals(5)){
            System.out.println("Yes 2");
        }

        if(a.equalsIgnoreCase("a")){
            System.out.println("Yes 3");
        }

    }
}
