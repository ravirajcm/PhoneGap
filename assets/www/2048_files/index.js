var AdController = {
        loadAd : function(sectionid, successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "loadAd", [sectionid]);
        },
        destroyAd : function(successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "destroyAd", []);
        },
        loadAudioAd : function(sectionid, successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "loadAudioAd", [sectionid]);
        },
        loadAudioTrack : function(sectionid, interval, successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "loadAudioTrack", [sectionid,interval]);
        },
        loadReEngagement : function(sectionid, successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "loadReEngagement", [sectionid]);
        },
        loadStartAd : function(sectionid, audiosectionid, reengagementsectionid, successcallback, errorcallback) {
            cordova.exec(successcallback, errorcallback, "AdController", "loadStartAd", [sectionid,audiosectionid,reengagementsectionid]);
        }
    };