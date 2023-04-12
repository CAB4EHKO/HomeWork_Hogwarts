public class Hogwarts {
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

    public void printInfoStudent() {
        System.out.println("Факультет: " + getFaculty() + "\nУченик: " + getName() + "\nСила магии = " + getPowerOfMagic() + "\nРасстояние трансгресии = " + getTransgressionDistance());
    }
}
