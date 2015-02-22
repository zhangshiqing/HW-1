.SUFFIXES: .java .class
.java.class:
        javac -g *.java
			
CLASSES = \
		Thing.java \
		Creature.java \
		Ant.java \
		Bat.java \
        Fly.java \
		TestCreature.java \
		Flyer.java
		
default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class
