public class myThread  implements Runnable {

    private int[] temp;

    public myThread() {
        temp = new int[10];


    for(int i = 0; i< temp.length; i++){
        temp[i] = i;
    }

}
    @Override
    public void run() {
        for(int thread : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            System.out.println("스레드 이름 : " + Thread.currentThread().getName());
            System.out.println("temp value : " + thread);
        }
    }


    public static void main(String[] args) {
        myThread myThread = new myThread();
        Thread t = new Thread(myThread, "첫번째");

        t.start();
    }
}
