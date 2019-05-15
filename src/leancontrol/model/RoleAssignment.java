package leancontrol.model;

public class RoleAssignment {

    public Person Assignee;
    public RoleDefinition AssignedRole;
    public OrgScope AssignedOrgScope;

    public RoleAssignment(Person assignee, RoleDefinition assignedRole, OrgScope assignedOrgScope) {

        if (assignedRole.ScopeType == assignedOrgScope.ScopeType) {
            Assignee = assignee;
            AssignedOrgScope = assignedOrgScope;
            AssignedRole = assignedRole;
        }
        else {
            // ToDo: throw an error here. Invalid role assignment
        }
    }
}
