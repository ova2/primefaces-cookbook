package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.primefaces.model.map.Polygon;
import org.primefaces.model.map.Polyline;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/10/12
 */
@Named
@ViewScoped
public class MapController implements Serializable {
                           
    private MapModel markerModel = new DefaultMapModel();
    private MapModel polylineModel = new DefaultMapModel();
    private MapModel polygonModel = new DefaultMapModel();
    private MapModel circleModel = new DefaultMapModel();

    private Marker selectedMarker;

    public MapController() {
        markerModel.addOverlay(new Marker(new LatLng(41.073399, 29.051971), "Bosphorus", "bosphorus.jpg"));
        markerModel.addOverlay(new Marker(new LatLng(41.118418, 29.134026), "Bosphorus", "bosphorus.jpg"));

        Polyline polyline = new Polyline();
        polyline.getPaths().add(new LatLng(41.073399, 29.051971));
        polyline.getPaths().add(new LatLng(41.118418, 29.134026));
        polyline.getPaths().add(new LatLng(41.027807, 29.049973));
        polylineModel.addOverlay(polyline);

        Polygon polygon = new Polygon();
        polygon.getPaths().add(new LatLng(41.073399, 29.051971));
        polygon.getPaths().add(new LatLng(41.118418, 29.134026));
        polygon.getPaths().add(new LatLng(41.027807, 29.049973));
        polygonModel.addOverlay(polygon);

        Circle circle = new Circle(new LatLng(41.073399, 29.051971), 5000);
        circleModel.addOverlay(circle);
    }

    public void onMarkerSelect(OverlaySelectEvent event) {
        Marker selectedMarker = (Marker) event.getOverlay();
        MessageUtil.addInfoMessageWithoutKey(selectedMarker.getTitle(), selectedMarker.getLatlng().toString());
    }

    public void selectMarker(OverlaySelectEvent event) {
        selectedMarker = (Marker) event.getOverlay();
    }

    public MapModel getMarkerModel() {
        return markerModel;
    }

    public MapModel getPolylineModel() {
        return polylineModel;
    }

    public MapModel getPolygonModel() {
        return polygonModel;
    }

    public MapModel getCircleModel() {
        return circleModel;
    }

    public Marker getSelectedMarker() {
        return selectedMarker;
    }
}