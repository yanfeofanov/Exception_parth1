import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Registration {

    private Registration() {

    }
    public static boolean registration(String login,String password,String confirmPassword){
    try {
        check(login,password,confirmPassword);
        return true;
    } catch (WrongPasswordException|WrongLoginException e){
        System.out.println(e.getMessage());
        return false;
    }
    }

    private static void check(String login,String password,String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if(login.length()>20){
            throw new WrongLoginException("Длинна логина должна быть меньше или ровна 20 символам!");
        }
        if(password.length()>=20){
            throw new WrongPasswordException("Длинна пароля должна быть меньше 20 символов! ");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
        Checker checker = new LoopChecker();
        if(!checker.check(login)){
            throw new WrongLoginException("Логин содержит не корректные символы! ");
        }
        if(!checker.check(password)){
            throw new WrongPasswordException("Пароль содержит не корректные символы! ");
        }
    }
}
