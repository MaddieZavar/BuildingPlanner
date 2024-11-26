package com.mahdieh.zavar.data;

import lombok.Data;

@Data
public class Feature {

    private String type;
    private Geometry geometry;
    private Properties properties;
}
