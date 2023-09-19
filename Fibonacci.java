import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args){
        int x = (int) (Math.random() * 10);
        Fibonacci myFib = new Fibonacci();
        String sequence = myFib.fib(x);
        System.out.println("Number = " + x + ": " +sequence);
    }
    public static ArrayList<Integer> fib(int x){
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        if(x!= 0){
              sequence.add(fib(x-1)  sequence.add(x));
        }else{
            sequence = sequence + 1;
        }
        return sequence;
    }


}
