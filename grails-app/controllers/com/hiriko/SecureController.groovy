package com.hiriko

import grails.plugins.springsecurity.Secured

class SecureController {
   @Secured(['ROLE_ADMIN'])
    def index = {
       render 'Logged in with ROLE_ADMIN'
    }
   
   @Secured(['ROLE_USER'])
    def users = {
       render 'Logged in with ROLE_USER'
    }
   
   def anybody = {
      render 'anyone can see this'
   }

 }