package dp;

public class AttendenceStore24 {

    private Student asuId;
    private String attendendeData;
    private String attendendeValue;

    public AttendenceStore24(Student asu, String dte, String val) {
        this.asuId = asu;
        this.attendendeData = dte;
        this.attendendeValue = val;
    }

    public String getAttendendeData() {
        return attendendeData;
    }

    public String getAttendendeValue() {
        return attendendeValue;
    }

    public Student getAsuId() {
        return asuId;
    }
}
