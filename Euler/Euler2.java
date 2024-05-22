public class euler2 {
    public int fib(){
        int x = 1;
        int y = 2;
        int z = 0;
        int sum = 0;

        do{

            if(x%2 == 0){
                sum+= x;
            }
            if(x > 4000000){
                break;

            }
            z = x+y;
            x = y;
            y = z;
        }
        while(x< 4000000);


        return sum;
    }
    public static void main(String[] args) {
        euler2 e = new euler2();

        System.out.println(e.fib());
    }
}
