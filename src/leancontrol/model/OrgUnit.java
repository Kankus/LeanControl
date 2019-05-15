package leancontrol.model;

// OrgUnit has recursive children to implement a ragged hierarchy
public class OrgUnit extends OrgScope{

    boolean IsTopLevelOrgUnit;
    boolean IsBottomLevelOrgUnit;

    OrgUnit(int id, String displayName, boolean isTopLevelOrgUnit, boolean isBottomLevelOrgUnit) {
        super(id, displayName);
        Type = OrgScopeType.OrgUnit;
        IsTopLevelOrgUnit = isTopLevelOrgUnit;
        IsBottomLevelOrgUnit = isBottomLevelOrgUnit;
    }

}
