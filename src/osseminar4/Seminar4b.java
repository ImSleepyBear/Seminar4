/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osseminar4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Seminar4b /*implements Serializable */{

    /*
    orginalkoden som kom med är bortkommenterad och ny kod som är
    anpassad till tasksen har utgått från orgianlkoden
    */
    
//    java.io.DataOutputStream doutStream;
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//       String filename="Seminar4.b";
//       createFile(filename);
//       //uncomment later on when we shoudl read the file
//       readFile(filename);
//    }
    //creates a file and write the bytes 255,254,..,0 to it
    public static void createFile(String filename) {
        java.io.FileOutputStream outFile = null;
        java.io.DataOutputStream doutStream = null;
        try {
            // create some data
            int i = 0x12345678; //hexadecimal konstant
            //create FileOutputStream
            outFile = new java.io.FileOutputStream(filename);
            doutStream = new java.io.DataOutputStream(outFile);
            //write dat to outputstream
//            outFile.write(i);
            doutStream.writeInt(i);
            System.out.println("stream has been written");
            //close file
//            outFile.close();
            doutStream.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                outFile.close();
                doutStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //open a file with the name filename and read and prints the bytes from the file
    public static void readFile(String filename) {
        java.io.FileInputStream inFile = null;
        java.io.DataInputStream dinStream = null;
        try {
            //create FileInputStream
            inFile = new java.io.FileInputStream(filename);
            dinStream = new java.io.DataInputStream(inFile);
            
            //read byte from file
            //print byte
//            int data = inFile.read();
            int data_stream = dinStream.readInt();
            
//            while (data != -1) {
//                System.out.printf("%02x ", data);
//                System.out.println((byte) data);
//                data = inFile.read();
//            }
//            //close file
//            inFile.close();
            
            while (data_stream != -1) {
                System.out.printf("%02x ", data_stream);
                System.out.println((byte) data_stream);
                data_stream = dinStream.read();
            }
            System.out.println("stream has been read");
            //close file
            dinStream.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inFile.close();
            } catch (IOException ex) {
                Logger.getLogger(Seminar4b.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
