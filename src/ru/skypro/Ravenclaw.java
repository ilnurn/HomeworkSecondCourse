package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Хогвартс, " +
                "имя и фамилия - " + getName() +
                ", сила магии - " + getPowerOfMagic() +
                ", расстояние трансгрессии - " + getTransgressionDistance() +
                ", факультет - Когтевран, " +
                "ум - " + smart +
                ", мудрость - " + wise +
                ", остроумие - " + witty +
                ", творчество - " + creativity;
    }
    public String comparison(Ravenclaw comparisonStudent) {
        if (this.witty > comparisonStudent.witty) {
            System.out.println(this.getName() + " остроумнее, чем " + comparisonStudent.getName());
        } else if (this.witty < comparisonStudent.witty) {
            System.out.println(comparisonStudent.getName() + " отсроумнее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + comparisonStudent.getName() + " одинаково остроумные");
        }
        return null;
    }
    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
}
