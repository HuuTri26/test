<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<header id="header" class="header fixed-top d-flex align-items-center">

      <div class="d-flex align-items-center justify-content-between">
        <i class="bi bi-list toggle-sidebar-btn"></i>
        <a href="index.html" class="logo d-flex align-items-center">
          <img src="<c:url value='/resources/admin/assets/img/EPariksha.png'/>" alt="">
          <span class="d-none d-lg-block">BookMyMaid</span>
        </a>
        
      </div><!-- End Logo -->
  
  
      <nav class="header-nav ms-auto">
        <ul class="d-flex align-items-center">
  
     
  
          <li class="nav-item dropdown pe-3">
  
            <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
              <img src="<c:url value='/resources/admin/assets/img/profile-img.jpg'/>" alt="Profile" class="rounded-circle">
              <span class="d-none d-md-block dropdown-toggle ps-2">Admin</span>
            </a><!-- End Profile Iamge Icon -->
  
            <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
              <li class="dropdown-header">
                <h6>Ram</h6>
                <span>PRN-111</span>
              </li>
              <li>
                <hr class="dropdown-divider">
              </li>
  
              <li>
                <a class="dropdown-item d-flex align-items-center" href="profile.htm">
                  <i class="bi bi-person"></i>
                  <span>My Profile</span>
                </a>
              </li>
              <li>
                <hr class="dropdown-divider">
              </li>
  
              <li>
                <a class="dropdown-item d-flex align-items-center" href="index.htm">
                  <i class="bi bi-box-arrow-right"></i>
                  <span>Sign Out</span>
                </a>
              </li>
  
            </ul><!-- End Profile Dropdown Items -->
          </li><!-- End Profile Nav -->
  
        </ul>
      </nav><!-- End Icons Navigation -->
  
    </header><!-- End Header -->