class Bank{
    int principal;
    int period;
    int rate;
    public int getPrincipal()
    {
        return principal;
    }
    public void setPrincipal(int principal)
    {
        this.principal = principal;
    }
    public int getRate() 
    {
        return rate;
    }
    public void setRate(int rate) 
    {
        this.rate = rate;
    }
    public int getPeriod() 
    {
        return period;
    }
    public void setPeriod(int period) 
    {
        this.period = period;
    }
    int simpleInterest()
    {
        return ((principal*rate*period)/100);
    }
    
}
class SimpleInterest
{
    public static void main(String[] args) 
    {
        Bank obj = new Bank();
        obj.setPrincipal(5000);
        System.out.println("The Principal amount "+ obj.getPrincipal());
        obj.setRate(8);
        System.out.println("The rate of interest is "+ obj.getRate());
        obj.setPeriod(20);
        System.out.println("The period of loan is "+ obj.getPeriod());
        System.out.println("The Simple Interest  is "+ obj.simpleInterest());
    }
}
