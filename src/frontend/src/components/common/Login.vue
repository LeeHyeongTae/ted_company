<template>
  <v-container>
     <v-card class="elevation-12">
         <v-toolbar
           color="primary"
           dark
           flat
         >
           <v-toolbar-title>Login</v-toolbar-title>
             <v-spacer></v-spacer>
           </v-toolbar>
             <v-card-text>
               <v-form>
                 <v-text-field
                   id="emailText"
                   label="E-mail"
                   name="login"
                   prepend-icon="mdi-account"
                   type="text"
                 ></v-text-field>
                 <v-text-field
                   id="password"
                   label="Password"
                   name="password"
                   prepend-icon="mdi-lock"
                   type="password"
                 ></v-text-field>
               </v-form>
                 </v-card-text>
                   <v-card-actions>
                     <v-spacer></v-spacer>
                       <v-btn color="primary">Join</v-btn>
                       <v-btn color="primary" @click="login">Login</v-btn>
                   </v-card-actions>
     </v-card>
  </v-container>
</template>

<script>
    export default {
        methods: {
            login(){
                let email = document.getElementById('emailText').value
                let passwd = document.getElementById('password').value
                this.$store.dispatch('member/login', {email: email, passwd:passwd})
            }
        }

    }
</script>

<style scoped>

</style>