// Add complex numbers
// import java.util.Scanner;
public class complex {
int r;
int i;
    complex(int real,int img){
    r=real;
    i=img;
    }
    void display(){
    System.out.println(r+"+"+i+"i");
    }
    static void add(int r1,int i1,int r2,int i2 ){
        r1=r1+r2;
        i1=i1+i2;
        System.out.println("After Addition = "+r1+"+"+i1+"i");
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // String firstComplex=sc.nextLine();
        // String[] ar=firstComplex.split("[-+i]");
        // String secondComplex=sc.nextLine();
        // String[] ar2=secondComplex.split("[-+i]");
        complex first=new complex(5,4);
        complex second=new complex(7,9);
        System.out.println("Complex Numbers are:");
        first.display();
        second.display();
        add(first.r,first.i,second.r,second.i);
    }
    
}
