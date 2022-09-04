package chapter13;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionHandling {

    public static void main(String[] args) {

        createNewFile();
    }

    public static void createNewFile(){
        File file = new File("idontfind");
        try{
            file.createNewFile();
        }catch (IOException | InputMismatchException ex){
            System.out.println("You have an error");
            ex.getMessage();
        }finally {
            System.out.println("I will be executed regardless of the path");
        }
    }

    /*
    
     */
    public static void createRethrowNewFile() throws Exception{
        File file = new File("idontfind");
        file.createNewFile();
    }
}
