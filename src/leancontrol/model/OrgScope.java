package leancontrol.model;


public abstract class OrgScope extends Displayable {

    public OrgScopeType Type;
    private int Id;

    OrgScope (int id, String displayName) {
        Id = id;
        DisplayName = displayName;
    }

    public int getId() {
        return Id;
    }

    public OrgScope getParent() {
        return new DummyOrgBuilder().getParent(this);
    }

    public OrgScope[] getChildren() {
        return new DummyOrgBuilder().getChildren(this);
    }

    public boolean hasChildren() {
        return (getChildren().length != 0);
    }
}

