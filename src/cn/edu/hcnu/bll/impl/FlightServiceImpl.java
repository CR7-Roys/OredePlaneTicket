package cn.edu.hcnu.bll.impl;
import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlightDao;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    @Override
    public void insertFlight(Flight flight) {

        System.out.println("界面传来的航班信息："+flight);
    }

    @Override
    public void inserFlight(Flight flight) {

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

