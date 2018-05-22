package references;

public class CityStatus {
    private String success;
    private String responseText;

    @Override
    public String toString() {
        return "{"+"success=" + success + '\'' +
                ", responseText='" + responseText + '\''+"}";
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String status) {
        this.success = status;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }
}
