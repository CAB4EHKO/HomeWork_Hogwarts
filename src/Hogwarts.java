public abstract class Hogwarts {
    private String faculty;
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String faculty, String name, int powerOfMagic, int transgressionDistance) {
        this.faculty = faculty;
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFaculty() {
        return faculty;
    }


    public String getName() {
        return name;
    }


    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

//    public void printInfoStudent() {
//        System.out.println("Факультет: " + getFaculty() + "\nУченик: " + getName() + "\nСила магии = " + getPowerOfMagic() + "\nРасстояние трансгресии = " + getTransgressionDistance());
//    }

    @Override
    public String toString() {
        return "Факультет: " + getFaculty() + "\nУченик: " + getName() + "\nСила магии = " + getPowerOfMagic() + "\nРасстояние трансгресии = " + getTransgressionDistance();
    }

    public void studentComparison(Hogwarts student) {
        int sumSkills1 = powerOfMagic + transgressionDistance;
        int sumSkills2 = student.powerOfMagic + student.transgressionDistance;
        if (sumSkills1 > sumSkills2) {
            System.out.println("Студент " + getName() + " обладает большей мощностью магии, чем " + student.getName() + " (" + sumSkills1 + " vs " + sumSkills2 + ") баллов.");
        } else if (sumSkills2 > sumSkills1) {
            System.out.println("Студент " + student.getName() + " обладает большей мощностью магии, чем " + getName() + " (" + sumSkills2 + " vs " + sumSkills1 + ") баллов.");
        } else {
            System.out.println("Студенты равны по силе, (" + sumSkills1 + " vs " + sumSkills2 + ") баллов.");
        }
    }
}
