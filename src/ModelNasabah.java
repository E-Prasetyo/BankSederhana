public class ModelNasabah {
    private String nama;
    private String pin;
    private int saldo,debit,kredit;

    public ModelNasabah() {
    }

    public ModelNasabah(String nama, String pin, int saldo, int debit, int kredit) {
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldo;
        this.debit = debit;
        this.kredit = kredit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }
}
