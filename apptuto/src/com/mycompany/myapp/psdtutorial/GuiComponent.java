/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.psdtutorial;

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
    private com.codename1.ui.Button gui_Button_3 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_4 = new com.codename1.ui.Button();
    private com.codename1.ui.TextField gui_T  = new com.codename1.ui.TextField();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button.addActionListener(callback);
        gui_T .addActionListener(callback);
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

            if(sourceComponent == gui_Button) {
                onButtonActionEvent(ev);
            }
            if(sourceComponent == gui_T ) {
                onT ActionEvent(ev);
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
        addComponent(gui_Button_3);
        addComponent(gui_Button_4);
        addComponent(gui_T );
        gui_Button.setText("Button");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "20.720722% auto auto 2.3809528mm").setReferenceComponents(gui_Button, "-1 -1 -1 2 ").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
        gui_Button_1.setText("Button");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "0.0mm 20.151133% auto auto").setReferenceComponents(gui_Button_1, "0 -1 -1 -1").setReferencePositions(gui_Button_1, "0.0 0.0 0.0 0.0");
        gui_Button_2.setText("Button");
                gui_Button_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_2.setName("Button_2");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_2.getParent().getLayout()).setInsets(gui_Button_2, "41.44144% auto auto 15.617128%").setReferenceComponents(gui_Button_2, "-1 -1 -1 -1").setReferencePositions(gui_Button_2, "0.0 0.0 0.0 0.0");
        gui_Button_3.setText("Button");
                gui_Button_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_3.setName("Button_3");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_3.getParent().getLayout()).setInsets(gui_Button_3, "41.666668% 22.418137% auto auto").setReferenceComponents(gui_Button_3, "-1 -1 -1 -1").setReferencePositions(gui_Button_3, "0.0 0.0 0.0 0.0");
        gui_Button_4.setText("Button");
                gui_Button_4.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_4.setName("Button_4");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_4.getParent().getLayout()).setInsets(gui_Button_4, "auto auto 23.198198% 14.357682%").setReferenceComponents(gui_Button_4, "-1 -1 -1 -1").setReferencePositions(gui_Button_4, "0.0 0.0 0.0 0.0");
        gui_T .setPreferredSizeStr("inherit inherit");
        gui_T .setText("");
                gui_T .setInlineStylesTheme(resourceObjectInstance);
        gui_T .setInlineAllStyles("bgImage:;");
        gui_T .setName("T ");
        gui_T .setMaxSize(124);
        gui_T .setColumns(20);
        gui_T .setRows(1);
        ((com.codename1.ui.layouts.LayeredLayout)gui_T .getParent().getLayout()).setInsets(gui_T , "auto 6.8783073mm 0.26454926mm 43.576828%").setReferenceComponents(gui_T , "-1 -1 4 -1").setReferencePositions(gui_T , "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
 -  
        T.setText("AASA");
          
    }
      
    public void  onTActionEvent(com.codename1.ui.events.ActionEvent ev) {
    }

}
