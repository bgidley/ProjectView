Tapestry.Initializer.initialiseSiteFrame = function(parameter){
    var thisFrame = $(parameter['clientId']);
    $(parameter['tabsId']).addFrame(thisFrame, parameter['refresh']);
};