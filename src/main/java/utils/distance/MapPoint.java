package utils.distance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 16:18.
 * © All Rights Reserved.
 */

@NoArgsConstructor
@AllArgsConstructor
public class MapPoint implements Point{

    private double latitude,longitude;


    @Override
    public double x() {
        return latitude;
    }

    @Override
    public double y() {
        return longitude;
    }
}
