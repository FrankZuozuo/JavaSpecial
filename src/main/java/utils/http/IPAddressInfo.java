package utils.http;

import lombok.Data;

/**
 * @author Created by 谭健 on 2018/3/27 0027. 星期二. 15:19.
 * © All Rights Reserved.
 */

@Data
public class IPAddressInfo {

    private String ip,
            country,
            area,
            region,
            city,
            county,
            isp,
            countryId,
            describe;
    private Integer areaId,
            regionId,
            cityId,
            countyId,
            ispId;

}
