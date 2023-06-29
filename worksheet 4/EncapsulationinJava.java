package com.java.Encapsulation;
class Hospital{
    private String patientName;
    private int patientid;
    private int roomnum;
    public String getpatientName() {
    return patientName;
    }
    public String setpatientName(String patientName) {
     return this.patientName = patientName;
    }
    
    public int getPatientid() {
        return patientid;
    }
    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }
    public int getRoomnum() {
        return roomnum;
    }
    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

public class EncapsulationinJava {
public static void main(String[] args) {
    Hospital obj = new Hospital();
    obj.setpatientName("Anandbhai");
    obj.setPatientid(12345);
    obj.setRoomnum(420);
    System.out.println("Patient name is "+obj.getpatientName()+"patient id is "+ obj.getPatientid()+"is living in room number"+obj.getRoomnum());
    
}
}
}
