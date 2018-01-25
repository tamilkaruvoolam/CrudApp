//calling controller method for navigation of view using parameterized urlPattern
function loadmydiv(urlPattern) {
	$.ajax({
		type: "POST",
		url : urlPattern,
		success : function(response) {
			//console.log(response);
			$("#page-wrapper").html(response);			
			//$.unblockUI();
		}
	});
}

history.pushState(null, null, document.URL);
window.addEventListener('popstate', function() {
	history.pushState(null, null, document.URL);
});			

window.onload = function() {
	document.onkeydown = function(e) {
		return (e.which || e.keyCode) != 116;
	};

}