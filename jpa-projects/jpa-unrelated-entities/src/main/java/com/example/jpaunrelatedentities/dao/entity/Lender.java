package com.example.jpaunrelatedentities.dao.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity(name = "Lender")
@Table(name = "lender")
public class Lender {

	@Id
	@SequenceGenerator(name = "lender_sequence", sequenceName = "lender_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "lender_sequence")
	@Column(name = "lender_id")
	private Long lender_id;
	private String lenderName;
	private String lenderAddress;

	public Lender(String lenderName, String lenderAddress) {
		super();
		this.lenderName = lenderName;
		this.lenderAddress = lenderAddress;
	}
//	@OneToOne
//	@NotFound(action = NotFoundAction.IGNORE)
//	@JoinColumn(name = "lender_id", referencedColumnName = "customer_id", insertable = false, updatable = false, foreignKey = @javax.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//	private Customer customer;
}
