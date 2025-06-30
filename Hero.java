public class Hero 
{
    private String name;
    private int powerLvl;
    private Affiliation affiliation;

    // hero constructor
    public Hero(String name, int powerLvl, Affiliation affiliation) 
    {
        this.name = name;
        this.powerLvl = powerLvl;
        this.affiliation = affiliation;
    }

    // getter functions
    public String getName() 
    {
        return name;
    }

    public int getPowerLevel() 
    {
        return powerLvl;
    }

    public Affiliation getAffiliation() 
    {
        return affiliation;
    }

    // stats
    @Override
    public String toString() 
    {
        return name + " (Power Lvl: " + powerLvl + ", Affiliation: " + affiliation + ")";
    }
}