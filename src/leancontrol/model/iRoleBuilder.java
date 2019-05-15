package leancontrol.model;

public interface iRoleBuilder {
    // Stub to move to storage. Should be singleton not static
    // Gives example role descriptions that should be tailored to the organisation's role names
    RoleDefinition[] getValidRoles();
}
