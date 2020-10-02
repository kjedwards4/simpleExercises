import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double kittenWeight;
        double amountToFeedPerDay;
        int age;
        int timesPerDay = 0;
        double amountPerFeeding;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the weight of the kitten in ounces");
        kittenWeight = in.nextDouble();
        System.out.println("Please enter the age in weeks of the kitten");
        age = in.nextInt();

        amountToFeedPerDay = (kittenWeight/4)*30;

        if(age<=2){
            timesPerDay = 12;
        }else if(age>2 && age<=5){
            timesPerDay = 6;
        }else{
            System.out.println("This kitten does not need to be bottle fed");
            System.exit(0);
        }

        amountPerFeeding = amountToFeedPerDay / timesPerDay;

        System.out.println("This kitten should be fed " + amountToFeedPerDay + "mL of formula per day. They should be " +
                "fed " + amountPerFeeding + "mL " + timesPerDay + " times a day.");
    }
}
