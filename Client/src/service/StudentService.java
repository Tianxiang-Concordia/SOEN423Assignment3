
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentService", targetNamespace = "http://service/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface StudentService {


    /**
     * 
     * @param date
     * @param studentID
     * @param roomNumber
     * @param campusName
     * @param timeSlot
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service/StudentService/bookRoomRequest", output = "http://service/StudentService/bookRoomResponse")
    public String bookRoom(
        @WebParam(name = "campusName", partName = "campusName")
        String campusName,
        @WebParam(name = "roomNumber", partName = "roomNumber")
        String roomNumber,
        @WebParam(name = "date", partName = "date")
        String date,
        @WebParam(name = "timeSlot", partName = "timeSlot")
        String timeSlot,
        @WebParam(name = "studentID", partName = "studentID")
        String studentID);

    /**
     * 
     * @param studentID
     * @param bookingID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service/StudentService/cancelBookingRequest", output = "http://service/StudentService/cancelBookingResponse")
    public String cancelBooking(
        @WebParam(name = "bookingID", partName = "bookingID")
        String bookingID,
        @WebParam(name = "studentID", partName = "studentID")
        String studentID);

    /**
     * 
     * @param studentID
     * @param newCampusName
     * @param newRoomNo
     * @param bookingID
     * @param newTimeSlot
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service/StudentService/changeReservationRequest", output = "http://service/StudentService/changeReservationResponse")
    public String changeReservation(
        @WebParam(name = "bookingID", partName = "bookingID")
        String bookingID,
        @WebParam(name = "newCampusName", partName = "newCampusName")
        String newCampusName,
        @WebParam(name = "newRoomNo", partName = "newRoomNo")
        String newRoomNo,
        @WebParam(name = "newTimeSlot", partName = "newTimeSlot")
        String newTimeSlot,
        @WebParam(name = "studentID", partName = "studentID")
        String studentID);

    /**
     * 
     * @param date
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service/StudentService/getAvailableTimeSlotRequest", output = "http://service/StudentService/getAvailableTimeSlotResponse")
    public String getAvailableTimeSlot(
        @WebParam(name = "date", partName = "date")
        String date);

}
