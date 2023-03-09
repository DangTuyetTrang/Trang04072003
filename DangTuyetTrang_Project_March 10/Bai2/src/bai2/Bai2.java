
package bai2;

import java.util.Scanner;


public class Bai2 {

    
    public static void main(String[] args) {
       
        int a;
        
        Scanner nhapTuBanPhim = new Scanner(System.in);
      
        System.out.print("Nhập số thứ nhất: ");
        a = nhapTuBanPhim.nextInt();
       
        if (a % 2 == 0) 
            System.out.println("Là số chẵn:");
        else
            System.out.println("Là số lẻ ");
            
        /*  if(điều kiện) {
                 code 
            }
            else if(điều kiện) {
                 code
            }
            else {
                 code
            }
        */
    
};
    }
