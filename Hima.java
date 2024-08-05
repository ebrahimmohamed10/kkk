/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hima;
import java.util.Scanner;
/**
 *
 * @author ENG_EBRAHIM
 */
public class Hima {
     

    /**
     * @param args the command line arguments
     */
        static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
int size;
System.out.println("Enter the size of array");
size = input.nextInt();
int[] ids = new int [size];
fillarray(ids);
printarray(ids);
int searchedid;
System.out.println("Enter the id search for");
searchedid = input.nextInt();
int returnedindex = search(ids,searchedid);
if( returnedindex >=0 )
    System.out.println("the item is found");
else
   System.out.println("the item is not found"); 

    }
public static void fillarray (int [] list)
{
    for (int i = 0; i < list.length; i++) {
       System.out.println("Enter no" + (1+i));
        list [i] = input.nextInt();
    }
    
}
public static void printarray (int [] list)
{
    for (int i = 0; i < list.length; i++) {
       System.out.println(list [i]);
       
    }
    
}
public static int search (int [] list, int target)
{
    for (int i = 0; i < list.length; i++) 
       
        if(list [i]==target)
        return i;
    return -1;
    
    
}



}