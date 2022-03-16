package ru.skypro;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Хогвартс, " +
                "имя и фамилия - " + getName() +
                ", сила магии - " + getPowerOfMagic() +
                ", расстояние трансгрессии - " + getTransgressionDistance() +
                ", факультет - Гриффиндор, " +
                "благородство - " + nobility +
                ", честь - " + honour +
                ", храбрость - " + bravery;
    }

    public String comparison(Gryffindor comparisonStudent) {
        if (this.nobility > comparisonStudent.nobility) {
            System.out.println(this.getName() + " благороднее, чем " + comparisonStudent.getName());
        } else if (this.nobility < comparisonStudent.nobility) {
            System.out.println(comparisonStudent.getName() + " благороднее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + comparisonStudent.getName() + " одинаково благородные");
        }
        return null;
    }

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }
}
