		function eliminar(id) {
			console.log(id);
			swal({
				title: "Esta seguro de Eliminar?",
				text: "Se eliminara el Plan. Una vez eliminado no se prodra restablecer!",
				icon: "warning",
				buttons: true,
				dangerMode: true,
			})
				.then((OK) => {
					if (OK) {
						$.ajax({
							url: "/eliminarplan/" + id,
							success: function (res) {
								console.log(res);
							},
						});
						swal("Listo! Registro eliminado!", {
							icon: "success",
						}).then((ok) => {
							if (ok) {
								location.href = "/listarplanes";
							}
						});
					}
				});
		}
