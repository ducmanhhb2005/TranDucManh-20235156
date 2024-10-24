import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Bank {
    private String accountHolderName;
    public long tien;
    private String currentBalance; // tiền + VND
    public final double monthlyInterestRate = (double) 20 / 100;
    public ArrayList<LichSuGiaoDich> list = new ArrayList<>();
    private int timeRut = 0;

    public Bank(String name, long soDu) {
        this.accountHolderName = name;
        this.tien = soDu;
        this.currentBalance = this.tien + " " + "VND";
    }

    public String Gui(String tienGui) {
        String[] arr = tienGui.split(" ");
        this.tien += Long.parseLong(arr[0]);
        this.currentBalance = this.tien + " VND";
        list.add(new LichSuGiaoDich("Deposit", Long.parseLong(arr[0])));
        return "Đã gửi " + Long.parseLong(arr[0]) + " VND";
    }

    public String Rut(String tienRut) {
        this.timeRut++;
        String[] arr = tienRut.split(" ");

        if (this.timeRut <= 3) {
            list.add(new LichSuGiaoDich("Withdraw", Long.parseLong(arr[0])));
            this.tien -= Long.parseLong(arr[0]);
            this.currentBalance = this.tien + " VND";
            return "Đã rút " + Long.parseLong(arr[0]) + " VND";
        } else {
            return "Rút " + Long.parseLong(arr[0]) + " VND - Lỗi: Bạn đã đạt giới hạn rút tiền tháng này.";
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Nguyen Van A", 5000000);
        long banktemp = bank.tien;

        System.out.println("Tạo tài khoản mới: " + bank.accountHolderName);
        System.out.println("Số dư ban đầu: " + bank.currentBalance);
        System.out.println(bank.Gui("1000000 VND"));
        System.out.println(bank.Rut("500000 VND"));
        System.out.println(bank.Rut("500000 VND"));
        System.out.println(bank.Rut("500000 VND"));
        System.out.println(bank.Rut("500000 VND"));
        System.out.println("Số dư hiện tại: " + bank.currentBalance);
        System.out.println("Lịch sử giao dịch:");

        double[] sab = new double[13];
        int mb = 0;
        int first = 0;

        for (int i = 0; i < bank.list.size(); i++) {
            System.out.println((i + 1) + ". " + bank.list.get(i).type + " - " + bank.list.get(i).tien + " VND - " + bank.list.get(i).ngayGio);

            if (i == bank.list.size() - 1) mb = bank.list.get(i).thangdo;
            if (i == 0) first = bank.list.get(i).thangdo;

            sab[first] = banktemp;

            switch (bank.list.get(i).thangdo) {
                case 1:
                    if (sab[12] != 0) sab[1] = sab[12] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[1] += bank.list.get(i).tien;
                    else sab[1] -= bank.list.get(i).tien;
                    break;
                case 2:
                    if (sab[1] != 0) sab[2] = sab[1] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[2] += bank.list.get(i).tien;
                    else sab[2] -= bank.list.get(i).tien;
                    break;
                case 3:
                    if (sab[2] != 0) sab[3] = sab[2] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[3] += bank.list.get(i).tien;
                    else sab[3] -= bank.list.get(i).tien;
                    break;
                case 4:
                    if (sab[3] != 0) sab[4] = sab[3] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[4] += bank.list.get(i).tien;
                    else sab[4] -= bank.list.get(i).tien;
                    break;
                case 5:
                    if (sab[4] != 0) sab[5] = sab[4] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[5] += bank.list.get(i).tien;
                    else sab[5] -= bank.list.get(i).tien;
                    break;
                case 6:
                    if (sab[5] != 0) sab[6] = sab[5] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[6] += bank.list.get(i).tien;
                    else sab[6] -= bank.list.get(i).tien;
                    break;
                case 7:
                    if (sab[6] != 0) sab[7] = sab[6] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[7] += bank.list.get(i).tien;
                    else sab[7] -= bank.list.get(i).tien;
                    break;
                case 8:
                    if (sab[7] != 0) sab[8] = sab[7] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[8] += bank.list.get(i).tien;
                    else sab[8] -= bank.list.get(i).tien;
                    break;
                case 9:
                    if (sab[8] != 0) sab[9] = sab[8] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[9] += bank.list.get(i).tien;
                    else sab[9] -= bank.list.get(i).tien;
                    break;
                case 10:
                    if (sab[9] != 0) sab[10] = sab[9] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[10] += bank.list.get(i).tien;
                    else sab[10] -= bank.list.get(i).tien;
                    break;
                case 11:
                    if (sab[10] != 0) sab[11] = sab[10] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[11] += bank.list.get(i).tien;
                    else sab[11] -= bank.list.get(i).tien;
                    break;
                case 12:
                    if (sab[11] != 0) sab[12] = sab[11] * (1 + bank.monthlyInterestRate);
                    if (bank.list.get(i).type.equals("Deposit")) sab[12] += bank.list.get(i).tien;
                    else sab[12] -= bank.list.get(i).tien;
                    break;
            }
        }

        System.out.println("Số dư sau khi cộng lãi: " + sab[mb] * (1 + bank.monthlyInterestRate));
    }

    public String getCurrentBalance() {
        return "Số dư hiện tại: " + this.currentBalance;
    }
}
