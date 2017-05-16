package project.nutricoach;

//import org.json.JSONException;
import org.json.JSONObject;
import java.io.UnsupportedEncodingException;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.model.CompactRecipe;
import com.fatsecret.platform.model.Food;
import com.fatsecret.platform.model.Recipe;
import com.fatsecret.platform.services.Response;
import com.fatsecret.platform.services.android.Request;
import com.fatsecret.platform.services.android.ResponseListener;

import org.json.JSONException;
import android.util.Log;
/**
 * Created by Katy on 5/15/17.
 */

public class NutriResponse {
    FatSecretAPI api;
    public NutriResponse(){
        String key = "8a87c3522c2c4298a57ad80a4a24354c";
        String secret = "6561cc4a8711477fbc696bd1dcfea90f";
        api = new FatSecretAPI(key, secret);

    }
    public String createResponse(String input) throws UnsupportedEncodingException, JSONException {
        Log.d("HELLO", api.getFoodItems(input).toString(2));
        return api.getFoodItems(input).toString(2);

    }
}
