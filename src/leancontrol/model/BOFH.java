package leancontrol.model;

// Singleton at top of org tree
public class BOFH extends OrgScope {
    BOFH() {
        Type = OrgScopeType.BOFH;
    }

    // Stub
    @Override
    OrgScope getParent() {
        return this;  // BOFH has no parent.
    }

    // Stub
    @Override
    OrgScope[] getChildren() {
        OrgScope[] children = {
            new Subscription(),
            new Subscription()
        };

        return children;
    }
}