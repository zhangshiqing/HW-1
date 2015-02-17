package HW1;
public class Ant 
extends Creature
implements Flyer{	
	private String className = getClass().getSimpleName();
	public Ant(java.lang.String theName){
		super(theName);
	}	
	public void	move(){
		System.out.println(name + " " + className + " is crawling around.");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub		
	};

}
