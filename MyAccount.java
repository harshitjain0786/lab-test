public class MyAccount {
		private long acc_no;
		private String name,email;
		private float amount;
		
		private long getAcc_no()
		{
			return acc_no;
		}
		private void setAcc_no(long acc_no)
		{
			this.acc_no =acc_no;
		}
		private String getName()
		{
			return name;
		}
		private void SetName(String name)
		{
			this.name=name;
		}
		private String getEmail()
		{
			return email;
		}
		private void setEmail(String email)
		{
			this.email=email;
		}
		private float getAmount()
		{
			return amount;
		}
		private void setAmount(float amount)
		{
			this.amount=amount;
		}
		public static void main(String[] args) {
		MyAccount myacc=new MyAccount();
		myacc.setAcc_no(22351245);
		myacc.SetName("HARSHIT");
		myacc.setEmail("jainharshit3020@gmail.com");
		myacc.setAmount(46500);
		System.out.println("acc no"+myacc.getAcc_no()+""+"account name:"+myacc.getName()+" \n"+
		"account email:"+myacc.getEmail()+"\n"+"amount in account = "+myacc.getAmount());
		
	}

}