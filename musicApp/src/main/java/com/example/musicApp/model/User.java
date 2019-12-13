package com.example.musicApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @NumberFormat
    private int track_id;
    @NotEmpty
    //@Size(min=10,max=25)
    @Pattern(regexp="^([a-zA-Z])+$",
            message="Name  is invalid")
    private String  track_Name;

    @Pattern(regexp="^([0-9])+$",
            message="Mobile number is invalid")
    private String phoneNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    @Size(min=10,max=25)
    @Pattern(regexp="^\\(?(\\d{2})\\)?[- ]?(\\d{3})[- ]?(\\d{4})+$",
            message="comment is invalid")
    private String track_comments;
    @NotEmpty
    private String personalId;


}
