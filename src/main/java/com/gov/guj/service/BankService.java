package com.gov.guj.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gov.guj.model.Ms_bank;
import com.gov.guj.repository.BankRepository;

@Service
@CrossOrigin(origins = "*")
@Transactional
public class BankService {

	private BankRepository bankRepository;

	@Autowired
	public BankService(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}
	
	public List getBankBranchNamesByBank() {

		JSONArray bankDetails = new JSONArray();
		JSONArray bankNames = new JSONArray();
		JSONArray branchNames = new JSONArray();

		Iterable<Ms_bank> ms_bank = this.bankRepository.findAll();

		ms_bank.forEach(bank -> {
			List<String> bankBranchName = new ArrayList<>();
			bank.getBank_branches().forEach(bankBranch -> {
				bankBranchName.add(bankBranch.getBranch_name());
			});
			bankNames.put(bank.getBank_name());
			branchNames.put(new JSONObject().put("bank", bank.getBank_name()).put("branches", bankBranchName));
		});
		bankDetails.put(bankNames);
		bankDetails.put(branchNames);

		System.out.println(bankDetails.toList());

		return bankDetails.toList();
	}
}
