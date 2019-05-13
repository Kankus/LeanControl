package leancontrol.model;

// Implements Multitenanneted org hierarchy as BOFH > Subscription > OrgUnit (recursive) > ProductGroup > Product
abstract class OrgScope extends Displayable {

    OrgScopeType Type;
    int Id;
    String Key;
    String DisplayName;
    int ParentId;

    abstract OrgScope getParent();

    abstract OrgScope[] getChildren();
}

