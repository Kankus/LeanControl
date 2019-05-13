package leancontrol.model;

// Product is the bottom of the hierarchy and must have OrgUnit as a parent
public class Product extends OrgScope{
    Product() {
        Type = OrgScopeType.Product;
    }

    // Stub
    OrgUnit getParent() {
        return new OrgUnit();
    }

    // No children for Product
    @Override
    OrgScope[] getChildren() {
        return new OrgScope[0];
    }
}
