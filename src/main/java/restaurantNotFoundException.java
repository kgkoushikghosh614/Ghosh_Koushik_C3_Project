public class restaurantNotFoundException extends Throwable {
    public  restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
      // return "No such resturent found.";


    }
    public String ResturentNotFoundExceptionMessage()
    {
        return  "No such resturent found.";
    }
}
