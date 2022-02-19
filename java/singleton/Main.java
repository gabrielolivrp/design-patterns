package singleton;

class Main {
    public static void main(String args[]) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if (singleton1.equals(singleton2)) {
            System.out.print("Objects are the same");
        } else {
            System.out.print("Objects are not the same");
        }
    }
}
