package leancontrol.model;

// Implements Org hierarchy as Subscription > OrgUnit (recursive) > ProductGroup > Product
public class DummyOrgBuilder implements iOrgBuilder {

    public DummyOrgBuilder() {

    }

    @Override
    public Platform getPlatform() {
        return new Platform();
    }

    @Override
    // Totally fake implementation
    public OrgScope getParent(OrgScope child) {
        switch (child.ScopeType) {
            case Platform:
                return child;
            case Subscription:
                return new Platform();
            case OrgUnit:
                // Three levels of OrgUnit here
                if (((OrgUnit)child).IsTopLevelOrgUnit)
                    return new Subscription(0, "Parent Subscription");
                else if (((OrgUnit)child).IsBottomLevelOrgUnit)
                    return new OrgUnit(0, "Parent mid-level Org Unit",false, false);
                else
                    return new OrgUnit(0, "Parent top-level Org Unit",true, false);
            case Product:
                return new OrgUnit(0, "Parent bottom-level Org Unit",false, true);
            default: // error
                return new Subscription (0, "Error");
        }
    }

    @Override
    // Totally fake implementation
    public OrgScope[] getChildren(OrgScope parent) {

        switch (parent.ScopeType) {
            case Platform:
                return new OrgScope[]{
                        new Subscription(0, "  Client subscription 1"),
                        new Subscription(0, "  Client subscription 2")
                };
            case Subscription:
                return new OrgUnit[]{
                        new OrgUnit(0, "    Top-level Org Unit 1", true, false),
                        new OrgUnit(0, "    Top-level Org Unit 2", true, false),
                };
            case OrgUnit:
                // Three levels of OrgUnit here
                if (((OrgUnit)parent).IsBottomLevelOrgUnit)
                    return new OrgScope[]{
                            new Product(0, "          Product 1"),
                            new Product(0, "          Product 2")
                    };
                else if (((OrgUnit)parent).IsTopLevelOrgUnit)
                    return new OrgScope[]{
                            new OrgUnit(0, "      Mid-level Org Unit 1",false, false),
                            new OrgUnit(0, "      Mid-level Org Unit 2",false, false),
                    };
                else
                    return new OrgScope[]{
                            new OrgUnit(0, "        Bottom-level Org Unit 1",false, true),
                            new OrgUnit(0, "        Bottom-level Org Unit 2",false, true),
                    };
            case Product:
                return new OrgScope[0];
            default: //error, shouldn't get here
                return new OrgScope[0];
        }
    }
}

