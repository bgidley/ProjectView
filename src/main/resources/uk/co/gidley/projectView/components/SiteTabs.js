Tapestry.Initializer.initialiseSiteTabs = function(clientId) {
    $(clientId).frames = new Array();

    $(clientId).addFrame = function (frameId, refresh) {
        $(clientId).frames.push(frameId);
        frameId.isRefresh = refresh;
    };


};

Tapestry.Initializer.rotateSiteTabs = function(clientId) {
    var tabs = $(clientId);
    var framesList = tabs.frames;

    if (framesList.length > 0) {
        new PeriodicalExecuter(function(pe) {
            switchTab(clientId);
        }, 30);
        showFrame(clientId, 0);
    }


}

function showFrame(clientId, offset) {
    var tabs = $(clientId);
    var framesList = tabs.frames;

    if (tabs.currentTab != null){
        framesList[tabs.currentTab].hide();
    }


    var nextFrame = framesList[offset];
    if (nextFrame.isRefresh){
        nextFrame.src = nextFrame.src;
    }
    nextFrame.setStyle({height : document.viewport.getHeight()});
    nextFrame.show();
    tabs.currentTab = offset;
}

function switchTab(clientId) {

    var tabs = $(clientId);
    var framesList = tabs.frames;


    if (tabs.currentTab != null) {
        offset = tabs.currentTab + 1;
        if (offset < framesList.length) {
            showFrame(clientId, offset);
        } else {
            showFrame(clientId, 0);
        }

    } else {
        // First Time
        if (framesList.length > 0) {
            showFrame(clientId, 0);
        }
    }
}

