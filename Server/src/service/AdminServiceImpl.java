package service;

import business.RoomManager;
import utils.Log;

import javax.jws.WebService;
import java.util.Date;

@WebService(name = "AdminService", endpointInterface = "service.AdminService")
public class AdminServiceImpl implements AdminService {

    RoomManager roomManager = RoomManager.getInstance();
    public String campusCode;

    @Override
    public String createRoom(String roomNumber, String date, String timeSlot, String userID) {

        System.out.println(roomNumber + ", " + date);
        String result;
        if (userID.charAt(3) != 'A') {
            result = "Permission Denied!";
        } else {
            roomManager.createRoom(roomNumber, date, timeSlot);
            result = "Success!";
        }
        Log.addLog(campusCode, "Date: " + new Date().toLocaleString());
        Log.addLog(campusCode, "\r\nRequest Type: Create Room");
        Log.addLog(campusCode, "\r\nParameter: " + roomNumber + ", " + date + ", " + timeSlot + ", " + userID);
        Log.addLog(campusCode, "\r\n" + result + "\r\n\r\n");
        return result;
    }

    @Override
    public String deleteRoom(String roomNumber, String date, String timeSlot, String userID) {

        String result;
        if (userID.charAt(3) != 'A') {
            result = "Permission Denied!";
        } else {
            result = roomManager.deleteRoom(roomNumber, date, timeSlot);
        }
        Log.addLog(campusCode, "Date: " + new Date().toLocaleString());
        Log.addLog(campusCode, "\r\nRequest Type: Delete Room");
        Log.addLog(campusCode, "\r\nParameter: " + roomNumber + ", " + date + ", " + timeSlot + ", " + userID);
        Log.addLog(campusCode, "\r\n" + result + "\r\n\r\n");
        return result;
    }

}
