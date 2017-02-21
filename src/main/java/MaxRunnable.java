// BEGIN (write your solution here)
public class MaxRunnable implements Runnable{

    final int[] target;
    private int b=0;

    MaxRunnable(final int[] target){
        this.target = target;
    }

    @Override
    public void run() {
        b=target[0];
        for (int i = 0; i <target.length-1 ; i++) {
            if (target[i]>b) b=target[i];
        }
    }

    public int getResult(){
       return b;
    }

}
// END
