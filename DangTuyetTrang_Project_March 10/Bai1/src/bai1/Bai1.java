package bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int number1, number2;
        
        Scanner nhapTuBanPhim = new Scanner(System.in);
                /*
                Scanner: như một thư viện # studio     
                Khai báo đối tượng 
                                */   
        System.out.print("Nhập số thứ 1:");
        /* Viết xong xuống dòng 
        System.out.print("");      Viết xong là thôi
        System.out.printf          Viết theo kiểu C   */
        
        number1 = nhapTuBanPhim.nextInt();
        
        System.out.print("Nhập số thứ 2:");
        number2 = nhapTuBanPhim.nextInt();
        
        
        System.out.printf("Tổng: %d\n", number1 + number2);   //+  (number1 + number2)
        System.out.printf("Hiệu: %d\n", number1 - number2);  
        System.out.printf("Tích: %d\n", number1 * number2);   
        System.out.printf("Thương: %.2f\n",1.0*number1 / number2);  
        // (float).....: đổi từ số nguyên về số thực
        // 1.0*......: đổi từ số nguyên về số thực
        System.out.printf("Chia lấy dư: %d\n", number1 % number2);   
      // shift + alt + .....: di chuyển câu lệnh 
      // shift + ctrl +.....: sao chép
      
        System.out.printf("Số lớn hơn là: %d\n",number1>number2?number1:number2);
    }
    
}
