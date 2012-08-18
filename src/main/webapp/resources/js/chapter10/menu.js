
function selectMenuitemLink(link) {
    $("#viewList").find(".ui-state-active").removeClass("ui-state-active");
    $(link).addClass("ui-state-active");
}