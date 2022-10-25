package org.ebebek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static double vergi;
    private static double bonus;
    private static double zam;

    public static void main(String[] args) {
        // mysql kullanarak veritabanından verileri çekerek hesaplama yöntemi 
        // Kendi bilgisayarımda bir veritabanı oluşturup bağlandığım için bu metodu çalıştığından emin olduktan sonra yorum olarak bıraktım.
        /*
        try {

            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/personel_bilgileri", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from personel_bilgi");
            while (myRs.next()) {
               System.out.print(myRs.getString("ad_soyadı"));
               System.out.println(" :");

                    float maas = myRs.getFloat("maas");
                    System.out.println(maas);
                    if (maas > 1000)
                        vergi = (maas * 0.03);
                System.out.println("Vergi :" + vergi+ " TL");

                    int calisma_saati = myRs.getInt("haftalik_calisma_saati");
                    if (calisma_saati > 40)
                        bonus = ((calisma_saati - 40) * 30);
                System.out.println("Bonus:" + bonus+ "TL");

                    int baslangic_yili = myRs.getInt("baslangic_yili");
                    if (2021 - baslangic_yili < 10 && 2021 - baslangic_yili >=0){
                        zam = (maas * 0.05);
                        System.out.println("Personel maaş artışı : " + zam + " TL");
                    }
                    else if (2021 - baslangic_yili >=10 && 2021 - baslangic_yili <20) {
                        zam = (maas * 0.1);
                        System.out.println("Personel maaş artışı : " + zam + " TL");
                    }
                    else if (2021 - baslangic_yili >=20) {
                        zam = (maas * 0.15);
                        System.out.println("Personel maaş artışı : " + zam + " TL");
                    }
                double hesap = maas + bonus - vergi;
                    
                    
                System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + hesap);
                double toplam = maas + bonus + zam - vergi;
                    
                    
                System.out.println("Toplam maaş : " + toplam + " TL");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        // Personel ile ilgili maaşı, haftalık çalışma saati, başlangıç yılı gibi bilgiler kullanıcıdan alınıp formüle uygulanabilir.
    /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Personel maaşı giriniz : ");

        float personel_maas = scanner.nextFloat();

        double personel_vergi = 0;
        if (personel_maas > 1000)
                personel_vergi = (personel_maas*0.03);
            System.out.println("Personelin ödemesi gereken vergi : "+ personel_vergi + " TL");
            
        System.out.print("Personel haftalık çalışma saati giriniz : ");
        float personel_saat = scanner.nextFloat();

        double personel_bonus = 0;
        if (personel_saat >40);
                personel_bonus = ((personel_saat - 40) * 30);
            System.out.println("Personelin alacağı bonus : "+ personel_bonus + " TL");

        System.out.print("Personel başlangıç yılını giriniz : ");
        float personel_baslangic_yili = scanner.nextFloat();


        double personel_zam =0;
        if (2021 - personel_baslangic_yili < 10 && 2021 - personel_baslangic_yili >=0){
            personel_zam = (personel_maas * 0.05);
            System.out.println("Personel maaş artışı : " + personel_zam + " TL");
        }
        else if (2021 - personel_baslangic_yili >=10 && 2021 - personel_baslangic_yili <20) {
            personel_zam = (personel_maas * 0.1);
            System.out.println("Personel maaş artışı : " + personel_zam + " TL");
        }
        else if (2021 - personel_baslangic_yili >= 20) {
            personel_zam = (personel_maas * 0.15);
            System.out.println("Personel maaş artışı : " + personel_zam + " TL");
        }
    double personel_hesap = personel_maas + personel_bonus - personel_vergi;
        List<Float> zamsiz_maas = new ArrayList<>();
        zamsiz_maas.add((float) personel_hesap);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + personel_hesap);


    double personel_toplam_maas = personel_hesap + personel_zam;
        List<Float> zamli_maas = new ArrayList<>();
        zamli_maas.add((float) personel_toplam_maas);
        System.out.println("Toplam maaş : " + zamli_maas + " TL");

*/


        // Personel Listesi javafaker kullanarak da oluşturulabilir.

        // Personel Listesi object olarak oluşturulmuş yöntem.

        Object personelList[][] = {
                {"\nAdı, Soyadı:", "Murat SİNMEZ", "\nMaaşı:", 900, "TL", "\nHaftalık Çalışma Saati:", 39, "Saat", "\nBaşlangıç Yılı:", 2021},
                {"\n\nAdı, Soyadı:", "Mücahit Kammışlıgöl, ", "\nMaaşı:", 1500, "TL", "\nHaftalık Çalışma Saati:", 41, "Saat", "\nBaşlangıç Yılı:", 2015},
                {"\n\nAdı, Soyadı:", "Sadık BOŞ, ", "\nMaaşı:", 1750, "TL", "\nHaftalık Çalışma Saati:", 45, "Saat", "\nBaşlangıç Yılı:", 2009},
                {"\n\nAdı, Soyadı:", "Sultan YÜRÜKEL, ", "\nMaaşı:", 2000, "TL", "\nHaftalık Çalışma Saati:", 45, "Saat", "\nBaşlangıç Yılı:", 1985}
        };

        int i = 0;
        for (i = 0; i < personelList.length; i++) {
            int j = 0;
            for (j = 0; j < personelList[i].length; j++)
                // Vergi hesabı
                if (j == 3)
                    System.out.println("");
            double conver_maas = (Integer) personelList[i][3];

            System.out.println("Personel Ad Soyadı :" + personelList[i][1]);
            System.out.println("Personel Ham Maaşı :" + conver_maas);
            System.out.println("Haftalık Çalışma Saati :" + personelList[i][6]);
            System.out.println("Başlangıç Yılı :" + personelList[i][9]);
            int maas = (Integer) personelList[i][3];
            if (maas > 1000)
                vergi = (maas * 0.03);
            System.out.println("Vergi :" + vergi + " TL");

            // Bonus hesabı
            if (j == 6)
                System.out.println(" ");
            int calisma = (Integer) personelList[i][6];
            if (calisma > 40)
                bonus = ((calisma - 40) * 30);
            System.out.println("Bonus:" + bonus + "TL");

            // Zam hesabı
            if (j == 9)
                System.out.println(" ");
            int baslangicYili = (Integer) personelList[i][9];
            if (2021 - baslangicYili < 10 && 2021 - baslangicYili >= 0) {
                zam = (maas * 0.05);
                System.out.println("Maaş Artışı : " + zam + " TL");
            } else if (2021 - baslangicYili >= 10 && 2021 - baslangicYili < 20) {
                zam = (maas * 0.1);
                System.out.println("Maaş Artışı : " + zam + " TL");
            } else if (2021 - baslangicYili >= 20) {
                zam = (maas * 0.15);
                System.out.println("Maaş Artışı : " + zam + " TL");
            }
            double hesap = maas + bonus - vergi;
            List<Float> zamsiz_maas = new ArrayList<>();
            zamsiz_maas.add((float) hesap);
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + hesap);


            double toplam = maas + bonus + zam - vergi;
            List<Float> zamli_maas = new ArrayList<>();
            zamli_maas.add((float) toplam);
            System.out.println("Toplam maaş : " + toplam + " TL");


        }
    }
}
