// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package connectorkitdemo.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import java.util.ArrayList;
import java.util.List;

public class JoinObjectsInList extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String Entity;
	private IMendixObject Object1;
	private IMendixObject Object2;

	public JoinObjectsInList(IContext context, java.lang.String Entity, IMendixObject Object1, IMendixObject Object2)
	{
		super(context);
		this.Entity = Entity;
		this.Object1 = Object1;
		this.Object2 = Object2;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		List<IMendixObject> resultList = new ArrayList<IMendixObject>();
		resultList.add(Object1);
		resultList.add(Object2);
		return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "JoinObjectsInList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
