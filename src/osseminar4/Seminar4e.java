/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osseminar4;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Seminar4e {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //write welcome message and read input from user
//        //print welcome message
//        printWelcome();
//        //read filename from user
//        java.util.Scanner sc=new java.util.Scanner(System.in);
//        String filename=sc.nextLine();
//        //print result
//        printResult(filename);
//    }
    public static void printWelcome() {
        //start to open the current directory

        //then list all files in the directory
        //use the printDirectoryInfo of the current directory
        //ask the user to pick a file in the list
        String fileName = ".";
        File currentDirr = new File(fileName);
        printDirectoryInfo(currentDirr);

        System.out.println("Enter filename");

        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();

        printResult(newName, currentDirr);
    }

    public static void printResult(String filename, File currentDirr) {
        //create a file object using the specified filename
        //check to make sure that the file exists
        //if not print error message and exit

        //check if file is a regular file or a directory
        //depending on the test call printFileInfo or printDirectoryInfo
        File newDirr = null;
        boolean flag = false;

        for (String list : currentDirr.list()) {
            if (filename.equals(list)) {
                newDirr = new File(filename);
                flag = true;
                System.out.println("test");
                break;
            }
        }
        if (flag == true) {

            System.out.println("DEN FINNS");
            if (newDirr.isDirectory()) {

                System.err.println("Det är en directory");
                printDirectoryInfo(newDirr);
            } else {

                System.err.println("Det är inte en directory");
                printFileInfo(newDirr);
            }
        } else {
            System.err.println("FILEN FINNS EJ");
            printWelcome();
        }

    }

    public static void printFileInfo(File file) {
        //print the following information about the file
        //1. complete filename including path
        //2. length in bytes
        //3. last time when the file was modified
        //(You need to convert into a readable form for instance with Date object)
        //4. Show if the file is readable, writeable and if it is a hidden file

        System.out.println("Current file path " + file.getAbsolutePath());
        System.out.println("File in bytes " + file.getAbsoluteFile().length());

        long lastModified = file.lastModified();
        Date date = new Date(lastModified);

        System.out.println("Last modified " + date);
        System.out.println("Readable: " + file.canRead() + " Writeable: " + file.canWrite());
        System.out.println("Is hidden: " + file.isHidden());

    }

    public static void printDirectoryInfo(File file) {
        //print the following information about a directory
        //1. name of directory including path
        //2. list of all files and directories locaded in this directory
        //3. number of files in the directory

        System.out.println("Current working directory " + file.getAbsolutePath());
        System.out.println("Content in the folder " + Arrays.toString(file.list()));
        System.out.println("Number of files " + file.list().length);

    }

}
