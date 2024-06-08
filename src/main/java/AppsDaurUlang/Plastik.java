package AppsDaurUlang;

public class Plastik extends BarangBekas {

    private int jumlah;
    private double harga;

    public Plastik(Owner id_Pemilik, double admin, int jumlah, double harga) {
        super(id_Pemilik, admin, harga);
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Jumlah Barang : " + getJumlah() + " Harga : " + getHarga());
    }
}
