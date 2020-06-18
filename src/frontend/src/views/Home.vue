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
           <iframe width="1920" height="1080" src="https://www.youtube.com/embed/d2sCSt-6_Mo?autoplay=1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
       </v-card>
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