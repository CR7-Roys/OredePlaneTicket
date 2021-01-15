package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFligths() throws SQLException;
    Flight getFlightDepartureAirPort(String departureAirPort);
    Flight getFlightDestinationAirPort(String destinationAirPort);
    Flight getFlightDepartureTime(String departureTime) throws SQLException;
    void updateFlight(Flight flight);
}
