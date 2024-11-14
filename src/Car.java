public class Car {
    private String name;
    private String model;
    private  int id;
    private  int  price;
    private int year;
    private double engine;
   private  int mileage;
    public Car(String name,String model,int id,int price,int year,double engine,int mileage) {
        this.name=name;
        this.model=model;
        this.id=id;
        this.price=price;
        this.year=year;
        this.engine=engine;
        this.mileage=mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car " +
                "name: " + name + '\'' +
                ", model: " + model + '\'' +
                ", id: " + id +
                ", price: " + price +
                ", year: " + year +
                ", engine : " + engine +
                ", mileage : " + mileage +
                '}';
    }
}
