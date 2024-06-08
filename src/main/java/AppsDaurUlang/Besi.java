package AppsDaurUlang;

public class Besi extends BarangBekas {

    private double berat;
    private double harga;

    public Besi(Owner id_Pemilik, double admin, double berat, double harga) {
        super(id_Pemilik, admin, harga);
        this.berat = berat;
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Admin: " + admin);
        System.out.println("Saldo: " + saldo);
    }
}
