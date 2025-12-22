FROM node:20-alpine as builder

WORKDIR /app

# Копируем package.json и yarn.lock
COPY package.json package-lock.json ./

# Устанавливаем зависимости
RUN yarn install --frozen-lockfile

# Копируем весь проект
COPY . .

# Собираем Vue приложение
RUN yarn build

# Этап production
FROM nginx:alpine

# Копируем собранное приложение из этапа builder
COPY --from=builder /app/dist /usr/share/nginx/html

# Копируем конфигурацию nginx
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]