package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private Key key;
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isRubberType() {
        return rubberType;
    }

    boolean rubberType;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    private String getBodyType() {
        return this.bodyType;
    }

    private int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    private String getTransmission() {
        return this.transmission;
    }

    private String getRegistrationNumber() {
        return this.registrationNumber;
    }

    private boolean getRubberType() {
        return this.rubberType;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "Информация не указана";
        }
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRubberType(boolean rubberType) {
        this.rubberType = rubberType;
    }


    public String toString() {

        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, " + "сборка в " + getCountry() + ", "
                + getColor() + " цвет кузова, объем двигателя - " + engineVolume + ", коробка передач - " + transmission +
                ", регистрационный номер авто : " + registrationNumber + ", количество сидений : " + numberOfSeats +
                ", номер страховки : " + insurance.number + ", стоимость страховки : " + insurance.cost +
                ", страховка истекает :  " + insurance.expireDate + " Удаленный запуск двигателя " + key.remoteEngineStart
                + " Бесключевой доступ " + key.isKeylessAccess() + "; вид топлива: " + getFuel() + " на " + getFuelPercentage()
                + " %";
    }

    public Car(String brand, String model, int year, String country, String color,
               double engineVolume, String registrationNumber, String transmission, String bodyType,
               int numberOfSeats, boolean rubberType, Key key, Insurance insurance) {
        super(brand, model, year, country, color);

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "автомат";
        }
        this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "седан";
        }
        this.bodyType = bodyType;

        if (getNumberOfSeats() == 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;

        this.rubberType = rubberType;
        this.registrationNumber = "x000xx000";

        if (key == null) {
            key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }
   /* public Car(String brand, String model, int year, String country, String color,
               double engineVolume, String registrationNumber, String transmission, String bodyType,
               int numberOfSeats, boolean rubberType, Key key, Insurance insurance, String fuel, double fuelPercentage, int numberOfSeats1) {
        super(brand, model, year, country, color, fuel, fuelPercentage);
        this.numberOfSeats = numberOfSeats1;
    }*/

    public void tireСhange(int month) {
        if (month < 3 || month > 11) {
            rubberType = !rubberType;
            System.out.println("переобуться в зиму");
        }
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteEngineStart;

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        private final boolean keylessAccess;

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }


        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "000000000";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public void chekExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Срочно нужно оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

    @Override
    public void refill() {
        System.out.println("автомобиль заправлен топливом" + getFuel());
        setFuelPercentage(100);
    }
}