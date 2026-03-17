package homework19.incapsulation.task3;

public class SystemConfiguration {
    /*
    Разработайте класс SystemConfiguration, который хранит конфигурационные параметры системы
     (например, уровень логирования, путь к файлам журналов).
    Доступ к включению этих параметров должен строго контролироваться методами,
     исключающими установку некорректированных результатов.
     */

    private String levelOfLogin;
    private String fileWay;

    public String getLevelOfLogin() {
        return levelOfLogin;
    }

    public String getFileWay() {
        return fileWay;
    }

    public String addParameters(String levelOfLogin, String fileWay, String result) {
        if (levelOfLogin.equals(levelOfLogin) && fileWay.equals(fileWay)) {

        }
        return result;
        }

        }


