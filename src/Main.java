public class Main {
    public static void main(String[] args) {
        System.out.println("Task 5");
        // Объявляем переменную и присваиваем ей значение
        int value = 33;

        // Вызываем метод changeValue и передаем переменную
        changeValue(value);

        // Распечатываем значение переменной после вызова метода
        System.out.println("После вызова метода значение равно: " + value);

        System.out.println("Task 6");
        int valueInteger = 33;
        changeValueInteger(valueInteger);
        System.out.println("После вызова метода значение равно: " + valueInteger);

        System.out.println("Task 7");
        Integer[] valueIntegerMassive = {3, 4};
        changeValueIntegerMassive(valueIntegerMassive);
        // Распечатываем значения массива после вызова метода
        for (int i = 0; i < valueIntegerMassive.length; i++) {
            System.out.print(valueIntegerMassive[i] + " ");
        }
        System.out.println();

        System.out.println("Task 8");
        changeValueIntegerMassiveIndex0(valueIntegerMassive);
        for (int i = 0; i < valueIntegerMassive.length; i++) {
            System.out.print(valueIntegerMassive[i] + " ");
        }

        System.out.println();
        System.out.println("Task 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

        System.out.println("Task 10");
        person.changePerson();
        System.out.println(person);
    }

    // Метод, который изменяет значение переменной Task5
    public static void changeValue(int value) {
        value = 22; // Изменяем значение переменной внутри метода
    }
    public static void changeValueInteger(Integer value) {
        value = 22; // Изменяем значение переменной внутри метода
    }
    // Метод, который изменяет значение массива
    public static void changeValueIntegerMassive(Integer[] value) {
        value = new Integer[]{1, 2}; // Записываем новый массив
    }
    public static void changeValueIntegerMassiveIndex0(Integer[] value) {
        value[0] = 99; // Записываем новое значение в первую ячейку
    }
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko"); // Создаем новый объект Person
    }
}
