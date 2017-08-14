package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;
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
    @javax.persistence.OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<FrameworkShear> frameworkShears;
    @javax.persistence.OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<FrameworkCore> frameworkCores;
    @javax.persistence.OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<ShearWall> shearWalls;


    public ApplicationTechnology() {
        super();
    }


    public List<FrameworkShear> getFrameworkShears() {
        return frameworkShears;
    }

    public void setFrameworkShears(List<FrameworkShear> frameworkShears) {
        this.frameworkShears = frameworkShears;
    }

    public List<FrameworkCore> getFrameworkCores() {
        return frameworkCores;
    }

    public void setFrameworkCores(List<FrameworkCore> frameworkCores) {
        this.frameworkCores = frameworkCores;
    }

    public List<ShearWall> getShearWalls() {
        return shearWalls;
    }

    public void setShearWalls(List<ShearWall> shearWalls) {
        this.shearWalls = shearWalls;
    }
}

