import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        int jk;

        System.out.println("=======================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tKALKULATOR BMI DAN BMR");
        System.out.println("=======================================================================================================");
        System.out.println("Pilih Jenis Kelamin");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan jenis kelamin anda : ");
        jk = input.nextInt();

        if (jk == 1) {
            Calculator cal = new Calculator();
            System.out.println("=======================================================================================================");
            System.out.println("Inputkan data");
            cal.getUserInput();
            System.out.println("=======================================================================================================");
            System.out.println("Tampilkan");
            System.out.println("1. BMR");
            System.out.println("2. BMI");
            System.out.print("Pilih\t\t\t\t\t\t: ");
            pilih = input.nextInt();
            if (pilih == 1) {
                cal.bmr_pria();
            } else if (pilih == 2) {
                cal.bmi_pria();
            } else {
                System.out.println("ERROR!!");
            }
        } else if (jk == 2) {
            Calculator cal = new Calculator();
            System.out.println("=======================================================================================================");
            System.out.println("Inputkan data");
            cal.getUserInput();
            System.out.println("=======================================================================================================");
            System.out.println("Tampilkan");
            System.out.println("1. BMR");
            System.out.println("2. BMI");
            System.out.print("Pilih\t\t\t\t\t\t: ");
            pilih = input.nextInt();
            if (pilih == 1) {
                cal.bmr_perempuan();
            } else if (pilih == 2) {
                cal.bmi_perempuan();
            } else {
                System.out.println("ERROR!!");
            }
        }
    }
}