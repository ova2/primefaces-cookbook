package org.primefaces.cookbook.model.chapter5;

import java.io.Serializable;

/**
 * Created by mertcaliskan
 * on 03/03/15.
 */
public class Stat implements Serializable {

    private String match;
    private int win;
    private int loss;

    public Stat(String match, int win, int loss) {
        this.loss = loss;
        this.win = win;
        this.match = match;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }
}
