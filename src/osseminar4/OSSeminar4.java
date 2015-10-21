/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osseminar4;

import static osseminar4.Seminar4a.createFile;
import static osseminar4.Seminar4b.createFile;
import static osseminar4.Seminar4b.readFile;

/**
 *
 * @author Mohini
 */
public class OSSeminar4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Task 4a
        Seminar4a s4a = new Seminar4a();
        String filename = "Seminar4.a";
        s4a.createFile(filename);
        s4a.readFile(filename);
        
        
        //Task 4b
//        Seminar4b s4b = new Seminar4b();
////        String filename = "Seminar4.b";
//        String filename = "Seminar4.c";
//        s4b.createFile(filename);
//        s4b.readFile(filename);
        
        
        //Task 4e
//        Seminar4e s4e = new Seminar4e();
//        s4e.printWelcome();
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        String fileName = sc.nextLine();
//        s4e.printResult(fileName);
    }

}
