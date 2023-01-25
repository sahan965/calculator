/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package add;
import java.util.Scanner;

/**
 *
 * @author SAHAN M DISSANAYAKE
 */
public class Add {
   
    public void addition(int a,int b){
        System.out.println("Answer: " + a+b);
    }
    public void subtraction(int a, int b){
        System.out.println("Answer: " + (a-b));
    }
    public void multiplication(int a, int b){
        System.out.println("Answer: " + a*b);
    }
    public void division(int a, int b){
        System.out.println("Answer: " + a/b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Add objone = new Add();
        int a = obj.nextInt();
        obj.nextLine();
        String ok = obj.nextLine();
        int b = obj.nextInt();
        
        switch (ok){
            case "+":
                objone.addition(a, b);
                break;
            case "-":
                objone.subtraction(a, b);
                break;
            case "*":
                objone.multiplication(a, b);
                break;
            case "/":
                objone.division(a,b);
                break;
            default:
                System.out.println("invaled imput! try agan.");
            
        }
        
        // TODO code application logic here
    }
    
}
