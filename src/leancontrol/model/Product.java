package leancontrol.model;

// Product is the bottom of the hierarchy and must have OrgUnit as a parent
public class Product extends OrgScope{
    Product(int id, String displayName) {
        super(id, displayName);
        Type = OrgScopeType.Product;
    }

}
