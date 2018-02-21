package sqlite.kripton209.model1;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;

import java.util.List;

@BindDao(Device.class)
public interface DeviceDao {

    @BindSqlSelect
    List<Device> getAllDevices();

    // List all devices by userId
    @BindSqlSelect(jql="select * from device inner join userdevice on device.id = userdevice.deviceId  where userdevice.userId = ${userId}")
    List<Device> getUserDevices(Long userId);
}