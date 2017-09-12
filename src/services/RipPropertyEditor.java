package services;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class RipPropertyEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String studentName) throws java.lang.IllegalArgumentException {
        if (studentName.contains("Mr")||studentName.contains("Ms")) {
            setValue(studentName);
            return;
        }
        else {
			setValue("Mr"+studentName);
			return;
		}
    }
}
