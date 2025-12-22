<template>
  <div class="about">
    <h1>О нас</h1>
    <div class="content">
      <p>Мы - команда разработчиков, создающая современные веб-приложения.</p>
      <p>Используем Vue.js, Node.js и Docker для разработки.</p>
    </div>
    <div class="technologies">
      <h3>Используемые технологии:</h3>
      <ul>
        <li>Vue.js 3</li>
        <li>Vue Router</li>
        <li>Node.js + Express</li>
        <li>Docker + Docker Compose</li>
        <li>Yarn</li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.about {
  max-width: 800px;
  margin: 0 auto;
}

.content {
  margin: 30px 0;
  padding: 20px;
  background-color: #f9f9f9;
  border-radius: 8px;
}

.technologies {
  margin-top: 40px;
}

.technologies ul {
  list-style-type: none;
  padding: 0;
}

.technologies li {
  padding: 10px;
  margin: 5px 0;
  background-color: #e8f5e9;
  border-left: 4px solid #42b983;
}
</style>