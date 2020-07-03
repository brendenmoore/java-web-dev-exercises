package exercises.technology;

public class SmartPhone extends Computer{
    private String cameraType;

    public SmartPhone(int aYear, double aPrice, String aBrand, String aModel, String aCameraType) {
        super(aYear, aPrice, aBrand, aModel);
        cameraType = aCameraType;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }
}
