package org.example.exercise5;

public class main {
    public static void main(String[] args) {
        class Singleton1 {
            @SuppressWarnings("InstantiationOfUtilityClass")
            private static final Singleton1 INSTANCE = new Singleton1();

            private Singleton1() {}

            public static Singleton1 getInstance() {
                return INSTANCE;
            }
        }


        class Singleton2 {
            private static Singleton2 INSTANCE = null;
            private Singleton2() {}

            @SuppressWarnings("InstantiationOfUtilityClass")
            public static synchronized Singleton2 getInstance() {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
                return INSTANCE;
            }
        }

        enum Singleton3 {
            INSTANCE;
            public static Singleton3 getInstance() {
                return INSTANCE;
            }
        }

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton1Copy = Singleton1.getInstance();


        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton3Copy = Singleton3.getInstance();
        Singleton3 singleton3AnotherCopy = Singleton3.INSTANCE;



        System.out.print("\nSingleton1 hashCodes: ");
        System.out.print(singleton1.hashCode() + " ");
        System.out.println(singleton1Copy.hashCode());

        System.out.print("\nSingleton3 hashCodes: ");
        System.out.print(singleton3.hashCode() + " ");
        System.out.print(singleton3Copy.hashCode() + " ");
        System.out.println(singleton3AnotherCopy.hashCode());

        System.out.println("Hello world!");
    }
}
