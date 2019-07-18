package question1;

/**
 * @author chamodshehanka on 7/18/2019
 * @project Demo
 **/
public class Bicycle {
    private double speed;
    private int gears;

    public Bicycle(double speed, int gears) {
        this.speed = speed;
        this.gears = gears;
    }

    public void applyBreak(int value){
        speed -= value;
    }

    public void speedup(int value){
        speed += value;
    }

    public void printInfo(){
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gears);
    }
}
