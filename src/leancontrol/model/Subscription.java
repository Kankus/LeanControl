package leancontrol.model;

// Subscription is scope of a tenancy
public class Subscription extends OrgScope{

    Subscription(int id, String displayName) {
        super(id, displayName);
        Type = OrgScopeType.Subscription;
    }

}
