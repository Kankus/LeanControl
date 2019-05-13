package leancontrol.model;

public class Role extends Displayable{


    public enum RoleType {
        Admin,
        OrgUnitLead,
        ControlLead,
        ControlSME,
        ProductOwner,
        TeamLead,
        TechLead,
        OpsLead
    }

    public enum RoleLevel {
        Lead,
        Delegate
    }

    public OrgScopeType RoleScope;
    public RoleType Role;
    public RoleLevel Level;

    Role(OrgScopeType roleScope, RoleType role, RoleLevel level, String displayName, String description) {

        RoleScope = roleScope;
        Role = role;
        Level = level;
        DisplayName = displayName;
        Description = description;
    }

    public static Role[] GetValidRoles() {
        return validRoles;
    }

    // Stub to move to storage
    // Gives example role descriptions that should be tailored to the organisation's role names
    private static Role[] validRoles = {
            // Global admins across tenants:
            new Role(OrgScopeType.BOFH, RoleType.Admin, RoleLevel.Lead, "BOFH GodlikeAdmin", "Hands on Admin across all tenants of the Lean Control product and accountable for stability of the system."),
            new Role(OrgScopeType.BOFH, RoleType.Admin, RoleLevel.Delegate, "BOFH Off-sider", "Hands on Admin across all tenants of the Lean Control product."),
            // Org Unit Leads:
            new Role(OrgScopeType.OrgUnit, RoleType.OrgUnitLead, RoleLevel.Lead, "Org Unit Leader", "e.g. Org Unit CIO. Responsible for Product delivery across the Org Unit. Generally one per Org Unit. Role in Lean Control is to provide Org Unit wide leadership to inspire healthy compliance."),
            new Role(OrgScopeType.OrgUnit, RoleType.OrgUnitLead, RoleLevel.Delegate, "Org Unit Control Coach", "e.g. Org Unit Compliance Coach. Responsible for Control governance and support within the Org Unit.  Role in Lean Control is to monitor compliance health and run interventions to improve the culture and behavior of everyone in the process."),
            // Control Function Roles.  Using EA as an example. Need same roles for all Control Functions
            new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, RoleType.ControlLead, RoleLevel.Lead, "Control Function Lead", "e.g. Head of Control Function for an Org unit that is not the bottom level Org Unit.  Works with other Control Function Leads to maintain the Risk Story Catalogue.  Assigns Control Leads to lower level Org Units or Control SMEs to bottom level Org Units."),
            new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, RoleType.ControlLead, RoleLevel.Delegate, "Control Function Co-ordinator", "Delegate of a Control Function Lead"),
            new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, RoleType.ControlSME, RoleLevel.Lead, "Control Function SME", "Control SME assigned to a bottom level Org Unit and by default all the Products it contains."),
            new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, RoleType.ControlSME, RoleLevel.Lead, "Control Function SME Delegate", "Delegate of a Control SME to assist at Org Unit level.  May share the load by being assigned specific Products in the bottom level Org Unit."),
            // Product Team roles
            new Role(OrgScopeType.ControlFunction, RoleType.ControlLead, RoleLevel.Delegate, "Control Function Co-ordinator", "Delegate of a Control Function Lead"),


    };
}

