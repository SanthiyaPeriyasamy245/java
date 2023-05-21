
class student
{
    //instance variables.
    float gpa;
    String name;
}
  
public class basic4 {
    public static void main(String a[])
    {
        //single dimensional array.
        int array[]=new int[6];
        for(int i=0;i<array.length;i++)
        {  
            array[i]=(int)(Math.random()*10);
            System.out.println(array[i]);
        }
        //enhanced for loop.
        for(int j:array)
        {
            System.out.println(j);
        }
        //multi dimensional array.
        int multi_array[][]=new int[3][3];
        for(int i=0;i<multi_array.length;i++)
        {
            for(int j=0;j<multi_array.length;j++)
            {
              multi_array[i][j]=(int)(Math.random()*10);
              System.out.print(multi_array[i][j]+" ");

            }
            System.out.println();
        }
        //enhanced for loop.
        for(int y[]:multi_array)
        {
            for(int z:y)
            {
                System.out.print(z+" ");
            }
            System.out.println();

        }
        //jagged array.
        int jagged_array[][]=new int[3][];
         jagged_array[0]=new int[3];   
         jagged_array[1]=new int[2];
        jagged_array[2]=new int[1];
        for(int i=0;i<jagged_array.length;i++)
        {
            for(int j=0;j<jagged_array[i].length;j++)
            {
               jagged_array[i][j]=(int)(Math.random()*10);
               System.out.print(jagged_array[i][j]+" ");
            }
            System.out.println();
        }
        student s1=new student();
        s1.gpa=9.8f;
        s1.name="santhiya";
        student s2=new student();
        s2.gpa=9.9f;
        s2.name="Gowtham";
        student students[]=new student[2];
        students[0]=s1;
        students[1]=s2;
        for(student s:students)
        {
            System.out.println(s.name+":"+s.gpa);
        }

    }
}



    
