import java.util.Scanner;
class student {
    String usn;
    String name;
    int credits[]= new int[9];
    int marks[]= new int[9];

    public void enterInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the usn");
        usn=sc.nextLine();
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the credits");
        for(int i=0;i<9;i++){
            credits[i]=sc.nextInt();
        }
        System.out.println("enter the marks");
        for(int i=0;i<9;i++){
            marks[i]=sc.nextInt();
        }
    }

    public void displayInfo(){
        System.out.println("\nPRINTING STUDENT INFO: \n");
        System.out.println("USN: "+usn);
        System.out.println("NAME: "+name);
        System.out.print("CREDITS: ");
        for(int i=0;i<9;i++){
            System.out.print(credits[i]+" ");
        }
        System.out.println();
        System.out.print("MARKS: ");
        for(int i=0;i<9;i++){
            System.out.print(marks[i]+" ");
        }
    }

    public float calculateSGPA(){
        float sgpa;
        float totalcreds=0;
        for(int i=0;i<9;i++){
            totalcreds+=credits[i];
        }
        float gp=0;
        for(int i=0;i<9;i++){
            gp+=credits[i]*(((marks[i])/10)+1);
        }
        sgpa=gp/totalcreds;
        return sgpa;
    }
}

public class democlass{
    public static void main(String args[]){
        student s1= new student();
        s1.enterInfo();
        s1.displayInfo();
        float sgpa=s1.calculateSGPA();
        System.out.println("\nSGPA: "+sgpa);
    }
}