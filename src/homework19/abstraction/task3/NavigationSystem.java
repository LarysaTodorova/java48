package homework19.abstraction.task3;

abstract class NavigationSystem {
    /*
    класс NavigationSystem с абстрактными методами для начала навигации startNavigation и
    завершения навигации stopNavigation.
    Этот класс может также включать общие поля и методы, применимые ко всем системам навигации.
     Наследуйте от него классы CarNavigationSystem и MarineNavigationSystem,
     реализующие абстрактные методы для определенных типов навигации.
     */

    abstract void  startNavigation();

    abstract void stopNavigation();

}
