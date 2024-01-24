import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class bank2 {

    public static void main (String args[]) {

        BufferedReader input=new BufferedReader (new InputStreamReader (System.in)); {

            int pin, option, saldo, proses, jum_transfer, no_rekening, penarikan; // Variabel
            saldo=1000000;
            no_rekening=123456789;
            jum_transfer= 0;
            penarikan=0;

            try {
                System.out.println ("------------ATM-----------");
                System.out.println ("       SELAMAT DATANG     ");
                System.out.println ("        BANK BERSAMA      ");
                System.out.println ("--------------------------");
                System.out.println ("SILAHKAN INPUTKAN PIN ANDA");
                System.out.print   ("-> ");
                pin=Integer.parseInt(input.readLine()); // Inputan


                if (pin == 18333) // Kondisi If
                {

                    do { // Kondisi Do While
                        System.out.println ("\n--------------------------");
                        System.out.println ("MENU TRANSAKSI ANDA");
                        System.out.println ("A/n Fakhrul Amri\n");
                        System.out.println ("SILAHKAN PILIH OPTION");

                        System.out.println  ("-> 1. INFO SALDO");
                        System.out.println  ("-> 2. TRANSFER");
                        System.out.println  ("-> 3. PENARIKAN");
                        System.out.println  ("-> 4. TRANSAKSI LAIN");
                        System.out.println  ("-> 5. KELUAR");
                        System.out.println ("--------------------------");

                        System.out.print ("OPTION -> ");
                        option=Integer.parseInt(input.readLine());


                        switch (option) { // Perulangan Case
                            case 1:
                                System.out.println ("================================");
                                System.out.println ("SALDO ANDA SAAT INI : "+saldo);
                                System.out.println ("================================");
                                break;

                            case 2:

                                System.out.println ("=================================");
                                System.out.println ("TRANSFER DANA KE BANK LAIN ");
                                System.out.println ("=================================");

                                System.out.print( "Masukan No Rekening     : " );
                                no_rekening=Integer.parseInt(input.readLine());
                                System.out.print( "Masukan Jumlah Transfer : " );
                                jum_transfer=Integer.parseInt(input.readLine());

                                for ( int i=0; i<=1; i++ ){ // Perulangan For
                                    System.out.print ("PIN ANDA : ");
                                    pin=Integer.parseInt(input.readLine());
                                }

                                if (pin == 18333) { // Pencocokan PIN
                                    System.out.println  ("> PIN MATCH : OK ");
                                }
                                else {
                                    System.out.println ("> PIN NOT MATCH. Trasaksi Batal");
                                }

                                if (jum_transfer <= (saldo-20000)) { // Cek saldo memenuhi aturan transfer
                                    System.out.println  ("> SALDO : OK");
                                }

                                else {
                                    System.out.print ("--> SALDO TIDAK CUKUP UNTUK TRANSFER. Trasaksi Batal");
                                }

                                if (no_rekening == 123456789) { // Cek kevalidan No rekening
                                    System.out.println (" -> No Rekening      = "+no_rekening);
                                    System.out.println (" -> a/n              = Arjuna Aulia Tirta");
                                    System.out.println (" -> Jumlah Transfer  = "+jum_transfer);
                                    System.out.println (" TRANSAKSI BERHASIL !"); }

                                else {
                                    System.out.println ("No Rekening tidak terdaftar. Transaksi BATAL");
                                }

                                saldo=saldo-jum_transfer ;
                                break;

                            case 3:
                                System.out.println ("=================================");
                                System.out.println ("         PENARIKAN UANG ");
                                System.out.println ("=================================");
                                System.out.print ("Masukan jumlah uang >> ");
                                penarikan=Integer.parseInt(input.readLine());
                                System.out.println ("Saldo Awal        : "+saldo);
                                System.out.println ("Penarikan         : "+penarikan);
                                saldo=saldo-penarikan;
                                System.out.println ("Saldo akhir       : "+saldo);
                                for ( int i=0; i<=1; i++ ){
                                    System.out.print ("\nPIN ANDA : ");
                                    pin=Integer.parseInt(input.readLine());
                                }

                                if (pin == 18333) {
                                    System.out.println ("-> PIN MATCH ");
                                }
                                else {
                                    System.out.println ("-> PIN NOT MATCH. Trasaksi Batal");
                                }

                                if (penarikan >= (saldo-50000))
                                {
                                    System.out.println ("-> SALDO TIDAK CUKUP : TRANSAKSI GAGAL !");
                                }

                                else{
                                    System.out.println ("TRANSAKSI BERHASIL");
                                }

                                break;

                            case 4:
                                System.out.println ("=================================");
                                System.out.println ("       HISTORY TRANSAKSI");
                                System.out.println ("=================================");
                                System.out.println ("Transksi Terakhir");
                                System.out.println ("Penarikan Uang :"+ penarikan);
                                System.out.println ("Trasfer Uang   :"+ jum_transfer);
                                System.out.println ("Saldo Akhir    :"+ saldo);
                                java.io.File file = new java.io.File("Struck.txt");
                                try {
                                    java.io.PrintWriter output = new java.io.PrintWriter(file);
                                    System.out.println("Struck telah keluar");
                                    output.println ("=================================");
                                    output.println ("           STRUCK ATM");
                                    output.println ("=================================");
                                    output.println ("Transksi Terakhir");
                                    output.println ("Penarikan Uang :"+ penarikan);
                                    output.println ("Trasfer Uang   :"+ jum_transfer);
                                    output.println ("Saldo Akhir    :"+ saldo);
                                    output.close();
                                }
                                catch (Exception e){
                                    System.out.println(e);
                                }
                                break;


                            default:
                                System.out.println ("TERIMA KASIH TELAH MENGGUNAKAN BANK BERSAMA");
                                break;


                        }
                        System.out.println ("\nTEKAN 0 UNTUK KEMBALI KE MENU");
                        System.out.print ("->> ");
                        proses=Integer.parseInt(input.readLine());
                        ++proses;

                    }


                    while ( proses <= 1);
                }

                else {
                    System.out.println ("PIN ANDA SALAH ! ATM ANDA DIBLOKIR. \nHUBUNGI KANTOR CABANG TERDEKAT atau CALL 0895416003385");
                }

            }

            catch (IOException e)
            {
                System.out.print("");
            }

            catch (NumberFormatException e)
            {
                System.out.println("PIN ANDA BUKAN ANGKA !");
            }
        }
    }
}