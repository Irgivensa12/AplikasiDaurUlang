package AppsDaurUlang;

import java.util.Scanner;

public class AppsMain {

    private static final String VALID_EMAIL = "user@example.com";
    private static final String VALID_PASSWORD = "password123";
    private static int barangCount = 0;

    public static void main(String[] args) {

        Transaksi transaksi[] = new Transaksi[100];
        BarangBekas barang[] = new BarangBekas[100];
        Owner owner[] = new Owner[100];

        Scanner in = new Scanner(System.in);
        System.out.println(">>>>>>>>>> SELAMAT DATANG DI MY DAUR ULANG <<<<<<<<<<");
        System.out.println();
        String emailUser = null;
        String pwUser = null;
        boolean loginSuccess = false;

        do {
            System.out.println("Silahkan login dengan akun Anda !");
            System.out.println();
            System.out.println("Contoh email dan password yang valid :\n"
                    + VALID_EMAIL + "\n" + VALID_PASSWORD);
            System.out.println();
            System.out.print("Masukan email Anda :");
            emailUser = in.next();
            System.out.print("Password : ");
            pwUser = in.next();

            if (emailUser.equals(emailUser) && pwUser.equals(pwUser)) {
                System.out.println("Login Anda berhasil :)");
            } else {
                System.out.println("Email/password tidak cocok silahkan login ulang !");
            }
        } while (!loginSuccess);

        System.out.println("Menu Utama\n"
                + "1. Daftar barang bekas\n"
                + "2. Cari barang bekas\n"
                + "3. Beli barang bekas\n"
                + "4. Riwayat Transaksi\n"
                + "5. Keluar");

        System.out.println("Silahkan pilih menu kami : ");
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Jenis barang bekas yang tersedia :\n "
                        + "1. Besi"
                        + "2. Plastik"
                        + "3. Kertas"
                        + "4. Elektronik");
                System.out.println();
                break;
            case 2:
                cariBarangBekas(in, barang);
                break;

            case 3:

        }
    }

    public static boolean isEmpty() {
        return barangCount == 0;
    }

    private static void daftarBarangBekas(BarangBekas[] barang) {
        if (isEmpty()) {
            System.out.println("Tidak ada barang bekas tersedia.");
        } else {
            System.out.println("Jenis barang bekas yang tersedia:");
            for (int i = 0; i < barangCount; i++) {
                if (barang[i] != null) {
                    barang[i].tampilInfo();
                    System.out.println("-----");
                }
            }
        }
    }

    private static void cariBarangBekas(Scanner in, BarangBekas[] barang) {
        System.out.println("Jenis barang bekas yang tersedia :\n "
                + "1. Besi"
                + "2. Plastik"
                + "3. Kertas"
                + "4. Elektronik");
        System.out.print("Apa yang ingn Anda cari (ketikkan angka yg mewakili jenis barang) :");
        int pilihan = in.nextInt();
        String jenis = "";
        switch (pilihan) {
            case 1:
                jenis = "Besi";
                break;
            case 2:
                jenis = "Plastik";
                break;
            case 3:
                jenis = "Kertas";
                break;
            case 4:
                jenis = "Elektronik";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        boolean found = false;
        for (int i = 0; i < barang.length; i++) {
            if (barang[i] != null && barang[i].getJenis().equalsIgnoreCase(jenis)) {
                barang[i].tampilInfo();
                System.out.println("-----");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada barang bekas jenis " + jenis + " yang ditemukan.");
        }
    }
}
