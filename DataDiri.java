import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Input Data Diri ===");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";

        System.out.print("Tanggal Lahir (YYYY-MM-DD): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate today = LocalDate.now();
        Period period = Period.between(tanggalLahir, today);
        int umur = period.getYears();
        int bulan = period.getMonths();
        int days = period.getDays();

        // Output data diri
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " Tahun " + bulan + " Bulan " + days + " Hari");
    }
}
