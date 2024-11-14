import java.util.Arrays;

public class Mercedes extends Car implements Operations {

    private int count=0;






          public static Car[] cars = {
                  new Mercedes("Mercedes", "W140-S500", 203, 11000, 1999, 5.5, 200000),
                  new Mercedes("Mercedes", "W140-S600", 250, 12000, 1998, 6.0, 180000),
                  new Mercedes("Mercedes", "W124-E320", 150, 8000, 1995, 3.2, 220000),
                  new Mercedes("Mercedes", "W124-E500", 210, 9500, 1994, 5.0, 240000),
                  new Mercedes("Mercedes", "190E-2.3", 80, 5000, 1989, 2.3, 300000),
                  new Mercedes("Mercedes", "190E-2.5-16", 120, 6500, 1991, 2.5, 260000),
                  new Mercedes("Mercedes", "C-Class-W202-C180", 100, 5500, 1997, 1.8, 210000),
                  new Mercedes("Mercedes", "C-Class-W202-C280", 140, 7200, 1996, 2.8, 190000),
                  new Mercedes("Mercedes", "C-ClassW-203-C230", 160, 8500, 2002, 2.3, 150000),
                  new Mercedes("Mercedes", "S-Class-W220-S430", 220, 11000, 2005, 4.3, 130000),
                  new Mercedes("Mercedes", "S-Class-W221-S550", 300, 15000, 2010, 5.5, 90000),
                  new Mercedes("Mercedes", "E-Class-W212-E350", 250, 12000, 2012, 3.5, 95000),
                  new Mercedes("Mercedes", "E-Class-W213-E300", 280, 13500, 2018, 2.0, 30000),
                  new Mercedes("Mercedes", "C-Class-W205-C300", 230, 11500, 2019, 2.0, 25000),
                  new Mercedes("Mercedes", "AMG-GT-S", 500, 25000, 2018, 4.0, 20000),
                  new Mercedes("Mercedes", "G-Class-G63-AMG", 650, 32000, 2020, 4.0, 15000),
                  new Mercedes("Mercedes", "SL-Class-SL500", 300, 15000, 2015, 4.7, 30000),
                  new Mercedes("Mercedes", "GLS-450", 350, 18000, 2021, 3.0, 10000),
                  new Mercedes("Mercedes", "CLS-550", 280, 14000, 2014, 4.7, 60000),
    };


    public Mercedes(String name, String model, int id,int price, int year, double engine, int mileage) {
        super(name, model,id, price, year, engine, mileage);

    }

    @Override
    public void add(Car dataCar) {
if(count<cars.length) {
    cars[count++]=dataCar;
    count++;
    System.out.println("Masin elave olundu");

}else {
    System.out.println("list doludu");
}


    }

    @Override
    public void buy(String model,double Balance) {
for(int i=0;i<count;i++) {
    if(model.equals(cars[i].getModel())&&Balance>=cars[i].getPrice()) {
        System.out.println("siz  "+cars[i].getModel()+" markali mercedes avtomibilini aldiniz");
    }
    System.out.println("XETA");
}
    }

    @Override
    public void deleteByID(int id) {
for(int i=0;i<count;i++) {
    if(id==cars[i].getId()) {
        for(int j=i;j<count;j++) {
            cars[j]=cars[j+1];
        }
        cars[count-1]=null;
        count--;
        System.out.println("Car deleted");
    }
}
    }

    @Override
    public Car getCarById(int id) {
        for(int i=0;i<count;i++) {
            if(cars[i].getId()==id) {
                return cars[i];
            }else {
                System.out.println("yanlis id daxil edilib");
            }
        }

        return null;
    }

    @Override
    public Car[] getcars() {
        return cars;
    }


}
