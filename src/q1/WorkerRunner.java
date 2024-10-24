package q1;

import javax.print.attribute.standard.MediaSize;

public class WorkerRunner {
    public static void main(String[] args) {
        Worker worker=new Worker("Shorif",20000) ;
        Supervisor supervisor=new Supervisor("Ashraful",30000, "Engineering");
        Director director=new Director("Tanim",40000,"Management");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
