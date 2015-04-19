package org.primefaces.cookbook.controller;

import org.primefaces.cookbook.model.BookTreeNode;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;

/**
 * BookBean
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@SessionScoped
public class BookBean implements Serializable {

    private static final long serialVersionUID = 20141005L;

    private static final String NODE_TYPE = "chapteritem";

    private TreeNode root;

    private TreeNode selectedNode;

    public BookBean() {
        root = new DefaultTreeNode("Root", null);

        TreeNode chapter1 = new DefaultTreeNode(new BookTreeNode("Getting Started with PrimeFaces", null), root);
        TreeNode chapter2 = new DefaultTreeNode(new BookTreeNode("Theming Concept", null), root);
        TreeNode chapter3 = new DefaultTreeNode(new BookTreeNode("Enhanced Inputs and Selects", null), root);
        TreeNode chapter4 = new DefaultTreeNode(new BookTreeNode("Grouping Content with Panels", null), root);
        TreeNode chapter5 = new DefaultTreeNode(new BookTreeNode("Data Iteration Components", null), root);
        TreeNode chapter6 = new DefaultTreeNode(new BookTreeNode("Endless Menu Variations", null), root);
        TreeNode chapter7 = new DefaultTreeNode(new BookTreeNode("Working with Files, Images and Multimedia", null), root);
        TreeNode chapter8 = new DefaultTreeNode(new BookTreeNode("Drag Me, Drop Me", null), root);
        TreeNode chapter9 = new DefaultTreeNode(new BookTreeNode("Creating Charts and Maps", null), root);
        TreeNode chapter10 = new DefaultTreeNode(new BookTreeNode("Client Side Validation", null), root);
        TreeNode chapter11 = new DefaultTreeNode(new BookTreeNode("Miscellaneous, Advanced Use Cases", null), root);

        constructChapter1(chapter1);
        constructChapter2(chapter2);
        constructChapter3(chapter3);
        constructChapter4(chapter4);
        constructChapter5(chapter5);
        constructChapter6(chapter6);
        constructChapter7(chapter7);
        constructChapter8(chapter8);
        constructChapter9(chapter9);
        constructChapter10(chapter10);
        constructChapter11(chapter11);
    }

    private void constructChapter1(TreeNode chapter1) {
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Your first page with PrimeFaces Component", "chapter1/yourFirstPage.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Internationalization of the Faces Messages", "chapter1/internationalization.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic Partial Page Rendering", "chapter1/basicPPR.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Update Component in Different Naming Container",
                        "chapter1/componentInDifferentNamingContainer.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Partial Processing", "chapter1/partialProcessing.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("PrimeFaces Selectors", "chapter1/pfs.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Processing with Fragment", "chapter1/fragment.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Partial View Submit", "chapter1/partialSubmit.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Localization of Calendar Component", "chapter1/localization.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Right to left language support", "chapter1/rightToLeft.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Localization with Resources", "chapter1/localizationWithResources.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Improved Resource Ordering", "chapter1/resourceOrdering.xhtml"), chapter1);
    }

    private void constructChapter2(TreeNode chapter2) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Customizing default theme styles", "chapter2/customThemeStyles.xhtml"),
                chapter2);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Customizing default styles on input components", "chapter2/customInputStyles.xhtml"),
                chapter2);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Stateless theme switcher", "chapter2/statelessThemeSwitcher.xhtml"),
                chapter2);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Stateful theme switcher", "chapter2/statefulThemeSwitcher.xhtml"), chapter2);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Font Awesome", "chapter2/fontAwesome.xhtml"), chapter2);
    }

    private void constructChapter3(TreeNode chapter3) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Formatted input with InputMask", "chapter3/inputMask.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Auto Suggestion with AutoComplete", "chapter3/autoComplete.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Usable Features of InputTextArea", "chapter3/inputTextArea.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("SelectBooleanCheckbox and SelectManyCheckbox",
                        "chapter3/selectBooleanCheckboxSelectManyCheckbox.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Choosing single item with selectOneMenu",
                        "chapter3/selectOneMenu.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Basic and Advanced Calendar Scenarios", "chapter3/calendar.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Spinner - Different ways to provide input", "chapter3/spinner.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Slider - Different ways to provide input", "chapter3/slider.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Rich Text Editing with the Editor", "chapter3/editor.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Advanced Editing with in-place Editor", "chapter3/inPlaceEditor.xhtml"), chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Enhanced Password Input", "chapter3/password.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Star Based Rating Input", "chapter3/rating.xhtml"), chapter3);
    }

    private void constructChapter4(TreeNode chapter4) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Grouping content with Standard Panel", "chapter4/panel.xhtml"),
                chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Panel Grid with colspan and rowspan support", "chapter4/panelGrid.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Vertical Stacked Panels with Accordion", "chapter4/accordionPanel.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Displaying overflowed content with ScrollPanel", "chapter4/scrollPanel.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Working with Tabbed Panel", "chapter4/tabView.xhtml"),
                chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Grouping Buttons and More with Toolbar", "chapter4/toolbar.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Multi purpose outputPanel", "chapter4/outputPanel.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Simulating Portal Environment with Dashboard", "chapter4/dashboard.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Full Page Layout", "chapter4/fullPageLayout.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Element Layout with AJAX Listeners", "chapter4/elementLayout.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Nested layout / layout in layout", "chapter4/nestedLayout.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Responsive layout with Grid CSS", "chapter4/gridCSS.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Responsive layout with Grid CSS / Nested", "chapter4/gridCSSNested.xhtml"), chapter4);
    }

    private void constructChapter5(TreeNode chapter5) {
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Selecting rows in DataTable", "chapter5/dataTableSelectRow.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Sorting and Filtering data in DataTable", "chapter5/dataTableSortFilter.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("In-cell editing with DataTable", "chapter5/dataTableInCellEdit.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Resizing, Reordering and Toggling of columns in dataTable", "chapter5/dataTableResizeReorderToggle.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Making dataTable Responsive", "chapter5/responsiveDataTable.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Using subTable for grouping", "chapter5/subTable.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Handling tons of data - LazyDataModel", "chapter5/dataTableLazyDataModel.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Listing data with DataList", "chapter5/dataList.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Listing data with PickList", "chapter5/pickList.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Listing data with OrderList", "chapter5/orderList.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Visualizing data with Tree", "chapter5/tree.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Visualizing data with TreeTable", "chapter5/treeTable.xhtml"),
                chapter5);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Exporting data in various formats", "chapter5/dataExport.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Managing events with schedule by leveraging lazy loading", "chapter5/scheduleLazyLoad.xhtml"), chapter5);

        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Visualizing data with Data Scroller", "chapter5/dataScroller.xhtml"), chapter5);
    }

    private void constructChapter6(TreeNode chapter6) {
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Creating programmatic menu", "chapter6/programmaticMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Context menu with nested items", "chapter6/contextMenu.xhtml"),
                chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Context menu integration", "chapter6/contextMenuIntegration.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Breadcrumb - contextual information about page hierarchy",
                        "chapter6/breadcrumb.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Slide Menu - menu in iPod style", "chapter6/slideMenu.xhtml"),
                chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Tiered Menu - submenus in nested overlays", "chapter6/tieredMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Mega Menu - multi-column menu", "chapter6/megaMenu.xhtml"),
                chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("PanelMenu - hybrid of accordion and tree", "chapter6/panelMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("MenuButton - multiple items in popup", "chapter6/menuButton.xhtml"),
                chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Accessing commands via Menubar", "chapter6/menubar.xhtml"),
                chapter6);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Displaying checkboxes in overlay menu", "chapter6/checkboxMenu.xhtml"), chapter6);
    }

    private void constructChapter7(TreeNode chapter7) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic File Upload", "chapter7/fileUpload.xhtml"),
                chapter7);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Multiple File Upload", "chapter7/fileUploadMultiple.xhtml"),
                chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Filtering File Types for File Upload", "chapter7/fileUploadFiltering.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Limiting File Size for File Upload", "chapter7/fileUploadSizeLimit.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Client Side Callback for File Upload", "chapter7/fileUploadCallback.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Uploading File with Drag & Drop", "chapter7/fileUploadDND.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Multiple advanced file uploads in one form", "chapter7/multipleFileUploadInOneForm.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Downloading Files", "chapter7/fileDownload.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Cropping Images", "chapter7/cropImage.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Creating dynamic image streaming programmatically", "chapter7/dynaImage.xhtml"),
                chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Displaying Collection of Images with Galleria", "chapter7/galleria.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Displaying Collection of Images with Image Switch", "chapter7/imageSwitch.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Displaying collection of images with Content Flow", "chapter7/contentFlow.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Embedding multimedia content in JSF pages", "chapter7/media.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Capturing Images with PhotoCam", "chapter7/captureImage.xhtml"), chapter7);
    }

    private void constructChapter8(TreeNode chapter8) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Making component Draggable", "chapter8/draggable.xhtml"),
                chapter8);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Restricting dragging by axis, grid and containment", "chapter8/advancedDraggable.xhtml"),
                chapter8);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Snapping to edges of near elements", "chapter8/snapping.xhtml"), chapter8);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Defining droppable targets", "chapter8/droppable.xhtml"),
                chapter8);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Restricting dropping by tolerance and acceptance", "chapter8/advancedDroppable.xhtml"),
                chapter8);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("AJAX enhanced drag & drop", "chapter8/ajaxDragDrop.xhtml"),
                chapter8);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Integrating drag & drop with data iteration components",
                        "chapter8/dragDropIntegration.xhtml"), chapter8);
    }

    private void constructChapter9(TreeNode chapter9) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Creating a line, area, bar and pie chart", "chapter9/chart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Creating combined chart", "chapter9/combinedChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Updating live data in charts with polling", "chapter9/pollingChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Interacting with charts via AJAX", "chapter9/chartInteraction.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic Mapping with GMaps", "chapter9/map.xhtml"),
                chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Adding, Selecting and Dragging Markers in Maps", "chapter9/mapMarkers.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Creating Rectangles, Circles, Polylines and Polygons in Maps", "chapter9/mapDrawings.xhtml"),
                chapter9);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Enabling InfoView and Street View on Maps", "chapter9/mapInfoView.xhtml"), chapter9);
    }

    private void constructChapter10(TreeNode chapter10) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic validation", "chapter10/basicCsv.xhtml"),
                chapter10);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Instant validation", "chapter10/instantCsv.xhtml"),
                chapter10);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Bean validation", "chapter10/bvCsv.xhtml"),
                chapter10);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Extending CSV with JSF", "chapter10/extendJsfCsv.xhtml"),
                chapter10);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Extending CSV with Bean Validation", "chapter10/extendBvCsv.xhtml"),
                chapter10);
    }

    private void constructChapter11(TreeNode chapter11) {
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Programmatic updating and scrolling with RequestContext",
                        "chapter11/requestContext.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Two ways to trigger JavaScript execution on server side",
                        "chapter11/javaScriptExec.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Adding AJAX callbacks parameters - validation within dialog",
                        "chapter11/ajaxCallbacks.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Opening external pages in dynamically generated dialog",
                        "chapter11/dialogFramework.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Polling - sending of periodical AJAX requests", "chapter11/polling.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Blocking page pieces during long-running AJAX calls", "chapter11/blockUI.xhtml"),
                chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Controlling form submitting by DefaultCommand", "chapter11/defaultCommand.xhtml"),
                chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Clever focus management in forms", "chapter11/focusManagement.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Layout pitfalls with menus and dialogs", "chapter11/layoutPitfalls.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Targetable messages with severity levels", "chapter11/targetableMessages.xhtml"),
                chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Conditional coloring in DataTable", "chapter11/dataTableColoring.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Sticking component when scrolling", "chapter11/sticking.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Reducing page load time by content caching", "chapter11/caching.xhtml"), chapter11);
        new DefaultTreeNode(NODE_TYPE,
                new BookTreeNode("Possibilities for exception handling", "chapter11/exceptionHandling.xhtml"), chapter11);
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        if (root == event.getTreeNode().getParent()) {
            return;
        }

        for (TreeNode treeNode : root.getChildren()) {
            if (treeNode.equals(selectedNode.getParent())) {
                treeNode.setExpanded(true);
            } else {
                treeNode.setExpanded(false);
            }
        }

        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getApplication().getNavigationHandler().handleNavigation(fc, "null",
                "/views/" + ((BookTreeNode) event.getTreeNode().getData()).getView() + "?faces-redirect=true");
    }
}
