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
public class WaitlistEntry {
    
    private String faculty;
    private Date date;
    private int seats;
    private Timestamp timestamp;
    
    public WaitlistEntry(String faculty, Date date, int seats,
            Timestamp timestamp)
    {
        setFaculty(faculty);
        setDate(date);
        setSeats(seats);
        setTimestamp(timestamp);
    }
    
    public void setFaculty(String name)
    {
        this.faculty = name;
    }
    public String getFaculty(){return faculty;}
    
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
