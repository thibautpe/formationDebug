package fr.cl.Cartouche;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMEF {

    public String getDateHeureCouranteString() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return s.format(date);
    }


}
