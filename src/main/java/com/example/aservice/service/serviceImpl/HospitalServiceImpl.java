package com.example.aservice.service.serviceImpl;

import com.example.aservice.Repo.DepartmentRepo;
import com.example.aservice.Repo.HospitalRepo;
import com.example.aservice.dto.HospitalRequestDto;
import com.example.aservice.dto.HospitalResponseDto;
import com.example.aservice.model.Department;
import com.example.aservice.model.Hospital;
import com.example.aservice.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalServiceImpl  implements HospitalService {

    private final HospitalRepo hospitalRepo;
    private final DepartmentRepo departmentRepo;

    public HospitalServiceImpl(HospitalRepo hospitalRepo, DepartmentRepo departmentRepo) {
        this.hospitalRepo = hospitalRepo;
        this.departmentRepo = departmentRepo;
    }

    @Override
    public HospitalResponseDto save(HospitalRequestDto hospitalRequestDto) {
        Hospital hospital = new Hospital(hospitalRequestDto.getName(), hospitalRequestDto.getAddress()
        , hospitalRequestDto.getContact(), hospitalRequestDto.getLocation(), hospitalRequestDto.getEmail());

        List<Department> departmentList = departmentRepo.findAllById(hospitalRequestDto.getDid());
        hospital.setDepartmentList(departmentList);
        hospitalRepo.save(hospital);
        return new HospitalResponseDto(hospital) ;
    }

    @Override
    public List<HospitalResponseDto> findAll() {
        List<Hospital> hospitalList = hospitalRepo.findByStatusTrue();
        List<HospitalResponseDto> hospitalResponseDtoList = new ArrayList<>();
        hospitalList.forEach(hospital ->
        {
            HospitalResponseDto hospitalResponseDto = new HospitalResponseDto();
            hospitalResponseDto.setId(hospital.getId());
            hospitalResponseDto.setName(hospital.getName());
            hospitalResponseDto.setEmail(hospital.getEmail());
            hospitalResponseDto.setContact(hospital.getContact());
            hospitalResponseDto.setLocation(hospital.getLocation());
            hospitalResponseDto.setDid(hospital.getDepartmentList());
            hospitalResponseDtoList.add(hospitalResponseDto);
        });

        return hospitalResponseDtoList;
    }

    @Override
    public HospitalResponseDto findById(int id) {
        return null;
    }

    @Override
    public HospitalResponseDto findByEmail(String email) {
        Hospital hospital = hospitalRepo.findByEmail(email);
        HospitalRequestDto hospitalRequestDto = new HospitalRequestDto();
        return new HospitalResponseDto(hospital);
    }
}
