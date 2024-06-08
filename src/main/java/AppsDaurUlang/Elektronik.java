package AppsDaurUlang;

public class Elektronik extends BarangBekas implements KondisiElektronik {

    private int banyak;
    private double harga;
    private boolean hidup, mati;

    public Elektronik(Owner id_Pemilik, double admin, int banyak, double harga, boolean hidup, boolean mati) {
        super(id_Pemilik, admin, harga);
        this.banyak = banyak;
        this.harga = harga;
        this.hidup = hidup;
        this.mati = mati;
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public boolean isHidup() {
        return hidup;
    }

    public void setHidup(boolean hidup) {
        this.hidup = hidup;
    }

    public boolean isMati() {
        return mati;
    }

    public void setMati(boolean mati) {
        this.mati = mati;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public void tampilInfo() {

    }

    @Override
    public String kondisi() {
        if (hidup) {
            return "Barang ini masih berfungsi dengan baik, bisa dijual lebih mahal";
        } else {
            return "Barang ini sudah rusak, buang saja";
        }

    }
}
