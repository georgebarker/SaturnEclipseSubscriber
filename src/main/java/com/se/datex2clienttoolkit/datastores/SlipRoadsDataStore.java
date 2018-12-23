package com.se.datex2clienttoolkit.datastores;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.se.datex2clienttoolkit.models.SlipRoad;
import com.se.datex2clienttoolkit.services.JourneyPlanningService;

import static com.se.datex2.schema.CarriagewayEnum.ENTRY_SLIP_ROAD;
import static com.se.datex2.schema.CarriagewayEnum.EXIT_SLIP_ROAD;

/**
 * This is a data store for Slip Roads that is used by Optimal Journey Planning.
 * It prevents the formulation of Slip Road DTOs occurring multiple times within
 * one instance of the application running.
 * 
 * @author georgebarker
 *
 */
@Component
public class SlipRoadsDataStore {

	private Map<String, List<SlipRoad>> entrySlipRoads;
	private Map<String, List<SlipRoad>> exitSlipRoads;

	@Autowired
	JourneyPlanningService journeyPlanningService;

	public Map<String, List<SlipRoad>> getEntrySlipRoads() {
		if (entrySlipRoads == null || entrySlipRoads.isEmpty()) {
			entrySlipRoads = journeyPlanningService.getSlipRoads(ENTRY_SLIP_ROAD);
		}

		return entrySlipRoads;
	}

	public Map<String, List<SlipRoad>> getExitSlipRoads() {
		if (exitSlipRoads == null || exitSlipRoads.isEmpty()) {
			exitSlipRoads = journeyPlanningService.getSlipRoads(EXIT_SLIP_ROAD);
		}

		return exitSlipRoads;
	}
}
