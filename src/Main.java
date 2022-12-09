public  class Main {
    public static void main(String[] args) {

        // getClass - возврат имя класса
        // hashCode - возвращает численное представление объекта
        // equals - проверяется на экв двух объектов
        // clone - клонирование объекта на основе другого объекта, копирование значений для нового объекта
        // toString - возвращение строкового представления объекта

        // Парадигмы ООП:
        // 1. Абстракция
        // 2. Наследование
        // Перенимать все свойства родительского класса + методы
        // 3. Полиморфизм
        // Один метод - множество реализаций
        // 4. Инкапсуляция
        // модификаторы доступа public protected private default
        // Для классов public default
        // Для методов
        // getter setter
        Student student  = new Student("Ivan", "Ivanov", 20);
        System.out.println(student);
        student.setAge(-10);
        System.out.println(student);
        System.out.println(student.getAge());
        // Скачивайте git -> устанавливаете
        // IntellijIdea -> Settings ->
        // Регистрация в github
        // Git bash:
        // git config --global user.name "username"
        // git config --global user.email "email"
        // git config --global -l

    }
}