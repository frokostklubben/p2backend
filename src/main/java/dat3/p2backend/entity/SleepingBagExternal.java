package dat3.p2backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class SleepingBagExternal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String brand;
    String model;
    String sku;
    String cost;
    String personHeight;
    String comfortTemp;
    String lowerLimitTemp;
    String recommendedTemp;
    String innerMaterial;
    String productWeight;
    String colour;
    String season;
    String stockLocation;

}
