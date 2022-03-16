package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 23, 34, 45, 34, 33);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 23, 34, 45, 34, 33);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 23, 34, 45, 34, 33);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 33, 43, 55, 44, 34, 33, 33);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтэгю", 33, 43, 55, 44, 34, 33, 33);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 33, 43, 55, 44, 34, 33, 33);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 23, 33, 55, 79, 55);
        Hufflepuff cedricDiggory = new Hufflepuff("Седерик Диггори", 23, 33, 55, 74, 55);
        Hufflepuff jastinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 23, 33, 55, 78, 55);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 33, 55, 66, 33, 33, 44);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 33, 55, 66, 33, 33, 44);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 33, 55, 66, 33, 37, 44);
        harryPotter.toString();
        hermioneGranger.toString();
        Service service = new Service();
        service.printStudent(harryPotter);
        service.printStudent(dracoMalfoy);
        service.printStudent(zachariasSmith);
        service.printStudent(choChang);
        hermioneGranger.comparison(ronWeasley);
        cedricDiggory.comparison(jastinFinchFletchley);
        padmaPatil.comparison(marcusBelby);
        grahamMontague.comparison(gregoryGoyle);
        harryPotter.comparisonStudents(hermioneGranger);
    }
}
