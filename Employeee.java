class Employee{
    String name;
    String id;
    double salary;
    String designation;

Employee(){
      this.name="aman";
      this.id="a120";
      this.salary=18000;
      this.designation="java";
}
Employee( String name,String id, double salary,String designation){
    this.name=name;
    this.id=id;
    this.salary=salary;
    this.designation=designation;
}
void displayinfo(){
    System.out.println("name:" +name);
     System.out.println("id:" +id);
     System.out.println("salary:" +salary);
     System.out.println("designation:" +designation);
}
}
class Employeee{
 public static void main(String[] args){
    Employee e1=new Employee();
    Employee e2=new Employee("rukai","a1221",12000,"c program");
    e1.displayinfo();
    e2.displayinfo();
   }
}

