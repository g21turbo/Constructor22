public class Constructors {


    public static void main(String[] args) {

        //New car object - Print year, make, model
        Car car = new Car(2022, "Dodge", "Challenger 392");
        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.model);

        //space
        System.out.println("\n");

        Car car1 = new Car(1999, "Toyota", "Supra");
        System.out.println(car1.year);
        System.out.println(car1.make);
        System.out.println(car1.model);

        System.out.println("\n");

        Car car2 = new Car(1999, "Nissan", "Skyline R34");
        System.out.println(car2.year);
        System.out.println(car2.make);
        System.out.println(car2.model);

    }
}
