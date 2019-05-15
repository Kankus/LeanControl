package leancontrol.model;

public class DummyRoleBuilder implements iDummyRoleBuilder {

    public DummyRoleBuilder() {}

    // Stub to move to storage. Should be singleton not static
    // Gives example role descriptions that should be tailored to the organisation's role names
    @Override
    public Role[] getValidRoles() {
        return new Role[]{
                // Global admins across tenants:
                new Role(OrgScopeType.Platform, Role.RoleType.Admin, Role.RoleLevel.Lead, "BOFH GodlikeAdmin", "Hands on Admin across all tenants of the Lean Control product and accountable for stability of the platform."),
                new Role(OrgScopeType.Platform, Role.RoleType.Admin, Role.RoleLevel.Delegate, "BOFH Off-sider", "Hands on Admin across all tenants of the Lean Control product."),
                // Org Unit Leads:
                new Role(OrgScopeType.OrgUnit, Role.RoleType.OrgUnitLead, Role.RoleLevel.Lead, "Org Unit Leader", "e.g. Org Unit CIO. Responsible for Product delivery across the Org Unit. Generally one per Org Unit. Role in Lean Control is to provide Org Unit wide leadership to inspire healthy compliance."),
                new Role(OrgScopeType.OrgUnit, Role.RoleType.OrgUnitLead, Role.RoleLevel.Delegate, "Org Unit Control Coach", "e.g. Org Unit Compliance Coach. Responsible for Control governance and support within the Org Unit.  Role in Lean Control is to monitor compliance health and run interventions to improve the culture and behavior of everyone in the process."),
                // Control Function Roles.  Using EA as an example. Need same roles for all Control Functions
                new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, Role.RoleType.ControlLead, Role.RoleLevel.Lead, "Control Function Lead", "e.g. Head of Control Function for an Org unit that is not the bottom level Org Unit.  Works with other Control Function Leads to maintain the Risk Story Catalogue.  Assigns Control Leads to lower level Org Units or Control SMEs to bottom level Org Units."),
                new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, Role.RoleType.ControlLead, Role.RoleLevel.Delegate, "Control Function Co-ordinator", "Delegate of a Control Function Lead"),
                new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, Role.RoleType.ControlSME, Role.RoleLevel.Lead, "Control Function SME", "Control SME assigned to a bottom level Org Unit and by default all the Products it contains."),
                new ControlRole(ControlFunction.GetControlFunction("EA"), OrgScopeType.ControlFunction, Role.RoleType.ControlSME, Role.RoleLevel.Delegate, "Control Function SME Delegate", "Delegate of a Control SME to assist at Org Unit level.  May share the load by being assigned specific Products in the bottom level Org Unit."),
                // Product Team roles
                new Role(OrgScopeType.Product, Role.RoleType.ProductOwner, Role.RoleLevel.Lead, "Product Owner", "Accountable for compliance for the product."),
                new Role(OrgScopeType.Product, Role.RoleType.ProductOwner, Role.RoleLevel.Delegate, "Team Product Owner / UX / BA", "Delegate of the Product Owner within a Team"),
                new Role(OrgScopeType.Product, Role.RoleType.TeamLead, Role.RoleLevel.Lead, "Programme Lead", "Facilitates and coaches compliance for the product."),
                new Role(OrgScopeType.Product, Role.RoleType.TeamLead, Role.RoleLevel.Delegate, "Agile Team Lead", "Agile Team Lead / Scrum Master / or any Team Member in a self organised team."),
                new Role(OrgScopeType.Product, Role.RoleType.TechLead, Role.RoleLevel.Lead, "Technology Lead", "Facilitates technical leadership and strategy for the product."),
                new Role(OrgScopeType.Product, Role.RoleType.TechLead, Role.RoleLevel.Delegate, "Senior Dev", "Senior Dev / Tech lead / or technically knowledgeable Team Member in a self organised team.  Point of contact for EA SMEs"),
                new Role(OrgScopeType.Product, Role.RoleType.OpsLead, Role.RoleLevel.Lead, "Service Manager", "Facilitates technical leadership and strategy for the product."),
                new Role(OrgScopeType.Product, Role.RoleType.OpsLead, Role.RoleLevel.Delegate, "DevOps / Support Engineer", "Support Engineer within the team / or Team Member in a self organised team.  Point of contact for Operational SMEs"),
        };
    }

}
