<template>
    <v-container>
        <v-row
                align="center"
                justify="center"
        >
            <v-col
                    cols="12"
                    sm="8"
                    md="4"
            >
                <form>
                    <v-text-field
                            v-model="name"
                            :error-messages="nameErrors"
                            :counter="10"
                            label="Name"
                            required
                            @input="$v.name.$touch()"
                            @blur="$v.name.$touch()"
                    ></v-text-field>
                    <v-text-field
                            v-model="email"
                            :error-messages="emailErrors"
                            label="E-mail"
                            required
                            @input="$v.email.$touch()"
                            @blur="$v.email.$touch()"
                    ></v-text-field>
                    <v-text-field
                            v-model="password"
                            :error-messages="passwordErrors"
                            :counter="8"
                            label="Password"
                            required
                            type="password"
                            @input="$v.password.$touch()"
                            @blur="$v.password.$touch()"
                    ></v-text-field>
                    <v-select
                            v-model="select"
                            :items="items"
                            :error-messages="selectErrors"
                            label="Item"
                            required
                            @change="$v.select.$touch()"
                            @blur="$v.select.$touch()"
                    ></v-select>
                    <v-checkbox
                            v-model="checkbox"
                            :error-messages="checkboxErrors"
                            label="Do you agree?"
                            required
                            @change="$v.checkbox.$touch()"
                            @blur="$v.checkbox.$touch()"
                    ></v-checkbox>

                    <v-btn class="mr-4" @click="submit">submit</v-btn>
                    <v-btn @click="clear">clear</v-btn>
                </form>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
import { validationMixin } from 'vuelidate'
import { required, maxLength, email } from 'vuelidate/lib/validators'
    export default {
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
            name: '',
            email: '',
            password: '',
            select: null,
            items: [
                'Item 1',
                'Item 2',
                'Item 3',
                'Item 4',
            ],
            checkbox: false,
        }),

        computed: {
            checkboxErrors () {
                const errors = []
                if (!this.$v.checkbox.$dirty) return errors
                !this.$v.checkbox.checked && errors.push('You must agree to continue!')
                return errors
            },
            selectErrors () {
                const errors = []
                if (!this.$v.select.$dirty) return errors
                !this.$v.select.required && errors.push('Item is required')
                return errors
            },
            nameErrors () {
                const errors = []
                if (!this.$v.name.$dirty) return errors
                !this.$v.name.maxLength && errors.push('Name must be at most 10 characters long')
                !this.$v.name.required && errors.push('Name is required.')
                return errors
            },
            emailErrors () {
                const errors = []
                if (!this.$v.email.$dirty) return errors
                !this.$v.email.email && errors.push('Must be valid e-mail')
                !this.$v.email.required && errors.push('E-mail is required')
                return errors
            },
            // passwordErrors () {
            //     const errors = []
            //     if (!this.$v.password.$dirty) return errors
            //     !this.$v.password.required && errors.push('password is required.')
            // }
        },

        methods: {
            submit () {
                this.$v.$touch()
            },
            clear () {
                this.$v.$reset()
                this.name = ''
                this.email = ''
                this.password = ''
                this.select = null
                this.checkbox = false
            },
        },
    }
</script>

<style scoped>

</style>