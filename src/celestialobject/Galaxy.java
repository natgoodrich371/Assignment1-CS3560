package src.celestialobject;

public class Galaxy {

    private int starCount;
    private float diameter;
    private String type;
    private float massToLightRatio;

    public int getStarCount(){
        return starCount;
    }
    
    public void setStarCount(int starCount){
        this.starCount = starCount;
    }

    public float getDiameter(){
        return diameter;}
    }

    public void setDiameter(float diameter){
        this.diameter = diameter;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public float getMassToLightRatio(){
        return massToLightRatio;
    }

    public void setMassToLightRatio(float massToLightRatio){
        this.massToLightRatio = massToLightRatio;
    }

    public void merge(Galaxy galaxy){
        
    }
}
