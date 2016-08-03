
package org.openmrs.mobile.models.retrofit;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "encountertype")
public class EncounterType extends Model implements Serializable {

    @Column(name = "uuid")
    @SerializedName("uuid")
    @Expose
    private String uuid;

    @Column(name = "display")
    @SerializedName("display")
    @Expose
    private String display;

    @Column(name = "links")
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();

    public EncounterType()
    {
        super();
    }

    /**
     *
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     *
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     *
     * @return
     *     The display
     */
    public String getDisplay() {
        return display;
    }

    /**
     *
     * @param display
     *     The display
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     *
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     *
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }


}
