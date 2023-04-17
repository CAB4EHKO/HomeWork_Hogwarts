public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String faculty, String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(faculty, name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "\nХитрость = " + getCunning() + "\nРешительность = " + getDetermination() + "\nАмбициозность = " + getAmbition() + "\nНаходчивость = " + getResourcefulness() + "\nЖажда власти = " + getLustForPower() + "\n------------------------";
    }
    public void studentComparisonFaculty(Slytherin student) {
        int sumSkillsFaculty1 = cunning + determination + ambition + resourcefulness + lustForPower;
        int sumSkillsFaculty2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
        if (sumSkillsFaculty1 > sumSkillsFaculty2) {
            System.out.println(getName() + " лучший Слизеринец, чем " + student.getName() + " (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        } else if (sumSkillsFaculty2 > sumSkillsFaculty1) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + getName() + " (" + sumSkillsFaculty2 + " vs " + sumSkillsFaculty1 + ") баллов.");
        } else {
            System.out.println("Студенты равны по силе, (" + sumSkillsFaculty1 + " vs " + sumSkillsFaculty2 + ") баллов.");
        }
    }
}
