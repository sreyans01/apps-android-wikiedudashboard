package com.codenicely.services.feelbazaar.vendorapp.helper;

import com.codenicely.services.feelbazaar.vendorapp.course_detail.data.CourseDetailResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WikiEduDashboardApi {

    @GET
    Call<CourseDetailResponse> getCourseDetail(@Url String url);

}