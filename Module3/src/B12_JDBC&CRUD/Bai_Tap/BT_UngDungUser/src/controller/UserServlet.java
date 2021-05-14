package controller;

import model.User;

import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    ArrayList<User> userList = new ArrayList<>();
    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(request, response);
                break;
            case "edit":
                editUser(request, response);
                break;
            default:
                listUser(request, response);
                break;
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        userService.update(new User(id, name, email, country));
        listUser(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                getCreateUser(request, response);
                break;
            case "edit":
                viewEditUser(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "search":
                searchUser(request, response);
                break;
            case "sortNameASC":
                sortNameASC(request, response);
                break;
            default:
                listUser(request, response);
                break;
        }
    }

    private void sortNameASC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("userList", this.userService.sortNameASC());
        request.getRequestDispatcher("user/list.jsp").forward(request,response);

    }


    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.remove(id);
        listUser(request, response);
    }

    private void viewEditUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(id);
        request.setAttribute("user", user);
        try {
            request.getRequestDispatcher("user/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void getCreateUser(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("user/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        userService.save(new User(id, name, email, country));
        listUser(request, response);
    }
    private void listUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userService.findAll();
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("user/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = this.userService.findByCountry(request.getParameter("country"));
        request.setAttribute("userList", userList);

            try {
                request.getRequestDispatcher("user/list.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }


}
