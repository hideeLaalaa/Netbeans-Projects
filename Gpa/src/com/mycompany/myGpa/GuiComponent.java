/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myGpa;

import com.codename1.ui.events.ActionEvent;

/**
 * GUI builder created Form
 *
 * @author Hidee
 */
public class GuiComponent extends com.codename1.ui.Form {

    public GuiComponent() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public GuiComponent(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button_1.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button_1) {
                onButton_1ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("GuiComponent");
        setName("GuiComponent");
        addComponent(gui_Button);
        addComponent(gui_Button_1);
        addComponent(gui_Button_2);
        gui_Button.setText("Button");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "auto auto 40.11194% 14.6648035%").setReferenceComponents(gui_Button, "-1 -1 -1 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
        gui_Button_1.setText("");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "auto auto 41.231342% 33.240223%").setReferenceComponents(gui_Button_1, "-1 -1 -1 -1").setReferencePositions(gui_Button_1, "0.0 0.0 0.0 0.0");
        gui_Button_2.setText("Button");
                gui_Button_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_2.setName("Button_2");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_2.getParent().getLayout()).setInsets(gui_Button_2, "auto 33.519554% 41.41791% auto").setReferenceComponents(gui_Button_2, "-1 -1 -1 -1").setReferencePositions(gui_Button_2, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
