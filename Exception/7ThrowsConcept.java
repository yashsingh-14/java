package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

class ThrowsConcept {
    static void readfile() throws FileNotFoundException{
        FileReader fr = new FileReader("Exception\\file.txt");
        System.out.println("File opened successfully.");
    }
    // static void readfile(){
    //     try{
    //         FileReader fr = new FileReader("Exception\\file.txt");
    //         System.out.println("File opened successfully.");
    //     }
    //     catch(FileNotFoundException e){
    //         System.out.println("File not found:");
    //     }
    // }
    public static void main(String[] args) {
        try{
            readfile();

        }catch(FileNotFoundException e){
            System.out.println("File not found");

        }
        // readfile();      //throws fileNotFoundException we have to add in main method
    }
}
