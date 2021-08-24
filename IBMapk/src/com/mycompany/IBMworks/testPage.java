/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.IBMworks;

import com.codename1.ui.table.DefaultTableModel;
import com.codename1.ui.table.Table;
import com.codename1.ui.table.TableModel;
import static com.mycompany.IBMworks.Aptitude.sectNo;

/**
 * GUI builder created Form
 *
 * @author Hidee
 */
public class testPage extends com.codename1.ui.Form {
String[] getSectLabel = {"A","B","C","D","E","F","G"};

    public testPage() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
       
//
        TableModel model= new DefaultTableModel(new String[] {"QUESTION","POINT"},
         MyApplication.toTable())
    {
        public boolean isCellEditable(int row,int col){
            return col!=0;
        }
      
     Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, true
    };
//
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    };
    gui_Table = new Table(model);  
    gui_Table.setModel(model);
    
    
    }
    
    public testPage(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
//        gui_Label.setText("CHAPTER " +getSectLabel[sectNo]);
//        chapLeft.setText((7-sectNo)+" Section"+((7-sectNo==1)?"":"s")+ " left");
        if(sectNo<6){
            gui_Button.setText("NEXT");
        }
        else{
            gui_Button.setText("SUBMIT");
        }
        
    }

//////////////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.table.Table gui_Table = new com.codename1.ui.table.Table();
    protected com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();
    protected com.codename1.components.InfiniteProgress gui_Infinite_Progress = new com.codename1.components.InfiniteProgress();
    protected com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Flow_Layout = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_Button_3 = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Border_Layout = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    protected com.codename1.ui.Container gui_Flow_Layout_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    protected com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField_1 = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_Button_5 = new com.codename1.ui.Button();
    protected com.codename1.components.ScaleImageButton gui_ScaleImageButton = new com.codename1.components.ScaleImageButton();
    protected com.codename1.ui.Button gui_Button_4 = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Layered_Layout = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Container gui_Box_Layout_Y = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    protected com.codename1.ui.Label gui_Label_2 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField_2 = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_Button_6 = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Table_Layout = new com.codename1.ui.Container(new com.codename1.ui.table.TableLayout(3, 3));
    protected com.codename1.ui.Label gui_Label_3 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField_3 = new com.codename1.ui.TextField();
    protected com.codename1.ui.Label gui_Label_3_1 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField_3_1 = new com.codename1.ui.TextField();
    protected com.codename1.ui.Label gui_Label_3_2 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField_3_2 = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_Button_7 = new com.codename1.ui.Button();
    protected com.codename1.components.InfiniteProgress gui_Infinite_Progress_1 = new com.codename1.components.InfiniteProgress();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("font:14.0mm; bgColor:20101; fgColor:2cfe23;");
        setTitle("testPage");
        setName("testPage");
        gui_Container.setPreferredSizeStr("61.640213mm 52.645504mm");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setInlineAllStyles("font:1.5mm native:ItalicThin native:ItalicThin; bgColor:e2d4eb; fgColor:2cfe23; transparency:135; opacity:211;");
        gui_Container.setName("Container");
        gui_Button_1.setText("Button");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
                gui_Flow_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Flow_Layout.setName("Flow_Layout");
                gui_Border_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Border_Layout.setName("Border_Layout");
                gui_Layered_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Layered_Layout.setName("Layered_Layout");
                gui_Box_Layout_Y.setInlineStylesTheme(resourceObjectInstance);
        gui_Box_Layout_Y.setName("Box_Layout_Y");
                gui_Table_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Table_Layout.setName("Table_Layout");
                gui_Infinite_Progress_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Infinite_Progress_1.setName("Infinite_Progress_1");
        addComponent(gui_Container);
        gui_Table.setPreferredSizeStr("56.613758mm inherit");
                gui_Table.setInlineStylesTheme(resourceObjectInstance);
        gui_Table.setName("Table");
        gui_Button.setText("Button");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        gui_Button_2.setText("Button");
                gui_Button_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_2.setName("Button_2");
                gui_Infinite_Progress.setInlineStylesTheme(resourceObjectInstance);
        gui_Infinite_Progress.setInlineAllStyles("bgColor:0; fgColor:f7fefb;");
        gui_Infinite_Progress.setName("Infinite_Progress");
        gui_Container.addComponent(gui_Table);
        gui_Container.addComponent(gui_Button);
        gui_Container.addComponent(gui_Button_2);
        gui_Container.addComponent(gui_Infinite_Progress);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Table.getParent().getLayout()).setInsets(gui_Table, "0.7936516mm 1.3227501mm auto 3.7037048mm").setReferenceComponents(gui_Table, "-1 -1 -1 -1").setReferencePositions(gui_Table, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "auto auto 38.693466% 3.4391537mm").setReferenceComponents(gui_Button, "-1 -1 -1 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_2.getParent().getLayout()).setInsets(gui_Button_2, "auto auto 37.688442% 30.04292%").setReferenceComponents(gui_Button_2, "-1 -1 -1 -1").setReferencePositions(gui_Button_2, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Infinite_Progress.getParent().getLayout()).setInsets(gui_Infinite_Progress, "auto auto 8.201058mm 33.90558%").setReferenceComponents(gui_Infinite_Progress, "-1 -1 -1 -1").setReferencePositions(gui_Infinite_Progress, "0.0 0.0 0.0 0.0");
        addComponent(gui_Button_1);
        addComponent(gui_Flow_Layout);
        gui_Label.setText("Search");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
                gui_TextField.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField.setName("TextField");
        gui_Button_3.setText("Submit");
                gui_Button_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_3.setName("Button_3");
        gui_Flow_Layout.addComponent(gui_Label);
        gui_Flow_Layout.addComponent(gui_TextField);
        gui_Flow_Layout.addComponent(gui_Button_3);
        addComponent(gui_Border_Layout);
                gui_Flow_Layout_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Flow_Layout_1.setName("Flow_Layout_1");
                gui_ScaleImageButton.setInlineStylesTheme(resourceObjectInstance);
        gui_ScaleImageButton.setName("ScaleImageButton");
        com.codename1.ui.FontImage.setMaterialIcon(gui_ScaleImageButton,"\ue3f4".charAt(0));
        gui_Button_4.setText("Edit");
                gui_Button_4.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_4.setName("Button_4");
        gui_Border_Layout.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Flow_Layout_1);
        gui_Label_1.setText("Search");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setName("Label_1");
                gui_TextField_1.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField_1.setName("TextField_1");
        gui_Button_5.setText("Submit");
                gui_Button_5.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_5.setName("Button_5");
        gui_Flow_Layout_1.addComponent(gui_Label_1);
        gui_Flow_Layout_1.addComponent(gui_TextField_1);
        gui_Flow_Layout_1.addComponent(gui_Button_5);
        gui_Border_Layout.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_ScaleImageButton);
        gui_Border_Layout.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Button_4);
        addComponent(gui_Layered_Layout);
        addComponent(gui_Box_Layout_Y);
        gui_Label_2.setText("Search");
                gui_Label_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_2.setName("Label_2");
                gui_TextField_2.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField_2.setName("TextField_2");
        gui_Button_6.setText("Submit");
                gui_Button_6.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_6.setName("Button_6");
        gui_Box_Layout_Y.addComponent(gui_Label_2);
        gui_Box_Layout_Y.addComponent(gui_TextField_2);
        gui_Box_Layout_Y.addComponent(gui_Button_6);
        addComponent(gui_Table_Layout);
        gui_Label_3.setText("Name");
                gui_Label_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_3.setName("Label_3");
                gui_TextField_3.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField_3.setName("TextField_3");
        gui_Label_3_1.setText("Email");
                gui_Label_3_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_3_1.setName("Label_3_1");
                gui_TextField_3_1.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField_3_1.setName("TextField_3_1");
        gui_Label_3_2.setText("Phone");
                gui_Label_3_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_3_2.setName("Label_3_2");
                gui_TextField_3_2.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField_3_2.setName("TextField_3_2");
        gui_Button_7.setText("Add");
                gui_Button_7.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_7.setName("Button_7");
        com.codename1.ui.table.TableLayout.Constraint Label_3Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(0, 0);
        gui_Table_Layout.addComponent(Label_3Constraint, gui_Label_3);
        com.codename1.ui.table.TableLayout.Constraint TextField_3Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(0, 1);
        gui_Table_Layout.addComponent(TextField_3Constraint, gui_TextField_3);
        com.codename1.ui.table.TableLayout.Constraint Label_3_1Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(1, 0);
        gui_Table_Layout.addComponent(Label_3_1Constraint, gui_Label_3_1);
        com.codename1.ui.table.TableLayout.Constraint TextField_3_1Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(1, 1);
        gui_Table_Layout.addComponent(TextField_3_1Constraint, gui_TextField_3_1);
        com.codename1.ui.table.TableLayout.Constraint Label_3_2Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(2, 0);
        gui_Table_Layout.addComponent(Label_3_2Constraint, gui_Label_3_2);
        com.codename1.ui.table.TableLayout.Constraint TextField_3_2Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(2, 1);
        gui_Table_Layout.addComponent(TextField_3_2Constraint, gui_TextField_3_2);
        com.codename1.ui.table.TableLayout.Constraint Button_7Constraint = ((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).createConstraint(2, 2);
        gui_Table_Layout.addComponent(Button_7Constraint, gui_Button_7);
        addComponent(gui_Infinite_Progress_1);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)61.640213);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)52.645504);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "auto 83.06879mm 59.18728% auto").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "auto 0.0mm 5.291008mm auto").setReferenceComponents(gui_Button_1, "-1 0 -1 -1").setReferencePositions(gui_Button_1, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Flow_Layout.getParent().getLayout()).setInsets(gui_Flow_Layout, "auto 1.8518524mm 40.282684% auto").setReferenceComponents(gui_Flow_Layout, "-1 -1 -1 -1").setReferencePositions(gui_Flow_Layout, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Border_Layout.getParent().getLayout()).setInsets(gui_Border_Layout, "auto 30.167599% 1.3227501mm 19.8324%").setReferenceComponents(gui_Border_Layout, "0 -1 1 -1").setReferencePositions(gui_Border_Layout, "0.0 0.0 1.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Layered_Layout.getParent().getLayout()).setInsets(gui_Layered_Layout, "7.933194% 6.296296% 32.985386% 27.407408%").setReferenceComponents(gui_Layered_Layout, "0 2 3 0 ").setReferencePositions(gui_Layered_Layout, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Box_Layout_Y.getParent().getLayout()).setInsets(gui_Box_Layout_Y, "-2.3809524mm 5.8201056mm auto auto").setReferenceComponents(gui_Box_Layout_Y, "-1 -1 -1 -1").setReferencePositions(gui_Box_Layout_Y, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Table_Layout.getParent().getLayout()).setInsets(gui_Table_Layout, "auto 50.977654% 32.155476% -1.8518519mm").setReferenceComponents(gui_Table_Layout, "-1 -1 -1 -1").setReferencePositions(gui_Table_Layout, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Infinite_Progress_1.getParent().getLayout()).setInsets(gui_Infinite_Progress_1, "auto 19.553072% 19.43463% auto").setReferenceComponents(gui_Infinite_Progress_1, "-1 -1 -1 -1").setReferencePositions(gui_Infinite_Progress_1, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
