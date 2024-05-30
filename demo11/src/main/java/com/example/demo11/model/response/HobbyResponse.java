package com.example.demo11.model.response;

import com.example.demo11.entity.Experience;
import com.example.demo11.entity.Hobby;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HobbyResponse {
    private Integer id;
    private String name;

    public static HobbyResponse fromHobby(Hobby hobby) {
        return HobbyResponse.builder()
                .id(hobby.getId())
                .name(hobby.getName())
                .build();
    }
}
