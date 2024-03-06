package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired //permet de faire l'injection de dépendance
     private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double result=tmp*10/Math.PI;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
