public class Runner {
     public static void main(String[] args) {
        Depo depo = new Depo();

        // Ürün Tanımlama
        depo.urunTanimlama(2545, "Peynir", "Sütaş", "Kalıp");
depo.urunTanimlama(4787,"Elma","Mersin","Palet");
        // Ürün Listeleme
        depo.urunListele();


        // Ürün Girişi
        depo.urunGirisi(2545, 5);
        depo.urunGirisi(4787,10);
        depo.urunListele();

        // Ürün Rafa Koy
        depo.urunuRafaKoy(2545, "Raf1");
        depo.urunuRafaKoy(4787,"raf3");
        depo.urunListele();

        // Ürün Çıkışı
        depo.urunCikisi(2545, 3);
        depo.urunCikisi(4787,5);
        depo.urunListele();
    }
}


