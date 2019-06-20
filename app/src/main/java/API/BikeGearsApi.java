package API;

import com.example.bikegears.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BikeGearsApi {
    @GET("users")
    Call<List<User>> getUsers();
}
