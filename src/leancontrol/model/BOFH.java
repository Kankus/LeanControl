package leancontrol.model;

// ToDo: Singleton at top of org tree
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
    Subscription[] getChildren() {
        return new Subscription[] {
                new Subscription(),
                new Subscription()
        };
    }
}
