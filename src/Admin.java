import java.util.ArrayList;

class Admin extends  User{

    // assigned list of customers and sellers;
//return list of customers and sellers

    private int adminId;
    private Boolean userStatus;
    // returns admins id
    public int getId() {
        return adminId;
    }
   // admin sets id
    public void setId(int adminId) {
        this.adminId = adminId;
    }

    // return user status
    public boolean getUserStatus() {
       return userStatus;
    }
    // set user status
    public void setUserStatus(boolean active) {
       this.userStatus=true;
    }


    @Override
    public void printAvailableUsers() {

    }
}



// Admin will have adminId and assigned list of customers and sellers, also method to suspend seller or customer