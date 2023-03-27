import java.util.Scanner;

public class main {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        final int appointCount = 100;

         appointment[] appoint = new appointment[appointCount];
         int count = 0;

         appoint[count++] = new DailyAppointment("Code");
         appoint[count++] = new DailyAppointment("Eat");
         appoint[count++] = new DailyAppointment("Sleep");
         appoint[count++] = new MonthlyAppointment(15,"Get Haircut");
         appoint[count++] = new MonthlyAppointment(1, "pay Day");
         appoint[count++] = new YearlyAppointment(15, 4, "Tax Day");
         appoint[count++] = new YearlyAppointment(1, 1, "New Year's Day");
         appoint[count++] = new SingleAppointment(9, 5, 2020, "Commencement");
         appoint[count++] = new SingleAppointment(16, 3, 2020, "Start Of Spring Break");
         appoint[count++] = new SingleAppointment(18, 3, 2019, "End Of Spring Break");


        //Traverse Array for compare the specific input and print the String value
        for(appointment Ap : appoint){
            if(Ap != null){
                System.out.println(Ap.toString());
            }
        }

        System.out.println("Enter a specific day month year separated by spaces");
        int D = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();

        for(int i=0; i<3; i++){
            System.out.println(appoint[i]);
        }

        for(appointment Ap : appoint){
            if(Ap != null && Ap.occursOn(D,M,Y)){
                System.out.println(Ap);
            }
        }
    }
}