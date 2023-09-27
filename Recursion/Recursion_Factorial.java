public class Recursion_Factorial {

    public static int factorial(int n) {
        //Base case
        if(n == 1 || n == 0){
            return 1;
        }

        //Recursive call
        int recRes = factorial(n-1);

        //Small Calculation
        int result = n * recRes;
        return result;
    }

    public static void main(String[] args) {
        int fact = factorial(6);
        System.out.println("Factorial>>>>>>>>>>>>>"+fact);
    }
}
