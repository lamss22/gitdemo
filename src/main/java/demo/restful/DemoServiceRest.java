package demo.restful;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import demo.entity.Product;

@Path("/basic-servic")
public class DemoServiceRest {
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello() {
		String data = "Hello C2010G1 in restful web service";
		Gson son = new Gson();
		String dataJson = son.toJson(data);
		return dataJson;
	}

	@GET
	@Path("/helloStudent/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello2(@PathParam("name") String name) {
		String data = "Welcome: " + name;
		Gson son = new Gson();
		String json = son.toJson(data);
		return json;
	}

	@GET
	@Path("/cong2So/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String cong(@PathParam("a") Integer a, @PathParam("b") Integer b) {
		int c = a + b;
		Gson son = new Gson();
		String data = son.toJson(c);
		return data;
	}

	@POST
	@Path("/insertProduct")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertProduct(String dataPro) {
		Gson son = new Gson();
		Product product = son.fromJson(dataPro, Product.class);
		//su dung dao de insert vao database
		//tra ve kieu boolean (insert duoc hay khong)
		boolean bl = true;
		String result = son.toJson(bl);
		return result;
	}
	
	@GET
	@Path("/listProducts")
	@Produces(MediaType.APPLICATION_JSON)
	public String listProducts() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("P01", "Máy tính acer core i3", "Acer", 2015, new Date(), 10L, 9000000D));
		list.add(new Product("P02", "Tủ lạnh Sanyo 180l", "Sanyo", 2015, new Date(), 10L, 9000000D));
		list.add(new Product("P03", "Chuột logistic", "Logistic", 2015, new Date(), 10L, 9000000D));
		
		Gson son = new Gson();
		String data = son.toJson(list);
		return data;
	}

}
