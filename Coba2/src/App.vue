<script setup>
import FormPush from './components/FormPush.vue'
import TodoList from './components/TodoList.vue'
import { ref, onMounted } from 'vue'

const todos = ref([])

onMounted(() => {
  const data = JSON.parse(localStorage.getItem('todos'))
  if (data) {
    todos.value = data
  }
})

function save() {
  localStorage.setItem('todos', JSON.stringify(todos.value))
}

const aha = 'helo'
const warnahijau = 'green'
console.log(aha)
function add(data) {
  console.log(data.todo)
  todos.value.push({ id: crypto.randomUUID(), todo: data.todo })
  data.clear()
}

function remove(id) {
  todos.value = todos.value.filter((item) => item.id !== id)
  save()
}
</script>
<template>
  <section clas="wrapper">
    <FormPush @addTodo="add"> </FormPush>
    <TodoList :todos="todos" @remove="remove" />
  </section>
  <h1
    v-bind:style="{
      color: warnahijau
    }"
  >
    Hello World {{ aha }}
  </h1>
</template>

<style>
/* General reset for padding and margin */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: Arial, sans-serif;
}

/* Layout for the main wrapper */
.wrapper {
  max-width: 1200px;
  margin: 20px auto;
  padding: 10px;
  background-color: #f4f4f4;
  border-radius: 10px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

/* Simple heading style */
h1,
h2 {
  color: #333;
  text-align: center;
  margin-bottom: 20px;
}

/* Styling form */
form {
  max-width: 600px;
  margin: 0 auto;
  background-color: #fff;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.form-control {
  margin-bottom: 15px;
}

label {
  display: block;
  margin-bottom: 8px;
  font-weight: bold;
}

input[type='text'] {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
}

button {
  display: inline-block;
  background-color: #28a745;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s;
}

button:hover {
  background-color: #218838;
}

/* Styling grid layout */
.grid-container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  gap: 20px;
  margin-top: 20px;
}

.card {
  background-color: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  padding: 20px;
}

.card-content {
  text-align: center;
}

.card-content h2 {
  margin-bottom: 10px;
  font-size: 1.5em;
}

button {
  margin-top: 10px;
}

button:focus {
  outline: none;
}

/* Add simple color customization */
button.delete {
  background-color: #dc3545;
}

button.delete:hover {
  background-color: #c82333;
}
</style>
