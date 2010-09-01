Tapestry.Initializer.initialiseSiteTabs = function(clientId) {
    $(clientId).frames = new Array();

    $(clientId).addFrame = function (frameId) {
        $(clientId).frames.push(frameId);
    };


};