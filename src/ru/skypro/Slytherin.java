package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int resolute;
    private int ambitious;
    private int resourceful;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Хогвартс, " +
                "имя и фамилия - " + getName() +
                ", сила магии - " + getPowerOfMagic() +
                ", расстояние трансгрессии - " + getTransgressionDistance() +
                ", факультет - Гриффиндор, " +
                "хитрость - " + cunning +
                ", решительность - " + resolute +
                ", амбициозность - " + ambitious +
                ", находчивость - " + resourceful +
                ", жажда власти - " + lustForPower;
    }
    public String comparison(Slytherin comparisonStudent) {
        if (this.resolute > comparisonStudent.resolute) {
            System.out.println(this.getName() + " решительнее, чем " + comparisonStudent.getName());
        } else if (this.resolute < comparisonStudent.resolute) {
            System.out.println(comparisonStudent.getName() + " решительнее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + comparisonStudent.getName() + " одинаково решительные");
        }
        return null;
    }

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int resolute, int ambitious, int resourceful, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }
}
