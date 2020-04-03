
public class Generator {
    public static void main(String[] args) {

        // An example of how to play M1
        /*
        for(int i = 1; i <= 172; i++) {
            double[] sample = StdAudio.read("mozart/M"+i+".wav");
            StdAudio.play(sample);
        }*/

        playC();

    }
    public static void playM()
    {
        Table s1 = new Table();
        int a = 0;
        for(int i = 0; i < 16; i++)
        {
            a = (int)(Math.random() * 12);
            while(a == 0)
            {
                a = (int)(Math.random() * 12);
            }
            System.out.println("Roll M: "+a);

            double[] sample = StdAudio.read("mozart/M"+s1.reTab1(a, i)+".wav");
            StdAudio.play(sample);
        }
    }
    public static void playT()
    {
        Table s1 = new Table();
        int a = 0; int b = 0;
        for(int i = 0; i < 16; i++)
        {
            a = (int)(Math.random() * 6);
            System.out.println("Roll T: "+a);
            double[] sample = StdAudio.read("mozart/M"+s1.reTab2(a, i)+".wav");
            StdAudio.play(sample);
        }
    }
    public static void playC()
    {
        playM();
        playT();
    }
}
