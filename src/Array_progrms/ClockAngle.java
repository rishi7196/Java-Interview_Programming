package Array_progrms;

public class ClockAngle {
    public static void main(String[] args) {

    	int[] num = {3, 30};

        int hour = num[0];
        int min = num[1];

        double hourAngle = (hour * 30) + (min * 0.5);//hour hand 0,5 for 1 min 30*0.5=15
       // minute hand ka angle
        double minuteAngle = min * 6; //30*6=180
        //differnece
        double angle = Math.abs(hourAngle - minuteAngle);
        System.out.println(angle);
    }
}