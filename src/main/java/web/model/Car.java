package web.model;

public class Car {

    private int series;
    private String brand;
    private String bodyType;

    public Car(){}

    public Car(int series, String model, String bodyType){
        this.series = series;
        this.brand = model;
        this.bodyType = bodyType;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + brand + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
