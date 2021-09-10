package Rectangle.src;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle extends Figuregeo{

    int cote1;
    int cote2;
    int cote3;

    public Triangle(){

    }

    public Triangle(int c1, int c2, int c3) {
        this.cote1 = c1;
        this.cote2 = c2;
        this.cote3 = c3;
    }

    public ArrayList<Integer> findHypothenuse(){
        ArrayList<Integer> hypo = new ArrayList<Integer>();
        hypo.add(cote1);
        hypo.add(cote2);
        hypo.add(cote3);
        Collections.sort(hypo, Collections.reverseOrder());
        return hypo;
    }

    public int getHypothenuse() {
        ArrayList<Integer> hypo = this.findHypothenuse();
        return hypo.get(0);
    }

    public boolean isRectangle(){
        ArrayList<Integer> hypo = this.findHypothenuse();
        boolean rect = false;
        if (hypo.get(0)*hypo.get(0) == (hypo.get(1)*hypo.get(1) + hypo.get(2)*hypo.get(2))) {
            rect = true;
        }
        return rect;
    }

    public double getPerimetre() {
        ArrayList<Integer> hypo = this.findHypothenuse();
        return (hypo.get(1) + hypo.get(0) + hypo.get(2));
    }

    public double getAire() {
        ArrayList<Integer> hypo = this.findHypothenuse();
        double aire;
        if (this.isRectangle()) {
            aire = (hypo.get(1)*hypo.get(2))/2;
        } else {
            double demip = this.getPerimetre()/2;
            aire = Math.sqrt(demip*(demip - hypo.get(0))*(demip - hypo.get(1))*(demip - hypo.get(2)));
        }
        return aire;
    }
    
}
