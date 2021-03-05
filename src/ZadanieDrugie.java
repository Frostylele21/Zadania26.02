public class ZadanieDrugie {
    public static void main(String[] args)
    {
        Punkt punkt1 = new Punkt(4,5);
        Punkt punkt2 = new Punkt();

        System.out.println("Odległość: " + punkt1.policzOdl(punkt2));
    }
}
