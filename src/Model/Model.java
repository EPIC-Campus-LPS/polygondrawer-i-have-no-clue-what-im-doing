package Model;
import java.util.ArrayList;
import java.awt.*;
import java.util.Iterator;
import java.util.Optional;

public class Model {
    ArrayList<Polygon> list = new ArrayList<>();

    Polygon current = null;

    public int size(){
        return list.size();
    }

    public Iterator<Polygon> iterator(){
        return list.iterator();
    }

    public void removeAll(){
        list.clear();
        current = null;
    }

    public void addPolygon(Polygon poly){
        list.add(poly);
    }

    public void makeCurrent(Polygon poly){
        if(list.contains(poly)){
            current = poly;
        }
    }

    public void unselectPolygon(){
        current = null;
    }

    public Optional<Polygon> getSelect(){
        Optional<Polygon> option = Optional.ofNullable(current);
        return option;
    }

    public boolean isSelected(Polygon poly){
        return (poly != null && poly == current);
    }

}
