package HW1;
public abstract class Creature
extends Thing{
	public Thing[] inStomach;
	public int numInStomach;
	public Creature (java.lang.String theName){
		super(theName);
	}	
	public void eat(Thing aThing) {
		// TODO Auto-generated method stub
		numInStomach += 1; 
		inStomach[numInStomach-1] = aThing;
		System.out.println(aThing.name +  " has just eaten a " + aThing);
	}	
	public abstract void move();
	public void whatDidYouEat() {
		// TODO Auto-generated method stub
		for (int i = 0; i<numInStomach; i += i)
			System.out.println(inStomach[i].name + " has eaten a " + inStomach[i]);
	}		
}


