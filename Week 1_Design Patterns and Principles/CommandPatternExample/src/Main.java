import dependencies.Command;
import dependencies.Light;
import dependencies.LightOffCommand;
import dependencies.LightOnCommand;
import dependencies.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
