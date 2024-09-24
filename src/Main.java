/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int sumTwo = add(3, 8);
        System.out.println(sumTwo);

        int sumFour = add(3, 8, 4, 9);
        System.out.println(sumFour);

        String greetingMorning = morningGreeting("Toby Fox");
        System.out.println(greetingMorning);

        String greetingEvening = afternoonGreeting("Mac Miller");
        System.out.println(greetingEvening);

        String threeTimes = triple("oohbaby");
        System.out.println(threeTimes);

        double halfNumber = half(17);
        System.out.println(halfNumber);

        int nearestInt1 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(nearestInt1);

        int nearestInt2 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(nearestInt2);


    }


    // 1. add

    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add  I dont get it

    public static int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }

    // 3. morningGreeting

    public static String morningGreeting(String name1) {
        return "早上好, " + name1 + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting(String name2) {
        return "下午好, " + name2 + "!";
    }

    // 5. triple

    public static String triple(String phrase) {
        return phrase + phrase + phrase;
    }

    // 6. half

    public static double half(int a) {
        return (double) a / 2;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) Math.round(a);
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegativeValueToNearestInteger(double a) {
        return (int) Math.round(-a) * -1;
    }

}

