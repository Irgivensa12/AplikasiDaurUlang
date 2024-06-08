package AppsDaurUlang;

public class Transaksi {

    private String tanggal;
    private int jumlahBarang;
    private double berat;
    private double hargaJual;
    private Costumer id_Pembeli;
    private Owner id_Pemilik;

    public Transaksi(String tanggal, int jumlahBarang, double berat, double hargaJual, Costumer id_Pembeli, Owner id_Pemilik) {
        this.berat = berat;
        this.hargaJual = hargaJual;
        this.jumlahBarang = jumlahBarang;
        this.tanggal = tanggal;

    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public Costumer getId_Pembeli() {
        return id_Pembeli;
    }

    public void setId_Pembeli(Costumer id_Pembeli) {
        this.id_Pembeli = id_Pembeli;
    }

    public Owner getId_Pemilik() {
        return id_Pemilik;
    }

    public void setId_Pemilik(Owner id_Pemilik) {
        this.id_Pemilik = id_Pemilik;
    }

    public double Transaksi() {
        return totalHarga();
    }

    public double totalHarga() {
        return jumlahBarang * berat * hargaJual;
    }

}
