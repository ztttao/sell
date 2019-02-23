package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

//类目表
@Entity
@DynamicUpdate  //时间动态更新
@Data   //getter setter自动更新
public class ProductCategory {

    @Id   //主键
    @GeneratedValue //自增
    private Integer categoryId; //类目id

    private String categoryName;  //类目名字
    private Integer categoryType;  //类目编号

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
