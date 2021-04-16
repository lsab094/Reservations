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
public class ReservationQueries {
    
    private static Connection connection;
    private static ArrayList<String> reservations = new ArrayList<String>();
    private static PreparedStatement addReservation;
    private static PreparedStatement getDatesByRoom;
    private static PreparedStatement getFacultyByDate;
    private static PreparedStatement getRoomsByDate;
    private static PreparedStatement deleteReservation;
    private static ResultSet resultSet;
    
    public static void addReservation(String faculty, String room, Date date,
            int seats, Timestamp timestamp)
    {   
        connection = DBConnection.getConnection();
        try
        {
            addReservation = connection.prepareStatement(
                    "insert into reservations (faculty, room, date, seats, "
                            + "timestamp) values (?, ?, ?, ?, ?)");
            addReservation.setString(1, faculty);
            addReservation.setString(2, room);
            addReservation.setDate(3, date);
            addReservation.setInt(4, seats);
            addReservation.setTimestamp(5, timestamp);
            addReservation.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
    
    public static ArrayList<Date> getDatesByRoom(
            String room)
    {
        
        connection = DBConnection.getConnection();
        ArrayList<Date> reservations = new ArrayList<Date>();
        try
        {
            getDatesByRoom = connection.prepareStatement(
                    "select date from reservations where room = ?");
            getDatesByRoom.setString(1, room);
            resultSet = getDatesByRoom.executeQuery();
            
            while(resultSet.next())
            {
                reservations.add(resultSet.getDate(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservations;
        
    }
    
    public static ArrayList<String> getFacultyByDate(Date date)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> reservations = new ArrayList<String>();
        
        try
        {
            getFacultyByDate = connection.prepareStatement(
                    "select faculty from reservations where date = ?");
            getFacultyByDate.setDate(1, date);
            resultSet = getFacultyByDate.executeQuery();
            
            while(resultSet.next())
            {
                reservations.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservations;
    }
    
    public static ArrayList<String> getRoomsByDate(Date date)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> reservations = new ArrayList<String>();
        
        try
        {
            getRoomsByDate = connection.prepareStatement(
                    "select room from reservations where date = ?");
            getRoomsByDate.setDate(1, date);
            resultSet = getRoomsByDate.executeQuery();
            
            while(resultSet.next())
            {
                reservations.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservations;
    }
    
     public static void deleteReservation(String name)
    {
        
    }
}
