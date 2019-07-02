<html>
<body>
<h2>Money converter</h2>
Enter Your value:<br/>
<input id="input-field-1" type="number" placeholder="Enter value" name="input-field-1"><br>
<br/>
<button onclick="formatMoney()">Format into monetary acceptable form</button>
<br/>
<br/>
<input id="input-field-2" size="35" type="text" placeholder="Your result" name="input-field-2" readonly><br>
<br/>
<button onclick="allertClear()">Clear fields</button>

<script>
    var field = document.getElementById("input-field-1");
    field.focus();

    function formatMoney() {
        var field = document.getElementById("input-field-1");
        var value = field.valueAsNumber;
        if (isNaN(value)) {
            var resultField = document.getElementById("input-field-2");
            resultField.value = formattedStringValue;
            resultField.value = "Entered value is not a valid number!";
        } else {
            var formattedStringValue = value.toFixed(2).replace(/\d(?=(\d{3})+\.)/g, '$& ');
            var resultField = document.getElementById("input-field-2");
            resultField.value = formattedStringValue;
        }
    }

    function clearFields() {
        var field = document.getElementById("input-field-1");
        var resultField = document.getElementById("input-field-2");
        field.value = "";
        resultField.value = "";

    }

    function allertClear() {
        var r = confirm("Warning all input fields will be cleared!!!");
        if (r) {
            clearFields();
        } else {
        }

    }


</script>
</body>
</html>