function handleDrop(event, ui) {
    $(event.target).addClass("ui-state-highlight").
            find("p").html("Dropped!");
}