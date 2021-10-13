public class StoreList {
    public static void main(String[] args) {
        //苹果笔记本
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        String macConfig = "i5处理器4GB内存128G固态硬盘";
        int macCount = 5;
        //联想笔记本
        String thinkpadBrand = "ThinkpadT450";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5999.99;
        String thinkpadConfig = "i5处理器4GB内存500G硬盘";
        int thinkpadCount = 10;
        //华硕笔记本
        String asusBrand = "ASUS-FL5800";
        double asusSize = 15.6;
        double asusPrice = 4999.5;
        String asusConfig = "i7处理器4GB内存128G固态硬盘";
        int asusCount = 18;
        //表头
        System.out.println("--------------------------------------商城库存清单----------------------------------------");
        System.out.println("品牌型号           尺寸        价格              配置                     库存数");
        //表中
        System.out.println(macBrand+"      "+macSize+"      "+macPrice+"      "+macConfig+"          "+macCount);
        System.out.println(thinkpadBrand+"    "+thinkpadSize+"      "+thinkpadPrice+"      "+thinkpadConfig+"            "+thinkpadCount);
        System.out.println(asusBrand+"     "+asusSize+"      "+asusPrice+"       "+asusConfig+"         "+asusCount);
        System.out.println("---------------------------------------------------------------------------------------");
        //表尾
        int totalCount = macCount+thinkpadCount+asusCount;
        double totalPrice = (macPrice*macCount)+(thinkpadPrice*thinkpadCount)+(asusPrice*asusCount);
        System.out.println("总库存数："+totalCount);
        System.out.println("库存商品总金额："+totalPrice);


    }
}
