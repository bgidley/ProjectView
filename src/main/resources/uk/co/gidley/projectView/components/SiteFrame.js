Tapestry.Initializer.initialiseSiteFrame = function(parameter){
    $(parameter['tabsId']).addFrame($(parameter['clientId']));
    var layout = $(parameter['clientId']).getLayout();
    layout.set('height', document.viewport.getHeight());
};