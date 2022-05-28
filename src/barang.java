public class barang {

    String nama_barang;
    int harga;
    
    void data_barang(int kode_barang){
        
        if (kode_barang == 1) {
            // Data Barang 1
            nama_barang = "Barang 1";
            harga = 10000;
        }
        else if(kode_barang == 2){
            // Data Barang 2
            nama_barang = "Barang 2";
            harga = 20000;
        }
        else if(kode_barang == 3){
            // Data Barang
            nama_barang = "Barang 3";
            harga = 30000;
        }
        else if(kode_barang == 4){
            // Data Barang
            nama_barang = "Barang 4";
            harga = 25000;
        }
        else if(kode_barang == 5){
            // Data Barang
            nama_barang = "Barang 5";
            harga = 100000;
        }
        else{
            // Error
            nama_barang = "ERROR!!! : Kode barang yang diinput tidak tersedia.";
            harga = 0;
        }
        
        // Menampilkan Barang
        System.out.println("   Nama Barang     = " + nama_barang);
        System.out.println("   Harga Barang    = Rp." + harga);
            
    }
    
}
