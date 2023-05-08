package com.skct.day3.model;



	import java.util.List;

	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.OneToMany;

	@Entity

	public class QuesModel {
		
		@Id
		private int qnum;
		private String qname;
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn
		public List<AnsModel> answer;
		public int getQnum() {
			return qnum;
		}
		public void setQnum(int qnum) {
			this.qnum = qnum;
		}
		public String getQname() {
			return qname;
		}
		public void setQname(String qname) {
			this.qname = qname;
		}
	}


