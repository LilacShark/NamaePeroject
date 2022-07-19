package marker.test.servlet;

import marker.test.domain.Products;
import marker.test.service.ProductService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductListServlet", urlPatterns = {"/productList"})
public class ProductListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ServletContext context = getServletContext(); // получаем контекст сервлета
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.
                getWebApplicationContext(context); //из контекста сервлета получаем контекст спринга

        ProductService service = webApplicationContext.getBean(ProductService.class);
        List<Products> allProducts = service.findAllProducts();
        allProducts.forEach(l -> System.out.println(l.getProductId() + " : " + l.getProductType()));

        getServletContext()
                .getRequestDispatcher("/clientList.jsp")
                .forward(req,resp);
    }
}
