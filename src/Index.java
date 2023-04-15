import f1.*;
class Index extends Asd{
    public static void main(String args[]){
        int x=10;
        try{
            int ans=x/0;
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println("Error! cant divide by zero ");
        }
    }

}
