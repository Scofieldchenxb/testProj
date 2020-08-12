package java;

public enum BEnum {

    HXRS("hxrs", "华夏接口", "ILongRisk", "huaXiaHeavyDisease"),

    HZRS("hzrs", "合众接口", "ILongRisk", "unionLifeImpl"),

    HXJK("hxjk", "和谐健康接口", "ILongRisk", "anBangMessgtoolImpl"),

    YIAN("yian", "易安接口", "ILongRisk", "yiAnImpl");

    private String supplierCode;
    private String def;
    private String inf;
    private String impBeanName;

    BEnum(String yian, String 易安接口, String iLongRisk, String yiAnImpl) {
        this.supplierCode = supplierCode;
        this.def = def;
        this.inf = inf;
        this.impBeanName = impBeanName;
    }


    /**
     * @return the supplierCode
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * @return the def
     */
    public String getDef() {
        return def;
    }

    /**
     * @return the inf
     */
    public String getInf() {
        return inf;
    }

    /**
     * @return the impBeanName
     */
    public String getImpBeanName() {
        return impBeanName;
    }

}
