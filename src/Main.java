public class Main {
    public static void main(String[] args) {
       /* Автомобиль Lada = new Автомобиль();
        Lada.setBrand("Lada");
        Lada.setModel("Granta");
        Lada.setYear(2015);
        Lada.setCountry("России");
        Lada.setColor("Желтый");
        Lada.setEngineVolume(1.7);

        Автомобиль Audi= new Автомобиль();
        Audi.setBrand("Audi");
        Audi.setModel("A8 50 L TDI quattro");
        Audi.setYear(2020);
        Audi.setCountry("Германии");
        Audi.setColor("Черный");
        Audi.setEngineVolume(3.0);

        Автомобиль BMW= new Автомобиль();
        BMW.setBrand("BMW");
        BMW.setModel("Z8");
        BMW.setYear(2021);
        BMW.setCountry("Германии");
        BMW.setColor("Черный");
        BMW.setEngineVolume(3.0);

        Автомобиль Kia= new Автомобиль();
        Kia.setBrand("Kia");
        Kia.setModel("Sportage");
        Kia.setYear(2018);
        Kia.setCountry("Южной корее");
        Kia.setColor("Красный");
        Kia.setEngineVolume(2.4);

        Автомобиль Hyundai = new Автомобиль();
        Hyundai .setBrand("Hyundai ");
        Hyundai .setModel("Avante");
        Hyundai .setYear(2016);
        Hyundai .setCountry("Южной корее");
        Hyundai .setColor("Оранжевый");
        Hyundai .setEngineVolume(1.6);*/

        Автомобиль Lada = new Автомобиль("Lada", "Granta", 2015, "России", "желтый",
                1.7);
        Автомобиль Audi = new Автомобиль("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный",
                3.0);
        Автомобиль BMW = new Автомобиль("BMW", "Z8", 2021, "Германии", "", 3.0);
        Автомобиль Kia = new Автомобиль("Kia", "Sportage", 2018, "Южной Корее", "красный",
                2.4);
        Автомобиль Hyundai = new Автомобиль("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый",
                1.6);

        System.out.println(Lada.toString());
        System.out.println(Audi.toString());
        System.out.println(BMW.toString());
        System.out.println(Kia.toString());
        System.out.println(Hyundai.toString());
    }
}
