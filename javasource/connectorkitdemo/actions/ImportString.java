// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package connectorkitdemo.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ImportString extends CustomJavaAction<IMendixObject> {
    private java.lang.String InputString;
    private java.lang.String ImportMapping;
    private java.lang.String ResultEntity;

    public ImportString(IContext context, java.lang.String InputString, java.lang.String ImportMapping, java.lang.String ResultEntity) {
        super(context);
        this.InputString = InputString;
        this.ImportMapping = ImportMapping;
        this.ResultEntity = ResultEntity;
    }

    @Override
    public IMendixObject executeAction() throws Exception {
        // BEGIN USER CODE
        try (InputStream is = new ByteArrayInputStream(this.InputString.getBytes(StandardCharsets.UTF_8))) {
            // import the string by executing the mapping
            List<IMendixObject> objects = Core.integration().importStream(getContext(), is,
                    this.ImportMapping, null, false);
            // Return first object created in mapping
            return objects.get(0);
        } catch (Exception e) {
            logger.error(e);
            throw new MendixRuntimeException(String.format("Failed to import json string: %s", e.getMessage()));
        }
        // END USER CODE
    }

    /**
     * Returns a string representation of this action
     */
    @Override
    public java.lang.String toString() {
        return "ImportString";
    }

    // BEGIN EXTRA CODE
    private static final ILogNode logger = Core.getLogger(ImportString.class.getName());
    // END EXTRA CODE
}