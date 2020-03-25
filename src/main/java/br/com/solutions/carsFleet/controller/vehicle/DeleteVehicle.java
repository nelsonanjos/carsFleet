package br.com.solutions.carsFleet.controller.vehicle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solutions.carsFleet.controller.ControllerCommand;
import br.com.solutions.carsFleet.dao.VehicleDao;

public class DeleteVehicle implements 	ControllerCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		VehicleDao.delete(id);
	}

}
