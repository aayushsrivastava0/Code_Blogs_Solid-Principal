package Dependency_IP;

public class Book implements Product{
    @Override

    public void seeReviews() {
        System.out.println("This is the best selling book of the year!");
    }

    @Override
    public void getSample() {
        System.out.println("Do yoy want to  purchase this book? Please visit our store");
    }
}
