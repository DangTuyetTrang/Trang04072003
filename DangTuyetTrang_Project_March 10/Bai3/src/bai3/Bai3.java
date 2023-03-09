
package bai3;

import java.util.Scanner;


public class Bai3 {

    public static void main(String[] args) {
       String name;
       int yob; // yob: year of birthday
       int Tuoi;
       
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Nhập tên:");
        name = scanner.nextLine();
        
        System.out.printf("Nhập năm sinh: ");
        yob = scanner.nextInt();
       
        Tuoi = 2023 - yob;
        if(Tuoi < 16){
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên");
       // theo java nên để là println 
        }
        else if(Tuoi >= 18){
            System.out.printf("Bạn %s đã già");
            // theo C thì k có println
        }
        else{
            System.out.printf("Bạn %s ở độ tuổi trưởng thành");
        }
        
    }
    
}
