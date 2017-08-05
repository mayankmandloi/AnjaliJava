/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

/**
 *
 * @author hp
 */
public class Test1 {
    
    public static void main(String[] args) {
        int i = 101,j=20;
        char oper='!';// + - * / % 
        switch(oper)
        {
            case '+':
            case '!':
                System.out.println(i+j);
                break;
            case '-':
                System.out.println(i-j);
                break;
            case '*':
                System.out.println(i*j);
                break;
            case '/':
                System.out.println(i/j);
                break;
            case '%':
                System.out.println(i%j);
                break;
            default:
                System.out.println("Sorry Not valid");


        }
    }
    
}
