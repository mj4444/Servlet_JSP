function resize() {
	var heights = window.innerHeight;
	var domObj=document.getElementsByTagName("html");
	domObj[0].style.height = heights + "px";
}
resize();
window.onresize = function() {
	resize();
};