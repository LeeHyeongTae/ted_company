<template>
    <div>
        <v-app id="inspire">
            <v-navigation-drawer
                    v-model="drawer"
                    app
            >
                <v-list dense>
                    <v-list-item link>
                        <v-list-item-action>
                            <v-icon>mdi-home</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <router-link to="/"><v-list-item-title>Home</v-list-item-title></router-link>
                        </v-list-item-content>
                    </v-list-item>
                    <v-list-item link>
                        <v-list-item-action>
                            <v-icon>mdi-contact-mail</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <router-link to="/composition"><v-list-item-title>{{Composition}}</v-list-item-title></router-link>
                        </v-list-item-content>
                    </v-list-item>
                    <v-list-item link>
                        <v-list-item-action>
                            <v-icon>mdi-contact-mail</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                           <router-link to="/member"> <v-list-item-title>{{Member}}</v-list-item-title></router-link>
                        </v-list-item-content>
                    </v-list-item>
                    <v-list-item link>
                        <v-list-item-action>
                            <v-icon>mdi-contact-mail</v-icon>
                        </v-list-item-action>
                        <v-list-item-content>
                            <router-link to="weapon"><v-list-item-title>{{Weapon}}</v-list-item-title></router-link>
                        </v-list-item-content>
                    </v-list-item>
                </v-list>
            </v-navigation-drawer>

            <v-app-bar
                    app
                    color="indigo"
                    dark
            >
                <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
                <v-toolbar-title>{{title}}</v-toolbar-title>
            </v-app-bar>

            <v-content><router-view/></v-content>
            <v-footer
                    color="indigo"
                    app
            >
                <span class="white--text">&copy; 2019</span>
            </v-footer>
        </v-app>
    </div>
</template>

<script>
    export default {
        name: "Home",
        data: () =>({
            drawer: null,
            title: 'Home', Composition:'조직도', Member:'중대원 목록', Weapon:'화기목록'
        }),
        methods: {

        }
    }
</script>

<style scoped>

</style>