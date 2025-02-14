import java.util.HashMap;
import java.util.Map;

public class Depo {

    private Map<Integer, Urun> urunler = new HashMap<>();

    // Urun Tanimlama
    public void urunTanimlama(int id, String urunIsmi, String uretici, String birim) {
        if (urunler.containsKey(id)) {
            System.out.println("Bu ürün zaten tanımlı.");
        } else {
            Urun yeniUrun = new Urun(id, urunIsmi, uretici, birim);
            urunler.put(id, yeniUrun);
            System.out.println("Ürün başarıyla tanımlandı.");
        }
    }

    // Urun Listeleme
    public void urunListele() {
        System.out.println("id        ismi               ureticisi          miktari     birimi         raf");
        System.out.println("--------------------------------------------------------------------");
        for (Urun urun : urunler.values()) {
            System.out.println(urun);
        }
    }

    // Urun Girisi
    public void urunGirisi(int id, int girisMiktari) {
        Urun urun = urunler.get(id);
        if (urun != null) {
            urun.setMiktar(urun.getMiktar() + girisMiktari);
            System.out.println("Ürün girişi başarıyla yapıldı.");
        } else {
            System.out.println("Geçersiz ürün ID.");
        }
    }

    // Urunu Rafa Koy
    public void urunuRafaKoy(int id, String raf) {
        Urun urun = urunler.get(id);
        if (urun != null) {
            urun.setRaf(raf);
            System.out.println("Ürün rafa yerleştirildi.");
        } else {
            System.out.println("Geçersiz ürün ID.");
        }
    }

    // Urun Cikisi
    public void urunCikisi(int id, int cikisMiktari) {
        Urun urun = urunler.get(id);
        if (urun != null) {
            int mevcutMiktar = urun.getMiktar();
            if (mevcutMiktar >= cikisMiktari) {
                urun.setMiktar(mevcutMiktar - cikisMiktari);
                System.out.println("Ürün çıkışı başarıyla yapıldı.");
            } else {
                System.out.println("Yetersiz miktar.");
            }
        } else {
            System.out.println("Geçersiz ürün ID.");
        }
    }
}

