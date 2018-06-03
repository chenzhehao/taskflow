var serviceDo = "http://localhost:8080/taskflow/";


var noLoginErrorNum = 0;

//请求统一拦截
function commonRequest(url, data, callback, setting) {
    // 调用本地ajax请求后台方法
    var s = {
        type: "POST",
        url: serviceDo + url,
        data: data,
        dataType: "json",
        async: true,
        beforeSend: function () {
            ThisCommon.showLoading();
        },
        success: function (data) {
            if (data.ret_code == "000018" || data.ret_code == "000016") {
                noLoginErrorNum = noLoginErrorNum + 1;
                if (noLoginErrorNum == 1) {
                    alert(data.ret_msg);
                }
                var topWin = (function (p, c) {
                    while (p != c) {
                        c = p;
                        p = p.parent;
                    }
                    return c;
                })(window.parent, window);
                topWin.location.href = serviceDo;
            } else {
                callback(data);
            }
        },
        complete: function () {
            ThisCommon.hideLoading();
            ThisCommon.activeButton(localStorage.target);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.status + XMLHttpRequest.readyState + textStatus);
        }
    };
    if (setting) {
        for (var key in setting) {
            s[key] = setting[key];
        }
    }
    $.ajax(s);
}


