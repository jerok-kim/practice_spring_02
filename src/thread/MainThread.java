package thread;

class SubThread implements Runnable {

    // 서브 쓰레드 (실)
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("서브 쓰레드 : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class MainThread {

    // 메인 쓰레드 (실)
    public static void main(String[] args) {
        Thread t1 = new Thread(new SubThread());  // OS야 쓰레드(subthread에 있는 run으로 실) 하나 만들어줄래?
        t1.start();  // OS가 만들어진 쓰레드로 run() 실행 (쓰레드가 분기됨 -> 메인쓰레드, 서브쓰레드)

        for (int i = 0; i < 6; i++) {
            System.out.println("메인 쓰레드 : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
