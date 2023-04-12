public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String faculty, String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(faculty, name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public void printInfoStudent() {
        super.printInfoStudent();
        System.out.println("Трудолюбие = " + getIndustriousness() + "\nВерность = " + getLoyalty() + "\nЧесность = " + getHonesty());
        Main.printSeparatorMinus();
    }
}