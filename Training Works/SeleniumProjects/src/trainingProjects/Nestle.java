package trainingProjects;

public class Nestle extends FoodIndustry {
	
	public static void main(String[] args)
	
	{ 		
		Nestle oNest = new Nestle();
		System.out.println("IM THE CHILD1 CLASS - NESTLE");
		System.out.println(" ");
		System.out.println("REFERENCE TO CHILD1");
		System.out.println("-------------------");
		System.out.println("Sugar Percentage is : "+oNest.sugarpercentage());
		System.out.println("Salt Percentage is : "+oNest.saltpercentage());
		System.out.println("Ingredient Percentage is :"+oNest.ingredientpercent());
	
		FoodIndustry oFood = new Nestle();
		System.out.println("REFERENCE TO PARENT");
		System.out.println("-------------------");
		System.out.println("Sugar Percentage is : "+oFood.sugarpercentage());
		System.out.println("Salt Percentage is : "+oFood.saltpercentage());
		System.out.println("Ingredient Percentage is :"+oFood.ingredientpercent());
		System.out.println("Price Details is : "+oFood.pricing());
		
	}

	public double ingredientpercent() 
	{
		return 50.10;
	}	
		
	public double pricing() 
	{
		return 20;
		
    }

	@Override
	public int outletcount() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
