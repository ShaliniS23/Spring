package com.skct.day3.model;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class AnsModel {
		
		@Id
		private int anum;
		private String ans;
		public int getAnum() {
			return anum;
		}
		public void setAnum(int anum) {
			this.anum = anum;
		}
		public String getAns() {
			return ans;
		}
		public void setAns(String ans) {
			this.ans = ans;
		}
		
		

	}


