public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){

    }
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public void swim(){
        System.out.println("swimming");
    }
    @Override
    public String toString(){
        return super.toString() +",Habitat:" + habitat;


    }
}
