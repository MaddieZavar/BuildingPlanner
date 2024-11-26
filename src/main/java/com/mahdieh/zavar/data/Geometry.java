package com.mahdieh.zavar.data;

import lombok.Data;

import java.util.List;

@Data
public class Geometry {

    private String type;
    private List<List<Double>> coordinates;
}
