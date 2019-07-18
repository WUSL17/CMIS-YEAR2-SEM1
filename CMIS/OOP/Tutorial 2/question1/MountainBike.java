package question1;

/**
 * @author chamodshehanka on 7/18/2019
 * @project Demo
 **/
public class MountainBike extends Bicycle {

    private double seatHeight;

    public MountainBike(double speed, int gears, double seatHeight) {
        super(speed, gears);
        this.seatHeight = seatHeight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Seat Height : " + seatHeight);
    }
}
