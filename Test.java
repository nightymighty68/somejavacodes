
import java.util.Scanner;

public class Test{
    
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nenter number of student:");
    int x = scan.nextInt();
    scan.nextLine();
    String[] name = new String[x];
    String[] grade=new String[x];
    int[] mark=new int[x];

    for (int count=0;count<x;count++){
        System.out.println("\nenter name of student:");
        name[count] = scan.nextLine();
        
        System.out.println("\nenter mark of student:");
        mark[count]= scan.nextInt();
        scan.nextLine();
    }
    System.out.println("MARK SUMMARY:");
    for (int y=0;y<x;y++){
        if(mark[y]>=80){
            grade[y]= "distinction";
        }
        else if(mark[y]>=60 && mark[y]<80){
            grade[y] = "merit";
        }
        else if(mark[y]>=40 && mark[y]<60){
            grade[y] = "pass";
        }
        else if(mark[y]<40){
            grade[y] = "fail";
        }
        System.out.println(name[y]+"\t"+mark[y]+"\t"+grade[y]);
    }
    System.out.println("\nstudents who achieve merit or distinction:");
    for(int z=0; z<x;z++){
        if(mark[z]>=60){
            System.out.println(name[z]+"\t"+mark[z]);
        }
    }
    boolean loc=false;
    System.out.println("\nenter the grade you want to search:");
    String gr = scan.nextLine();
    for(int count=0;count<x;count++){
        if(grade[count].equals(gr)){
            System.out.println(name[count]+"\t"+mark[count]);

        }
    }

	}
}





