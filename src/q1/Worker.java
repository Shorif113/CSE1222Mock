package q1;

public class Worker {
   protected String name;
   protected double wage;

    public Worker(String name,double wage){
        this.name=name;
        this.wage=wage;
    }


    public String toString(){
        return "Name: "+name+ ",Wage: "+wage;
    }

}
class Supervisor extends Worker{
    String division;
    public  Supervisor(String name,double wage,String division){
        super(name,wage);
        this.division=division;
    }
    public String toString(){
        return "Name: " + name + ", Division: " + division + ", Wage: " + wage;
    }
}


class Director extends Supervisor {
    public Director(String name,double wage,String division){
        super(name, wage, division);
    }
    public String toString(){
        return "Name: "+ name + " ,Division: " + division + " ,Wage: "+ wage;
    }
}