import java.util.Scanner;

public class Calculator implements User {
    private int usia;
    private double tingb;
    private double berba;

    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Usia anda\t\t\t\t\t: ");
        usia = input.nextInt();
        System.out.print("Tinggi badan anda\t\t\t: ");
        tingb = input.nextInt();
        System.out.print("Berat badan anda\t\t\t: ");
        berba = input.nextInt();
    }

    @Override
    public double bmi_pria() {
        double bmi = berba/((tingb/100) * (tingb/100));
        System.out.println("=======================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tBMI ANDA ADALAH "+bmi);
        System.out.println("=======================================================================================================");
        System.out.println("Kategori BMI");
        System.out.println("1. Normal Weight\t\t: 18.5 <= BMI <= 24.9");
        System.out.println("2. Over Weight\t\t\t: 25 <= BMI <= 29.9");
        System.out.println("3. UnderWeight\t\t\t: BMI < 18.5");
        System.out.println("4. Obesitas Kelas 1\t\t: 30 <= BMI <= 34.9");
        System.out.println("5. Obesitas Kelas 2\t\t: 35 <= BMI <= 39.9");
        System.out.println("6. Obesitas Kelas 3\t\t: BMI >= 40");
        return 0;
    }

    @Override
    public double bmi_perempuan() {
        double bmi = berba/((tingb/100) * (tingb/100));
        System.out.println("=======================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tBMI ANDA ADALAH "+bmi);
        System.out.println("=======================================================================================================");
        System.out.println("Kategori BMI");
        System.out.println("1. Normal Weight\t\t: 18.5 <= BMI <= 24.9");
        System.out.println("2. Over Weight\t\t\t: 25 <= BMI <= 29.9");
        System.out.println("3. UnderWeight\t\t\t: BMI < 18.5");
        System.out.println("4. Obesitas Kelas 1\t\t: 30 <= BMI <= 34.9");
        System.out.println("5. Obesitas Kelas 2\t\t: 35 <= BMI <= 39.9");
        System.out.println("6. Obesitas Kelas 3\t\t: BMI >= 40");
        return 0;
    }

    @Override
    public double bmr_pria() {
        double bmr = 66.47 + (13.75 * berba) + (5.003 * tingb) - (6.755 * usia);
        System.out.println("=======================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tBMR ANDA ADALAH "+bmr + " kkal");
        System.out.println("=======================================================================================================");
        System.out.println("Tubuh Anda akan membakar "+bmr + " kalori setiap hari jika anda tidak melakukan aktivitas dalam 1 hari");
        System.out.println("=======================================================================================================");
        System.out.println("BMR sesuai aktivitas");
        System.out.println("1. Super Aktif (latihan yang sangat keras dan tetap konsisten)\t\t= " +bmr*1.9);
        System.out.println("2. Sangat Aktif (latihan seminggu full)\t\t\t\t\t\t\t\t= " +bmr*1.725);
        System.out.println("3. Tidak banyak bergerak (tidak berolahraga)\t\t\t\t\t\t= " +bmr*1.2);
        System.out.println("4. Aktivitas Ringan (olahraga yang tidak berat 1-4 hari/seminggu)\t= " +bmr*1.375);
        System.out.println("5. Aktivitas Cukup (olahraga yang sedang 4-5 hari/seminggu)\t\t\t= " +bmr*1.55);
        System.out.println("=======================================================================================================");
        return 0;
    }

    @Override
    public double bmr_perempuan() {
        double bmr = 655.1 + (9.563 * berba) + (1.85 * tingb) - (4.676 * usia);
        System.out.println("=======================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tBMR ANDA ADALAH "+bmr + " kkal");
        System.out.println("=======================================================================================================");
        System.out.println("Tubuh Anda akan membakar "+bmr + " kalori setiap hari jika anda tidak melakukan aktivitas dalam 1 hari");
        System.out.println("=======================================================================================================");
        System.out.println("BMR sesuai aktivitas");
        System.out.println("1. Super Aktif (latihan yang sangat keras dan tetap konsisten)\t\t= " +bmr*1.9);
        System.out.println("2. Sangat Aktif (latihan seminggu full)\t\t\t\t\t\t\t\t= " +bmr*1.725);
        System.out.println("3. Tidak banyak bergerak (tidak berolahraga)\t\t\t\t\t\t= " +bmr*1.2);
        System.out.println("4. Aktivitas Ringan (olahraga yang tidak berat 1-4 hari/seminggu)\t= " +bmr*1.375);
        System.out.println("5. Aktivitas Cukup (olahraga yang sedang 4-5 hari/seminggu)\t\t\t= " +bmr*1.55);
        System.out.println("=======================================================================================================");
        return 0;
    }
}