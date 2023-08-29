public class Introduction{
  // new is a keyword to create an object after that we are giving an constructor;
  // to create m=number of objects with same template we use constructor. 
  // final is like a constant that prevents modification of a data
  // for example ramper class is a final type class .

  public static void main(String[]args)
  {
      final bike bk1=new bike();
      // here object referrence cannot be changed to new object.
      bike bk2=new bike("royalenfield",120000,"black");
      bike bk3=new bike("duke",120000,"black");
       System.out.println(bk3.name);
      // here if bk3 is final we can't change the object refference of it otherwise we can change like given below!.
      bk3=new bike(); 
       System.out.println(bk3.name);
      bk1.name=bk2.name;
      // the values can be changed but referrence can't be changed.
      System.out.println(bk2.cost);
       
          System.out.println(bk1.color);
    
  }
}
class bike{
  String name;
  int cost;
  String color;
   bike()
   {
    // internally it'll be like new bike().
    this("oops",0,"undefined");
   }
   bike(String name,int cost,String color)
   {
    this.name=name;
    this.cost=cost;
    this.color=color;
   }
}