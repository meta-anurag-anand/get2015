// To Show The Span 
function show() 
{
	document.getElementById("name").style.visibility = "visible";
	document.getElementById("showHideButton").value = "hide";
}
// To Hide The Details
function hide()
{
	document.getElementById("name").style.visibility = "hidden";
	document.getElementById("showHideButton").value = "show";
}
// To Show Hide The Details
function showHide() 
{
	if (document.getElementById("name").style.visibility == "visible") 
	{
		document.getElementById("name").style.visibility = "hidden";
		document.getElementById("showHideButton").value = "show";
	} 
	else 
	{
		document.getElementById("name").style.visibility = "visible";
		document.getElementById("showHideButton").value = "hide";
	}
}