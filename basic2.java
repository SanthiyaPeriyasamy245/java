public class basic2 {
    public static void main(String a[])
    {
    
int n=1;
//switch case.
switch(n)
{
    case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        break;
        default:
        System.out.println("invalid input");

}
//loops.
int i=1;
while(i<5)
{
    System.out.println("week"+i);
    int j=1;
    while(j<3)
    {
        System.out.println("hi");
        j++;
    }
    i++;
}
do{
    int y=5;
    System.out.println("value of n is 5 and it's not greater then 6!");
}
while(n>6);
int z=10;

for(int c=1;c<=10;c++)
{ 
     int count=0;
    for(int j=1;j<=c;j++)
    {
        if(c%j==0)
        {
            count++;
            
        }
       
        
    }
    if(count==2)
    {
        System.out.println(c+"is a prime number");
    }  
    else{
        System.out.println(c+"is not a prime number");
    }     

        
    }
}

}

