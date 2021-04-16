/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author surfacepro3
 */
public class RoomEntry {
    
    private String name;
    private int rooms;
    
    public RoomEntry(String name, int rooms)
    {
        setName(name);
        setRooms(rooms);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){return name;}
    
    public void setRooms(int rooms)
    {
        this.rooms = rooms;
    }
    public int getRooms(){return rooms;}
    
}
