public class euler3 {

    public long largestprime(long a){



        while (a % 2 == 0) {
            a /= 2;
        }
        for (long factor = 3; factor < a; factor += 2) {
            while (a % factor == 0 && factor < a) {
                a /= factor;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        euler3 e = new euler3();

        System.out.println(e.largestprime(600851475143L));

    }
}
