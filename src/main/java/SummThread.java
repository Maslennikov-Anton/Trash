import java.util.stream.*;
// BEGIN (write your solution here)
public class SummThread extends Thread{

    private int[] toSumm;
    private int i=0;

    SummThread(final int[] toSumm){
        this.toSumm=toSumm;
    }

    @Override
    public void run(){

        for (int item: toSumm
             ) {
            this.i+=item;
        }
    }

    public int getResult(){
        return i;
    }
}
// END
