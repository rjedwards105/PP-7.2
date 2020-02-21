public class Tennis extends Sport
{
    private boolean isSingles;

    public Tennis(String name, boolean isTeam, String unit, int point, boolean isSingles)
    {
        super(name, isTeam, unit, point);
        this.isSingles = isSingles;
    }//end tennis constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nSingles: " + isSingles;

        return output;
    }//end tennis toString
}// end class tennis
