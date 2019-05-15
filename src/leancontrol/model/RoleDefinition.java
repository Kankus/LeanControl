package leancontrol.model;

public class RoleDefinition extends Displayable{

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
        Primary,
        Delegate
    }

    public OrgScopeType ScopeType;
    public RoleType Role;
    public RoleLevel Level;

    RoleDefinition(OrgScopeType scopeType, RoleType role, RoleLevel level, String displayName, String description) {

        ScopeType = scopeType;
        Role = role;
        Level = level;
        DisplayName = displayName;
        Description = description;
    }

}

