import java.util.Scanner;

/**
 * Created by lileilei on 2017/3/9.
 */
public class Myrunnable implements Runnable {
    private int[] up = new int[6];//代表向上5层是否有指令,分别为1,2,3,4,5
    private int[] down = new int[6];//代表向下5层是否有指令，分别为q,w,e,r,t
    private int curFloor = 0;//当前楼层
    private int curFuction = 1;//当前运行方向，1为上，2为下

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        if (tName.equals("in")) {
            in();
        } else {
            out();
        }

    }

    public void out() {
        while (true) {
            System.out.print("当前的请求有：" + "向上：");
            for (int i = 0; i < 6; i++) {
                if (up[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("向下: ");
            for (int i = 0; i < 6; i++) {
                if (down[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
            try {
                Thread.sleep(1500);
                //Thread.yield();
            } catch (Exception e) {

            }
        }

    }

    public void in() {
        while (true){
            try {
                Thread.sleep(50);
            }catch (Exception e){

            }
            Scanner s = new Scanner(System.in);
            String in = s.nextLine();
            if (in.equals("1")) {
                up[1] = 1;
            }
            if (in.equals("2")) {
                up[2] = 1;
            }
            if (in.equals("3")) {
                up[3] = 1;
            }
            if (in.equals("4")) {
                up[4] = 1;
            }
            if (in.equals("5")) {
                up[5] = 1;
            }
            if (in.equals("q")) {
                down[1] = 1;
            }
            if (in.equals("w")) {
                down[2] = 1;
            }
            if (in.equals("e")) {
                down[3] = 1;
            }
            if (in.equals("r")) {
                down[4] = 1;
            }
            if (in.equals("t")) {
                down[5] = 1;
            }
        }


    }
}
