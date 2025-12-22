FROM node:20-alpine

WORKDIR /app

# Копируем package.json и yarn.lock
COPY package.json ./

# Устанавливаем зависимости
RUN yarn install --frozen-lockfile

# Копируем исходный код
COPY . .

EXPOSE 3000

CMD ["yarn", "start"]