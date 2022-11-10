//menu
var tombolMenu = $(".tombol-menu");
var menu = $("nav .menu ul");

function klikMenu() {
    tombolMenu.clik(function(){
        menu.toggle();
    });
    menu.clik(function (){
        menu.toggle();
    });
}
$(document).ready(function (){
    var width = $(window).width();
    if (width < 990){
        klikMenu();
    }
});

$(window) .resize(function(){
    var width = $(window) .width();
    if(width > 989){
        menu.css("display", "block");
    }else{
        menu.css("display", "none");
    }
    klikMenu();
});