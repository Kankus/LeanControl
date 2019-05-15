package leancontrol.model;

public interface iOrgBuilder {
    Platform getPlatform();

    OrgScope getParent(OrgScope child);

    OrgScope[] getChildren(OrgScope parent);
}
