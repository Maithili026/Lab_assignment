//project name: library management system

package com.Entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name="Libtable")
public class library{
		
		public library() {
			super();
			// TODO Auto-generated constructor stub
		}

		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id
		@Column(name="mid")
		private Integer memId;
		
		@Column(name="mName")
		private String memName;
		
		@Column(name="mType")
		private String memtype;
		
		@Column(name="bName")
		private String bookName;
		

		public library(String memName, String memtype, String bookName) {
			super();
			this.memName = memName;
			this.memtype = memtype;
			this.bookName = bookName;
		}


		@Override
		public String toString() {
			return "library [memId=" + memId + ", memName=" + memName + ", memtype=" + memtype + ", bookName="
					+ bookName + "]";
		}
			
		

		
}
	
