
let acordeon = document.getElementById("acordeon-content"),
    acordeonBody = [...document.querySelectorAll(".acordeon__body")];

function openMenu(element){
    let parent  = element.target.parentNode,
        lastChild = parent.lastElementChild,
        menu = lastChild.firstElementChild;
    acordeonBody.map(el => el.style.height = 0);
    if(lastChild.clientHeight){
        lastChild.style.height = 0;
    }else{
        let altoMenu = menu.clientHeight;
        lastChild.style.height = `${altoMenu}px`;
    }
}

function getTarget(e){
    if(e.target.tagName === "DIV"){
        openMenu(e);
    }
}
//添加事件，该函数在DOM初始化之后，否则DOM尚未初始化完成添加事件报错，所以引入的js位置放在html尾部
acordeon.addEventListener("click", getTarget);

