/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.IBMworks;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextArea;
import com.codename1.ui.table.TableLayout;
import static com.mycompany.IBMworks.Aptitude.sectNo;


/**
 * GUI builder created Form
 *
 * @author Hidee
 */
public class instrPage extends com.codename1.ui.Form {

    public instrPage() {
        initGuiBuilderComponents(com.codename1.ui.util.Resources.getGlobalResources());
        gui_UserName.setText("WELCOME, "+Aptitude.getTitle()+Aptitude.userName);
        gui_display.setText("To complete each section of this inventory, tick in appropriate boxes the one,"
                + " two or three sentences most applicable to yourself. Then split 10 points between those"
                + " sentences you have ticked, thus indicating the relative extent to which each applies. For examples, "
                + "in one section you might feel there are only three sentences that apply to you: one which you feel "
                + "sums you up well while the other two apply some of the time. In this instance, you could give your first "
                + "choice six points and the remaining points to your second and third choices. In some instances, you might decide "
                + "that there are two sentences, which apply to you equally; if this is the case, award five points to each. "
                + "You must allocate all 10 points in each section.");
        gui_playButton.addActionListener(e -> {
            testPage();
            
        });
        
    }
    
    public void testPage(){
        TableLayout tl = new TableLayout(8,3);
        Form hi = new Form("TEST PAGE",tl);
        TextArea x = new TextArea("I can be relied upon to see that work that needs to be done is organised");
         x.setInlineAllStyles("font:1.5mm;");
         x.setInlineAllStyles("font:2.0mm native:MainBold native:MainBold; border:roundRect stroke(0.1mm 37000000)  bgColor:f7fefb; fgColor:20101; opacity:223; bgType:none; bgImage:; alignment:left;");

        hi.add(tl.createConstraint().widthPercentage(10),new Label("1"));
        hi.add(tl.createConstraint().widthPercentage(10),new TextArea("fjdf"))
        .add(x).
        add(tl.createConstraint().widthPercentage(10),new TextArea("10"));
        hi.getToolbar().setBackCommand("", f -> new instrPage().showBack());
            sectNo=0;
            hi.show();
    }
        
    

    public com.codename1.ui.TextArea x(){
        return gui_display;
    }

//////////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.TextArea gui_display = new com.codename1.ui.TextArea();
    protected com.codename1.ui.Button gui_playButton = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_UserName = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("font:12.0mm native:MainBold native:MainBold; bgColor:f7fefb; fgColor:f7fefb; bgImage:ComboBox.sel#borderTopL_1.png;");
        setTitle("INSTRUCTION PAGE");
        setName("instrPage");
        gui_display.setPreferredSizeStr("123.809525mm 30.0mm");
        gui_display.setEditable(true);
        gui_display.setRTL(false);
        gui_display.setHint("here");
        gui_display.setText("el practiso fjjd hddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddjjdjd ddjjjj   ");
                gui_display.setInlineStylesTheme(resourceObjectInstance);
        gui_display.setInlineAllStyles("font:1.0mm native:MainBold native:MainBold; border:roundRect stroke(0.1mm 37000000) -top-left +top-right -bottom-left +bottom-right 2.0mm; bgColor:f7fefb; fgColor:20101; transparency:255; opacity:223; bgType:none; bgImage:; alignment:left;");
        gui_display.setName("display");
        gui_display.setMaxSize(124000);
        gui_display.setColumns(10);
        gui_display.setRows(5);
        gui_display.setConstraint(com.codename1.ui.TextArea.NON_PREDICTIVE);
        gui_playButton.setPreferredSizeStr("16.931217193603516mm inherit");
        gui_playButton.setText("CONTINUE");
                gui_playButton.setInlineStylesTheme(resourceObjectInstance);
        gui_playButton.setInlineAllStyles("font:native:ItalicBold native:ItalicBold; border:0.25mm dotted 0; bgColor:20101; fgColor:deffee; transparency:255; opacity:255; alignment:left;");
        gui_playButton.setName("playButton");
        gui_Label.setPreferredSizeStr("24.338625mm 4.4973545mm");
        gui_Label.setText("Read the instructions carefully");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setInlineAllStyles("font:1.7mm native:ItalicLight native:ItalicLight; bgColor:20101; fgColor:fe2e2a; bgImage:;");
        gui_Label.setName("Label");
        gui_UserName.setPreferredSizeStr("123.809525mm inherit");
        gui_UserName.setText("Welcome, ");
                gui_UserName.setInlineStylesTheme(resourceObjectInstance);
        gui_UserName.setInlineAllStyles("font:2.0mm native:MainBold native:MainBold; bgImage:;");
        gui_UserName.setName("UserName");
        gui_UserName.setTextPosition(com.codename1.ui.Component.RIGHT);
        addComponent(gui_display);
        addComponent(gui_playButton);
        addComponent(gui_Label);
        addComponent(gui_UserName);
        ((com.codename1.ui.layouts.LayeredLayout)gui_display.getParent().getLayout()).setInsets(gui_display, "2.645503mm auto auto auto").setReferenceComponents(gui_display, "2 -1 -1 -1").setReferencePositions(gui_display, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_playButton.getParent().getLayout()).setInsets(gui_playButton, "auto auto 3.4391575mm auto").setReferenceComponents(gui_playButton, "-1 -1 -1 -1").setReferencePositions(gui_playButton, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "0.0mm auto auto auto").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_UserName.getParent().getLayout()).setInsets(gui_UserName, "3.7037036mm auto auto auto").setReferenceComponents(gui_UserName, "2 -1 -1 -1").setReferencePositions(gui_UserName, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
