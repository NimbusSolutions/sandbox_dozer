package com.nimbus.mapper;

import com.nimbus.data.JourneyEntity;
import com.nimbus.data.PassengerEntity;
import com.nimbus.domain.Journey;
import com.nimbus.domain.Passenger;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.Arrays;

/**
 * Created by Kye on 09/04/15.
 */
public class DozerMapper {


    private final Mapper mapper;

    public DozerMapper() {

        DozerBeanMapper configMapper = new DozerBeanMapper();
        configMapper.setMappingFiles(Arrays.asList("dozer/mapping.xml"));

        this.mapper = configMapper;
    }


    public PassengerEntity map(Passenger domain) {

        return this.mapper.map(domain, PassengerEntity.class);
    }

    public Passenger map(PassengerEntity data) {
        return this.mapper.map(data, Passenger.class);
    }

    public JourneyEntity map(Journey domain) {
        return this.mapper.map(domain, JourneyEntity.class);
    }

    public Journey map(JourneyEntity data) {
        return this.mapper.map(data, Journey.class);
    }

}
