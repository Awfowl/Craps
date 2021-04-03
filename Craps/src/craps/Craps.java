package craps;
import java.util.Random;
public class Craps {

    public static void main(String[] args) {

      
    }



    static boolean craps(){
        int num1 = roleDice();
        int num2 = roleDice();
        show(num1,num2);
        boolean result = checkTheSum(num1,num2);
        winOrLose(result);
        return  result;
    }


    static int roleDice() {
        Random random = new Random();
       return random.nextInt(5) + 1;
    }

    /**
     *
     * @param n1
     * @param n2
     * @return true if win or false is lose
     */
    static boolean checkTheSum(int n1 , int n2){
        int sum = n1 + n2;
        if (sum == 2  || sum == 3|| sum == 12){
            return false;
        }else  if (sum == 7 || sum == 11){
            return true;
        }else{
            System.out.println("point is "+sum);
           return recheck(sum);
        }
    }

    static boolean recheck(int target){
        int num1 =0;
        int num2 =0;
        int sum =0;
        while (sum != target && sum != 7){
             num1 = roleDice();
             num2 = roleDice();
             sum  = num1 + num2;

        }
        show(num1,num2);
        if(sum == target){
            return true;
        }else
            return false;
    }
    static void show(int num1 , int num2 ){
        System.out.println("you rolled " + num1 + "+"+  num2 + " = " + (num1+num2));
    }
    static void winOrLose(boolean result){
        if(result){
            System.out.println("you win");
        }else
            System.out.println("you lose");
    }
}