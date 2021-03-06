package servlets.complex;

import data.dao.ClientDao;
import data.dao.ComplexDao;
import data.dao.CredentialsDao;
import data.dao.ManagerDao;
import data.repository.ComplexRepository;
import data.repository.UserRepository;
import helper.JsonConverter;
import org.json.simple.JSONObject;
import service.ComplexService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static servlets.helpers.ServletHelper.sendResponse;
import static utils.Constants.GET_DATA_SUCCESS;

@WebServlet(
    name = "TourGroupByTourDateServlet",
    urlPatterns = "/tour/group/by/tour/date")
public class TourGroupByTourDateServlet extends HttpServlet {

  private final ComplexService complexService = ComplexService.getInstance(
      ComplexRepository.getInstance(
          ComplexDao.getInstance(),
          UserRepository.getInstance(
              CredentialsDao.getInstance(),
              ManagerDao.getInstance(),
              ClientDao.getInstance()
          )
      )
  );

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    JSONObject reqJson = JsonConverter.parse(request, response);
    JSONObject jsonObject = complexService.getTourGroupsByTourDate(reqJson);
    sendResponse(response, jsonObject, GET_DATA_SUCCESS);
  }
}
