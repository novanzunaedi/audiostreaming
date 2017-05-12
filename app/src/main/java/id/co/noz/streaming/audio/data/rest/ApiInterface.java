package id.co.noz.streaming.audio.data.rest;

import id.co.noz.streaming.audio.data.model.StreamingRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by CLient-PC on 11/05/2017.
 */

public interface ApiInterface {

    @GET("{stringid}")
    Call<StreamingRequest> getStreaming(@Path("stringid") String stringid);
}
