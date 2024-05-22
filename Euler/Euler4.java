public class euler4 {

    public static void main(String[] args) {

        /**
         * 100 * 100 = "10000"
         * Palindrome needs a String that has an even length
         * 999*999 = 998001
         * The string must have a length of 6.
         */
        int max = 0;


        for(int i = 100; i < 999; i++){
            for(int j = 100; j < 999; j++){
                int temp = i*j;
                StringBuilder z = new StringBuilder(Integer.toString(temp));
                if(z.length() == 6){

                    StringBuilder temp1 = new StringBuilder(z.substring(0,3));

                    StringBuilder temp2 = new StringBuilder(z.substring(3,z.length())).reverse();

                    if(temp1.toString().equals(temp2.toString())){
                        if(max < temp) {
                            max = temp;}

                    }
                }
            }
        }
        System.out.println(max);
    }
}
