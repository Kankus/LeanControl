package leancontrol.model;

// Subscription is scope of a tenancy
public class Subscription extends OrgScope{

    Subscription() {
        Type = OrgScopeType.Subscription;
    }

    // Stub
    @Override
    BOFH getParent() {
        return new BOFH();
    }

    @Override
    OrgUnit[] getChildren() {
        return new OrgUnit[] {
            new OrgUnit(),
            new OrgUnit()
        };

    }
}
