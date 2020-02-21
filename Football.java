public class Football extends Sport
{
    private boolean canTackle;

    public Football(String name, boolean isTeam, String unit, int point, boolean canTackle)
    {
        super(name, isTeam, unit, point);
        this.canTackle = canTackle;
    }//end Football constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nCan Tackle: " + canTackle;

        return output;
    }//end Football toString
}// end class Football
