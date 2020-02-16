import java.util.*;
public class BuildHouse {
	float areaOfHouse,cost;
	public void choiceOfHouse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
/*Available options are: 1.Standard materials,2.Above Standard materials,3.High Standard materials,4.High Standard materials and Fully Automated*/
		int choice = sc.nextInt(); //input from available choices
		areaOfHouse = sc.nextFloat();	//take input of total area of house		
		if(choice==1)
			stdMat();
		else if(choice==2)
			aboveStdMat();
		else if(choice==3)
			highStdMat();
		else if(choice==4)
			highStdMatAuto();
		}
	public void highStdMatAuto() {
		cost = areaOfHouse*2500;
		//print cost in INR
	}
	public void highStdMat() {
		cost = areaOfHouse*1800;
		//print cost in INR
	}
	public void aboveStdMat() {
		cost = areaOfHouse*1500;
		//print cost in INR
	}
	public void stdMat() {
		cost = areaOfHouse*1200;
		//print cost in INR
	}
}