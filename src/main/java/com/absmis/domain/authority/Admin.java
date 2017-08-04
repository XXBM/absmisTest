package com.absmis.domain.authority;


import javax.persistence.DiscriminatorValue;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
@DiscriminatorValue("Admin")
public class Admin extends User {

    public Admin() {
        super();
    }

}

