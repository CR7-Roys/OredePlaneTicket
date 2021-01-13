package cn.edu.hcnu.bean;

import cn.edu.hcnu.bll.impl.FlightServiceImpl;
import cn.edu.hcnu.dao.impl.FlightDaoIml;

public class Flight {
    private String id;
    private String flightId;
    private String planeType;//乘客类型（成人、儿童）
    private int currentSeatsNum;
    private String departureAirPort;//出发机场
    private String destinationAirPort;//目的机场
    private String departureTime;//出发时间

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }
   //设置和录取

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
//重写、打印
    @Override
    public String toString() {
        return "{" +
                " 航班号='" + flightId + '\'' +
                " 飞机类型='" + planeType + '\'' +
                " 座位数=" + currentSeatsNum +'\'' +
                " 起飞机场='" + departureAirPort + '\'' +
                " 目的机场='" + destinationAirPort + '\'' +
                " 到达时间='" + departureTime + '\'' +
                '}';
    }

}