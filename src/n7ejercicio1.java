import java.util.*;

public class n7ejercicio1 {

    public static void main(String[] args){

        TrabajadorOnline workerOnline = new TrabajadorOnline("Larry", "Bird", 12.50);
        TrabajadorPresencial workerSite = new TrabajadorPresencial ("Michael", "Jordan", 15.75);

        System.out.println(workerOnline);
        System.out.println("Tiene un coste total por horas trabajadas "+workerOnline.salaryHours(40)+"€");
        System.out.println(workerSite);
        System.out.println("Tiene un coste total por horas trabajadas "+workerSite.salaryHours(35)+"€");

    }
}