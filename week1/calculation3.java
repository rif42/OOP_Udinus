public class calculation3 {

    static void TubeVolume(double diameter, double height) {
        double volume = Math.PI * (diameter/2) * (diameter/2) * height;
        System.out.println("Tube Volume = " + volume);
    }

    public static void main(String[] args) {
        TubeVolume(5, 10);     
    }

}
