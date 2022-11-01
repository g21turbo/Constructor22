public class Constructors {


    public static void main(String[] args) {

        //New car object - Print year, make, model
        Car car = new Car(2022, "Dodge", "Challenger 392");
        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year + " " + car.make + " " + car.model);

        //space
        System.out.println("\n");

        Car car1 = new Car(1999, "Toyota", "Supra");
        System.out.println(car1.year);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year + " " + car1.make + " " + car1.model);

        //space
        System.out.println("\n");

        Car car2 = new Car(1999, "Nissan", "Skyline R34");
        System.out.println(car2.year);
        System.out.println(car2.make);
        System.out.println(car2.model);

        System.out.println(car2.year + " " + car2.make + " " + car2.model);

        //space
        System.out.println("\n");

        //Constructor not visible because it is private but static fields can be used
        System.out.println(Constants.MY_NAME);


    }
}
