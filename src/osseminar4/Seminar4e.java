/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osseminar4;
import java.io.File;


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
    
    public static void printWelcome(){
        //start to open the current directory
        
        //then list all files in the directory
        //use the printDirectoryInfo of the current directory
        
        //ask the user to pick a file in the list
        System.out.println("Enter filename");
    }
    
    public static void printResult(String filename){
        //create a file object using the specified filename
        //check to make sure that the file exists
        //if not print error message and exit
        
        //check if file is a regular file or a directory
        //depending on the test call printFileInfo or printDirectoryInfo
    }
    
    public static void printFileInfo(File file){
        //print the following information about the file
        //1. complete filename including path
        //2. length in bytes
        //3. last time when the file was modified
        //(You need to convert into a readable form for instance with Date object)
        //4. Show if the file is readable, writeable and if it is a hidden file
    }
    
    public static void printDirectoryInfo(File file){
        //print the following information about a directory
        //1. name of directory including path
        //2. list of all files and directories locaded in this directory
        //3. number of files in the directory
        
    }
    
}
