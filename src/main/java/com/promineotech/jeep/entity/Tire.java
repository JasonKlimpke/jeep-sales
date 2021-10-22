package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tire {
  private String manufacturer;
  private Long tirePK;
  private String tireId;
  private String tireSize;
  private BigDecimal price;
  private int warrantyMiles;
}

