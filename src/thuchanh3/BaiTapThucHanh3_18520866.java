package thuchanh3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTapThucHanh3_18520866 {
    private static final Input input = new Input();

    // Bai 1: Tinh tien sach
    public static void Bai1() {

    }


    // Bai 2: Generic xuat mang
    public static <T> void xuatMang(T[] array) {
        System.out.println("====================");
        System.out.println("Cac phan tu cua mang: ");
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void Bai2() {
        Integer[] arrInt = {3, 5, 1, 2, 9, 3};
        String[] arrString = {"mot", "hai", "nam", "chin"};
        Float[] arrFloat = {1.5F, 2.5F, 11.2F, 8.1F, 54F};
        xuatMang(arrInt);
        xuatMang(arrString);
        xuatMang(arrFloat);

    }


    // Bai 3: Generic tinh trung binh mang
    public static double tinhTrungBinhMang(List<? extends Number> numberList) {
        double total = 0;
        for (Number n : numberList) {
            total += n.doubleValue();
        }
        return total / numberList.size();
    }

    public static void Bai3() {
        List<Float> floatList = new ArrayList<Float>();
        floatList.add(12.1F);
        floatList.add(101F);
        floatList.add(12.321F);
        floatList.add(812.1F);
        floatList.add(90.812F);

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(12);
        integerList.add(101);
        integerList.add(12321);
        integerList.add(8121);
        integerList.add(90812);

        System.out.println("Trung binh cua floatList: " + tinhTrungBinhMang(floatList));
        System.out.println("Trung binh cua integerList: " + tinhTrungBinhMang(integerList));
    }


    // Bai 4: Viết Exception cho trường hợp sử mảng số nguyên 5 phần tử
    public static void Bai4() {
        Scanner scanner = new Scanner(System.in);
        Integer[] intArray = new Integer[5];

        try {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("Nhap so nguyen duong");
                int inputValue = scanner.nextInt();
                intArray[i] = inputValue;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("So phan tu > 5 roi!!");
        } catch (Exception e) {
            System.out.println("Hay nhap so nguyen nhe!!");
        }

        xuatMang(intArray);
    }

    // Bai 5: Thiet ke menu
    public static void main(String[] args) {
        System.out.println("1 :  Tinh tien sach");
        System.out.println("2 :  Generic xuat mang");
        System.out.println("3 :  Generic tinh trung binh mang");
        System.out.println("4 :  Viet Exception cho truong hop su mang so nguyen 5 phan tu");
        System.out.println("5 :  Thoat ");


        int menuIndex = input.InputIntNotNegative("so menu de chon bai toan");

        switch (menuIndex) {
            case 1 -> Bai1();
            case 2 -> Bai2();
            case 3 -> Bai3();
            case 4 -> Bai4();
            default -> {
                System.out.println("Thoat chuong trinh...");
            }
        }

    }
}
