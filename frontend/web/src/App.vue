<template>
  <NavBar></NavBar>
  <router-view> </router-view>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'

export default {
    components: { 
      NavBar 
    },setup(){
      
      
      $.ajax({
        url: "http://localhost:3000/user/account/register/",
        type: "post",
        data: {
          username: "zca1",
          password: "1234",
          confirmedPassword: "1234",
        },
        success(resp){
          console.log(resp);
        },
        error(resp){
          console.log(resp);
        }
      });
    }
}
</script>

<style>
  body{
    background-image: url("@/assets/images/background.png");
    background-size: cover;
  }
</style>
