/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
public class B5_4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
