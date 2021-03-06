package com.github.biancacristina.Forum.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class TopicDTO {

    private Integer id;

    @NotEmpty
    @NotNull
    @Length(min=5, max= 80, message= "Deve ter entre 5 e 80 caracteres.")
    private String title;

    @NotNull
    @NotEmpty
    private String text;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private LocalDateTime date;

    public TopicDTO() {
        this.date = LocalDateTime.now();
    }

    public TopicDTO(Integer id, String title, String text, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.date = date;

        if (date == null) {
            this.date = LocalDateTime.now();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
