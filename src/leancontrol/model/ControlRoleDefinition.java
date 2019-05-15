package leancontrol.model;

public class ControlRoleDefinition extends RoleDefinition {

    public ControlFunction Function;

    public ControlRoleDefinition(ControlFunction function, OrgScopeType roleScope, RoleType role, RoleLevel level, String displayName, String description) {

        super(roleScope, role, level, displayName, description);
        Function = function;

    }

}
