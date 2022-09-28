import java.util.Scanner;

public class ApplicationMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Nasabah nasabah = new Nasabah();
        int ulang =0;
        System.out.print("Masukan Nama Bank : ");
        String bank = sc.next();
        System.out.print("Masukan Kapasitas rekening : ");
        int n = sc.nextInt();

        while (ulang !=1){

            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("          "+"BANK "+bank.toUpperCase()+"   ");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("1. Buat Rekening");
            System.out.println("2. Cek Info Rekening");
            System.out.println("3. Setor");
            System.out.println("4. Tarik");
            System.out.println("5. Transfer");
            System.out.println("6. Mutasi");
            System.out.println("7. EXIT");
            System.out.print("Masukkan : ");
            int pilih = sc.nextInt();
            System.out.println();

            switch(pilih)
            {
                case 1 :
                    System.out.println("=========Pendaftaran rekening baru=========\n");
                    int v = nasabah.nasabah.size();
                    if(v<=n-1){
                        System.out.print(" Masukkan Nama :");
                        String nama = sc.next();
                        System.out.print(" Masukkan Nomor Rekening :");
                        String pin = sc.next();
                        int saldo= 0;int debit= 0;int kredit= 0;

                        nasabah.buat_akun(nama, pin, saldo,debit,kredit);

                    }else{
                        System.out.println("Maaf Akun Sudah Penuh ");
                    }
                    System.out.println("\n");
                    break;


                case 2 :
                    System.out.println("==========Cek Info Rekening==========\n");
                    System.out.print("Masukan Nomer Rekening : ");
                    String Norek = sc.next();
                    nasabah.tampil(Norek);
                    System.out.println("\n");
                    break;

                case 3 :
                    System.out.println("=========Setor=========\n");
                    System.out.print(" Masukkan Nomer Rekening : ");
                    String pin = sc.next();
                    System.out.print(" Saldo : ");
                    int saldo = sc.nextInt();
                    nasabah.tambahsaldo(pin, (int) saldo);
                    System.out.println("\n");
                    break;
                case 4 :
                    System.out.println("=========Tarik Tunai=========");
                    System.out.print(" Masukkan Nomer Rekening : ");
                    pin = sc.next();
                    System.out.print(" Jumlah yang ingin ditarik : ");
                    saldo = sc.nextInt();
                    nasabah.tariktunai(pin, saldo);
                    System.out.println("\n");
                    break;

                case 5 :
                    System.out.println("=========Transfer=========");
                    System.out.print("Masukan Nomor Rekening Asal : ");
                    String NoAsl = sc.next();
                    System.out.print("Masukan Nomer Rekening Tujuan :");
                    String NoTuj = sc.next();
                    System.out.print("Masukan Nominal : ");
                    int Nomi = Integer.valueOf(sc.next());
                    nasabah.transfer(NoAsl,NoTuj,Nomi);
                    System.out.println("\n");
                    break;

                case 6 :
                    System.out.println("=========Cek Mutasi=========");
                    System.out.print("Masukan Nomer Rekening : ");
                    String norek = sc.next();
                    nasabah.mutasi(norek);
                    System.out.println("\n");
                    break;

                case 7 :
                    System.exit(0);
                    break;
            }
        }

    }

}
