package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {
    void inserFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFligths() throws SQLException;
    Flight getFlightDepartureAirPort(String departureAirPort);
    Flight getFlightDestinationAirPort(String destinationAirPort);
    Flight getFlightDepartureTime(String departureTime);
    void updateFlight(Flight flight);

}
