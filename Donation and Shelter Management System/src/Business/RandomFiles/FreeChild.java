/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

/**
 *
 * @author Utkarsh
 */
public class FreeChild {

    private boolean adoptionFoster;
    private boolean adoptionFamily;
    private boolean physicalhandicap;
    private ParentFreeChild parentFreeChild;
    private boolean workOpportunity;
    private String reason;

    public boolean isAdoptionFoster() {
        return adoptionFoster;
    }

    public void setAdoptionFoster(boolean adoptionFoster) {
        this.adoptionFoster = adoptionFoster;
    }

    public boolean isAdoptionFamily() {
        return adoptionFamily;
    }

    public void setAdoptionFamily(boolean adoptionFamily) {
        this.adoptionFamily = adoptionFamily;
    }

    public boolean isPhysicalhandicap() {
        return physicalhandicap;
    }

    public void setPhysicalhandicap(boolean physicalhandicap) {
        this.physicalhandicap = physicalhandicap;
    }

    public ParentFreeChild getParentFreeChild() {
        return parentFreeChild;
    }

    public void setParentFreeChild(ParentFreeChild parentFreeChild) {
        this.parentFreeChild = parentFreeChild;
    }

    public boolean isWorkOpportunity() {
        return workOpportunity;
    }

    public void setWorkOpportunity(boolean workOpportunity) {
        this.workOpportunity = workOpportunity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "FreeChild{" + "adoptionFoster=" + adoptionFoster + ", adoptionFamily=" + adoptionFamily + ", physicalhandicap=" + physicalhandicap + ", parentFreeChild=" + parentFreeChild + ", workOpportunity=" + workOpportunity + ", reason=" + reason + '}';
    }

}
