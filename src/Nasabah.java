import java.util.ArrayList;

public class Nasabah {
    ArrayList<ModelNasabah> nasabah = new ArrayList<ModelNasabah>();
    double saldo = 0;

    public Nasabah() {}

    public Nasabah(ArrayList<ModelNasabah> nasabah) {
        this.nasabah = nasabah;
    }

    public void buat_akun(String nama, String pin, int saldo, int debit, int kredit){
        int j=0;int l=0;

        if(nasabah.isEmpty())
        {nasabah.add(new ModelNasabah(nama, pin, saldo,debit,kredit));System.out.println("Pendaftaran Berhasil");}else{
            for(ModelNasabah sg:nasabah){
                if(pin.equals(sg.getPin())){j=1;}else{l=1;}}

            if (j==1){System.out.println("Pendaftaran Gagal, Nomer Rekening Telah Digunakan");}
            if (l==1&&j!=1){nasabah.add(new ModelNasabah(nama, pin, saldo,debit,kredit));System.out.println("Pendaftaran Berhasil");
            }}}

    public void tampil(String n){
        int j=0;int l=0;
        if(nasabah.isEmpty()){    System.out.println("Akun Tidak Terdaftar");}else{
            for(ModelNasabah sg:nasabah){
                if(n.equals(sg.getPin())){ j=1;
                    System.out.println("\n  Nama Nasabah   : "+sg.getNama());
                    System.out.println("  Nomer Rekening  : "+sg.getPin());
                    System.out.println("  Saldo Terkini   : "+sg.getSaldo());
                }else{ l=2;}

            }if (l==2&&j!=1){System.out.println("Akun Tidak Terdaftar");}}
    }




    public void mutasi(String n){
        if(nasabah.isEmpty()){            System.out.println("Akun Tidak Terdaftar");}else{
            int j=0;int l=0;
            for(ModelNasabah sg:nasabah){
                if(n.equals(sg.getPin())){ j=1;
                    System.out.println("       Mutasi No. Rek. "+sg.getPin());
                    System.out.println("  Kredit : "+sg.getKredit());
                    System.out.println("  Debit  : "+sg.getDebit());
                    System.out.println("\n");
                }else{ l=1;}

            }if (l==1&&j!=1){System.out.println("Akun Tidak Terdaftar");}}
    }

   /* public void HapusData(String pin){
        for (ModelNasabah sg:nasabah) {
            if (pin.equals(sg.getPin())) {
                nasabah.remove(ModelNasabah(nama, pin, saldo));
            }
        }
    }*/

    public void tambahsaldo(String pin, int saldo){
        if(nasabah.isEmpty()){            System.out.println("Akun Tidak Terdaftar");}else{
            if (saldo<0){System.out.println("Transaksi Gagal, Nominal Tidak Tervalid");}
            int j=0;int l=0;
            for(ModelNasabah sg:nasabah){
                if(pin.equals(sg.getPin()) && saldo>0){j=1;
                    sg.setSaldo(sg.getSaldo()+saldo);
                    sg.setKredit(sg.getKredit()+saldo);
                    System.out.println("Transaksi Berhasil");
                }else{l=1;}}
            if (j!=1&&l==l){System.out.println("Transaksi Gagal, Akun Tidak Terdaftar");}
        } }




    public void tariktunai(String pin, int saldo){
        if(nasabah.isEmpty()){     System.out.println("Akun Tidak Terdaftar");}else{
            int j=0;int l=0;int k=0;
            for(ModelNasabah sg:nasabah){
                if(pin.equals(sg.getPin())){  l=1;
                    if (sg.getSaldo()>saldo && saldo>0) { j=1;
                        sg.setSaldo(sg.getSaldo()-saldo);
                        sg.setDebit(sg.getDebit()+saldo);
                        System.out.println("Transaksi Berhasil");
                    }else{if (j!=1){System.out.println("Transaksi Gagal, Saldo Anda Tidak Cukup/Tidal Valid");}}
                }else{k=1;}
            }if (l!=1&&k==1&&j!=1){System.out.println("Transaksi Gagal, Akun Tidak Terdaftar");}
        }}


   /* public void hapusnasabah(String pin){
       for(ModelNasabah sg:nasabah){
        if (pin.equals(sg.getPin())) {
            nasabah.remove(sg.getNama());
            nasabah.remove(sg.getPin());
            nasabah.remove(sg.getSaldo());
        }
        }*/

    public double transfer(String pin1,String pin2,int nomi){
        int a=0;int b=0;int c=1;int d=0;int e=0;int f=0;int h=0;

        if(nasabah.isEmpty()){     System.out.println("Akun Tidak Terdaftar");}else{

            if(nomi<0){     System.out.println("Nominal Tidak Valid");}else{

                for(ModelNasabah sg:nasabah){
                    if (pin2.equals(sg.getPin())){a=1;}
                    if (pin1.equals(sg.getPin())){f=1;
                        int Saldo = sg.getSaldo();
                        if (Saldo<nomi ){b=1;
                            System.out.println("Tranfer Gagal, Saldo Tidak Mencukupi");
                        }else {d=1;
                        }
                    }else {h=1;System.out.println("");}

                }
                if (f==1){
                    for(ModelNasabah sg:nasabah){
                        if(pin1.equals(sg.getPin())&&d==1&&a==1){ c=1;
                            sg.setSaldo(sg.getSaldo()-nomi);
                            sg.setDebit(sg.getDebit()+nomi);
                        }else {if (d==1&&f!=1){System.out.println("Akun Asal Tidak Terdaftar");}}
                        if(pin2.equals(sg.getPin())&&c==1){ e=1;
                            sg.setSaldo(sg.getSaldo()+nomi);
                            sg.setKredit(sg.getKredit()+nomi);}
                    }
                }if (d==1&&a==1){System.out.println("Berhasil");}
                if (d==1&&f!=1||d!=1&&f!=1){System.out.println("Akun Asal Tidak Terdaftar");}
                if (d==1&&a!=1||d!=1&&a!=1){System.out.println("Akun Tujuan Tidak Terdaftar");}

            }
        }    return this.saldo;
    }

}
