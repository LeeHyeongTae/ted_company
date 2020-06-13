<template>
  <v-app id="inspire">
   <v-parallax
     src="https://farm6.staticflickr.com/5343/8977838805_0e5dd85d2e_c.jpg"></v-parallax>
    <v-navigation-drawer
            v-model="drawer"
            app
    >
      <Navidrawer/>
    </v-navigation-drawer>

    <v-app-bar
            app
            color="indigo"
            hide-on-scroll
            dark
    >
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>ALL of Bicycle</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <v-btn icon>
        <v-avatar>
          <v-icon>mdi-account-circle</v-icon>
        </v-avatar>
      </v-btn>

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
          <v-list-item
                  v-for="n in 5"
                  :key="n"
                  @click="() => {}"
          >
            <v-list-item-title>Option {{ n }}</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
    </v-app-bar>
    <v-content>
      <router-view/>
    </v-content>

    <v-footer
            color="indigo"
            app
    >
        <v-spacer></v-spacer>
      <span class="white--text">&copy; 2020.06.04 Lee Hyeong Tae</span>
    </v-footer>
  </v-app>
</template>

<script>
import Navidrawer from "./components/common/Navidrawer";
export default {
  name: 'App',
  components: {Navidrawer},
  data: () => ({
    drawer: false,
  }),
  methods: {},
  computed: {
  },
}
</script>
