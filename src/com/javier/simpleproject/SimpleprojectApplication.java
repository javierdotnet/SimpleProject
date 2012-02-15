package com.javier.simpleproject;

import com.vaadin.Application;
import com.vaadin.terminal.Sizeable;
import com.vaadin.terminal.UserError;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.Runo;

public class SimpleprojectApplication extends Application {
	@Override
	public void init() {
		/*
		Window mainWindow = new Window("Simpleproject Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
		*/
		//inicio();
		init2();
		
	}
	
	private void init2(){
		Window main = new Window("My Application");
		setMainWindow(main);
		// Have a window with a SplitPanel.
		final Window window = new Window("Window with a Light Panel");
		window.setWidth("800px");
		window.setHeight("600px");

		final SplitPanel splitter =	new SplitPanel(SplitPanel.ORIENTATION_HORIZONTAL);
		window.setContent(splitter);
		final Panel full = new Panel("full");
		full.setSizeFull();
		// Create a panel with a caption.
		final Panel light = new Panel("Light Panel");
		light.setSizeFull();
		// The "light" style is a predefined style without borders
		light.addStyleName(Runo.PANEL_LIGHT);
		light.addComponent(new Label("The light Panel has no borders."));
		light.getLayout().setMargin(true);
		// The Panel will act as a "caption" of the left panel
		// in the SplitPanel.
		splitter.addComponent(light);
		splitter.addComponent(full);
		splitter.setSplitPosition(250, Sizeable.UNITS_PIXELS);
		main.addWindow(window);
		
		TabSheetExample tab = new TabSheetExample();
		
		full.addComponent(tab );
		

	}
	private void inicio(){
		
		
		// Create the main window.
		Window main = new Window("My Application");
		setMainWindow(main);
		// Set the root layout (VerticalLayout is actually the default).
		VerticalLayout root = new VerticalLayout();
		main.setContent(root);
		// Add the topmost component.
		root.addComponent(new Label("The Ultimate Cat Finder"));
		// Add a horizontal layout for the bottom part.
		HorizontalLayout bottom = new HorizontalLayout();
		root.addComponent(bottom);
		bottom.addComponent(new Tree("Major Planets and Their Moons"));
		bottom.addComponent(new Panel());

	
		// A FormLayout used outside the context of a Form
		FormLayout fl = new FormLayout();
		// Make the FormLayout shrink to its contents
		fl.setSizeUndefined();
		TextField tf = new TextField("A Field");
		fl.addComponent(tf);
		// Mark the first field as required
		tf.setRequired(true);
		tf.setRequiredError("The Field may not be empty.");
		TextField tf2 = new TextField("Another Field");
		fl.addComponent(tf2);
		// Set the second field straing to error state with a message.
		tf2.setComponentError(new UserError("This is the error indicator of a Field."));

		root.addComponent(fl);

	}

}
