
// Query
var query;
// Function to check condition
function checkCondition()
{
	// Getting the value from textbox 
	query = document.getElementById("textbox1").value;
	if (isNaN(query))
	{
		alert("not a Number");
	} 
	else 
	{
		// Concating the result
		result = "<table id='tableData' align='center'>";
		result += "<tr>";
		result += "<th>Name</th><th>Min</th><th>Max</th>";
		result += "</tr>";
		for (var i = 0; i < query; i++) 
		{
			result += "<tr>";
			result += "<td><input type='text'id='name" + i + "'></td>";
			result += "<td><input type='number' min=0 max=9 id='min" + i
					+ "'></td>";
			result += "<td><input type='number' min=0 max=9 id='max" + i
					+ "'></td>";
			result += "</tr>";
		}
		// Button 
		result += "<tr><td colspan='3' align='center'><input type='button' id='button' onClick='createTable()' value='Click Me!!'><input type='button' id='button1' onClick='checkCondition()' value='Reset'></td></tr>";
		result += "</table>";
		document.getElementById('tableData').innerHTML = result;
	}
}
// Function to create the table
function createTable() 
{
	// Getting the tble data
	var tabledata = document.getElementById("tableData");
	// Intializing the string
	var string = "";
	// Intializing the value
	for (count = 0; count < query; count++) 
	{
		name = document.getElementById("name" + count).value;
		min = document.getElementById("min" + count).value;
		max = document.getElementById("max" + count).value;
		// Checking the value of max and min
		if (min == "" || max == "")
		{
			continue;
		}
		// Checking the Condition whether max>min
		if (min > max)
		{
			alert("Row " + count + " column maximum have value less then minimum.");
			continue;
		}
		else if (min < 0 || max > 9 || min > 9 || max < 0) 
		{
			alert("Row " + count + " !! Enter value within range..");
			continue;
		}
		// Intializing the name
		else 
		{
			string += "<tr ><td id='name'>" + name + "</td>";
			// Loop to run through the div
			for (count2 = 0; count2 <= 9; count2++)
			{
				if (count2 < min || count2 > max) 
				{
					string += "<td class='space' ></td>";
				} 
				else
				{
					string += "<td class='data'></td>";
				}
			}
			// Closing the Row
			string += "</tr>"
		}
	}
	tabledata.innerHTML = string;
}