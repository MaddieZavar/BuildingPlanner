package com.mahdieh.zavar.data;

import lombok.Data;

import java.util.List;
@Data
public class BuildingLimits {

    private String type;
    private List<Feature> features;
}
