public class Main {
    public static void main(String[] args) {
        } else if (places >= 60 && places < 102) {
            System.out.println("Осталось " + (102 - places) + " мест. Сидячих мест не осталось.");
        } else {
            System.out.println("Мест не осталось");
        }

        int one = 5;
        int two = 2;
        int three = 1;

        if (one > two && one > three) {
            System.out.println(one + " наибольшее число");
        } else if (two > one && two > three) {
            System.out.println(two + " наибольшее число");
        } else {
            System.out.println(three + " наибольшее число");
        }
    }
}
