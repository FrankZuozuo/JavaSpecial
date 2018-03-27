package utils.http;

import lombok.Data;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 14:00.
 * © All Rights Reserved.
 */
public class IPPropertiesUtils {

    // 淘宝IP库工具类





    @Data
    public class Result {

        private boolean isSuccess;
        private IPAddressInfo ipAddressInfo;
    }


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
}
