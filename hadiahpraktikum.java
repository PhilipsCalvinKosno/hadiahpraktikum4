import java.util.Scanner;
public class hadiahpraktikum {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String nama , alamat ;
        char tipe= 'A' ;
        final double bayar,kembalian,p1=5000000;
        double p2=2000000;
        double p3=1000000;
        double harga = 0;
        System.out.println("===== Aplikasi Pendataan Pesawat=====\n");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Alamat : ");
        alamat = input.nextLine();
       	System.out.print("Masukkan Tipe Pesawat : ");
		try{
			tipe = (char) System.in.read();
			
		}catch(Exception c){
			System.out.println("Input Salah...!");
		}
		switch(tipe){
			case 'A' : System.out.println("Anda Memilih Pesawat A Rp 5.000.000");
			harga= harga + p1 ; break;
			case 'B' : System.out.println("Anda Memilih Pesawat B Rp 2.000.000");
			harga= harga + p2; break;
			case 'C' : System.out.println("Anda Memilih Pesawat C Rp 1.000.000"); 
     		harga= harga + p3; break;
     		default:
     		System.out.println("maaf input salah");
     		}
{    	
System.out.print("Bayar = ");
        bayar = input.nextInt();
        kembalian=bayar-harga;
            System.out.println("\n"+nama+"\n"+alamat+"\n"+"Kembalian = Rp"+kembalian);
            }
            }
            }