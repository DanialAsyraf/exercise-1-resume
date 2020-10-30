/*
    A class can be considered as a blueprint which you can create as ,any objects as you like.
 */
package assign2;

/**
 *
 * @author user
 */
public class main {


    public static void main(String[] args) {
        
        personal p=new personal();
        cgpa q=new cgpa();
        exam c=new exam();
        skill s=new skill();
        workexperiences w=new workexperiences();
        awards a=new awards();
        address h=new address();
        MultiDimensionArrayDemo m=new MultiDimensionArrayDemo();
        FindLargestElement f=new FindLargestElement();
        
        System.out.println("My name is "+p.name);
        System.out.println("Address: "+h.homeadress);
        q.printCgpa();
        c.printExam();
        q.printGpa();
        System.out.println("Final Cgpa: "+q.calculateCgpa());
        s.printProskills();
        w.printWork();
        a.printAward();
        
    }    
}











    /*// fields (or instance variable)
    int age;
    String name,work,birthday,address,result;
    double cgpa;
    double sum=0;
    double gpa[]={4.00,3.98,3.70,3.85,3.70,3.85};
    double finalcgpa=calculateCgpa();
        
    // Default constructor
    main(){
        this.name="Danial";
        this.age=24;
        this.work="Mamasab Official Agent";
        this.result="A";
        this.cgpa=3.69;
        this.birthday="14 April 1996";
        this.address="92A, Jalan OZ 2, Ozana Impian, Bukit Katil, 75450, Melaka";       
        
    }
    //Parameterized constructor
    main (String n,String w,String b,String h,String r,int a,double c,double f){
        this.name=n;
        this.age=a;
        this.work=w;
        this.cgpa=c;
        this.birthday=b;
        this.address=h;
        this.finalcgpa=f;
        this.result=r;
    }
    
    public void printMain() {
        main obj1 = new main();
        main obj2 = new main("Asyraf","Open Journal System Consultant","27 February 2000","92A, Jalan OZ 2, Ozana Impian, Bukit Katil, 75450, Melaka","A",30,3.89,finalcgpa);
        
        System.out.println("Name: "+obj1.name+"\n"+"Age: "+obj1.age+"\n"+"Birtday: "+obj1.birthday+"\n"+"Home Address: "+obj1.address+"\n"+"Work Experiences: "+obj1.work+"\n"+"Programming 1 result: "+obj1.result+"\n"+"Sem 1 Gpa: "+obj1.cgpa+"\n"+"Final cgpa: "+obj1.finalcgpa);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name: "+obj2.name+" || "+"Age: "+obj2.age+" || "+"Birthday: "+obj2.birthday+" || "+"Home Address: "+obj2.address+" || "+"Work Experiences: "+obj2.work+" || "+"Programming 1 result: "+obj2.result+" || "+"Sem 1 Gpa:"+obj2.cgpa+" || "+"Final cgpa: "+obj2.finalcgpa);
    }
    public double calculateCgpa(){
    for (int i=0; i<gpa.length; i++){
        sum+=gpa[i];
        //sum=sum+gpa[i];
    }
    if (gpa.length != 0){
        cgpa=sum/gpa.length;
    }
    else {
        cgpa=0.0;
    }
        
    
    return cgpa;

        m.printDemo();
        f.printLargest();
} */