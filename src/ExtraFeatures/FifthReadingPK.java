/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraFeatures;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Abdullah Sajid
 */
@Embeddable
public class FifthReadingPK implements Serializable {

    public FifthReadingPK() {
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FifthReadingPK)) {
            return false;
        }
        FifthReadingPK other = (FifthReadingPK) object;
        return true;
    }

    @Override
    public String toString() {
        return (ERROR);
    }
    
}
