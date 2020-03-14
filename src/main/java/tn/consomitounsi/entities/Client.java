package tn.consomitounsi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Client extends User implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	private int workload;
	private int cin;
	
//	@OneToOne
//	private Bill bill;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Command> commands;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Comment> comments;
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Subject> subjets;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int workload, int cin) //Bill bill, List<Command> commands, List<Comment> comments,
			//List<Subject> subjets) 
			{
		super();
		this.workload = workload;
		this.cin = cin;
//		this.bill = bill;
//		this.commands = commands;
//		this.comments = comments;
//		this.subjets = subjets;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

//	public Bill getBill() {
//		return bill;
//	}
//
//	public void setBill(Bill bill) {
//		this.bill = bill;
//	}
//
//	public List<Command> getCommands() {
//		return commands;
//	}
//
//	public void setCommands(List<Command> commands) {
//		this.commands = commands;
//	}
//
//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
//
//	public List<Subject> getSubjets() {
//		return subjets;
//	}
//
//	public void setSubjets(List<Subject> subjets) {
//		this.subjets = subjets;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Client [workload=" + workload + ", cin=" + cin + //", bill=" + bill + ", commands=" + commands
//				+ ", comments=" + comments + ", subjets=" + subjets + 
		"]";
	}
	
	
	
	

}
