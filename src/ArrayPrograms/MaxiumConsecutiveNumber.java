package ArrayPrograms;

public class MaxiumConsecutiveNumber {

    public static void main(String[] args) {
        
        int[]num={0, 1, 1, 0, 0, 1, 0, 1, 1};
        int count=0;
        int maxcnt=0;
       for(int n:num)
        {
            count=n*(count+1);// 
            maxcnt=Math.max(maxcnt, count);

        }
        System.out.println("maxium consecutive number is "+maxcnt);
    }
    
}
