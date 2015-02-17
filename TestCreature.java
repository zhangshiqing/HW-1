package HW1;
public class TestCreature {	
	public static final int	CREATURE_COUNT = 3; 
	public static final int THING_COUNT = CREATURE_COUNT;	
	public TestCreature(){};	
	public static void	main(java.lang.String[] args)  {
		// TODO Auto-generated method stub
		Creature[] creatures = new Creature [CREATURE_COUNT];
		Thing[] things = new Thing [THING_COUNT];		
		Creature ant = new Ant("ant"){};
		Creature bat = new Bat("bat"){};
		Creature fly= new Fly("fly"){};		
		creatures[0] = ant;
		creatures[1] = bat;
		creatures[2] = fly;		
		for (int i = 0; i < CREATURE_COUNT; i = i + 1)
			things[i] = creatures[i];
		System.out.println("Things:");
		System.out.println();
		for (int i = 0; i < CREATURE_COUNT; i = i + 1)
			System.out.println(things[i].toString());
		System.out.println();
		System.out.println("Creatures:");
		System.out.println();
		for (int i = 0; i < CREATURE_COUNT; i = i + 1)
			System.out.println(creatures[i].toString());		
	}
}

