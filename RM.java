public class RM{
    public static void main(String[] args){
        int count=0;
        int iterations=10;
        for(int i=0;i<iterations;i++){
            double value=Math.random();
            if(value>0.5)
            count++;
        }
        System.out.println((double)count/iterations);

    }
}