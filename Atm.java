import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cần rút (bội soos của 50.000): ");
        int amount = scanner.nextInt();

        if (amount % 50000 != 0) {
            System.out.println("Số tiền nhập vào không phải là bội của 50.000 VND.");
        } else {
            int originalAmount = amount;
            int count500 = 0, count200 = 0, count100 = 0, count50 = 0;

            if (amount >= 500000) {
                count500 = amount / 500000;
                amount = amount % 500000;            }
            if (amount >= 200000) {
                count200 = amount / 200000;
                amount = amount % 200000;            }
            if (amount >= 100000) {
                count100 = amount / 100000;
                amount = amount % 100000;            }
            if (amount >= 50000) {
                count50 = amount / 50000;            }
            int totalNotes = count500 + count200 + count100 + count50;

            System.out.println("Số tiền rút: " + originalAmount + " VND");
            System.out.println("Số tờ 500.000: " + count500);
            System.out.println("Số tờ 200.000: " + count200);
            System.out.println("Số tờ 100.000: " + count100);
            System.out.println("Số tờ 50.000: " + count50);
            System.out.println("Tổng số tờ tiền: " + totalNotes);
        }

        scanner.close();
    }
}
