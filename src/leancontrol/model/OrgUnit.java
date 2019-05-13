package leancontrol.model;

// OrgUnit has recursive children to implement a ragged hierarchy
public class OrgUnit extends OrgScope{

    boolean IsTopLevelOrgUnit = false;
    boolean IsBottomLevelOrgUnit = false;

    OrgUnit() {
        Type = OrgScopeType.OrgUnit;
    }

    // Top level OrgUnit is child of a Subscription
    OrgScope getParent() {
        if (IsTopLevelOrgUnit)
            return new Subscription();
        else
            return new OrgUnit();
    }

    // Only a bottom level OrgUnit can contain Products
    @Override
    OrgScope[] getChildren() {

        OrgScope[] children;

        if (IsBottomLevelOrgUnit)
            children = new OrgScope[] {
                    new Product(),
                    new Product()
            };
        else
            children = new OrgScope[] {
                new OrgUnit(),
                new OrgUnit()
            };

        return children;
    }

}
