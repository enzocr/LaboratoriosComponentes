package com.cenfotec.graphql.mutation;

import com.cenfotec.graphql.entities.Vehicle;
import com.cenfotec.graphql.services.VehicleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

	@Autowired
    private VehicleService vehicleService;
    
	public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}