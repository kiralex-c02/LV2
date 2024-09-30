public class PingPong {
    public static void main(String[] args) {
        int num = 100;
        pingPong(num);
    }

    public static void pingPong(int num) {
        for(int i = 1; i <= num; i++) {
            if(i % 6 != 0 && i % 2 == 0) System.out.println(i + " ping");
            else if (i % 6 != 0 && i % 3 == 0) System.out.println(i + " pong");
            else if (i % 6 == 0)System.out.println(i + " ping pong");
            else System.out.println(i + " -");
        }
    }
}
