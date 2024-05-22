public class euler9 {
    public static void main(String[] args) {
        int c = 0;
        for( int i =1; i< 1001; i++){
            for(int g=1;g<1001; g++){

                c = 1000 - i - g;
                if(c < 0){
                    break;
                }
                if(Math.pow(i,2)+Math.pow(g,2) == Math.pow(c,2)){
                    System.out.println(c*i*g);
                    break;
                }
                }
        }


    }
}
