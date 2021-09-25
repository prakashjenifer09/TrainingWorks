package trainingProjects;

public abstract class FoodIndustry {

	
		public FoodIndustry() 
		    {
			 System.out.println("IM THE PARENT CLASS - FOOD INDUSTRY");
			 System.out.println(" ");
		    }
		
		public int sugarpercentage()
		{
			return 7;
		}
		
		public int saltpercentage()
		{
			return 12;
		}
		public double potassiumpercent()
		{
			return 3.5;
			
		}
		public abstract double ingredientpercent();
		
		public abstract double pricing();
		
		public abstract int outletcount();
		
		
	}




