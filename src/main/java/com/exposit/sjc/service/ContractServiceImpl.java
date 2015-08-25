package com.exposit.sjc.service;

import com.exposit.sjc.app.repository.dao.ContractDao;
import com.exposit.sjc.app.repository.entity.ContractEntity;
import com.exposit.sjc.domain.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ContractServiceImpl implements ContractService {

    @Autowired
   private ContractDao contractRepository;

    @Override
    public List<ContractEntity> getContracts() {
        List<ContractEntity> contractEntities = contractRepository.findAll();

        return contractEntities;
    }

    @Override
    public ContractEntity getContractByID(Long contractId) {
        ContractEntity contractEntity = contractRepository.findById(contractId);


        return contractEntity;
    }
}
