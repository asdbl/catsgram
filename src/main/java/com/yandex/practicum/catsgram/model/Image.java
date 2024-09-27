package com.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Image {
    private long id;
    private long postId;
    private String originalFileName;
    private String filePath;
}
