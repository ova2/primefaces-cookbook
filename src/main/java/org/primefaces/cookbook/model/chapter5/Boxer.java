package org.primefaces.cookbook.model.chapter5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 03/03/15.
 */
public class Boxer implements Serializable {

    private String name;

    private List<Stat> stats = new ArrayList<Stat>();

    public Boxer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public int getAllWins() {
        int sum = 0;

        for(Stat s : stats) {
            sum += s.getWin();
        }

        return sum;
    }

    public int getAllLosses() {
        int sum = 0;

        for(Stat s : stats) {
            sum += s.getLoss();
        }

        return sum;
    }
}
