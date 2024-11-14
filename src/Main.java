import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("Mercedes", "190E", 345, 5000, 1980, 2.0, 200000);
boolean bulundu=false;
        System.out.println("0-cixis et");
        System.out.println("1: Maşın əlavə et (admin icazəsi tələb olunur)");
        System.out.println("2: Maşın al");
        System.out.println("3: Maşın sil (admin icazəsi tələb olunur)");
        System.out.println("4: İstədiyiniz maşının məlumatına baxın");
        System.out.println("5: Bütün maşınların listi");
        System.out.println("Melumatlari guncelle(admin icazəsi tələb olunur)");
        Scanner sc = new Scanner(System.in);
String password="xanbala2005";
        while (true) {
            System.out.print("Seçiminizi edin (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine(); // nextInt sonrası satır sonunu temizlemek için

            switch (choice) {
                case 0:
                    System.out.println("cixis edilir....");
                    sc.close();
                    return;
                case 1:
                    System.out.println("bu emeliyyati etmek ucun sifre daxil etmelisiniz");
                    String userPassword = sc.nextLine();
                    if (userPassword.equals(password)) {
                        System.out.println("Maşın adını daxil edin: ");
                        String name = sc.nextLine();
                        System.out.println("Model daxil edin: ");
                        String model = sc.nextLine();
                        System.out.println("ID daxil edin: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // nextInt sonrası satır sonunu temizlemek için
                        System.out.println("Qiymət daxil edin: ");
                        int price = sc.nextInt();
                        sc.nextLine(); // nextInt sonrası satır sonunu temizlemek için
                        System.out.println("İl daxil edin: ");
                        int year = sc.nextInt();
                        sc.nextLine(); // nextInt sonrası satır sonunu temizlemek için

                        System.out.println("Mator daxil edin: ");
                        // nextLine ile alıp Double.parseDouble ile dönüştürüyoruz
                        double engine = Double.parseDouble(sc.nextLine());

                        System.out.println("Kilometraj daxil edin: ");
                        int mileage = sc.nextInt();
                        sc.nextLine(); // nextInt sonrası satır sonunu temizlemek için

                        // Yeni bir araba oluşturup Mercedes listesine ekliyoruz
                        Car newCar = new Car(name, model, id, price, year, engine, mileage);
                        mercedes.add(newCar);
                    } else {
                        System.out.println("yanlis praol daxil edilib");
                    }

                    break;

                case 2:
                    System.out.println("Model daxil edin: ");
                    String modelforbuy = sc.nextLine();
                    System.out.println("Balans daxil edin: ");
                    Double balance = sc.nextDouble();
                    for (int i = 0; i < Mercedes.cars.length; i++) {
                        if (balance >= Mercedes.cars[i].getPrice() && modelforbuy.equals(Mercedes.cars[i].getModel())) {
                            mercedes.buy(modelforbuy, balance);
                            System.out.println("Tebrikler siz  " + Mercedes.cars[i].getModel() + "  markali masini aldiniz");
                        }
                    }
                     {
                    System.out.println("yanlis melumat daxil edilib");
                }
                    break;
                case 3:
System.out.println("melumat silmek ucun parolu daxil edin");
String PaswordForDelete=sc.nextLine();
if(PaswordForDelete.equals(password)) {
    System.out.println("silmek istediyiniz masinin id-sini daxil edin");
    int id=sc.nextInt();
    for(int i=0;i<Mercedes.cars.length;i++) {
        if(id==Mercedes.cars[i].getId()) {
            mercedes.deleteByID(id);
            System.out.println("Melumatlar ugurla silindi");
        }
    }
    {
        System.out.println("Yanlis id daxil edilib");
    }
}else {
    System.out.println("Yanlis parol daxil edilib");
}

break;
case 4:
    System.out.println("istediyiniz masinin id-sini daxil edin: ");
    int id=sc.nextInt();
    for (int i = 0; i < Mercedes.cars.length; i++) {
        if (id == Mercedes.cars[i].getId()) {
            System.out.println(Mercedes.cars[i]);
         bulundu = true;  // Aracı bulduğumuzda bayrağı true yapıyoruz
            break;           // Aracı bulduktan sonra döngüden çıkıyoruz
        }
    }

    if (!bulundu) {
        System.out.println("yanlis id daxil edilib");
    }


    break;
    case 5:
       System.out.println(Arrays.toString(Mercedes.cars));


        break;
                case 6:
                    System.out.println("Melumatlari guncellemek ucun parolu daxil edin:");
                    String passwordForUpdate = sc.nextLine();
                    if (passwordForUpdate.equals(password)) {
                        System.out.println("Guncellemek istediyiniz masinin ID-sini daxil edin:");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        boolean isfinded = false;

                        for (int i = 0; i < Mercedes.cars.length; i++) {
                            if (updateId == Mercedes.cars[i].getId()) {
                                isfinded = true;


                                System.out.println("Yeni model adını daxil edin (movcud: " + Mercedes.cars[i].getModel() + "): ");
                                String newModel = sc.nextLine();
                                Mercedes.cars[i].setModel(newModel);

                                System.out.println("Yeni qiymət daxil edin (movcud: " + Mercedes.cars[i].getPrice() + "): ");
                                int newPrice = sc.nextInt();
                                sc.nextLine();
                                Mercedes.cars[i].setPrice(newPrice);

                                System.out.println("Yeni il daxil edin (mevcut: " + Mercedes.cars[i].getYear() + "): ");
                                int newYear = sc.nextInt();
                                sc.nextLine(); // Satır sonunu temizlemek için
                                Mercedes.cars[i].setYear(newYear);

                                System.out.println("Yeni mator daxil edin (mevcut: " + Mercedes.cars[i].getEngine() + "): ");
                                double newEngine =Double.parseDouble(sc.nextLine());
                                sc.nextLine(); // Satır sonunu temizlemek için
                                Mercedes.cars[i].setEngine(newEngine);

                                System.out.println("Yeni kilometraj daxil edin (mevcut: " + Mercedes.cars[i].getMileage() + "): ");
                                int newMileage = sc.nextInt();
                                sc.nextLine(); // Satır sonunu temizlemek için
                                Mercedes.cars[i].setMileage(newMileage);

                                System.out.println("Melumatlar ugurla guncellendi");
                                break;
                            }
                        }

                        if (!isfinded) {
                            System.out.println("Yanlis ID daxil edilib, masin tapilmadi.");
                        }
                    } else {
                        System.out.println("Yanlis parol daxil edilib.");
                    }
                    break;

                default:
                    System.out.println("Yanlis secim daxil edilib");
            }
        }

    }
}