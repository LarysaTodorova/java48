package practice;

public class ShootDemo {
    public static void main(String[] args) {

ShootUtil util = new ShootUtil();

        Shoot shoot1 = util.prepareShoot();
        util.printShoot(shoot1);

        Shoot shoot2 = util.prepareShoot();
        util.printShoot(shoot2);

        Shoot shoot3 = util.prepareShoot();
        util.printShoot(shoot3);

        Shoot shoot4 = util.prepareShoot();
        util.printShoot(shoot4);


    }

}
