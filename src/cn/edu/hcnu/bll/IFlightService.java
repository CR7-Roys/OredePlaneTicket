package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    void inserFlight(Flight flight);
    Set<Flight> getAllFligths();
    Flight getFlightDepartureAirPort(String departureAirPort);
    Flight getFlightDestinationAirPort(String destinationAirPort);
    Flight getFlightDepartureTime(String departureTime);
    void updateFlight(Flight flight);
}
