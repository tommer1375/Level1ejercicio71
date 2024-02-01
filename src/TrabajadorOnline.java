
public class TrabajadorOnline extends Trabajador{
   
    private static final Integer internet=30;

    public TrabajadorOnline (String name, String surname, double price){
        super (name, surname, price);

    }
  @Override
    public double salaryHours(double hours){
        return super.salaryHours(hours)+internet;
    }

}
