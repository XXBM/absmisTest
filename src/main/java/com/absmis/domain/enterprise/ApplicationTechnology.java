package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     应用建筑产业化技术内容
 *
 * @generated
 */


@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class ApplicationTechnology {
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "applicationTechnology_id")
    private List<Framework> frameworkShears;
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "applicationTechnology_id")
    private List<Framework> frameworkCores;
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "applicationTechnology_id")
    private List<ShearWall> shearWalls;

    public ApplicationTechnology() {
        super();
    }

    public List<Framework> getFrameworkShears() {
        return frameworkShears;
    }

    public void setFrameworkShears(List<Framework> frameworkShears) {
        this.frameworkShears = frameworkShears;
    }

    public List<Framework> getFrameworkCores() {
        return frameworkCores;
    }

    public void setFrameworkCores(List<Framework> frameworkCores) {
        this.frameworkCores = frameworkCores;
    }

    public List<ShearWall> getShearWalls() {
        return shearWalls;
    }

    public void setShearWalls(List<ShearWall> shearWalls) {
        this.shearWalls = shearWalls;
    }
}

