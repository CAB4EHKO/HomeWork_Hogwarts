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
    public String toString() {
        return super.toString() + "\nУм = " + getMind() + "\nМудрость = " + getWisdom() + "\nОстроумие = " + getWit() + "\nТворчество = " + getCreation() + "\n------------------------";
    }
    public void studentComparisonFaculty(Ravenclaw student) {
        int sumSkillsFaculty1 = mind + wisdom + wit + creation;
        int sumSkillsFaculty2 = student.mind + student.wisdom + student.wit + student.creation;
        if (sumSkillsFaculty1 > sumSkillsFaculty2) {
            System.out.println(getName() + " лучший Когтевранец, чем " + student.getName() + " (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        } else if (sumSkillsFaculty2 > sumSkillsFaculty1) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + getName() + " (" + sumSkillsFaculty2 + " vs " + sumSkillsFaculty1 + ") баллов.");
        } else {
            System.out.println("Студенты равны по силе, (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        }
    }
}
