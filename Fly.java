package HW1;
public class Fly
extends Creature
implements Flyer{	
	private String className = getClass().getSimpleName();	
	public Fly(java.lang.String theName){
		super(theName);
	}	
	public void	eat(Thing aThing){
		if(aThing instanceof Creature)
			System.out.println(name + " " + className + " won't eat a " + aThing);
		else{
			numInStomach += 1; 
			inStomach[numInStomach-1] = aThing;
			System.out.println(aThing.name +  " has just eaten a " + aThing);
			}		
	}; 	 
	public void	move(){
		fly();
	};    
	public void fly(){
		System.out.println(name + " " + className +" is buzzing around in flight.");
	};
}
