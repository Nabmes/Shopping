<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<div class="row">
		<div class="col-md-offset-2 col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h4>Product Management</h4>
				</div>

				<div class="panel-body">
					<!-- Form Elements -->
					<sf:form class="form-horizontal" modelAttribute="product">
						<div class="form-group">
							<label class="control-label col-md-4" for="name">Enter Product Name: </label>
							<div class="col-md-8">
								<!-- <input type="text" name="name" id="name" placeholder="Product Name" class="form-control" />--> 
								<sf:input type="text" path="name" id="name" placeholder="Product Name" class="form-control" />					
								<!-- <em class="help-block">Please enter Product Name!</em> -->
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="brand">Enter Brand Name: </label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand" placeholder="Brand Name" class="form-control" /> 
								<!--<em class="help-block">Please enter Brand Name!</em>-->
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="description">Product Description: </label>
							<div class="col-md-8">
								<sf:textarea path="description" id="description" placeholder="Write a description" class="form-control" />
								<!--<em class="help-block">Please enter Brand Name!</em>-->
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="unitPrice">Enter Unit Price: </label>
							<div class="col-md-8">
								<sf:input type="text" path="unitPrice" id="unitPrice" placeholder="Unit Price In &#8364" class="form-control" /> 
								<!--<em class="help-block">Please enter Brand Name!</em>-->
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Quantity Available: </label>
							<div class="col-md-8">
								<sf:input type="text" path="quantity" id="quantity" placeholder="Quantity Available" class="form-control" /> 
								<!--<em class="help-block">Please enter Brand Name!</em>-->
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Select Category: </label>
							<div class="col-md-8">
								<sf:select path="categoryId" id="categoryId" class="form-control"
									items="${categories}"
									itemLabel="name"
									itemValue="id"
								/> 
								<!--<em class="help-block">Please enter Brand Name!</em>-->
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary" /> 
								<!-- Hidden fields for products-->
								<sf:hidden path="id"/>
								<sf:hidden path="code"/>
								<sf:hidden path="active"/>
								<sf:hidden path="supplierId"/>
								<sf:hidden path="purchases"/>
								<sf:hidden path="views"/>
							</div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>

</div>