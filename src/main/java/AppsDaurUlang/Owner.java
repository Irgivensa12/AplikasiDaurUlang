package AppsDaurUlang;

public class Owner {

    private String namaOwner;
    private String alamat;
    private Owner owner;
    private BarangBekas saldo;

    public Owner(String namaOwner, String alamat, Owner owner, BarangBekas saldo) {
        this.namaOwner = namaOwner;
        this.alamat = alamat;
        this.owner = owner;
        this.saldo = saldo;
    }

    public String getNamaP() {
        return namaOwner;
    }

    public void setNamaP(String namaP) {
        this.namaOwner = namaP;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public BarangBekas getSaldo() {
        return saldo;
    }

    public void setSaldo(BarangBekas saldo) {
        this.saldo = saldo;
    }

    public void add() {
        
    }

    public void delete() {
        System.out.print("Masukkan NPP pegawai yang akan dihapus: ");
       
    }

}
