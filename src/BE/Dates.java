/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import com.jfoenix.controls.JFXComboBox;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ZeXVex
 */
public class Dates {

    @Override
    public String toString() {
        return "Day:" + Day.getValue() + "\t" + "Month:" + month.getValue() + "\t" + "Year:" + year.getValue() + "\t\t" + Pressent.getValue();
    }

    public Dates(int day, int month, int yaers, String Pressent) {
        this.Day.set(day);
        this.month.set(month);
        this.year.set(yaers);
        this.Pressent.set(Pressent);
    }
    private final IntegerProperty Day = new SimpleIntegerProperty();
    private final IntegerProperty month = new SimpleIntegerProperty();
    private final IntegerProperty year = new SimpleIntegerProperty();
    private final StringProperty Pressent = new SimpleStringProperty();

    public String getPressent() {
        return Pressent.get();
    }

    public void setPressent(String value) {
        Pressent.set(value);
    }

    public StringProperty PressentProperty() {
        return Pressent;
    }

    public int getYear() {
        return year.get();
    }

    public void setYear(int value) {
        year.set(value);
    }

    public IntegerProperty yearProperty() {
        return year;
    }

    public int getMonth() {
        return month.get();
    }

    public void setMonth(int value) {
        month.set(value);
    }

    public IntegerProperty monthProperty() {
        return month;
    }

    public int getDay() {
        return Day.get();
    }

    public void setDay(int value) {
        Day.set(value);
    }

    public IntegerProperty DayProperty() {
        return Day;
    }

}
