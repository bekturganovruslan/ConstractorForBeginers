package ConstractorPractice;

public class StaticExample {

    int a;
    int b;
    static int c;

    public StaticExample(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
    }

    public static void main(String[] args) {

        StaticExample se1=new StaticExample(5,6,2);
        int sum=se1.a+se1.c;
        System.out.println(se1.a+"<-a c->"+se1.c);

        System.out.println(sum);

        StaticExample se2=new StaticExample(2,1,10);
        sum=sum+se2.a+se1.c;
        System.out.println("c "+c);
        System.out.println(sum);

        StaticExample se3=new StaticExample(8,5,8);

        System.out.println(sum+" "+se3.c+" "+se1.c+" "+se2.c);

        sum=sum+se3.c+se1.c+se2.c;
        System.out.println(sum);

    }


}
