package pres;

import Dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args)
    { //injection des dépendances par des
        // instanciation statique
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("result= "+metier.calcul());
    }
}
