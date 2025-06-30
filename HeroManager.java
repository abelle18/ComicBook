import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager 
{
    private ArrayList<Hero> heros;

    public HeroManager() 
    {
        heros = new ArrayList<>();
    }

    public void addHero(Hero hero) 
    {
        heros.add(hero);
    }

    public boolean removeHero(String name) 
    {
        return heros.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }

    // bubble sort
    public void bubbleSortByPowerLevel() 
    {
        for (int i = 0; i < heros.size() - 1; i++) 
        {
            for (int j = 0; j < heros.size() - 1 - i; j++) 
            {
                if (heros.get(j).getPowerLevel() > heros.get(j + 1).getPowerLevel()) 
                {
                    Hero temp = heros.get(j);
                    heros.set(j, heros.get(j + 1));
                    heros.set(j + 1, temp);
                }
            }
        }
    }

    // insertion sort
    public void insertionSortByPowerLevel() 
    {
        for (int i = 1; i < heros.size(); i++) 
        {
            Hero temp2 = heros.get(i);
            int j = i - 1;
            while (j >= 0 && heros.get(j).getPowerLevel() > temp2.getPowerLevel()) 
            {
                heros.set(j + 1, heros.get(j));
                j--;
            }
            heros.set(j + 1, temp2);
        }
    }

    public void displayHeros() 
    {
        for (int i = 0; i < heros.size(); i++) 
        {
            System.out.println(heros.get(i));
        }
    }

    // print 2D display
    public void displayHerosAs2DArray() 
    {
        String[][] table = new String[heros.size()][3];
        for (int i = 0; i < heros.size(); i++) 
        {
            table[i][0] = heros.get(i).getName();
            table[i][1] = String.valueOf(heros.get(i).getPowerLevel());
            table[i][2] = heros.get(i).getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(table));
    }
}