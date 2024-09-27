<script setup>
import FormPush from './components/FormPush.vue'

const aha = 'helo'
const warnahijau = 'green'
console.log(aha)
</script>
<template>
  <section clas="wrapper">
    <FormPush> </FormPush>
  </section>
  <h1
    v-bind:style="{
      color: warnahijau
    }"
  >
    Hello World {{ aha }}
  </h1>
</template>
