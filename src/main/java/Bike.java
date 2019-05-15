public class Bike {

    String condition = "working";

    public String getCondition() {
        return condition;
    }

    private void setCondition(String condition) {
        this.condition = condition;
    }

    public void isBroken() {
        this.setCondition("broken");
    }

}
