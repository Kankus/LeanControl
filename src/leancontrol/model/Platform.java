package leancontrol.model;

// ToDo: Singleton at top of multi-tenanted subscription / org tree
public class Platform extends OrgScope {
    Platform() {
        super(0, "Single Platform");
        ScopeType = ScopeType.Platform;
    }

}
