<template>
 <v-container
    class="fill-height"
    fluid
 >
   <v-row
      align="center"
      justify="center"
   >
       <v-card>
           <iframe width="1280" height="720" src="https://www.youtube.com/embed/d2sCSt-6_Mo?autoplay=1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
       </v-card>
<!--       <v-card class="elevation-12">-->
<!--         <h1>로그인이 필요한 페이지입니다.</h1>-->
<!--         <router-link to="/join"><v-btn color="blue">join</v-btn></router-link>-->
<!--         <router-link to="/login"><v-btn color="blue">login</v-btn></router-link>-->
<!--       </v-card>-->
   </v-row>
 </v-container>
</template>

<script>
    export default {
        name: "Home",
        data: () =>({
            drawer: null,
        }),
        methods: {

        }
    }
</script>

<style scoped>

</style>