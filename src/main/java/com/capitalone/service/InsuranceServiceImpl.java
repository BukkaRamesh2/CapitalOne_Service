package com.capitalone.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.exception.BankingException;
import com.capitalone.exception.InvalidInsuranceNameException;
import com.capitalone.exception.SameBeneficiaryException;
import com.capitalone.model.Insurance;
import com.capitalone.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	
	public InsuranceServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public InsuranceRepository inspRepo;
	
	private List<Insurance> arrayList = new ArrayList<>();
	private List<Insurance> linkedList = new LinkedList<>();
	
	private Set<Long> hashSet = new HashSet<>();
	private Set<Long> linkedHashSet = new LinkedHashSet<>();
	private Set<Long> treeSet = new TreeSet<>();
//	
//	private Map<Long, Insurance> hashMap = new HashMap<>();
//	private Map<Long, Insurance> linkedHashMap = new LinekedHashMap<>();
//	private Map<Long, Insurance> treeMap = new TreeMap<>();
//	
	
	@Override
	public Insurance createInsurance(Insurance insurance) {
		
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		arrayList.add(insurance);
		endTime = System.nanoTime();
		System.out.println("ArrayList insertion time is: "+(endTime-startTime));
		
		startTime = System.nanoTime();
		linkedList.add(insurance);
		endTime = System.nanoTime();
		System.out.println("LinkedList insertion time is: "+(endTime-startTime));
		
		
		startTime = System.nanoTime();
		hashSet.add(insurance.getInsuranceId());
		endTime = System.nanoTime();
		System.out.println("HashSet insertion time is: "+(endTime-startTime));
		
		startTime = System.nanoTime();
		treeSet.add(insurance.getInsuranceId());
		endTime = System.nanoTime();
		System.out.println("TreeSet insertion time is: "+(endTime-startTime));
		
		
//		startTime = System.nanoTime();
//		hashMap.put(insurance.getInsuranceId(), insurance);
//		endTime = System.nanoTime();
//		System.out.println("HashMap insertion time is: "+(endTime-startTime));
//		
//		startTime = System.nanoTime();
//		linkedHashMap.put(insurance.getInsuranceId(), insurance);
//		endTime = System.nanoTime();
//		System.out.println("LinkedHashMap insertion time is: "+(endTime-startTime));
//		
//		startTime = System.nanoTime();
//		treeMap.put(insurance.getInsuranceId(), insurance);
//		endTime = System.nanoTime();
//		System.out.println("Tree Map insertion time is: "+(endTime-startTime));
//		
		
		if(inspRepo.existsById(insurance.getInsuranceId())) {
			throw new BankingException("Insurance with id: "+ insurance.getInsuranceId()+ " already exists.");
		}
		
		else if(inspRepo.findByBeneficiary(insurance.getBeneficiary())!=null) {
				throw new SameBeneficiaryException("Another customer already has the beneficiary: " + insurance.getBeneficiary() + " listed on their insurance policy.");
			}
		else
			{System.out.println("Executed");}
		
		
		
		return inspRepo.save(insurance);
	}

	@Override
	public Insurance getInsurance(Long insuranceId) {
		// TODO Auto-generated method stub
		
		if (insuranceId == null) {
		       throw new InvalidInsuranceNameException();
		   }
		else
			return inspRepo.findByInsuranceId(insuranceId);

	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInsurance(Long insuranceId) {
		// TODO Auto-generated method stub
		
	}

}