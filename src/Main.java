import leancontrol.model.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!\n");

		PrintDisplayableList(new DummyRoleBuilder().getValidRoles());

		PrintOrgHierarchy(new DummyOrgBuilder());
	}


	static void PrintDisplayableList(Displayable[] displayableItems) {
		for (Displayable displayableItem: displayableItems) {
			PrintDisplayable(displayableItem);
		}
	}

	static void PrintDisplayable(Displayable displayableItem) {
		System.out.println(displayableItem.getClass().getSimpleName() + ": " + displayableItem.DisplayName);
	}

	private static void PrintOrgHierarchy(iOrgBuilder orgBuilder) {
		Platform platform = orgBuilder.getPlatform();
		System.out.println("\nConcrete OrgBuilder class: " + orgBuilder.getClass().getCanonicalName());
		PrintChildren(platform);
	}

	private static void PrintChildren(OrgScope parent) {
		System.out.println(parent.DisplayName + " (" + parent.getClass().getSimpleName() + ")");
		for (OrgScope child: parent.getChildren() ) {
			PrintChildren(child); // yay for recursion
		}

	}

}
