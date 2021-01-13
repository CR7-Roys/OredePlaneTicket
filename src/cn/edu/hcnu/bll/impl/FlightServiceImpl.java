package cn.edu.hcnu.bll.impl;
import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {
//定义一个类，
    IFlightDao IflightDao;
//构造这个方法，调用这个FlightDaoIml()方法
    public FlightServiceImpl() {
        IflightDao =new FlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        IflightDao.inserFlight(flight);
//        System.out.println("界面传来的航班信息："+flight);
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

