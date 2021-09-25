package trainingProjects;

public class Hatsun extends Nestle {
	
public static void main(String[] args)
	
	{ 		
		Nestle oHat = new Hatsun();
		System.out.println("IM THE CHILD2 CLASS - HATSUN");
		System.out.println(" ");
		System.out.println("REFERENCE TO CHILD2");
		System.out.println("-------------------");
		System.out.println("Potassium Percentage is : "+oHat.potassiumpercent());
		System.out.println("Sugar Percentage is : "+oHat.sugarpercentage());
		System.out.println("Salt Percentage is : "+oHat.saltpercentage());
		System.out.println("Ingredient Percentage is :"+oHat.ingredientpercent());
		System.out.println("Price Details is : "+oHat.pricing());
		System.out.println("outlet Count is : "+oHat.outletcount());
				
	}

    public int outletcount() 
{
	// TODO Auto-generated method stub
	return 500;
}


}
