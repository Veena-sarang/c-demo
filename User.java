public class User {
    private int userId;
    private String userName;
    private String dateOfBirth;

    public User(int userId, String userName, String dateOfBirth) {
        this.userId = userId;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + userName + ", Date of Birth: " + dateOfBirth;
    }
}
