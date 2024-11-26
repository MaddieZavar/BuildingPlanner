package com.mahdieh.zavar.rest;

import com.mahdieh.zavar.data.BuildingService;
import com.mahdieh.zavar.data.BuildingSpecification;
import com.mahdieh.zavar.data.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BuildingLimitsSplitController {

    private final BuildingService buildingService;

    @PostMapping("/split-building-limits")
    public ResponseEntity<Response> splitBuildingLimits(@RequestBody BuildingSpecification buildingSpecification) {
        buildingService.createBuilding(buildingSpecification);
        //todo make me better
        return ResponseEntity.ok(new Response("Building limits split successfully"));
    }
}
