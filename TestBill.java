abstract class Bill
{
    long no_of_unit;
    int chargeperunit;
    int billid;
    static int fieldcount;
    {
        fieldcount++;
    }
    public Bill()
    {
        this.no_of_unit=0;
        this.chargeperunit=0;
        this.billid=0;

    }
     public Bill(long nou, int cpu,int billid)
    {
        this.no_of_unit=nou;
        this.chargeperunit=cpu;
        this.billid=billid;
        
    }
     public Bill(Bill b)
    {
        this.no_of_unit=b.no_of_unit;
        this.chargeperunit=b.chargeperunit;
        this.billid=b.billid;   
    }
    public long getunit()
    {
        return no_of_unit;
    }
    public int getcharge()
    {
        return chargeperunit;
    }

    public void setunit(long unit)
    {
        no_of_unit=unit;
    }
    public void setcharge(int charge)
    {
        chargeperunit=charge;

    }

    public String tostring()
    {
        return "The bill ID is "+billid+"charge per unit is :"+chargeperunit+"no of unit consumed is"+no_of_unit;
        }
public boolean equals(Object other)
{
    Bill b=(Bill) other;
    return (this.billid==b.billid);

}

abstract long calculatebillamount();

static int totalbillcount()
{
    return fieldcount;

}

}

class Electricitybill extends Bill
{
int fixed_meter=200;

Electricitybill(long u,int charge,int billid)
{
    super(u,charge,billid);
}
public long calculatebillamount()
{
 long  a=chargeperunit*no_of_unit;
 double c=(0.02*a);
 return a+(long)(c+fixed_meter);
}
}
class MilkBill extends Bill
{

    int suppliercharge=102;

    MilkBill(long u,int charge,int billid)
{
    super(u,charge,billid);
}

    public long calculatebillamount()
    {
        return ((chargeperunit*no_of_unit)+suppliercharge);
    }

}

public class TestBill
{
    public static void main(String [] args)
    {
        Bill b1= new Electricitybill(2,564,1010);
       System.out.println(b1.calculatebillamount());
        Bill c1= new MilkBill(3,4,00227);
       System.out.println(c1.calculatebillamount());

       





    }
}
