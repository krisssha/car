public class Автомобиль {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    private String getColor() {
        return this.color;
    }

    private int getYear() {
        return this.year;
    }

    private String getCountry() {
        return this.country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return brand + " " + model + ", " + year + "год выпуска, " + "сборка в " + country + ", " + color +
                " цвет кузова, объем двигателя - " + engineVolume;
    }

    public Автомобиль(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.equals("")) {
            country = "default";
        }
        this.country = country;

        if (color == null || color.equals("")) {
            color = "белый";
        }
        this.color = color;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }
}