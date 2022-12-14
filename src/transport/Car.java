package transport;

public class Car extends Transport implements Competing{


    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " "+ getModel()+ " начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " "+ getModel()+ " окончил движение.");
    }

    @Override
    public void pitstop() {
        System.out.println("Автомобиль прошел питстоп.");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*220);
    }
}
  /*  private double engineVolume;
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
            brand = "&#x418;&#x43D;&#x444;&#x43E;&#x440;&#x43C;&#x430;&#x446;&#x438;&#x44F; &#x43D;&#x435; &#x443;&#x43A;&#x430;&#x437;&#x430;&#x43D;&#x430;";
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

        return getBrand() + " " + getModel() + ", " + getYear() + " &#x433;&#x43E;&#x434; &#x432;&#x44B;&#x43F;&#x443;&#x441;&#x43A;&#x430;, " + "&#x441;&#x431;&#x43E;&#x440;&#x43A;&#x430; &#x432; " + getCountry() + ", "
                + getColor() + " &#x446;&#x432;&#x435;&#x442; &#x43A;&#x443;&#x437;&#x43E;&#x432;&#x430;, &#x43E;&#x431;&#x44A;&#x435;&#x43C; &#x434;&#x432;&#x438;&#x433;&#x430;&#x442;&#x435;&#x43B;&#x44F; - " + engineVolume + ", &#x43A;&#x43E;&#x440;&#x43E;&#x431;&#x43A;&#x430; &#x43F;&#x435;&#x440;&#x435;&#x434;&#x430;&#x447; - " + transmission +
                ", &#x440;&#x435;&#x433;&#x438;&#x441;&#x442;&#x440;&#x430;&#x446;&#x438;&#x43E;&#x43D;&#x43D;&#x44B;&#x439; &#x43D;&#x43E;&#x43C;&#x435;&#x440; &#x430;&#x432;&#x442;&#x43E; : " + registrationNumber + ", &#x43A;&#x43E;&#x43B;&#x438;&#x447;&#x435;&#x441;&#x442;&#x432;&#x43E; &#x441;&#x438;&#x434;&#x435;&#x43D;&#x438;&#x439; : " + numberOfSeats +
                ", &#x43D;&#x43E;&#x43C;&#x435;&#x440; &#x441;&#x442;&#x440;&#x430;&#x445;&#x43E;&#x432;&#x43A;&#x438; : " + insurance.number + ", &#x441;&#x442;&#x43E;&#x438;&#x43C;&#x43E;&#x441;&#x442;&#x44C; &#x441;&#x442;&#x440;&#x430;&#x445;&#x43E;&#x432;&#x43A;&#x438; : " + insurance.cost +
                ", &#x441;&#x442;&#x440;&#x430;&#x445;&#x43E;&#x432;&#x43A;&#x430; &#x438;&#x441;&#x442;&#x435;&#x43A;&#x430;&#x435;&#x442; :  " + insurance.expireDate + " &#x423;&#x434;&#x430;&#x43B;&#x435;&#x43D;&#x43D;&#x44B;&#x439; &#x437;&#x430;&#x43F;&#x443;&#x441;&#x43A; &#x434;&#x432;&#x438;&#x433;&#x430;&#x442;&#x435;&#x43B;&#x44F; " + key.remoteEngineStart
                + " &#x411;&#x435;&#x441;&#x43A;&#x43B;&#x44E;&#x447;&#x435;&#x432;&#x43E;&#x439; &#x434;&#x43E;&#x441;&#x442;&#x443;&#x43F; " + key.isKeylessAccess() + "; &#x432;&#x438;&#x434; &#x442;&#x43E;&#x43F;&#x43B;&#x438;&#x432;&#x430;: " + getFuel() + " &#x43D;&#x430; " + getFuelPercentage()
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
            transmission = "&#x430;&#x432;&#x442;&#x43E;&#x43C;&#x430;&#x442;";
        }
        this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "&#x441;&#x435;&#x434;&#x430;&#x43D;";
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
   *//* public Car(String brand, String model, int year, String country, String color,
               double engineVolume, String registrationNumber, String transmission, String bodyType,
               int numberOfSeats, boolean rubberType, Key key, Insurance insurance, String fuel, double fuelPercentage, int numberOfSeats1) {
        super(brand, model, year, country, color, fuel, fuelPercentage);
        this.numberOfSeats = numberOfSeats1;
    }*//*

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


   public void refill() {
       System.out.println("автомобиль заправлен топливом" + getFuel());
      setFuelPercentage(100);
    }*/
