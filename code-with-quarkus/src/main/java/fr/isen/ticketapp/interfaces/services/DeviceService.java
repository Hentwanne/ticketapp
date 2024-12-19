package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.PosteInformatique;

public interface DeviceService {
    List<PosteInformatique> GetAllDevice();

    PosteInformatique GetDeviceById(final int id);

    PosteInformatique AddDevice(final PosteInformatique device);

    boolean removeDevice(final int deviceId);

    PosteInformatique updateDevice(final PosteInformatique newDevice);

}
