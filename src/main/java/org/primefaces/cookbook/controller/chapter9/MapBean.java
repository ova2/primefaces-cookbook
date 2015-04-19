package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.map.MarkerDragEvent;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.*;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/10/12
 */
@Named
@ViewScoped
public class MapBean implements Serializable {
                           
    private MapModel markerModel = new DefaultMapModel();
    private MapModel draggableMarkerModel = new DefaultMapModel();
    private MapModel polylineModel = new DefaultMapModel();
    private MapModel polygonModel = new DefaultMapModel();
    private MapModel circleModel = new DefaultMapModel();
    private MapModel rectangleModel = new DefaultMapModel();

    private Marker selectedMarker;

    public MapBean() {
        markerModel.addOverlay(new Marker(new LatLng(41.073399, 29.051971), "Bosphorus", "bosphorus.jpg"));
        markerModel.addOverlay(new Marker(new LatLng(41.118418, 29.134026), "Bosphorus", "bosphorus.jpg"));

        Marker marker1 = new Marker(new LatLng(41.073399, 29.051971), "Bosphorus", "bosphorus.jpg");
        marker1.setDraggable(true);
        draggableMarkerModel.addOverlay(marker1);
        Marker marker2 = new Marker(new LatLng(41.118418, 29.134026), "Bosphorus", "bosphorus.jpg");
        marker2.setDraggable(true);
        draggableMarkerModel.addOverlay(marker2);

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

        rectangleModel.addOverlay(new Rectangle(new LatLngBounds(new LatLng(41.073399, 29.051971), new LatLng(41.118418, 29.134026))));

    }

    public void onMarkerSelect(OverlaySelectEvent event) {
        Marker selectedMarker = (Marker) event.getOverlay();
        MessageUtil.addInfoMessageWithoutKey(selectedMarker.getTitle(), selectedMarker.getLatlng().toString());
    }

    public void onMarkerDrag(MarkerDragEvent event) {
        MessageUtil.addInfoMessage("marker.dragged", event.getMarker().getLatlng().toString());
    }


    public void selectMarker(OverlaySelectEvent event) {
        selectedMarker = (Marker) event.getOverlay();
    }

    public MapModel getMarkerModel() {
        return markerModel;
    }

    public MapModel getDraggableMarkerModel() {
        return draggableMarkerModel;
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

    public MapModel getRectangleModel() {
        return rectangleModel;
    }

    public Marker getSelectedMarker() {
        return selectedMarker;
    }
}