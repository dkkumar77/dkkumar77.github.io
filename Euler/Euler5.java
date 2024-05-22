public class euler5 {

    public static void main(String[] args) {

        int value = 0;
        for(int i = 10; i< Integer.MAX_VALUE; i++) {
            boolean pass = false;
            for (int j = 1; j <= 20; j++) {
                if(i%j == 0){
                    pass = true;
                }
                else {
                    pass = false;
                }
                if(pass == false){
                    break;


                }
            }

            if(pass == true){
                value = i;
                break;
            }
        }

        System.out.println(value);
    }
}


