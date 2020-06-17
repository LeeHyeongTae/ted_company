<template>
    <v-container>
        <v-list-item>
            <v-list-item-avatar>
                <v-img src="https://randomuser.me/api/portraits/men/78.jpg"></v-img>
            </v-list-item-avatar>

            <v-list-item-content>
                <v-list-item-title>관리자</v-list-item-title>
            </v-list-item-content>
        </v-list-item>

        <v-divider></v-divider>

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
                    <v-icon>mdi-email</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <router-link to="/intro"><v-list-item-title>Intro</v-list-item-title></router-link>
                </v-list-item-content>
            </v-list-item>
            <v-list-item link>
                <v-list-item-action>
                    <v-icon>mdi-contact-mail</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <router-link to="/history"><v-list-item-title>history</v-list-item-title></router-link>
                </v-list-item-content>
            </v-list-item>
            <v-list-item link>
                <v-list-item-action>
                    <v-icon>mdi-info</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <router-link to="/info"><v-list-item-title>information</v-list-item-title></router-link>
                </v-list-item-content>
            </v-list-item>
            <v-list-item link>
                <v-list-item-action>
                    <v-icon>mdi-contact-mail</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <router-link to="/bicycle"><v-list-item-title>bicycle DB</v-list-item-title></router-link>
                </v-list-item-content>
            </v-list-item>
            <v-list-item link>
                <v-list-item-action>
                    <v-icon>mdi-contact-mail</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <router-link to="/links"><v-list-item-title>links</v-list-item-title></router-link>
                </v-list-item-content>
            </v-list-item>
        </v-list>
    </v-container>
</template>

<script>
    export default {
        name: "Navidrawer"
    }
</script>

<style scoped>

</style>