public class PlayerController {
    private PlayerModel model;
    private PlayerView view;

    private String playerFullName;
    private int playerJerseyNo;
    private String playerTeamName;

    /**
     * PlayerController constructor takes a model and view as parameter so that
     * it can work as a mediator between them.
     * @param model --> model object will store the player's info
     * @param view --> view object is the one user will see
     */
    public PlayerController(PlayerModel model, PlayerView view)
    {
        this.model = model;
        this.view = view;
    }

    /**
     *  This method will allow the controller to take input given
     *  by the user to the view
     */
    public void getInputFromView()
    {
        view.getInputFromUser();
    }

    /**
     * Using this method, controller will tell the model to
     * get the info requested by user
     */
    public  void getUserRequestedInfo()
    {

        model.setPlayerInfo(view.getPlayerNickName());
        playerFullName = model.getPlayerFullName();
        playerJerseyNo = model.getPlayerJerseyNo();
        playerTeamName = model.getPlayerTeamName();
    }

    /**
     * Using this method, controller will pass user requested info
     * to the view and update view with this info
     */
    public void updateView()
    {
        view.printPlayerDetails(playerFullName, playerJerseyNo, playerTeamName);
    }
}
