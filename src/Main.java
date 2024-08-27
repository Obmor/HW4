public class Main {
    public static void main(String[] args) {


        System.out.println("Exercise 1");
        int mansAge = 18;
        if (mansAge >= 18) {
            System.out.println("Если возраст человека больше или равен 18 годам, " +
                    "то он совершеннолетний.");
        } else {
            System.out.println("Если человеку меньше 18 лет, то он не совершеннолетний.");
        }


        System.out.println("Exercise 2");
        int outerTemperature = 10;
        if (outerTemperature <= 5) {
            System.out.println("Если на улице температура ниже 5 градусов то стоит одеть шапку.");
        } else {
            System.out.println("Если не улице выше 5 градусов, то шапку можно не одевать.");
        }


        System.out.println("Exrcise 3");
        int speedLimit = 59;
        if (speedLimit <= 60) {
            System.out.println("Если скорость авто не превышает 60 км/ч, " +
                    "то можно спокойно продолжать поездку.");
        } else {
            System.out.println("Если скорость авто выше 60 км/ч," +
                    "то придется заплатить штраф.");
        }


        System.out.println("Exercise 4");
        int ageToGetChoise = 10;
        if (ageToGetChoise >= 2 && ageToGetChoise <= 6) {
            System.out.println("Если вам от 2 до 6 лет, то ваше место в детском саду.");
        }
        if (ageToGetChoise >= 7 && ageToGetChoise <= 17) {
            System.out.println("Если вам от 7 до 17 лет, то по вам пора писать контрольную.");
        }
        if (ageToGetChoise >= 18 && ageToGetChoise <= 24) {
            System.out.println("Если вам от 18 до 24 лет, то вам пора сдавать курсач.");
        }
        if (ageToGetChoise > 24) {
            System.out.println("Если вам больше 24 лет, то вам пора вставать на работу.");
        }


        System.out.println("Exercise 5");
        int ageOfChild = 14;
        boolean areThereAdult = true;
        if (ageOfChild >= 5 && ageOfChild < 14 && areThereAdult) {
            System.out.println("Если возраст ребенка " + ageOfChild +
                    " лет и есть сопровождающий, то ему можно посещать аттракцион.");
        } else if (ageOfChild >= 14) {
            System.out.println("Если ребенок в возрасте от " + ageOfChild + " лет и старше," +
                    " то он может посещать аттракцион свободно.");
        } else if (ageOfChild <5)   {
            System.out.println("Если ребенку " + ageOfChild + " года, то ему " +
                    "нельзя посещать аттракцион.");
        } else if (ageOfChild >= 5 && ageOfChild < 14 && areThereAdult != true) {
            System.out.println("Если ребенок в возрасте " + ageOfChild+ " лет и без" +
                    " сопровождения взрослого, то ему запрещено посещать " +
                    "аттракцион.");
        }


        System.out.println("Exercise 6");
        int totalPersons = 1;
        int amountOfPersonsAtCarriage = 102;
        int sitPlaces = 60;
        int standingPlaces = amountOfPersonsAtCarriage - sitPlaces;
        if (amountOfPersonsAtCarriage - totalPersons <= 0) {
            System.out.println("Мест нет.");
        } else {
            System.out.println("Есть места.");
        }
        if (amountOfPersonsAtCarriage - totalPersons >= standingPlaces && amountOfPersonsAtCarriage
                - totalPersons > 0) {
            System.out.println("В наличии сидячие места.");
        }
        if (amountOfPersonsAtCarriage - totalPersons <= standingPlaces && amountOfPersonsAtCarriage
                - totalPersons < 102 && amountOfPersonsAtCarriage - totalPersons > 0) {
            System.out.println("В наличии только стоячие места.");
        } else {
            System.out.println();
        }


        System.out.println("Exercise 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("The bigest number is " + one);
        } else if (two > three){
            System.out.println("The bigest number is " + two);
        } else {
            System.out.println("The bigest number is " + three);
        }

    }
}