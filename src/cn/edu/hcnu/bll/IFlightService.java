package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    void inserFlight(Flight flight);
    Set<Flight> getAllFligths();
    Flight getFlightDepartureAirPort(String departureAirPort);
    Flight getFlightDestinationAirPort(String destinationAirPort);
    Flight getFlightDepartureTime(String departureTime);
    void updateFlight(Flight flight);
}
