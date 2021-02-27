package wsb.devices;

public class Phone extends Device {
    final Double screenSize;
    final OperatingSystem operatingSystem;

    public Phone(String producer, String model, Double screenSize, OperatingSystem operatingSystem) {
        super(producer,model);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("The phone is turned on");
    }


    public void sell(){
        System.out.println("Its been already sold");
    }

    public void installAnApp(String name){
       installAnApp(name, 0.0);
    }


    public void installAnApp(String[] apps){
        for(String app : apps){
            installAnApp(app);
        }
    }

    public void installAnApp(String name, Double version){
        System.out.println("The app " + name + " was installed in version " +  version);
    }

}
