public class wariant419 {
    public static void main(String[] args) {
        Speaker s1 = new Speaker();
        System.out.println(s1.volumeLevel);
        s1.setVolumeLevel(30,23);
        System.out.println(s1.volumeLevel);
        s1.boostVolume("30");
        System.out.println(s1.volumeLevel);
    }

    static class Speaker {
        private int volumeLevel;

        public void setVolumeLevel( int a, int b) {
            volumeLevel = a+b;

        }
        public void boostVolume(String c) {

            volumeLevel = Integer.parseInt(c);
        }
    }
}



