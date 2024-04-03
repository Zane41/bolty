import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи начальные данные");
        Scanner vvod = new Scanner(System.in);
        int k1 = vvod.nextInt(), l1 = vvod.nextInt(), m1 = vvod.nextInt(), k2 = vvod.nextInt(), l2 = vvod.nextInt(),
            m2 = vvod.nextInt(),  dx, lose=0, p1 = k1 / 100 * (100 - l1), y1 = k1 - p1, p2 = k2 / 100 * (100 - l2), y2 = k2 - p2;
        if (p1 > p2) {
            dx = p1 - p2;
            lose = dx * m1 + y1 * m1 + y2 * m2;
        }
        if (p2 > p1) {
            dx = p2 - p1;
            lose = dx * m2 + y1 * m1 + y2 * m2;
        }
        if (p2 == p1)
            lose = y1 * m1 + y2 * m2;
        System.out.println("Потери: "+lose);
    }
}