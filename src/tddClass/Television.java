package tddClass;


public class Television {
    private int channel;
    private int volume;
    private boolean isOn;
    private String SONY;
    private double screenInches;

    public void setPower() {
        isOn = !isOn;
    }

    public boolean isOn(){
        return isOn;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannelToIncrease(int channel) {
        this.channel = ++channel;
    }

    public int getIncreaseChannel() {
        return channel;
    }

    public void setChannelToDecrease(int channel) {
        this.channel = --channel;
    }
    
    public int getDecreaseChannel() {
        return channel;
    }
    
    public void setVolumeToIncrease(int volume) {
        this.volume = ++volume;
    }

    public int getIncreaseVolume(int volume){
        return volume;
    }

    public void setVolumeToDecrease(int volume) {
        this.volume = --volume;
    }

    public int getDecreaseVolume() {
        return volume;
    }

    public String getManufacturer() {
        return "SONY";
    }

    public double getScreenInches() {
        return 5.6;
    }
}
