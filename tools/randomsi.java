package tools;

public class randomsi {
    public static int random(int a, int b){
        return (int)(( Math.random() * (b - a + 1) + a));
    }
}
