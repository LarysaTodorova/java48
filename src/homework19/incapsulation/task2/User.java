package homework19.incapsulation.task2;

public class User {
    /*
    Создайте класс User, который инкапсулирует данные пользователя: логин, пароль и адрес электронной почты.
     Обеспечьте безопасное изменение и доступ к этим полям через геттеры и сеттеры.
     Пароль следует изменять только в том случае, если введен старый пароль,
      а новый соответствует требованиям безопасности пароля.
     */

    private String login;
    private boolean oldPass;
    private String eMail;
    private boolean newPass;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isOldPass() {
        return oldPass;
    }

    public void setOldPass(boolean oldPass) {
        this.oldPass = oldPass;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isNewPass() {
        return newPass;
    }

    public void setNewPass(boolean newPass) {
        this.newPass = newPass;
    }

    public  boolean changePass(boolean oldPass, boolean newPass) {
        if (oldPass == oldPass) {
            System.out.println("You can change you password");
        }return newPass;

    }
}

