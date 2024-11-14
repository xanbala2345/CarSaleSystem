public interface Operations {
    void add(Car dataCar);
    void buy(String model,double Balance);
    void deleteByID(int id);
    Car getCarById(int id);
    Car[] getcars();

}
