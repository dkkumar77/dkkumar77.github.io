public class euler1 {

    public static void main(String[] args) {

        final int upper_bound = 1000;

        int sum = 0;

        for(int i = 0; i < upper_bound; i++){
            if((i%3) == 0 || (i%5) == 0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}