package MinMax;
import MinMax.entity.SoNguyen;
public class MainThread {
    public static void main(String[] args) {
        int [] arr = {0, 2, 3, 11, 9, 1, 12, 23};
        SoNguyen songuyen1 = new SoNguyen();
        System.out.printf("Số lớn nhất là: " + songuyen1.SoLonNhat(arr));
        System.out.printf("\nSố nhỏ nhất là: " + songuyen1.SoNhoNhat(arr));

    }
}
