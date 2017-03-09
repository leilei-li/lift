public class Main {

    public static void main(String[] args) {
        Myrunnable runnable = new Myrunnable();
        Thread in = new Thread(runnable);//接收控制电梯
        Thread out = new Thread(runnable);//打印电梯状态
        in.setName("in");
        out.setName("out");
        in.start();
        out.start();


    }
}
