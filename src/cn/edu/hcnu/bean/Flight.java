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

    public Flight(String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureTime) {
//构造方法
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
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
        return "Flight{" +"\n"+
                " 航班号='" + flightId + '\'' +"\n"+
                " 飞机类型='" + planeType + '\'' +"\n"+
                " 座位数=" + currentSeatsNum +"\n"+
                " 起飞机场='" + departureAirPort + '\'' +"\n"+
                " 目的机场='" + destinationAirPort + '\'' +"\n"+
                " 到达时间='" + departureTime + '\'' +"\n"+
                '}';
    }

}