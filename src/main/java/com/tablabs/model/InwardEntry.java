package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDOI_INWARD_ENTRY", schema = "DOI")
public class InwardEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inward_id")
	long inwardId;

	@Column(name = "inward_no")
	long inwardNo;

	@Column(name = "inward_dt")
	LocalDate inwardDate;

	@Column(name = "letter_type_id")
	long letterTypeId;

	@Column(name = "letter_type")
	String letterType;

	@Column(name = "c")
	String letterNo;

	@Column(name = "letter_dt")
	LocalDate letterDate;

	@Column(name = "letter_details")
	String letterDetails;

	@Column(name = "from_where_details")
	String fromWhereDetails;

	@Column(name = "doi_branch_id")
	long doiBranchId;

	@Column(name = "doi_employee_id")
	long doiEmployeeId;

	@Column(name = "doi_employee_name")
	String doiEmployeeName;

	@Column(name = "reference_no")
	String referenceNo;

	@Column(name = "reference_dt")
	LocalDateTime referenceDate;

	@Column(name = "active_status")
	int activeStatus;

	@Column(name = "created_date")
	LocalDateTime createdDate;

	@Column(name = "created_by")
	long createdBy;

	@Column(name = "created_by_post")
	long createdByPost;

	@Column(name = "updated_date")
	LocalDateTime updatedDate;

	@Column(name = "updated_by")
	long updatedBy;

	@Column(name = "updated_by_post")
	long updatedByPost;

	public InwardEntry() {
		super();
	}

	public InwardEntry(long inwardId, long inwardNo, LocalDate inwardDate, long letterTypeId, String letterType,
			String letterNo, LocalDate letterDate, String letterDetails, String fromWhereDetails, long doiBranchId,
			long doiEmployeeId, String doiEmployeeName, String referenceNo, LocalDateTime referenceDate,
			int activeStatus, LocalDateTime createdDate, long createdBy, long createdByPost, LocalDateTime updatedDate,
			long updatedBy, long updatedByPost) {
		super();
		this.inwardId = inwardId;
		this.inwardNo = inwardNo;
		this.inwardDate = inwardDate;
		this.letterTypeId = letterTypeId;
		this.letterType = letterType;
		this.letterNo = letterNo;
		this.letterDate = letterDate;
		this.letterDetails = letterDetails;
		this.fromWhereDetails = fromWhereDetails;
		this.doiBranchId = doiBranchId;
		this.doiEmployeeId = doiEmployeeId;
		this.doiEmployeeName = doiEmployeeName;
		this.referenceNo = referenceNo;
		this.referenceDate = referenceDate;
		this.activeStatus = activeStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.createdByPost = createdByPost;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.updatedByPost = updatedByPost;
	}

	public long getInwardId() {
		return inwardId;
	}

	public void setInwardId(long inwardId) {
		this.inwardId = inwardId;
	}

	public long getInwardNo() {
		return inwardNo;
	}

	public void setInwardNo(long inwardNo) {
		this.inwardNo = inwardNo;
	}

	public LocalDate getInwardDate() {
		return inwardDate;
	}

	public void setInwardDate(LocalDate inwardDate) {
		this.inwardDate = inwardDate;
	}

	public long getLetterTypeId() {
		return letterTypeId;
	}

	public void setLetterTypeId(long letterTypeId) {
		this.letterTypeId = letterTypeId;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getLetterNo() {
		return letterNo;
	}

	public void setLetterNo(String letterNo) {
		this.letterNo = letterNo;
	}

	public LocalDate getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(LocalDate letterDate) {
		this.letterDate = letterDate;
	}

	public String getLetterDetails() {
		return letterDetails;
	}

	public void setLetterDetails(String letterDetails) {
		this.letterDetails = letterDetails;
	}

	public String getFromWhereDetails() {
		return fromWhereDetails;
	}

	public void setFromWhereDetails(String fromWhereDetails) {
		this.fromWhereDetails = fromWhereDetails;
	}

	public long getDoiBranchId() {
		return doiBranchId;
	}

	public void setDoiBranchId(long doiBranchId) {
		this.doiBranchId = doiBranchId;
	}

	public long getDoiEmployeeId() {
		return doiEmployeeId;
	}

	public void setDoiEmployeeId(long doiEmployeeId) {
		this.doiEmployeeId = doiEmployeeId;
	}

	public String getDoiEmployeeName() {
		return doiEmployeeName;
	}

	public void setDoiEmployeeName(String doiEmployeeName) {
		this.doiEmployeeName = doiEmployeeName;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public LocalDateTime getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(LocalDateTime referenceDate) {
		this.referenceDate = referenceDate;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getCreatedByPost() {
		return createdByPost;
	}

	public void setCreatedByPost(long createdByPost) {
		this.createdByPost = createdByPost;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getUpdatedByPost() {
		return updatedByPost;
	}

	public void setUpdatedByPost(long updatedByPost) {
		this.updatedByPost = updatedByPost;
	}

}
