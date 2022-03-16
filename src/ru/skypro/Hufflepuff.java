package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalyty;
    private int honesty;

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalyty() {
        return loyalyty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Хогвартс, " +
                "имя и фамилия - " + getName() +
                ", сила магии - " + getPowerOfMagic() +
                ", расстояние трансгрессии - " + getTransgressionDistance() +
                ", факультет - Пуффедуй, " +
                "трудолюбие - " + industriousness +
                ", верность - " + loyalyty +
                ", честность - " + honesty;
    }
    public String comparison(Hufflepuff comparisonStudent) {
        if (this.loyalyty > comparisonStudent.getLoyalyty()) {
            System.out.println(this.getName() + " более верный, чем " + comparisonStudent.getName());
        } else if (this.loyalyty < comparisonStudent.loyalyty) {
            System.out.println(comparisonStudent.getName() + " более верный, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + comparisonStudent.getName() + " одинаково верные");
        }
        return null;
    }
    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalyty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalyty = loyalyty;
        this.honesty = honesty;
    }
}
