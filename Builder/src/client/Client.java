/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPersonView;
import view.factory.impl.AdvancedPersonViewFactory;
import view.factory.impl.Builder;
import view.factory.impl.SimplePersonViewFactory;

/**
 *
 * @author Milica i Nikola
 */
public class Client {

    Builder builder;

    public Client(Builder c) {
        builder = c;
    }

    void create() {
        builder.createPanelFirstName();
        builder.createPanelLastName();
        builder.createPanelDate();
        builder.createPanelGender();
        builder.createButtonSubmit();
    }

    public static void main(String[] args) {
        JFrame main = new JFrame();
        JPanel panel = new FrmPersonView();

        SimplePersonViewFactory spw = new SimplePersonViewFactory();
        Client client = new Client(spw);
        client.create();
        main.add(spw.getPanel());

        main.pack();
        main.setVisible(true);

//        AdvancedPersonViewFactory apv = new AdvancedPersonViewFactory();
//        client = new Client(apv);
//        client.create();
//        main.add(apv.getPanel());
//
//        main.pack();
//        main.setVisible(true);
    }

}
