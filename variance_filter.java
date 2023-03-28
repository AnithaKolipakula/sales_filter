import java.util.*;

public class variance_filter{
    public static void main(String args[]){
        List<data> sales2021=new ArrayList<>();
        List<data> sales2022=new ArrayList<>();
        sales2021.add(new data("tea",120));
        sales2021.add(new data("Coffee",230));
        sales2021.add(new data("greentea",60));
        sales2021.add(new data("Orangesoda",210));
        sales2021.add(new data("lemonade",205));

        sales2022.add(new data("tea",100));
        sales2022.add(new data("Coffee",250));
        sales2022.add(new data("greentea",50));
        sales2022.add(new data("Orangesoda",180));
        sales2022.add(new data("lemonade",220));
        
         
        
        //to calculate grandtotal of sales 2002 &2003
        
        int sales2021Total=sales2021.stream().mapToInt(s->s.getvalue()).sum();
        int sales2022Total=sales2022.stream().mapToInt(s->s.getvalue()).sum();
        


        //calculate total sales for only tea products(tea,greentea) in 2021 year-so use filter option
        int salesoftea_2021=sales2021.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();
        //calculate total sales for only tea products(tea,greentea) in 2022 year
        int salesoftea_2022=sales2022.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();

        System.out.println("sum of 2002 sales:"+sales2021Total);
        System.out.println("sum of 2003 sales:"+sales2022Total);
        System.out.println("Sales of tea products in year 2021 :"+salesoftea_2021);
        System.out.println("Sales of tea products in year 2022 :"+salesoftea_2022);



       



    }
}
class data {
    private String product;
    private int value;
    private double varpct;
     public data(String product,int value){
        this.product=product;
        this.value=value;
        

     }
     public data(String product,double varpct){
        this.product=product;
        this.varpct=varpct;
     }
     public int getvalue(){
        return value;

     }
     public String getProduct(){
        return product;
     }
     public String toString(){
        return "{"+this.product+":"+this.value+":"+this.varpct+"}";
     }

    
}
