<template>
  <div class="hello">
    <input v-model="name" type="text" placeholder="Input Your Name">
    <button v-on:click="fetchHello">Send</button>
    <h1>{{ msg }}</h1>
  </div>
</template>


<script>

import axios from 'axios';

export default {
  name: 'HelloWorld',
  data() {
    return {
      name : null,
      msg: null,
    };
  },
  
  methods: {
    fetchHello() {
      axios.get(`http://localhost:8080/hello?name=${this.name}`)
        .then(response => {
          this.msg = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
