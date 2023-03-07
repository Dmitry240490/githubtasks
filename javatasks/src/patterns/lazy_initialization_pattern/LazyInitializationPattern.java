package patterns.lazy_initialization_pattern;

// TODO: Задание. Реализовать паттерн Ленивая инициализация синглтона
public class LazyInitializationPattern {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static class Singleton {
        private static Singleton singleton;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}