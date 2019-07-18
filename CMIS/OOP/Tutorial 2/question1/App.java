package question1;

/**
 * @author chamodshehanka on 7/18/2019
 * @project Demo
 **/
public class App {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(40,3,2.5);
        mountainBike.speedup(10);
        mountainBike.printInfo();

        mountainBike.applyBreak(12);
        mountainBike.printInfo();
    }
}
