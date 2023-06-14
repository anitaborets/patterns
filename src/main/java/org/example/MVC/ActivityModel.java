package org.example.MVC;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "activity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityModel {
    @Id
    private Long id;

    @NotNull
    private String name;

    @Nullable
    @Column(name = "status_code")
    private String statusCode;

    @Nullable
    @Column(name = "priority_code")
    private String priorityCode;

    @Nullable
    @Column(name = "type_code")
    private String typeCode;

}