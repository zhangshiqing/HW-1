package HW1;
public class Bat 
extends Creature
implements Flyer{
	private String className = getClass().getSimpleName();
	public Bat(java.lang.String theName){
		super(theName);
	}
	public void eat(Thing aThing){
		if(aThing instanceof Creature){
			numInStomach += 1; 
			inStomach[numInStomach-1] = aThing;
			System.out.println(aThing.name +  " has just eaten a " + aThing);
		}			
		else
			System.out.println(name + " " + className + " won't eat a " + aThing);			
	}	
	public void	move(){
		fly();
	};    
	public void fly(){
		System.out.println(name + " " + className +" is swooping through the dark.");
	};	
}
