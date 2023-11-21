package KI305.Vozniuk.Lab3;

public class HealthRecords {
    private String testResults;
    /**
     * Constructor
     *  @param testResults person testResults
     */
    public HealthRecords(String testResults) {
        this.testResults = testResults;
    }
    /**
     *  Method returns HealthResults
     */
    public String getHealthResults() {
        return testResults;
    }
}
