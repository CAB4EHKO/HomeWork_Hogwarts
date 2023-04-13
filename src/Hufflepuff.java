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
    public String toString() {
        return super.toString() + "\nТрудолюбие = " + getIndustriousness() + "\nВерность = " + getLoyalty() + "\nЧесность = " + getHonesty() + "\n------------------------";
    }
    public void studentComparisonFaculty(Hufflepuff student) {
        int sumSkillsFaculty1 = industriousness + loyalty + honesty;
        int sumSkillsFaculty2 = student.industriousness + student.loyalty + student.honesty;
        if (sumSkillsFaculty1 > sumSkillsFaculty2) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + student.getName() + " (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        } else if (sumSkillsFaculty2 > sumSkillsFaculty1) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + getName() + " (" + sumSkillsFaculty2 + " vs " + sumSkillsFaculty1 + ") баллов.");
        } else {
            System.out.println("Студенты равны по силе, (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        }
    }
}
