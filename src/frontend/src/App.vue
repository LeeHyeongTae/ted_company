<template>
  <v-app id="inspire">
    <v-navigation-drawer
            v-model="drawer"
            app
    ><Navidrawer/></v-navigation-drawer>

    <v-app-bar
            app
            color="black"
            hide-on-scroll
            dark
    >
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>ALL of Bicycle</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon @click="searchButton">
        <v-icon>mdi-magnify</v-icon>
      </v-btn>
      <v-dialog v-model="dialog" max-width="500">
        <template v-slot:activator="{on, attrs}">
          <v-btn
            v-bind="attrs"
            v-on="on"
            icon>
            <v-avatar>
              <v-icon>mdi-account-circle</v-icon>
            </v-avatar>
          </v-btn>
        </template>
        <Join/>
      </v-dialog>


      <v-menu
              left
              bottom
      >
        <template v-slot:activator="{ on }">
          <v-btn icon v-on="on">
            <v-icon>mdi-dots-vertical</v-icon>
          </v-btn>
        </template>

        <v-list>
          <v-list-item v-for="item of items" :key="item.title">
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
    </v-app-bar>
    <v-content><router-view/></v-content>

    <v-footer
            color="black"
            app
    >
        <v-spacer></v-spacer>
      <span class="white--text">&copy; 2020.06.04 Lee Hyeong Tae</span>
    </v-footer>
  </v-app>
</template>

<script>
import Navidrawer from "./components/common/Navidrawer";
import Join from "./components/common/Join";
export default {
  name: 'App',
  components: {Join, Navidrawer},
  data: () => ({
    dialog: false,
    drawer: false,
      items: [
          {title: 'Login'},
          {title: 'MyPage'},
          {title: 'Setting'},

      ],
  }),
  methods: {
    searchButton(){
          alert('검색 버튼 클릭')
      },
    popUp(){
        alert('마이 페이지 클릭')
    },
  },
  computed: {
  },
}
</script>
