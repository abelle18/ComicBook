public class Main 
{
    public static void main(String[] args) 
    {
        HeroManager HM = new HeroManager();

        // Adding heros to list
        HM.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        HM.addHero(new Hero("Batman", 75, Affiliation.JUSTICE_LEAGUE));
        HM.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        HM.addHero(new Hero("Human Torch", 70, Affiliation.FANTASTIC_FOUR));

        System.out.println("Original List:");
        HM.displayHeros();

        // bubble sort 
        System.out.println("\nBubble Sort (power lvl):");
        HM.bubbleSortByPowerLevel();
        HM.displayHeros();

        HM.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        HM.removeHero("Batman");

        System.out.println("\nList after Removal and Addition:");
        HM.displayHeros();

        // insertion sort
        System.out.println("\nInsertion Sort (power lvl):");
        HM.insertionSortByPowerLevel();
        HM.displayHeros();

        // print 2D array
        System.out.println("\n2D Array Display:");
        HM.displayHerosAs2DArray();
    }
}