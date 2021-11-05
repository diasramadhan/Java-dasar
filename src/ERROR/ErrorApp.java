package ERROR;

public class ErrorApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Terjadi error " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Terjadi error " + e.getMessage());
            e.getMessage();
        }


    }
}
