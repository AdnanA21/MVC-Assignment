public class PlayerModel {
    private String playerFullName;
    private int playerJerseyNo;
    private String playerTeamName;


    /**
     * This method will communicate will database server to
     * fetch user-requested info
     * For this assignment, here the database is hard-coded.
     */
    public void setPlayerInfo(String playerNickName)
    {
        if(playerNickName.equals("MJ"))
        {
            this.playerFullName = "Michael Jordan";
            this.playerJerseyNo = 23;
            this.playerTeamName = "Chicago Bulls";
        }

        else if(playerNickName.equals("LeBron"))
        {
            this.playerFullName = "LeBron James";
            this.playerJerseyNo = 23;
            this.playerTeamName = "LA Lakers";
        }
        else if(playerNickName.equals("Kobe"))
        {
            this.playerFullName = "Kobe Bryant";
            this.playerJerseyNo = 24;
            this.playerTeamName = "LA Lakers";
        }
        else if(playerNickName.equals("Curry"))
        {
            this.playerFullName = "Steph Curry";
            this.playerJerseyNo = 30;
            this.playerTeamName = "Golden Warriors";
        }
        else if(playerNickName.equals("KD"))
        {
            this.playerFullName = "Kevin Durant";
            this.playerJerseyNo = 7;
            this.playerTeamName = "Brooklyn Nets";
        }
        else
        {
            this.playerFullName = "No name";
            this.playerJerseyNo = 0;
            this.playerTeamName = "No team";
        }
    }

    /**
     * @return this method returns with the full name of the requested player
     */
    public String getPlayerFullName()
    {
        return playerFullName;
    }

    /**
     * @return this method returns with the jersey number of the requested player
     */
    public int getPlayerJerseyNo()
    {
        return playerJerseyNo;
    }

    /**
     * @return this method returns with the team name of the requested player
     */
    public String getPlayerTeamName()
    {
        return playerTeamName;
    }
}