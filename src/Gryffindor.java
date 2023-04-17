public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String faculty, String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(faculty, name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\nБлагородство = " + getNobility() + "\nЧесть = " + getHonor() + "\nХрабрость = " + getBravery() + "\n------------------------";
    }

    public void studentComparisonFaculty(Gryffindor student) {
        int sumSkillsFaculty1 = nobility + honor + bravery;
        int sumSkillsFaculty2 = student.nobility + student.honor + student.bravery;
        if (sumSkillsFaculty1 > sumSkillsFaculty2) {
            System.out.println(getName() + " лучший Гриффендорец, чем " + student.getName() + " (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        } else if (sumSkillsFaculty2 > sumSkillsFaculty1) {
            System.out.println(student.getName() + " лучший Гриффендорец, чем " + getName() + " (" + sumSkillsFaculty2 + " vs " + sumSkillsFaculty1 + ") баллов.");
        } else {
            System.out.println("Студенты равны по силе, (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        }
    }
}
