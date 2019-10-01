// Write a project named ""Remote Device"". Create a class ""RemoteController""
//        which will be simulation the real one to control the TV. Create interfaces Device and Volume.
//        The ""Device"" interface should have methods powerOn(), powerOff(), setChannel(int channel),
//        and currentChannel();
//        The ""Volume"" interface should have methods ""upVolume(), downVolume() and mute();
//        Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
//        has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
//        if you class is abstract).
//        Write a class ""TV"" which extends the class TVDevice. Implements all the methods.
//        Write a class RemoteController to control your TV.
//        Example of the structure in the requirements.

//1. Write a project named "Remote Device". - done.
//2. Create a class "RemoteController for managing of TV." - done.
//3. Create interfaces Device and Volume. - done.
//4. The "Device" interface should have methods powerOn(), powerOff(), setChannel(int channel), and currentChannel();
//   - done.
//5. The "Volume" interface should have methods upVolume(), downVolume() and mute(); - done.
//6. Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
//   has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
//   if you class is abstract).
//     - done.
//7. Write a class "TV" which extends the class TVDevice. Implements all the methods.
//     - done.

//8. Write a class RemoteController to control your TV. - done.


//This is project named "Remote Device"
   
interface Device {
    void powerOn();

    void powerOff();

    void setChannel(int channel);

    void currentChannel();
}

interface Volume {
    void upVolume();

    void downVolume();

    void mute();

}

abstract class TVDevice implements Volume, Device {
    String modelName;
    boolean isOn;
}

class TV extends TVDevice {
    public void upVolume() {

    }

    public void downVolume() {

    }

    public void mute() {

    }

    public void powerOn() {

    }

    public void powerOff() {

    }

    public void setChannel(int channel) {

    }

    public void currentChannel() {

    }
}

public class RemoteController {
    public void connectDevice(TVDevice LG, boolean powerOn) {
    }

    public void toggleChannels(int channel) {
    }

    public void manageOfSound(int downVolume, int upVolume) {
    }

    public void applyMuteMode(boolean mute) {
    }

    public void findOutCurrentChannel(int currentChannel) {
    }

}
