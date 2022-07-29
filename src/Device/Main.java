package Device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 120, "AB1234567CD", 300, "AS-SD-23-FD-14");


        System.out.println(device);
        System.out.println(device.hashCode());
        System.out.println(device.equals(monitor));

        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println(monitor.equals(ethernetAdapter));

        System.out.println(ethernetAdapter);
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(ethernetAdapter.equals(device));
    }
}
