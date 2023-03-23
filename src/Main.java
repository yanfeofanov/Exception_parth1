public class Main {
    public static void main(String[] args) {
        boolean result = Registration.registration("Login", "123", "123");
        if (result) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин или пароль не корректные");
        }
    }
}