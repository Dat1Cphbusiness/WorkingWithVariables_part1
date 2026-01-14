public class DataScenario {
    
    // This class provides scenarios where students must choose good variable names
    
    private String description;
    private String dataType;
    private String purpose;
    
    public DataScenario(String description, String dataType, String purpose) {
        this.description = description;
        this.dataType = dataType;
        this.purpose = purpose;
    }
    
    // Getters
    public String getDescription() {
        return this.description;
    }
    
    public String getDataType() {
        return this.dataType;
    }
    
    public String getPurpose() {
        return this.purpose;
    }
    
    public void displayInfo() {
        System.out.println("Scenario: " + description);
        System.out.println("Data Type: " + dataType);
        System.out.println("Purpose: " + purpose);
    }
    
    // Example scenarios students can reference
    public static DataScenario getUserAgeScenario() {
        return new DataScenario(
            "Store a person's age in years",
            "int",
            "Track how old someone is"
        );
    }
    
    public static DataScenario getProductPriceScenario() {
        return new DataScenario(
            "Store the price of a product in kroner",
            "double",
            "Calculate total cost"
        );
    }
    
    public static DataScenario getIsLoggedInScenario() {
        return new DataScenario(
            "Track whether user is logged in",
            "boolean",
            "Control access to features"
        );
    }
}
