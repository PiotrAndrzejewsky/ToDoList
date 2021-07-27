package com.andrzejewski.todolist;

import javax.persistence.*;

@Entity
@Table(name = "string")
public class StringEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long mStringId;

    private String mStringText;

    public StringEntity() {
    }

    public StringEntity(Long stringId, String stringText) {
        this.mStringId = stringId;
        this.mStringText = stringText;
    }

    public StringEntity(String stringText) {
        this.mStringText = stringText;
    }

    public Long getStringId() {
        return mStringId;
    }

    public void setStringId(Long stringId) {
        this.mStringId = stringId;
    }

    public String getStringText() {
        return mStringText;
    }

    public void setStringText(String stringText) {
        this.mStringText = stringText;
    }

    @Override
    public String toString() {
        return "StringEntity{" +
                "id=" + mStringId + '\'' +
                ", text='" + mStringText + '\'' +
                '}';
    }
}
