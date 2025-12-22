const express = require('express');
const cors = require('cors');
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 3000;

app.use(cors());
app.use(express.json());

// Пример API endpoint
app.get('/api/data', (req, res) => {
  res.json({
    message: 'Данные с сервера',
    timestamp: new Date().toISOString(),
    items: [
      { id: 1, name: 'Элемент 1' },
      { id: 2, name: 'Элемент 2' },
      { id: 3, name: 'Элемент 3' }
    ]
  });
});

// Health check
app.get('/health', (req, res) => {
  res.status(200).json({ status: 'OK' });
});

app.listen(PORT, () => {
  console.log(`Сервер запущен на порту ${PORT}`);
});