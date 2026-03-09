class Computer {

    public String getMePen(int cost) {
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }

    public void playMusic() {
        System.out.println("Music Playing...");
    }
}

public class Method {

    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playMusic();

        String str = obj.getMePen(10);

        System.out.println(str);
    }
}