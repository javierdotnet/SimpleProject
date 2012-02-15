package com.javier.simpleproject;

import com.vaadin.terminal.UserError;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class Form1 extends FormLayout {
	
public Form1() {
	inicio();
}
	
	private void inicio() {
		// A FormLayout used outside the context of a Form
	//	FormLayout fl = new FormLayout();
		// Make the FormLayout shrink to its contents
		this.setSizeUndefined();
		TextField tf = new TextField("A Field");
		this.addComponent(tf);
		// Mark the first field as required
		tf.setRequired(true);
		tf.setRequiredError("The Field may not be empty.");
		TextField tf2 = new TextField("Another Field");
		this.addComponent(tf2);
		// Set the second field straing to error state with a message.
		tf2.setComponentError(new UserError("This is the error indicator of a Field."));
		
	}
}
