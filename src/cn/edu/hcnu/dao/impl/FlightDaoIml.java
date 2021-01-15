package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {


    @Override
    public void inserFlight(Flight flight) throws SQLException {
       String url="jdbc:oracle:thin:@localhost:1521:orcl";
       String username="opts";
       String password="opts1111";
        Connection conn= DriverManager.getConnection(url,username,password);
//     System.out.println("当前连接：" + conn);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,flight.getDestinationAirPort());
        pstmt.setString(7,flight.getDepartureTime());
        pstmt.executeUpdate();

    }

    @Override
    public Set<Flight> getAllFligths() throws SQLException {
        Set<Flight> allFlights=new HashSet<Flight>();//容器
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1111";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM flight";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet hq = pstmt.executeQuery();
        while (hq.next()) {
            String id = hq.getString("ID");
            String flightId = hq.getString("FLIGHT_ID");
            String planeType = hq.getString("PLANE_TYPE");
            int currentSeatsNum = hq.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = hq.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = hq.getString("DESTINATION_AIRPORT");
            String departureTime = hq.getString("DEPARTURE_TIME");
            Flight flight = new Flight(id, flightId, planeType, currentSeatsNum,
                    departureAirPort, destinationAirPort, departureTime);
            allFlights.add(flight);
        }
        return allFlights;
    }

    @Override
    public Flight getFlightDepartureAirPort(String departureAirPort) {

        return null;
    }

    @Override
    public Flight getFlightDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public Flight getFlightDepartureTime(String departureTime) throws SQLException {
        String sql = "SELECT FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,DESTINATION_AIRPORT,DEPARTURE_TIME" +
                " FROM flight " +
                "where DEPARTURE_TIME=?";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1111";
        Connection conn = DriverManager.getConnection(url, username, password);
        Flight flight=null;
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,departureTime);
        ResultSet zx=pstmt.executeQuery();

        while (zx.next()){
            String flightId = zx.getString("FLIGHT_ID");
            String planeType = zx.getString("PLANE_TYPE");
            int currentSeatsNum = zx.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = zx.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = zx.getString("DESTINATION_AIRPORT");
            String departureTimes = zx.getString("DEPARTURE_TIME");
            flight = new Flight(flightId, planeType, currentSeatsNum,
                    departureAirPort, destinationAirPort, departureTimes);
        }
        return flight;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
