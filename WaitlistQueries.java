/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Date;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author surfacepro3
 */
public class WaitlistQueries {
    
    private static Connection connection;
    private static ArrayList<String> waitlist = new ArrayList<String>();
    private static PreparedStatement addWaitlist;
    private static PreparedStatement getWaitlistByFaculty;
    private static PreparedStatement getWaitlistByDate;
    private static PreparedStatement getWaitlistBySeats;
    private static PreparedStatement deleteWaitlist;
    private static ResultSet resultSet;
    
    public static void addWaitlist(String faculty, Date date,
            int seats, Timestamp timestamp)
    {   
        connection = DBConnection.getConnection();
        try
        {
            addWaitlist = connection.prepareStatement(
                    "insert into waitlist (faculty, date, seats, "
                            + "timestamp) values (?, ?, ?, ?)");
            addWaitlist.setString(1, faculty);
            addWaitlist.setDate(2, date);
            addWaitlist.setInt(3, seats);
            addWaitlist.setTimestamp(4, timestamp);
            addWaitlist.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
    
    public static ArrayList<String> getWaitlistByFaculty()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> waitlist = new ArrayList<String>();
        try
        {
            getWaitlistByFaculty = connection.prepareStatement(
                    "select faculty from waitlist");
            resultSet = getWaitlistByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                waitlist.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlist;
    }
    
    public static ArrayList<Date> getWaitlistByDate()
    {
        connection = DBConnection.getConnection();
        ArrayList<Date> waitlist = new ArrayList<Date>();
        try
        {
            getWaitlistByDate = connection.prepareStatement(
                    "select date from waitlist");
            resultSet = getWaitlistByDate.executeQuery();
            
            while(resultSet.next())
            {
                waitlist.add(resultSet.getDate(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlist;
    }
    
    public static ArrayList<String> getWaitlistBySeats()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> waitlist = new ArrayList<String>();
        try
        {
            getWaitlistBySeats = connection.prepareStatement(
                    "select seats from waitlist");
            resultSet = getWaitlistBySeats.executeQuery();
            
            while(resultSet.next())
            {
                waitlist.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlist;
    }
    
     public static void deleteWaitlist(String faculty)
    {
        
    }
    
}
