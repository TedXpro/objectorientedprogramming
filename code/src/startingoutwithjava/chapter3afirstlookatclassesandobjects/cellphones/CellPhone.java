package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.cellphones;
/**
 * Cell phone class declaratoin.
 */
public class CellPhone
{
    private String make;
    private String model;
    private String retailPrice;

    /**
     * The Constructor initializes the attributes.
     * @param m holds the make.
     * @param mod holds the model of the cellphones.
     * @param retPrice holds the retial price of the phones.
     */
    public CellPhone(String m, String mod, String retPrice)
    {
        make = m;
        model = mod;
        retailPrice = retPrice;
    }

    /**
     * The getMake method returns the make of the cellphone.
     * @return make.
     */
    public String getMake()
    {
        return make;
    }

    /**
     * The getModel Method returns the model of the cellphones.
     * @return model.
     */
    public String getModel()
    {
        return model;
    }

    public String getRetailPrice()
    {
        return retailPrice;
    }
}