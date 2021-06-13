package demo;

import demo.entity.Tamgiac;

public class MainThread {
    public static void main(String[] args) {
        Tamgiac tg1 = new Tamgiac();
        int canh1, canh2, canh3;
        canh1 = tg1.NhapCanhTamGiac("Nhập cạnh thứ 1:");
        canh2 = tg1.NhapCanhTamGiac("Nhập cạnh thứ 2:");
        canh3 = tg1.NhapCanhTamGiac("Nhập cạnh thứ 3:");
        if (tg1.KiemTraCanhTamGiac(canh1, canh2, canh3)) {
            System.out.printf("Nua chu vi tam giac la: %f", tg1.nuaChuViTamGiac(canh1, canh2, canh3));
        }
    }
}
