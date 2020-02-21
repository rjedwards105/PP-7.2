public class Soccer extends Sport
{
    private boolean isAYSO;

    public Soccer(String name, boolean isTeam, String unit, int point, boolean isAYSO)
    {
        super(name, isTeam, unit, point);
        this.isAYSO = isAYSO;
    }//end Soccer constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nAYSO: " + isAYSO;

        return output;
    }//end Soccer toString
}// end Soccer tennis
