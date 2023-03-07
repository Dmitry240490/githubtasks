package patterns.factory_method_pattern;

// TODO: Задание. Реализовать паттерн Factory/Фабричный метод
public class FactoryMethodPattern {

    public static void main(String[] args) {
        AQA aqa = new PythonAQA();
        aqa.writeTest();

        String language = "Python";
        Programmer programmer = getProgrammer(language);
        programmer.writeCode();
    }

    static Programmer getProgrammer(String language) {
        if ("Java".equals(language)) {
            return new JavaDeveloper();
        } else {
            return new PythonDeveloper();
        }
    }

    interface Programmer {
        void writeCode();
    }

    interface AQA {
        void writeTest();
    }

    static class PythonDeveloper implements Programmer {
        @Override
        public void writeCode() {
            System.out.println("Write Python code");
        }
    }

    static class PythonAQA implements AQA {
        @Override
        public void writeTest() {
            System.out.println("Write Python AQA test");
        }
    }

    static class JavaDeveloper implements Programmer {
        @Override
        public void writeCode() {
            System.out.println("Write Java code");
        }
    }
}