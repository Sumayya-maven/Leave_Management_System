package com.jkt.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "leaves") 
public class Leaves {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	

	private Leaves_Type type;
	
	@NotEmpty(message = "please provide reason for leave")
	private String reason;
	
	
	@NotNull(message = "please provide start date")
	private Date fromDate;
	
	
	@NotNull(message = "please provide end date")
	private Date toDate;
	
	private int duration;
	
	private boolean acceptRejectFlag;
	
	private boolean active;
	
	public Leaves(int id, Leaves_Type type, @NotEmpty(message = "please provide reason for leave") String reason,
			@NotNull(message = "please provide start date") Date fromDate,
			@NotNull(message = "please provide end date") Date toDate, int duration, boolean acceptRejectFlag,
			boolean active) {
		super();
		this.id = id;
		this.type = type;
		this.reason = reason;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.duration = duration;
		this.acceptRejectFlag = acceptRejectFlag;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Leaves_Type getType() {
		return type;
	}

	public void setType(Leaves_Type type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isAcceptRejectFlag() {
		return acceptRejectFlag;
	}


	public void setAcceptRejectFlag(boolean acceptRejectFlag) {
		this.acceptRejectFlag = acceptRejectFlag;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}




	@Override
	public String toString() {
		return "Leaves [id=" + id + ", type=" + type + ", reason=" + reason + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", duration=" + duration + ", acceptRejectFlag=" + acceptRejectFlag + ", active=" + active
				+ "]";
	}

	
}
