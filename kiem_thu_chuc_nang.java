import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stop = 1;
        while (stop == 1) {
            System.out.println("Chuong trinh kiem tra suc khoe!");
            Scanner s = new Scanner(System.in);
            System.out.println("Nhap vao nhip tho va nhip tim!");
            System.out.println("Nhip tho la:");
            int b = s.nextInt();
            System.out.println("Nhip tim la:");
            int h = s.nextInt();
            int result = checkHealth(b, h);
            switch (result) {
                case -1:
                    System.out.println("Input khong hop le!");
                    break;
                case 0:
                    System.out.println("Suc khoe binh thuong.");
                    break;
                case 1:
                    System.out.println("Can di kham!");
                    break;
                default:
                    System.out.println("Can di cap cuu!!!");
            }
            System.out.println("Tiep tuc: 1");
            stop = s.nextInt();
        }

    }
    public static int checkHealth(int b, int h) {
        if ((b < 0) || (b > 60) || (h<0) || (h> 160)) {
            return -1;
        } else if (b >= 16 && b <= 25) {
            if (h >= 60 && h <= 110)
                return 0;
            else return 1;
        } else {
            if (h >= 60 && h <= 110)
                return 1;
            else return 2;
        }
    }
}

