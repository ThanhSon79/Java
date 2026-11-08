import java.util.Scanner;

class Nguoi {
    protected String hoten;
    protected int tuoi;

    void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }

    void xuat() {
        System.out.print("Ho ten: " + hoten);
        System.out.print(" | Tuoi: " + tuoi);
    }
}

class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;

    @Override
    void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    double tinhLuong() {
        double lcb = 1.5;
        double phucap = 0.2 * snct;

        return lcb * hsl + phucap;
    }

    @Override
    void xuat() {
        super.xuat();

        System.out.print(" | Nam cong tac: " + snct);
        System.out.print(" | He so luong: " + hsl);
        System.out.println(" | Tien luong: " + tinhLuong() + " trieu");
    }

    int getSnct() {
        return snct;
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Nhap so luong nhan vien: ");
        n = Integer.parseInt(sc.nextLine());

        Nhanvien[] a = new Nhanvien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap nhan vien thu " + (i + 1));

            a[i] = new Nhanvien();
            a[i].nhap(sc);
        }

        System.out.println("\n===== DANH SACH NHAN VIEN =====");

        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }

        int vt = 0;

        for (int i = 1; i < n; i++) {
            if (a[i].getSnct() > a[vt].getSnct()) {
                vt = i;
            }
        }

        System.out.println("\nNHAN VIEN CONG TAC LAU NHAT");
        a[vt].xuat();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].tinhLuong() < a[j].tinhLuong()) {
                    Nhanvien tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }

        System.out.println("\nDANH SACH THEO LUONG GIAM DAN");

        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }

        sc.close();
    }
}
