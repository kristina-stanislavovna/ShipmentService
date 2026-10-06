public enum DeliveryResponceType {
    FAIL("FAIL", 404),
    SUCCESS("SUCCESS", 800);

    private String name;
    private int code;

    DeliveryResponceType(String name, int code) {
        this.name = name;
        this.code = code;
    }



}
