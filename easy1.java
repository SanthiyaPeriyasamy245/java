
class student{
    //instance variables.
    String name;
    double maths;
    double physics;
    double chemistry;
}

public class easy1{
    public static void main(String a[])
    {
         student stud1=new student();
         stud1.name="Aishwarya";
         stud1.maths=98.00;
         stud1.physics=87.00;
         stud1.chemistry=95.00;
        
     
         student stud2=new student();
         stud2.name="tamizh";
         stud2.maths=100;
         stud2.physics=98;
         stud2.chemistry=95;
    student students[]=new student[2];
    students[0]=stud1;
    students[1]=stud2;
    for(int i=0;i<students.length;i++)
    { 
        System.out.println(students[i].maths);

    }
    //enhanced for  loop.
    for(student x:students)
    {
        System.out.println(x.name);
    }

    }
    
}

