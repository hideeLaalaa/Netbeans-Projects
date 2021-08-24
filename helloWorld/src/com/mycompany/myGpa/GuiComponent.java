/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myGpa;

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
    private com.codename1.ui.Label gui_Form = new com.codename1.ui.Label();
    private com.codename1.ui.table.Table gui_Table = new com.codename1.ui.table.Table();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("bgColor:fbfaf9; bgType:none; bgImage:chbox1.png;");
        setTitle("GuiComponent");
        setName("GuiComponent");
        com.codename1.ui.Toolbar cn1Toolbar = getToolbar();
        if(cn1Toolbar == null) {
                cn1Toolbar = new com.codename1.ui.Toolbar();
                setToolbar(cn1Toolbar);
        }
        com.codename1.ui.Command cmd_null = new com.codename1.ui.Command("New Command");
        cn1Toolbar.addCommandToOverflowMenu(cmd_null);
        addComponent(gui_Form);
        addComponent(gui_Table);
        gui_Form.setPreferredSizeStr("187.30159mm 5.820106mm");
        gui_Form.setText("FORM");
        gui_Form.setUIID("BackCommandLandscape");
                gui_Form.setInlineStylesTheme(resourceObjectInstance);
        gui_Form.setInlineAllStyles("bgColor:102827; fgColor:7c7a50; transparency:36; opacity:255; bgType:gradient_radial;");
        gui_Form.setName("Form");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Form.getParent().getLayout()).setInsets(gui_Form, "0.0mm 0.0mm auto auto").setReferenceComponents(gui_Form, "-1 -1 -1 -1").setReferencePositions(gui_Form, "0.0 0.0 0.0 0.0");
        gui_Table.setPreferredSizeStr("21.957672mm 52.910053mm");
                gui_Table.setInlineStylesTheme(resourceObjectInstance);
        gui_Table.setName("Table");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Table.getParent().getLayout()).setInsets(gui_Table, "17.723883% auto auto 22.06704%").setReferenceComponents(gui_Table, "-1 -1 -1 -1").setReferencePositions(gui_Table, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
