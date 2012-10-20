package org.primefaces.cookbook.controller;

import org.primefaces.cookbook.model.BookTreeNode;

import org.primefaces.event.NodeSelectEvent;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 * BookController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@SessionScoped
public class BookController implements Serializable {

    private static final long serialVersionUID = 20121705L;

    private static final String NODE_TYPE = "chapteritem";

    private TreeNode root;

    private TreeNode selectedNode;

    public BookController() {
        root = new DefaultTreeNode("Root", null);

        TreeNode chapter1 = new DefaultTreeNode(new BookTreeNode("Getting Started with PrimeFaces", null), root);
        TreeNode chapter2 = new DefaultTreeNode(new BookTreeNode("Theming Concept", null), root);
        TreeNode chapter3 = new DefaultTreeNode(new BookTreeNode("Enhanced Inputs and Selects", null), root);
        TreeNode chapter4 = new DefaultTreeNode(new BookTreeNode("Grouping Content with Panels", null), root);
        TreeNode chapter5 = new DefaultTreeNode(new BookTreeNode("Data Iteration Components", null), root);
        TreeNode chapter6 = new DefaultTreeNode(new BookTreeNode("Endless Menu Variations", null), root);
        TreeNode chapter7 = new DefaultTreeNode(new BookTreeNode("Working with Files and Images", null), root);
        TreeNode chapter8 = new DefaultTreeNode(new BookTreeNode("Drag Me, Drop Me", null), root);
        TreeNode chapter9 = new DefaultTreeNode(new BookTreeNode("Creating Charts and Maps", null), root);
        TreeNode chapter10 = new DefaultTreeNode(new BookTreeNode("Miscellaneous, Advanced Use Cases", null), root);
        TreeNode chapter11 = new DefaultTreeNode(new BookTreeNode("Writing of Custom Components", null), root);
        TreeNode chapter12 = new DefaultTreeNode(new BookTreeNode("PrimeFaces Extensions in Action", null), root);

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
        constructChapter12(chapter12);
    }

