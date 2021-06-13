package demo.entity;

import java.util.Scanner;

public class Tamgiac {

    public int NhapCanhTamGiac(String str) {
        int canh;
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        canh = scanner.nextInt();
        return canh;
    }

    public boolean KiemTraCanhTamGiac(int canh1, int canh2, int canh3) {
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0) {
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
            return false;
        } else if ((canh1 >= (canh2 + canh3)) || (canh2 >= (canh1 + canh3)) || (canh3 >= (canh1 + canh2))) {
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại");
            return false;
        }
        return true;
    }

    public double nuaChuViTamGiac(int canh1, int canh2, int canh3) {
        return (double) (canh1 + canh2 + canh3) / 2;
    }
}


