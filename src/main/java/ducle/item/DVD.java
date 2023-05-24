package ducle.item;

public class DVD extends Item {
    public DVD(){
        super();
        this.rentalType.set("DVD");
    }

    public DVD(String id, String title, String loanType, int stock, String fee, String genre) {
        super(id, title, "DVD", loanType, stock, fee, genre);
    }
}
