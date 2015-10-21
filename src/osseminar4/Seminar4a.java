/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osseminar4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class Seminar4a {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//       String filename="Seminar4.a";
//       createFile(filename);
//       //uncomment later on when we shoudl read the file
//       //readFile(filename);
//        
//    }
    //creates a file and write the bytes 255,254,..,0 to it
    public static void createFile(String filename) {
//        java.io.FileOutputStream outFile = null;
        RandomAccessFile out = null;
        
        try {
            // create byte array
            byte data[];
            data = new byte[256];
            for (int i = 0; i < 256; i++) {
                data[i] = (byte) (255 - i);
            }
            //create FileOutputStream
//            outFile = new java.io.FileOutputStream(filename);
            out = new RandomAccessFile(filename, "rws");
            //write byte to outputstream
            for (int i = 0; i < 256; i++) {
//                outFile.write(data[i]);
                out.write(data[i]);
            }
            //close file
//            outFile.close();
            out.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                outFile.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    //open a file with the name filename and read and prints the bytes from the file
    public static void readFile(String filename) {
        java.io.FileInputStream inFile = null;
        RandomAccessFile in = null;
        try {
            //create FileInputStream
            inFile = new java.io.FileInputStream(filename);
            in = new RandomAccessFile(filename, "r");
            //read byte from file
            //print byte
//            int data = inFile.read();
            int data = in.read();
            while (data != -1) {
                System.out.printf("%02x ", data);
                System.out.println((byte) data);
//                data = inFile.read();
                data = in.read();
            }
            //close file
            inFile.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inFile.close();
            } catch (IOException ex) {
                Logger.getLogger(Seminar4a.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
