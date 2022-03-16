package ru.skypro;

public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;

    }
    public String comparisonStudents(Hogwarts comparisonStudent) {
        if (this.powerOfMagic > comparisonStudent.powerOfMagic) {
            System.out.println(this.name + " сильнее, чем " + comparisonStudent.name);
        } else if (this.powerOfMagic < comparisonStudent.powerOfMagic) {
            System.out.println(comparisonStudent.name + " сильнее, чем " + this.name);
        } else {
            System.out.print(this.name + " и " + comparisonStudent.name + " одинаково сильные");
        }
        if (this.transgressionDistance > comparisonStudent.transgressionDistance) {
            System.out.println(", а также, " + this.name + " расстояние трансгрессии больше, чем " + comparisonStudent.name);
        } else if (this.transgressionDistance < comparisonStudent.transgressionDistance) {
            System.out.println(", а также, " + comparisonStudent.name + " расстояние трансгрессии больше, чем " + this.name);
        } else {
            System.out.println(", а также, " + this.name + " и " + comparisonStudent.name + " имеют одинаковое расстояние трансгрессии");
        }
        return null;
    }
}
