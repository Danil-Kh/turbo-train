
class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.printf("Add %d of %s, tanker serial number is %s%n", amount, getFuelType(), getSerialNumber());
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);
    }
}
class XFuelTanker extends Tanker{
    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}
class MX200Tanker extends Tanker{
    @Override
    protected String getFuelType() {
        return "MX200";
    }

}
