package com.lgdx.indiaCS.service;

import com.lgdx.indiaCS.domain.AsRequest;
import com.lgdx.indiaCS.domain.Diagnose;
import com.lgdx.indiaCS.domain.Repair;
import com.lgdx.indiaCS.repository.AsRequestRepository;
import com.lgdx.indiaCS.repository.DiagnoseRepository;
import com.lgdx.indiaCS.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ASService {

    @Autowired
    AsRequestRepository asRequestRepository;

    @Autowired
    DiagnoseRepository diagnoseRepository;

    @Autowired
    RepairRepository repairRepository;

    public AsRequest asRequestInfo(String asRequestId) {
        return asRequestRepository.findByAsRequestId(asRequestId).orElse(null);
    }

    public Diagnose diagnoseInfo(String asRequestId) {
        return diagnoseRepository.findByAsRequestId(asRequestId).orElse(null);
    }

    public List<Repair> repairInfo(String diagnoseId) {
        return repairRepository.findByAsDiagnoseId(diagnoseId);
    }
}
