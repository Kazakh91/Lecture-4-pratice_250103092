import java.util.List;

public class ModernHub {

    private final List<SmartDevice> devices;

    public ModernHub(List<SmartDevice> devices){
        this.devices = devices;
    }


    public void activeAll(){
        for (SmartDevice b : devices){
            b.turnOn();
        }
    }
    public void emergencyShutdown() {
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }
    public double calculateAveragePowerUsage() {
        if (devices.isEmpty()) return 0.0;
        int sum = 0;
        for (SmartDevice d : devices) {
            sum += d.getPowerPercent();
        }
        return (double) sum / devices.size();
    }
}
