package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.util.Set;

public class FlightDaoIml implements IFlightDao {


    @Override
    public void inserFlight(Flight flight) {
        System.out.println("Dao层："+flight);
    }

    @Override
    public Set<Flight> getAllFligths() {
        return null;
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
    public Flight getFlightDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
