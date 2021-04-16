/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author surfacepro3
 */
public class ReservationEntry {
    
    private String name;
    private String room;
    private Date date;
    private int seats;
    private Timestamp timestamp;
    
    public ReservationEntry(String name, String room, Date date, int seats,
            Timestamp timestamp)
    {
        setName(name);
        setRoom(room);
        setDate(date);
        setSeats(seats);
        setTimestamp(timestamp);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){return name;}
    
    public void setRoom(String room)
    {
        this.room = room;
    }
    public String getRoom(){return room;}
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    public Date getDate(){return date;}
    
    public void setSeats(int seats)
    {
        this.seats = seats;
    }
    public int getSeats(){return seats;}
    
    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }
    public Timestamp getTimestamp(){return timestamp;}
    
}
