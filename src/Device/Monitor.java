package Device;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "manufacturer=" + getManufacturer() +
                ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() +','+
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY ;
    }

}


