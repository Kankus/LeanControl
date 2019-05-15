package leancontrol.model;

public class DummyRoleBuilder implements iRoleBuilder {

    public DummyRoleBuilder() {}

    // Stub to move to storage. Should be singleton not static
    // Gives example role descriptions that should be tailored to the organisation's role names
    @Override
    public RoleDefinition[] getValidRoles() {
        return new RoleDefinition[]{
                // Global admins across tenants:
                new RoleDefinition(OrgScopeType.Platform, RoleDefinition.RoleType.Admin, RoleDefinition.RoleLevel.Primary, "BOFH GodlikeAdmin", "Hands on Admin across all tenants of the Lean Control product and accountable for stability of the platform."),
                new RoleDefinition(OrgScopeType.Platform, RoleDefinition.RoleType.Admin, RoleDefinition.RoleLevel.Delegate, "BOFH Off-sider", "Hands on Admin across all tenants of the Lean Control product."),
                // Org Unit Leads:
                new RoleDefinition(OrgScopeType.OrgUnit, RoleDefinition.RoleType.OrgUnitLead, RoleDefinition.RoleLevel.Primary, "Org Unit Leader", "e.g. Org Unit CIO. Responsible for Product delivery across the Org Unit. Generally one per Org Unit. Role in Lean Control is to provide Org Unit wide leadership to inspire healthy compliance."),
                new RoleDefinition(OrgScopeType.OrgUnit, RoleDefinition.RoleType.OrgUnitLead, RoleDefinition.RoleLevel.Delegate, "Org Unit Control Coach", "e.g. Org Unit Compliance Coach. Responsible for Control governance and support within the Org Unit.  Role in Lean Control is to monitor compliance health and run interventions to improve the culture and behavior of everyone in the process."),
                // Control Function Roles.  Using EA as an example. Need same roles for all Control Functions
                new ControlRoleDefinition(ControlFunction.GetControlFunction("EA"), OrgScopeType.OrgUnit, RoleDefinition.RoleType.ControlLead, RoleDefinition.RoleLevel.Primary, "Control Function Lead", "e.g. Head of Control Function for an Org unit that is not the bottom level Org Unit.  Works with other Control Function Leads to maintain the Risk Story Catalogue.  Assigns Control Leads to lower level Org Units or Control SMEs to bottom level Org Units."),
                new ControlRoleDefinition(ControlFunction.GetControlFunction("EA"), OrgScopeType.OrgUnit, RoleDefinition.RoleType.ControlLead, RoleDefinition.RoleLevel.Delegate, "Control Function Co-ordinator", "Delegate of a Control Function Lead"),
                new ControlRoleDefinition(ControlFunction.GetControlFunction("EA"), OrgScopeType.OrgUnit, RoleDefinition.RoleType.ControlSME, RoleDefinition.RoleLevel.Primary, "Control Function SME", "Control SME assigned to a bottom level Org Unit and by default all the Products it contains."),
                new ControlRoleDefinition(ControlFunction.GetControlFunction("EA"), OrgScopeType.Product, RoleDefinition.RoleType.ControlSME, RoleDefinition.RoleLevel.Delegate, "Control Function SME Delegate", "Delegate of a Control SME to assist at Org Unit level.  May share the load by being assigned specific Products in the bottom level Org Unit."),
                // Product Team roles
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.ProductOwner, RoleDefinition.RoleLevel.Primary, "Product Owner", "Accountable for compliance for the product."),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.ProductOwner, RoleDefinition.RoleLevel.Delegate, "Team Product Owner / UX / BA", "Delegate of the Product Owner within a Team"),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.TeamLead, RoleDefinition.RoleLevel.Primary, "Programme Lead", "Facilitates and coaches compliance for the product."),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.TeamLead, RoleDefinition.RoleLevel.Delegate, "Agile Team Lead", "Agile Team Lead / Scrum Master / or any Team Member in a self organised team."),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.TechLead, RoleDefinition.RoleLevel.Primary, "Technology Lead", "Facilitates technical leadership and strategy for the product."),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.TechLead, RoleDefinition.RoleLevel.Delegate, "Senior Dev", "Senior Dev / Tech lead / or technically knowledgeable Team Member in a self organised team.  Point of contact for EA SMEs"),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.OpsLead, RoleDefinition.RoleLevel.Primary, "Service Manager", "Facilitates technical leadership and strategy for the product."),
                new RoleDefinition(OrgScopeType.Product, RoleDefinition.RoleType.OpsLead, RoleDefinition.RoleLevel.Delegate, "DevOps / Support Engineer", "Support Engineer within the team / or Team Member in a self organised team.  Point of contact for Operational SMEs"),
        };
    }

}
