class Computer {
    public void playMusic() {
        System.out.println("Play some music");
    }

    public String getMeAPen() {
        return "Pen";
    }
}

public class methods {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String result = comp.getMeAPen();
        System.out.println(result);
    }
}
