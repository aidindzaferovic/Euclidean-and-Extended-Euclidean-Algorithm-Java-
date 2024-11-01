public class ExtendedEuclideanAlgorithm {

    static int[] extendedGCD(int a, int b) {
        int[] result = new int[3]; 
        if (b == 0) {
        result[0] = 1;
        result[1] = 0;
        result[2] = a;
        return result;
    }
        int[] temp = extendedGCD(b, a % b);
        result[0] = temp[1];
        result[1] = temp[0] - (a / b) * temp[1];
        result[2] = temp[2];
        return result;
    }
    	public static void main(String[] args) {
        if (args.length < 2) {
        System.out.println("Provide two integers: ");
          return;
        }
        int N = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int[] result = extendedGCD(a, N);  
        if (result[2] != 1) {
        System.out.println("Inverse does not exist");
        } else {
          int inverse = (result[0] + N) % N; 
          System.out.println("The inverse of " + a + " mod " + N + " is: " + inverse);
    }
    }
}
