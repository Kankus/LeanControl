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

}

