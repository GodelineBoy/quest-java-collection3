import java.util.TreeSet;

public class Thanos {

    public static void main(String[] args) {

    	Hero hulk = new Hero("Hulk", 49);
    	Hero blackwidow = new Hero("Black Widow", 34);
    	Hero captainamerica = new Hero("Captain America", 100);
    	Hero thor = new Hero("Thor", 1501);
    	Hero vision = new Hero("Vision", 3);
    	Hero scarletwitch = new Hero("Scarlet Witch", 29);
    	Hero doctorstrange = new Hero("Doctor Strange", 42);
    	Hero spiderman = new Hero("Spider-Man", 18);
        Hero ironman = new Hero("Iron Man", 48);
       
        TreeSet<Hero> heroes = new TreeSet<>();
        	heroes.add(hulk);
        	heroes.add(blackwidow);
        	heroes.add(captainamerica);
        	heroes.add(thor);
        	heroes.add(vision);
        	heroes.add(scarletwitch);
        	heroes.add(doctorstrange);
        	heroes.add(spiderman);
            heroes.add(ironman);
            
        //heroes.add(new Hero("Hulk", 49));
        //heroes.add(new Hero("Black Widow", 34));
        //heroes.add(new Hero("Captain America", 100));
        //heroes.add(new Hero("Thor", 1501));
        //heroes.add(new Hero("Vision", 3));
        //heroes.add(new Hero("Scarlet Witch", 29));
        //heroes.add(new Hero("Doctor Strange", 42));
        
        
        // TODO 1 : Retrieve and remove the oldest hero in one line
        //Hero oldest = null;
        boolean removeThor = heroes.remove(thor);

        System.out.println("\nOldest hero:");
        System.out.println(thor == null ? "" : thor.getName());

        // TODO 2: Show heroes by age (descending)
        System.out.println("\nHeroes by age (descending) :");
        for (Hero hero : heroes.descendingSet()) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }

        // TODO 3: Show heroes by age (ascending),from Spider-Man (include) to Iron Man (include)
        

        System.out.println("\nSubset of heroes :");
        for (Hero hero : heroes.subSet(spiderman, hulk)) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }
    }
}
