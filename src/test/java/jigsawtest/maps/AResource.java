package jigsawtest.maps;

import jigsawtest.BResource;

import java.util.Map;


public class AResource {

    private Map<String, BResource> bmap;

    public AResource() {
        super();
    }

    public Map<String, BResource> getBmap() {
        return bmap;
    }

    public void setBmap(Map<String, BResource> bmap) {
        this.bmap = bmap;
    }

    @Override
    public String toString() {
        return "A [bmap=" + bmap + "]";
    }

}
