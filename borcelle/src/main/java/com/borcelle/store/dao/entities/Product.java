package com.borcelle.store.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String _id;

    private String pid;
    private String title;
    private String vendor;
    private String category;
    @Field("image_srcs")
    private List<String> imageSrc;
    private List<List<String>> sizes;
}
