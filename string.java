class Stringtest
{
    public static void main(String[] args){
        String name1="pdeu";
        String name2="pdeu";
        String name3= new String("pdeu");
        
    
        System.out.println("length of "+ name1+"is :"+ name1.length());
        System.out.println("uppercase  "+ name1+"is :"+ name1.toUpperCase());
        System.out.println("lower case "+ name1+"is :"+ name1.toLowerCase());
            name1=name1.concat("CSE");
            System.out.print(name1);


            if(name1== name2)
            System.out.println(name1+"\t"+name2 +"is equal ");
            if(name1 == name3)
            // if(name1.equalsIgnoreCase(name3))//this will show that name1 is eqaul to 3 
            System.out.println(name1+"\t"+name3 +"is equal ");//this will shw they are not as they are in different location
            else
            System.out.println(name1 + "\t"+ name2 + "\t" +  "equal");



    }



}