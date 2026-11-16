import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        ArrayList<shape> danhSach = new ArrayList<>();

        Random rd = new Random();

        for (int i = 0; i < 10; i++) {

            int loai = rd.nextInt(3);

            double x = rd.nextInt(10) + 1;
            double y = rd.nextInt(10) + 1;

            if (loai == 0) {
                danhSach.add(new point(x, y));
            }
            else if (loai == 1) {
                double r = rd.nextInt(10) + 1;
                danhSach.add(new circle(x, y, r));
            }
            else {
                double dai = rd.nextInt(10) + 1;
                double rong = rd.nextInt(10) + 1;

                danhSach.add(new rectangle(x, y, dai, rong));
            }
        }

        System.out.println("DANH SACH CAC HINH:");

        for (shape h : danhSach) {
            System.out.println(h);
        }

        double tongDienTich = 0;
        double tongChuVi = 0;

        shape max = danhSach.get(0);
        shape min = danhSach.get(0);

        for (shape h : danhSach) {

            tongDienTich += h.area();
            tongChuVi += h.perimeter();

            if (h.area() > max.area()) {
                max = h;
            }

            if (h.area() < min.area()) {
                min = h;
            }
        }

        System.out.println("\nTong dien tich: " + tongDienTich);
        System.out.println("Tong chu vi: " + tongChuVi);

        System.out.println("\nHinh co dien tich lon nhat:");
        System.out.println(max);

        System.out.println("\nHinh co dien tich nho nhat:");
        System.out.println(min);

        for (shape h : danhSach) {
            h.zoom(2);
        }

        System.out.println("\nDANH SACH SAU KHI PHONG TO:");

        for (shape h : danhSach) {
            System.out.println(h);
        }
    }
}