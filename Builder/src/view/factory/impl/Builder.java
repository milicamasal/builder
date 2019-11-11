package view.factory.impl;

import components.IValue;
import javax.swing.JPanel;

public abstract class Builder {

    JPanel panel;
    IValue panelFirstName;
    IValue panelLastName;
    IValue panelDate;
    IValue panelGender;

    public abstract JPanel getPanel();
    public abstract void createPanelFirstName();
    public abstract void createPanelLastName();
    public abstract void createPanelDate();
    public abstract void createPanelGender();
    public abstract void createButtonSubmit();

}
