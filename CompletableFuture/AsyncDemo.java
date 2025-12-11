package CompletableFuture;
import java.util.concurrent.CompletableFuture;


public class AsyncDemo {

    public static void main(String[] args) throws Exception {

        CompletableFuture<String> weather =
                CompletableFuture.supplyAsync(() -> load("Weather", 2000));

        CompletableFuture<String> news =
                CompletableFuture.supplyAsync(() -> load("News", 1500));

        CompletableFuture<String> stocks =
                CompletableFuture.supplyAsync(() -> load("Stocks", 1000));

        CompletableFuture.allOf(weather, news, stocks).join();

        System.out.println(weather.get());
        System.out.println(news.get());
        System.out.println(stocks.get());
    }

    static String load(String name, int delay) {
        try { Thread.sleep(delay); } catch(Exception e){}
        return name + " Loaded by " + Thread.currentThread().getName();
    }
}
