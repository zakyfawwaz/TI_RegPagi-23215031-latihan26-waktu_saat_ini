import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan_26 {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini sesuai timezone lokal
        ZoneId zonaLokasi = ZoneId.systemDefault();
        ZonedDateTime waktuSekarang = ZonedDateTime.now(zonaLokasi);

        // Format waktu untuk ditampilkan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss z");
        String waktuFormatted = waktuSekarang.format(formatter);

        // Menampilkan waktu saat ini
        System.out.println("Waktu saat ini sesuai lokasi Anda (" + zonaLokasi + ") adalah: " + waktuFormatted);
    }
}
