public class Child extends parent {
  // here the child class extends the properties of it's parent class.
  // so that it can get properties that are used in the parent class.
  //this is called inheritance.
  int w;
  Child()
  {
    w=10;
  }
  Child(int l,int b ,int w)
  {
    //here it will call the constuctor of parent class which is already created (with two parameters)
    super(l, b);
    this.w=w;
  }
}
