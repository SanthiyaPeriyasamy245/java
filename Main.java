import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // to store different type of data's in the single variable we use object.
        // below the job is like a datatype of a person1 reference variable for this  memory allocation done at compile time.
        // new is a keyword which used to create object in heap memory at run time that's wh it's known as dynamic memory allocation.
        // how can we access the class variables in our object it can be done using dot operator.
        // but we can't initialize a value for each object using dot operator that's where constructor comes into picture.
        // whenever the new object is created the constructor get called.
        // this keyword refers to the current object.
        // this() is refers to the current constructor.you can call one constructor from another constructor.using this().
        job person1=new job();
        person1.company="amazon";
        person1.position="frontend developer";
        person1.salary=1000000;
        System.out.println(person1.company);
        job person2=new job("backend developer",1000000,"google");
        System.out.println(person2.salary);
        final job person3=new job();
//        person3=new job(); // here person 3 can't refer to new object.
        System.out.println(person3.position);
//        referrence variable can refer to new objects
        person1=new job("dfg",35346,"gfg");
        System.out.println(person1.company);// here person1 refers to the new object.
//        to prevent this we can use final keyword if you define one thing as final you can't modify it.
        job x;
        for(int i=0;i<1000000;i++)
        {
            x=new job(); // c=garbage collector wil be done in the java automatically we can't delete it manually.
        }

    }


}
 class job{
    String position;
    long salary;
    String company;
job(String position,long salary,String company)
{
    this.position=position;
    this.salary=salary;
    this.company=company;
}
job()
{
    this("fullstack developer",1200000,"facebook");
}

     @Override
     protected void finalize() throws Throwable {
         System.out.println("obj is deleted"); // when the obj is being deleted it'll give us this message we can't delete the obj manually but we can mention what to do when obj is being deleted.
     }
}