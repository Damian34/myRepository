package Service;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-29T22:02:27")
@StaticMetamodel(Wypożyczenie.class)
public class Wypożyczenie_ { 

    public static volatile SingularAttribute<Wypożyczenie, Integer> idWypożyczenie;
    public static volatile SingularAttribute<Wypożyczenie, Integer> idKsiążka;
    public static volatile SingularAttribute<Wypożyczenie, Date> terminZwrotu;
    public static volatile SingularAttribute<Wypożyczenie, Integer> idCzytelnika;
    public static volatile SingularAttribute<Wypożyczenie, String> status;
    public static volatile SingularAttribute<Wypożyczenie, Date> dataWypożyczenia;

}