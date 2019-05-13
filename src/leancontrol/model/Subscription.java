package leancontrol.model;

// Subscription is scope of a tenancy
public class Subscription extends OrgScope{

    Subscription() {
        Type = OrgScopeType.Subscription;
    }

    // Stub
    @Override
    OrgScope getParent() {
        return new BOFH();
    }

    @Override
    OrgScope[] getChildren() {
        OrgScope[] children = {
            new OrgUnit(),
            new OrgUnit()
        };

        return children;
    }
}
