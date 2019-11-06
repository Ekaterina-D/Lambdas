public class Lambda {

    public static void main(String[] args) {
        MyFunctionalInterface withoutRest = x -> (x % 15) == 0;
        System.out.println(withoutRest.myMethod(15));
        System.out.println(withoutRest.myMethod(20));
        System.out.println();

        MyFunctionalInterface positive = x -> x > 0;
        System.out.println(positive.myMethod(15));
        System.out.println(positive.myMethod(-5));
        System.out.println();

        MyFunctionalInterface fibonacci = x -> {
            double num1 = 5 * Math.pow(x, 2) + 4;
            double num2 = 5 * Math.pow(x, 2) - 4;
            long num1_sqrt = (long) Math.sqrt(num1);
            long num2_sqrt = (long) Math.sqrt(num2);
            return !(((num1_sqrt * num1_sqrt) == num1) || ((num2_sqrt * num2_sqrt) == num2));
        };
        System.out.println(fibonacci.myMethod(34));
        System.out.println(fibonacci.myMethod(5));
        System.out.println(fibonacci.myMethod(7));
    }

}