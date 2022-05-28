import java.util.Scanner;  // Import the Scanner class

public class ProgramPenjualan {

    public static void main(String[] args) {
        
        // Variabel
        char menu, ulang;
        int quantity, subTotal, kode_input, hargaBarang, totalBelanja;
        subTotal = 0;
        hargaBarang = 0;
        totalBelanja = 0;
        
        // Sacnner
        Scanner input = new Scanner(System.in);
        
        // Tampilan Header
        System.out.println(" +---------------------------------------+ ");
        System.out.println(" |           PROGRAM PENJUALAN           | ");
        System.out.println(" |     M. Yedi Arisandi - 2010010210     | ");
        System.out.println(" +---------------------------------------+ \n");
        
        // Menu Utama
        System.out.println(" +---------------------------------------+ ");
        System.out.println(" |              MENU  UTAMA              | ");
        System.out.println(" +---------------------------------------+ ");
        System.out.println(" | [A] Penjualan                         | ");
        System.out.println(" | [B] Daftar Barang                     | ");
        System.out.println(" +---------------------------------------+ ");
        System.out.print("   Pilih Menu [A/B] = ");
        menu = input.next().charAt(0);
        
        //--------------------------------Menu Daftar Barang--------------------------------
        
        if (menu == 'A' || menu == 'a') {
            System.out.println("\n\n\n");
            System.out.println(" +---------------------------------------+");
            System.out.println(" |                 STRUK                 |");
            System.out.println(" +---------------------------------------+");
            do {                   
                System.out.print("   Kode Barang     = ");
                kode_input = input.nextInt();                  
                    
                // Mengambil data barang dari class barang
                barang barang = new barang();
                barang.data_barang(kode_input);
                        
                // Sub Total
                hargaBarang = barang.harga;
                
                // Input Quantity
                System.out.print("   Quantity        = ");
                quantity = input.nextInt();
                
                // Sub Total
                subTotal = quantity * hargaBarang;
                System.out.println("   Sub Total       = Rp." + subTotal);
                
                // Total Belanja
                totalBelanja += subTotal;
                
                
                System.out.print(" +---------------------------------------+ Input Lagi [y/n] = ");
                ulang = input.next().charAt(0);
            } while(ulang == 'Y' || ulang == 'y');
            
            // Perhitungsan Diskon (Jika Total Belanja > 100.000 dapat diskon 2%)
            double diskon = 0;
            if (totalBelanja > 100000) {
                diskon = totalBelanja * 0.02;
                System.out.println("   Total           = Rp." + totalBelanja);
                System.out.println("   Diskon (2%)     = Rp." + diskon);
            }
            
            // Total Belanja
            totalBelanja -= diskon;
            System.out.println("   Total Belanja   = Rp." + totalBelanja);
            System.out.println(" +---------------------------------------+");
        }
        
        //--------------------------------Menu Daftar Barang--------------------------------
        
        else if(menu == 'B' || menu == 'b'){
            System.out.println("\n\n\n");
            System.out.println(" +---------------------------------------+");
            System.out.println(" |             DAFTAR BARANG             |");
            System.out.println(" +---------------------------------------+");
            
            int x = 1;
            while(x <= 5){
                System.out.println("   Kode Barang     = " + x);
                
                // Mengambil data barang dari class barang
                barang barang = new barang();
                barang.data_barang(x);
                
                System.out.println(" +---------------------------------------+");
                x++;
            }

        }
        
        
        
    }
    
}
