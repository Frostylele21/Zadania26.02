public class Kwadrat {
    private final int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }
    public int area() {
        return (int) Math.pow(bok, 2);
    }
    public int circuit() {
        return bok*4;
    }
}
