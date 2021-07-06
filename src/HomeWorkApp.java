public class HomeWorkApp {

    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик", "белый", "Кот");
        Cat catMusya = new Cat("Муся", "черно-белая", "Кот");
        Dog dogAlma = new Dog("Альма", "черная", "Собака");
        Dog dogReks = new Dog("Рэкс", "серый", "Собака");
        Dog dogBobik = new Dog("Бобик", "рыжий", "Собака");

        catBarsik.run(200);
        catBarsik.swum(40);
        System.out.println();
        catMusya.run(201);
        catMusya.swum(10);
        System.out.println();
        dogAlma.run(501);
        dogAlma.swum(8);
        System.out.println();
        dogReks.run(100);
        dogReks.swum(10);
        System.out.println();
        dogBobik.run(400);
        dogBobik.swum(15);
        System.out.println();
        System.out.println("Всего создано животных: " + Animal.count);
        System.out.println("Всего создано котов: " + Cat.count);
        System.out.println("Всего создано cобак: " + Dog.count);

    }
}
