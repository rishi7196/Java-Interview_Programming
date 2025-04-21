package ArrayPrograms;

public class MisingNumberInArray {
    public static void main(String[] args) {
        
        int[]num={1,2,3,4,6};
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println(sum);
        int sum1=0;
        for(int j=1;j<=6;j++)
        {
            sum1=sum1+j;
        }
        System.out.println(sum1);
        System.out.println("Missing number is "+(sum1-sum));

    }
    
}
