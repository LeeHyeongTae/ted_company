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
           <v-carousel
                   cycle
                   height="600"
                   show-arrows-on-hover
           >
               <v-carousel-item
                       v-for="(image,i) in images"
                       :key="i"
                       :src="image.src"
                       reverse-transition="fade-transition"
                       transition="fade-transition"
               ></v-carousel-item>
           </v-carousel>
       </v-card>
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
            images: [
                {src: 'https://wallpaperaccess.com/full/1222907.jpg'},
                {src: 'https://trek.scene7.com/is/image/TrekBicycleProducts/howtobuyabikeonline_homepage2?$responsive-pjpg$&cache=on,on&wid=1920'},
                {src: 'https://dk8nafk1kle6o.cloudfront.net/Images/Shared/Pages/TCR_RangePage_Dektop_banner_1920x1000_1585219894.jpg'},
                {src: 'https://cdn.shopify.com/s/files/1/0232/3305/files/NovWallpaperDesktop.jpg'},
                {src: 'https://media.daysoftheyear.com/20171223121018/bicycle-day1-scaled.jpg'},
            ]
        }),
        methods: {

        }
    }
</script>

<style scoped>

</style>