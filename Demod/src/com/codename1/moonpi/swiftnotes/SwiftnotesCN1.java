package com.codename1.moonpi.swiftnotes;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.io.Util;
import com.codename1.l10n.L10NManager;
import com.codename1.ui.Toolbar;
import java.io.IOException;
import java.util.Map;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class SwiftnotesCN1 {

    private Form current;
    private Resources theme;

    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");

        Map<String, String> v = theme.getL10N("strings", L10NManager.getInstance().getLanguage());
        if(v == null) {
            v = theme.getL10N("strings", "en");
        }
        UIManager.getInstance().setBundle(v);
        
        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        // Pro only feature, uncomment if you have a pro subscription
        Log.bindCrashProtection(true);
        
        Util.register("Note", Note.class);
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new ActivityMain(theme).show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = Display.getInstance().getCurrent();
        }
    }
    
    public void destroy() {
    }

}
