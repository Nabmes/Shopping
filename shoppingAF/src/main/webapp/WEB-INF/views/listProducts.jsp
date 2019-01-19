<div class="container">

	<div class="row">

		<!-- Sidebar Section -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<c:if test="${UserClickAllProducts == true}">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active" aria-current="page">All Products</li>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item active" aria-current="page">Category</li>
					<li class="breadcrumb-item active" aria-current="page">${category.name}</li>
					</c:if>
					
				</ol>
			</nav>
		</div>


	</div>
</div>