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
      <v-dialog v-model="dialog" persistent max-width="500">
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
        <v-container>
          <v-card v-if="loginModal">
            <v-toolbar
                    color="primary"
                    dark
                    flat
            >
              <v-toolbar-title>Join</v-toolbar-title>
              <v-spacer></v-spacer>
            </v-toolbar>
            <v-card-text>
              <v-form>
                <v-text-field
                        id="nameText"
                        label="Name"
                        name="name"
                        prepend-icon="mdi-account"
                        type="text"
                ></v-text-field>
                <v-text-field
                        id="emailText"
                        label="E-mail"
                        name="email"
                        prepend-icon="mdi-email"
                        type="text"
                ></v-text-field>
                <v-text-field
                        id="passwordText"
                        label="Password"
                        name="password"
                        prepend-icon="mdi-lock"
                        type="password"
                ></v-text-field>
                <v-checkbox
                        v-model="checkbox"
                        label="Do you agree?"
                        required
                ></v-checkbox>
              </v-form>
            </v-card-text>
            <v-card-actions>
              <v-btn color="light-green" class="mr-4" @click="submit">submit</v-btn>
              <v-btn color="amber" @click="clear">clear</v-btn>
              <v-spacer/>
              <v-btn color="primary" @click="ModalSwitch">Login</v-btn>
              <v-btn color="gray" @click="cancel">Cancel</v-btn>
            </v-card-actions>

          </v-card>
          <v-card class="elevation-12" v-else>
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
              <v-btn color="teal" @click="ModalSwitch">Join</v-btn>
              <v-btn color="primary" @click="login">Login</v-btn>
              <v-btn color="gray" @click="cancel">Cancel</v-btn>
            </v-card-actions>
          </v-card>
        </v-container>
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
          <v-list-item v-for="item of menus" :key="item.title">
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
import { validationMixin } from 'vuelidate'
import { required, maxLength, email } from 'vuelidate/lib/validators'
import Navidrawer from "./components/common/Navidrawer";
export default {
  components: {Navidrawer},
  mixins: [validationMixin],

  validations: {
    name: { required, maxLength: maxLength(10) },
    email: { required, email },
    password: { required },
    select: { required },
    checkbox: {
      checked (val) {
        return val
      },
    },
  },
  data: () => ({
    dialog: false,
    drawer: false,
      menus: [
          {title: 'Login'},
          {title: 'MyPage'},
          {title: 'Setting'},

      ],
    loginModal: false,
    name: '',
    email: '',
    password: '',
    checkbox: false,
  }),
  methods: {
    searchButton(){
          alert('검색 버튼 클릭')
      },
    submit () {
      alert('submit')
    },
    clear () {
      document.getElementById('nameText').value = ''
      document.getElementById('emailText').value = ''
      document.getElementById('passwordText').value = ''
      this.checkbox = false
    },
    login(){
      let email = document.getElementById('emailText').value
      let passwd = document.getElementById('password').value
      this.$store.dispatch('member/login', {email: email, passwd:passwd})
    },
    ModalSwitch(){
      (this.loginModal != true)? this.loginModal = true : this.loginModal = false
    },
    cancel(){
      this.dialog = false
      this.loginModal = false
    }
  },
  computed: {

  },
  created() {this.loginModal = false}
}
</script>
