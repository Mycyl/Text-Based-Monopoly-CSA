public class property {

    private String[] names;
    private int[] costs;

    private int cost;
    private int type;
    private int payment;
    private String name;

    public property (int propertyNumber) {
        type = (int) (Math.random() * 10); // ten different property costs
        costs = new int[]{250, 300, 320, 450, 500, 520, 560, 570, 650, 700} // 1000 for the last property
        names = new String[]{"Jouble Sreet/Mr. Meow Avenue", // 1
                             "Mr. Miller Road/Hips lie Avenue" // 2
                             ""
                            }
        cost = costs.indexOf(type);
        // 19 properties to win

    }

    private decideCost () {
        
    }


}