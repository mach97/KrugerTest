package com.canterita.challenge.backend.test.dto.request;

import lombok.Data;

@Data
public class OrderDetailsRequest {

    private String detail;

    private Double cantidad;

    private Double precioUnitario;

    private Double totalDetail;
}
