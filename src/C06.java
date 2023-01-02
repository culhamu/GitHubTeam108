import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class C06 {
    public static void main(String[] args) {
          /*
        Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.
         */
        LocalDate ali=LocalDate.of(2012,11,24);
        LocalDate veli=ali.plusYears(3).plusDays(11);

        long veliYas= ChronoUnit.YEARS.between(veli,LocalDate.now());
        System.out.println(veliYas);

    }
}