    private void constructChapter1(TreeNode chapter1) {
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Your first page with Primefaces Component", "chapter1/yourFirstPage.xhtml"), chapter1);
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
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Localization of Calendar Component", "chapter1/localization.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Localization with Resources", "chapter1/localizationWithResources.xhtml"), chapter1);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Improved Resource Ordering", "chapter1/resourceOrdering.xhtml"), chapter1);
    }

    private void constructChapter2(TreeNode chapter2) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Customizing theme styles", "chapter2/customThemeStyles.xhtml"),
            chapter2);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Customizing default styles on input components", "chapter2/customInputStyles.xhtml"),
            chapter2);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Default stateless theme switcher (Client-side)", "chapter2/stdThemeSwitcher.xhtml"),
            chapter2);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Stateful theme switcher (AJAX)", "chapter2/altThemeSwitcher1.xhtml"), chapter2);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Stateful theme switcher (Full page refresh)", "chapter2/altThemeSwitcher2.xhtml"),
            chapter2);
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
            new BookTreeNode("Simulating Portal Environment with Dashboard", "chapter4/dashboard.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Full Page Layout", "chapter4/fullPageLayout.xhtml"), chapter4);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Element Layout with AJAX Listeners", "chapter4/elementLayout.xhtml"), chapter4);
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
            new BookTreeNode("Conditional Coloring in DataTable", "chapter5/dataTableColoring.xhtml"), chapter5);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Handling millions of data - LazyDataModel", "chapter5/dataTableLazyDataModel.xhtml"),
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
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Visualizing data with Carousel", "chapter5/carousel.xhtml"),
            chapter5);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Visualizing data with Ring", "chapter5/ring.xhtml"), chapter5);
    }

    private void constructChapter6(TreeNode chapter6) {
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Creating programmatic menu", "chapter6/programmaticMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Context menu with nested items", "chapter6/contextMenu.xhtml"),
            chapter6);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Context menu integration", "chapter6/contextMenuIntergration.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Slide Menu - menu in iPod style", "chapter6/slideMenu.xhtml"),
            chapter6);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Tiered Menu - submenus in nested overlays", "chapter6/tieredMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Mega Menu - multi-column menu", "chapter6/megaMenu.xhtml"),
            chapter6);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("PanelMenu - hybrid of accordion and tree", "chapter6/panelMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Accessing commands via Menubar", "chapter6/menubar.xhtml"),
            chapter6);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Displaying checkboxes in overlay menu", "chapter6/checkboxMenu.xhtml"), chapter6);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Dock menu for Mac OS fans", "chapter6/dockMenu.xhtml"),
            chapter6);
    }

    private void constructChapter7(TreeNode chapter7) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic File Upload", "chapter7/fileUploadBasic.xhtml"),
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
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Downloading Files", "chapter7/fileDownload.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Cropping Images", "chapter7/cropImage.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Displaying Collection of Images", "chapter7/displayImageCollection.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Displaying Collection of Images 2 ", "chapter7/displayImageCollection2.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Capturing Images with PhotoCam", "chapter7/captureImage.xhtml"), chapter7);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Comparing Images", "chapter7/compareImage.xhtml"), chapter7);
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
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Line", "chapter9/lineChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Bar", "chapter9/barChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Pie", "chapter9/pieChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Bubble", "chapter9/bubbleChart.xhtml"),
            chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Donut", "chapter9/donutChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with Meter Gauge", "chapter9/meterGaugeChart.xhtml"),
            chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Charting with OHLC", "chapter9/ohlcChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Live Data updating of charts with polling", "chapter9/pollingChart.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Interacting with charts by AJAX", "chapter9/chartInteraction.xhtml"), chapter9);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Creating dynamic image streaming programmatically", "chapter9/dynaImage.xhtml"),
            chapter9);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Mapping with Google Maps", "chapter9/map.xhtml"), chapter9);
    }

    private void constructChapter10(TreeNode chapter10) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Power of PrimeFaces selectors", "chapter10/pfs.xhtml"),
            chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Programmatic updating and scrolling with RequestContext",
                "chapter10/requestContext.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Two ways to trigger JavaScript execution on server side",
                "chapter10/javaScriptExec.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Adding AJAX callbacks parameters - validation within dialog",
                "chapter10/ajaxCallbacks.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Polling - sending of periodical AJAX requests", "chapter10/polling.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Blocking page pieces during long-running AJAX calls", "chapter10/blockUI.xhtml"),
            chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Remembering current menu selection", "chapter10/rememberMenu.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Controlling form submitting by DefaultCommand", "chapter10/defaultCommand.xhtml"),
            chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Clever focus management in forms", "chapter10/focusManagement.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Layout pitfalls with menus and dialogs", "chapter10/layoutPitfalls.xhtml"), chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Targetable messages with severity levels", "chapter10/targetableMessages.xhtml"),
            chapter10);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Leveraging Schedule lazy loading feature", "chapter10/scheduleLazyLoad.xhtml"), chapter10);
    }

    private void constructChapter11(TreeNode chapter11) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Custom Layout component", "chapter11/customComponent.xhtml"),
            chapter11);
    }

    private void constructChapter12(TreeNode chapter12) {
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Showing error messages in tooltips", "chapter12/messagesTooltips.xhtml"), chapter12);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Rotating and resizing images", "chapter12/rotateResize.xhtml"),
            chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Managing states with TriStateCheckbox, -ManyCheckbox",
                "chapter12/triStateCheckboxes.xhtml"), chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Supporting numeric inputs with InputNumber", "chapter12/inputNumber.xhtml"), chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Creating pleasant editor interface for code-like content", "chapter12/codeMirror.xhtml"),
            chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Calling Java methods with parameters on client-side", "chapter12/remoteCommand.xhtml"),
            chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Building dynamic form described by model", "chapter12/dynaForm.xhtml"), chapter12);
        new DefaultTreeNode(NODE_TYPE,
            new BookTreeNode("Timeline - displaying events in chronological order", "chapter12/timeline.xhtml"),
            chapter12);
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
