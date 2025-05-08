package Genric_programs;

public class MaxConsequativeNumber {
    public static void main(String[] args) {

        int[]number ={1,1,2,3,0,0,1,1,1,0,0};
        int cnt=0;
        int maxcount=0;
        for(int i=0;i<number.length;i++) {
            if (number[i] == 1) {
                cnt++;
                maxcount = Math.max(maxcount, cnt);
            }
            else
            {
                cnt=0;
            }
        }
        System.out.println("Maximum consecutive 1's: " + maxcount);
        }
    }

