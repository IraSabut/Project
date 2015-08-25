
package com.exposit.sjc.domain.service;


import com.exposit.sjc.app.repository.entity.ContractEntity;

import java.util.List;

public interface ContractService {
    List<ContractEntity> getContracts();
    ContractEntity getContractByID(Long contractId);
}
