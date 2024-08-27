public class Main {
    public static void main(String[] args) {


        System.out.println("Exercise 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он " +
                    "совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека " + age + " лет, то он " +
                    "не совершеннолетний.");
        }


        System.out.println("Exercise 2");
        int temperature = 2;
        if (temperature <= 5) {
            System.out.println("Если на улице температура ниже " + temperature +
                    " градусов, то стоит одеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("Если на улице выше " + temperature +
                    " градусов, то шапку можно не одевать.");
        }


        System.out.println("Exercise 3");
        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость авто " + speed +
                    " то можно спокойно продолжать поездку.");
        }
        if (speed > 60) {
            System.out.println("Если скорость авто " + speed +
                    " то придется заплатить штраф.");
        }


        System.out.println("Exercise 4");
        int ageAtFourthExercice = 25;
        if (ageAtFourthExercice >= 2 && ageAtFourthExercice <= 6) {
            System.out.println("Если вам " + ageAtFourthExercice +
                    " лет, то ваше место в детском саду.");
        }
        if (ageAtFourthExercice >= 7 && ageAtFourthExercice <= 17) {
            System.out.println("Если вам " + ageAtFourthExercice +
                    " лет, то по пора писать контрольную.");
        }
        if (ageAtFourthExercice >= 18 && ageAtFourthExercice <= 24) {
            System.out.println("Если вам " + ageAtFourthExercice +
                    " лет, то пора сдавать курсач.");
        }
        if (ageAtFourthExercice > 24) {
            System.out.println("Если вам " + ageAtFourthExercice +
                    " лет, то пора вставать на работу.");
        }


        System.out.println("Exercise 5");
        int ageOfChild = 14;
        if (ageOfChild < 5) {
            System.out.println("Если ребенку " + ageOfChild +
                    " то он не может посетить аттракцион.");
        } else if (ageOfChild >= 5 && ageOfChild < 14) {
            System.out.println("Если ребенку " + ageOfChild +
                    " лет, то он может посещать аттракцион только " +
                    "в сопровождении взрослого.");
        } else {
            System.out.println("Если ребенку " + ageOfChild + " лет, " +
                    "то он может посещать аттракцион " +
                    "без сопровождения взрослого.");
        }


        System.out.println("Exercise 6");
        int carriageCapacity = 103;
        if (carriageCapacity < 60) {
            System.out.println("Есть сидячие места.");
        } else if (carriageCapacity < 102 && carriageCapacity > 60) {
            System.out.println("Остались только стоячие места.");
        } else {
            System.out.println("Мест нет.");
        }



        System.out.println("Exercise 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("The biggest number is " + one + ".");
        } else if (two > three){
            System.out.println("The biggest number is " + two + ".");
        } else {
            System.out.println("The biggest number is " + three + ".");
        }
    }
}