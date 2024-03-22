import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

