package backend.model.po;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Table(name = "dataset", schema = "GraduationProject5")
public class Dataset {

    @Id
    @Column(name = "dataset_id")
    private Long datasetID;

    @Basic
    @Type( type = "json" )
    @Column(name = "data_json",columnDefinition = "json")
    private Map<String,Object> dataStr ;

    @Basic
    @Column(name = "user_id")
    private Long userID;

    @Basic
    @Column(name = "experiment_id")
    private Long experimentID;

    @Basic
    @Column(name = "node_id")
    private Long nodeID;


}
