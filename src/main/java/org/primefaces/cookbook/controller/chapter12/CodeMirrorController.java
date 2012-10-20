package org.primefaces.cookbook.controller.chapter12;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * CodeMirrorController
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class CodeMirrorController implements Serializable {

    private String content;
    private String mode = "javascript";

    public CodeMirrorController() {
        content = "function test() { console.log('test'); }";
    }

    public void changeMode() {
        if (mode.equals("css")) {
            mode = "javascript";
        } else {
            mode = "css";
        }
    }

    public List<String> complete(String token, String context) {
        ArrayList<String> suggestions = new ArrayList<String>();

        suggestions.add("context: " + context);
        suggestions.add("token: " + token);

        return suggestions;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
