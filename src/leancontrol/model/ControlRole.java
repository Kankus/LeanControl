package leancontrol.model;

public class ControlRole extends Role {

    public ControlFunction Function;

    public ControlRole(ControlFunction function, OrgScopeType roleScope, RoleType role, RoleLevel level, String displayName, String description) {

        super(roleScope, role, level, displayName, description);
        Function = function;

    }

}
