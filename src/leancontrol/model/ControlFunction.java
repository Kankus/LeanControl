package leancontrol.model;
import java.util.TreeMap;

public class ControlFunction extends Displayable {

    // public DefaultEngagementLevel;
    // URL Risk Story Catalogue

    private ControlFunction(String key, String displayName, String description) {

        // Displayable attributes
        Key = key;
        DisplayName = displayName;
        Description = description;
    }

    public static ControlFunction GetControlFunction(String key) {
        return controlFunctions.get(key);
    }

    public static TreeMap<String, ControlFunction> GetAllControlFunctions() {
        return controlFunctions;
    }


    // Stub to move to storage
    // Gives example role descriptions that should be tailored to the organisation's role names
    private static TreeMap<String, ControlFunction> controlFunctions;
    static {
        controlFunctions = new TreeMap<>();
        controlFunctions.put("EA", new ControlFunction("EA", "Enterprise Architecture", "EA function led by the CTO. Governing Enterprise (not Solution) Architecture."));
        controlFunctions.put("InfoSec", new ControlFunction("InfoSec", "Information Security", "Central InfoSec function providing standards, guidance and security review and testing services."));
        controlFunctions.put("IRM", new ControlFunction("IRM", "Information Risk", "Information risk management function focusing on data privacy and leakage. (May be combined with InfoSec)"));
        controlFunctions.put("CDO", new ControlFunction("CDO", "Data Governance", "Chief Data Office providing data governance standards."));
        controlFunctions.put("Compliance", new ControlFunction("Compliance", "Compliance", "Regulatory and legal compliance advisory function. Governing regulatory work in particular."));
        controlFunctions.put("Sourcing", new ControlFunction("Sourcing", "Sourcing", "Sourcing and purchasing function. Governing supplier engagement particularly new supply contracts."));
        controlFunctions.put("PMO", new ControlFunction("PMO", "PMO", "PMO support function assisting Product teams comply to the Lean Control process and to Portfolio Standards."));
    }
}

