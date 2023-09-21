class calculator{
    void add(int a,int b){
         System.out.println(a+b);
    }    
    void add(double a,double b){
        System.out.println(a+b);
    }        
    void add(int a,double b){
        System.out.println(a+b);
    }
    
public static void  main(String[] args){
        calculator c1=new calculator();
        c1.add(2,3);
        c1.add(4,4);
        c1.add (7,4);       
    }
}