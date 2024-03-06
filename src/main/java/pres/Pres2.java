package pres;

import Dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        //injection des dépendances par des
        //instanciation dynamique
        String daoClassName=sc.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String metierClassName=sc.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
    }
}
