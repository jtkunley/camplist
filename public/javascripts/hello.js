if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}

function deleteUser (id) {
	var req = new XMLHttpRequest();
	req.open ("delete", "/users/" + id);
	req.onload = function (e) {
		if (req.status = 200) {
			document.location.reload(true);
		}
	};
	req.send();
}
