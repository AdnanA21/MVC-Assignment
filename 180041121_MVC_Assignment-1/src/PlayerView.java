import java.util.Scanner;

public class PlayerView {
    private String playerNickName;

    /**
     * This method will take input from the user directly
     */
    public void getInputFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a NBA star player nickname: ");
        playerNickName = scanner.next();
    }

    /**
     * This method will be used by the controller class to
     * get the nickname of the player
     */
    public String getPlayerNickName()
    {
        return playerNickName;
    }

    /**
     * This method will print the detail info of the user-requested
     * player
     * @param playerFullName --> Full Name of the requested player
     * @param playerJerseyNo --> Jersey No of the requested player
     * @param playerTeamName --> Team Name of the requested player
     */
    public void printPlayerDetails(String playerFullName, int playerJerseyNo, String playerTeamName)
    {
        System.out.println("-------Player's Details Information-------");
        System.out.println("Full Name: "+ playerFullName);
        System.out.println("Jersey No: "+ playerJerseyNo);
        System.out.println("Team Name: "+ playerTeamName);
    }
}
