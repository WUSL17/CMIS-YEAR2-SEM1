import java.util.Scanner;

/**
 * @author chamodshehanka on 5/22/2019
 * @project Demo
 **/
public class GPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int creditCount = 0;
        double gpa, gpaSum = 0.0;
        int[] marks = new int[3];
        String[] subCodes = new String[3];

        System.out.print("Enter index no : ");
        String indexNo = scanner.next();

        System.out.print("Enter Name : ");
        String name = scanner.next();



        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter subject code : ");
            subCodes[i] = scanner.next();

            System.out.print("Enter subject code " + (i + 1) + " : ");
            marks[i] = scanner.nextInt();

            creditCount += getSubjectCredit(subCodes[i]);
        }

        for (int mark : marks) {
            gpaSum += getGPA(getGrade(mark));
        }
        
        gpa = gpaSum / creditCount;

        System.out.println("Index No : " + indexNo);
        System.out.println("Name : " + name);
        System.out.println("GPA : " + gpa);
    }

    private static String getGrade(int marks){
        String grade;
        if (marks <= 100 && marks >= 80 ){
            grade = "A";
        }else if (marks >= 60){
            grade = "B";
        }else if (marks >= 50){
            grade = "C";
        }else if (marks >= 40){
            grade = "D";
        }else {
            grade = "E";
        }
        return grade;
    }

    private static double getGPA(String grade){
        double gpa = 0.0;
        switch (grade){
            case "A" :
                gpa = 4.0;
                break;
            case "B" :
                gpa = 3.0;
                break;
            case "C" :
                gpa = 2.0;
                break;
            case "D" :
                gpa = 1.0;
                break;
            case "E" :
                gpa = 0.0;
                break;
            default:
                break;
        }
        return gpa;
    }

    private static int getSubjectCredit(String subCode){
        return Integer.parseInt(subCode.substring(subCode.length() - 1));
    }
}
