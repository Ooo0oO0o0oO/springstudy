package Demo18NoTransaction;

public interface AccountDaoI
{

	public abstract void in(String inUser, int money);

	public abstract void out(String outUser, int money);

}