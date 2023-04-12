public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public Ravenclaw(String faculty, String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(faculty, name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public void printInfoStudent() {
        super.printInfoStudent();
        System.out.println("Ум = " + getMind() + "\nМудрость = " + getWisdom() + "\nОстроумие = " + getWit() + "\nТворчество = " + getCreation());
        Main.printSeparatorMinus();
    }

    public void print(Ravenclaw[] ravenclaws, int index) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (i == index) {
                System.out.println("Name:" + ravenclaw.getName() + "\nPower:" + ravenclaw.getPowerOfMagic());
                System.out.println();}
        }
    }
}
