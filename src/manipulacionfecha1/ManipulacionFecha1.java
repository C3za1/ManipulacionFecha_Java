/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacionfecha1;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 * @author cezar alan
 */
public class ManipulacionFecha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha=new Date();
        System.out.println("fecha");
        
        DateFormat fh=new SimpleDateFormat("HH:MM:SS");
        DateFormat ff=new SimpleDateFormat("dd:MM:yyyy");
        System.out.println("La hora es:"+fh+"La fecha es:"+ff.format(fecha));
        
        Calendar fecha1=Calendar.getInstance();
        int anio=fecha1.get(Calendar.YEAR);
        int mes=fecha1.get(Calendar.MONTH);
//        int dia=fecha1.get(DAY_OF_MONTH);
//        int dia=fecha1.get(hora HOUR_OF_DAY);
//        int dia=fecha1.get(minutos);
//          int dia=fecha1.get(segundos);      
             
         //mandar a escribir el formato de nora por hora-minutos y segundos
         //fecha por dia-mes y año
                        // TODO code application logic here
    }
    
}
