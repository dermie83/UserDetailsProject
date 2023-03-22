public class User {

    private String userName;
    private String userAddress;
    private String userDOB;
    private double userHeight;

    /**
     * Constructor for objects of class User
     * @param userName Name of the user
     * @param userAddress Address of the user
     * @param userDOB DOB of the user
     * @param userHeight Height of the user
     */
    public User(String userName, String userAddress, String userDOB, double userHeight)
    {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userDOB = userDOB;
        this.userHeight = userHeight;
    }

    //-------
    //getters
    //-------
    /**
     * Returns the UserName
     */
    public String getUserName(){
        return userName;
    }

    /**
     * Returns the User Address
     */
    public String getUserAddress(){
        return userAddress;
    }

    /**
     * Returns the User DOB
     */
    public String getUserDOB() {
        return userDOB;
    }

    /**
     * Returns the User Height
     */
    public double getUserHeight() {
        return userHeight;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the Username to the parameter
     * @param userName The new UserName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Updates the User Address to the parameter
     * @param userAddress The new User Address
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * Updates the User DOB to the parameter
     * @param userDOB The new User DOB
     */
    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    /**
     * Updates the User Height to the parameter
     * @param userHeight The new User Height
     */
    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    /**
     * Builds a String representing a user-friendly representation of the object state
     * @return Details of the specific user
     */
    public String toString()
    {
        return "UserName: " + userName
                + ", User Address: " + userAddress
                + ", User DOB: " + userDOB
                + ", User Height cm: " + userHeight;
    }

}
