<c:forEach items="${invoiceForm.itemList}" var="invoiceDetail" varStatus="status">
<div class="text">
	<label>${status.count}</label>
</div>
<div class="text">
	<label for="productType"><spring:message code="label.upload.invoiceDetails.productType" /></label>
	<input id="itemList[${status.index}].productType" name="itemList[${status.index}].productType" type="text" />
</div>
<div class="text">
	<label for="productName"><spring:message code="label.upload.invoiceDetails.productName" /></label>
	<input id="itemList[${status.index}].productName" name="itemList[${status.index}].productName" type="text" />
</div>
<div class="text">
	<label for="productModel"><spring:message code="label.upload.invoiceDetails.productModel" /></label>
	<input id="itemList[${status.index}].productModel" name="itemList[${status.index}].productModel" type="text" />
</div>
<div class="text">
	<label for="productVendor"><spring:message code="label.upload.invoiceDetails.productVendor" /></label>
	<input id="itemList[${status.index}].productVendor" name="itemList[${status.index}].productVendor" type="text" />
</div>
<div class="text">
	<label for="warranty"><spring:message code="label.upload.invoiceDetails.warranty" /></label>
	<select id="itemList[${status.index}].warrantyYears" name="itemList[${status.index}].warrantyYears">
		<option value="-1"><spring:message code="label.upload.invoiceDetails.warrantyYears" /></option>
		<option value="0">0</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
	</select>
	<select id="itemList[${status.index}].warrantyMonths" name="itemList[${status.index}].warrantyMonths">
		<option value="-1"><spring:message code="label.upload.invoiceDetails.warrantyMonths" /></option>
		<option value="0">0</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		<option value="11">11</option>
	</select>
</div>
<div class="text">
	<label for="itemReceiptFile"><spring:message code="label.upload.invoiceDetails.itemReceiptFile" /></label>
	<input id="itemList[${status.index}].itemReceiptFile" name="itemList[${status.index}].itemReceiptFile" type="file" />
</div>
<div class="text">
	<label for="documentFiles"><spring:message code="label.upload.invoiceDetails.documentFiles" /></label>
	<input id="itemList[${status.index}].documentFiles" name="itemList[${status.index}].documentFiles" type="file" />
</div>
</c:forEach>