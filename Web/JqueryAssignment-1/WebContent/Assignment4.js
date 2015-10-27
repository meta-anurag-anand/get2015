// Jquery file to change the Background
$(document).ready(function()
{
	// For even Rows
    $("tr:even").css("background-color", "#FFFFFF");
    // For Odd Rows
    $("tr:odd").css("background-color", "#696969");
    $("tr:odd").css("color", "WHITE");
    // For Padding
    $("td").css("padding", "5px");
});