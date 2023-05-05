class employee{
    
    int age;
    int experience;
    String job;

}


class  day2 {
    public static void main(String a[])
 { 
      employee emp1=new employee();
      emp1.age=23;
      emp1.experience=2;
      emp1.job="data analyst";
      employee emp2=new employee();
      emp2.age=25;
      emp2.experience=3;
      emp2.job="front end developer";
      employee emp3=new employee();
      emp3.age=35;
      emp3.experience=13;
      emp3.job="full stack developer";
      employee emp4=new employee();
      emp4.age=25;
      emp4.experience=3;
      emp4.job="front end developer";
      employee emp5=new employee();
      emp5.age=28;
      emp5.experience=5;
      emp5.job="full stack developer";
      
     employee workers[]=new employee[5];
      workers[0]=emp1;
      workers[1]=emp2;
      workers[2]=emp3;
      workers[3]=emp4;
      workers[4]=emp5;
      
     for(employee x:workers)
     {
        System.out.println(x.age+" "+x.experience+" "+x.job);
     }
 }   
}
