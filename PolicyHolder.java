public class PolicyHolder {
    private int policyholderAge;
    private double policyholderHeightInInches;
    private double policyholderWeightInLbs;
    private String policyholderFirstname;
    private String policyholderLastname;
    private String smokingStatus;

    public PolicyHolder(int policyholderAge, double policyholderHeightInInches, double policyholderWeightInLbs,
                        String policyholderFirstname, String policyholderLastname, String smokingStatus) {
        this.policyholderAge = policyholderAge;
        this.policyholderHeightInInches = policyholderHeightInInches;
        this.policyholderWeightInLbs = policyholderWeightInLbs;
        this.policyholderFirstname = policyholderFirstname;
        this.policyholderLastname = policyholderLastname;
        this.smokingStatus = smokingStatus;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public double getPolicyholderHeightInInches() {
        return policyholderHeightInInches;
    }

    public double getPolicyholderWeightInLbs() {
        return policyholderWeightInLbs;
    }

    public String getPolicyholderFirstname() {
        return policyholderFirstname;
    }

    public String getPolicyholderLastname() {
        return policyholderLastname;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    @Override
    public String toString() {
        return "Policyholder Information:\n" +
               "First Name: " + policyholderFirstname + "\n" +
               "Last Name: " + policyholderLastname + "\n" +
               "Age: " + policyholderAge + "\n" +
               "Height: " + policyholderHeightInInches + " inches\n" +
               "Weight: " + policyholderWeightInLbs + " lbs\n" +
               "Smoking Status: " + smokingStatus + "\n";
    }
}