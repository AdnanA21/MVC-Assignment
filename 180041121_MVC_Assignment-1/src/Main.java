/**
 * This main function contains three objects namely view, model, controller
 * where controller works as a mediator between view and model.
 */

public class Main {
    public static void main(String[]  args)
    {
        PlayerView view = new PlayerView();
        PlayerModel model = new PlayerModel();
        PlayerController controller = new PlayerController(model, view);

        controller.getInputFromView();
        controller.getUserRequestedInfo();
        controller.updateView();
    }
}
