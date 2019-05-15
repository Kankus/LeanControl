import leancontrol.model.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		PrintDisplayableList(Role.GetValidRoles());


	}

	static void PrintDisplayableList(Displayable displayableItems[]) {
		for (Displayable displayableItem: displayableItems) {
			PrintDisplayable(displayableItem);
		}
	}

	static void PrintDisplayable(Displayable displayableItem) {
		System.out.println(displayableItem.getClass().getSimpleName() + ": " + displayableItem.DisplayName);
	}
}
