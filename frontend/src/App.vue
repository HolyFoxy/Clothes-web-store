<template>
  <div id="app">
    <div class="header">
      <div class="container">
        <div class="company-name">
          Activika
        </div>
        <nav class="navbar">
          <router-link to="/">Главная</router-link>
          <router-link to="/about">О нас</router-link>
          <router-link to="/products">Продукты</router-link>
          <router-link to="/contact">Контакты</router-link>
        </nav>
        <div class="user-ui">
          <div class="ico search">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 30 30">
              <path d="M 13 3 C 7.4889971 3 3 7.4889971 3 13 C 3 18.511003 7.4889971 23 13 23 C 15.396508 23 17.597385 22.148986 19.322266 20.736328 L 25.292969 26.707031 A 1.0001 1.0001 0 1 0 26.707031 25.292969 L 20.736328 19.322266 C 22.148986 17.597385 23 15.396508 23 13 C 23 7.4889971 18.511003 3 13 3 z M 13 5 C 17.430123 5 21 8.5698774 21 13 C 21 17.430123 17.430123 21 13 21 C 8.5698774 21 5 17.430123 5 13 C 5 8.5698774 8.5698774 5 13 5 z"></path>
            </svg>
          </div>
          <div class="ico user">
            <svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
              <g id="User">
                <g>
                  <path  d="M17.438,21.937H6.562a2.5,2.5,0,0,1-2.5-2.5V18.61c0-3.969,3.561-7.2,7.938-7.2s7.938,3.229,7.938,7.2v.827A2.5,2.5,0,0,1,17.438,21.937ZM12,12.412c-3.826,0-6.938,2.78-6.938,6.2v.827a1.5,1.5,0,0,0,1.5,1.5H17.438a1.5,1.5,0,0,0,1.5-1.5V18.61C18.938,15.192,15.826,12.412,12,12.412Z"/>
                  <path  d="M12,9.911a3.924,3.924,0,1,1,3.923-3.924A3.927,3.927,0,0,1,12,9.911Zm0-6.847a2.924,2.924,0,1,0,2.923,2.923A2.926,2.926,0,0,0,12,3.064Z"/>
                </g>
              </g>
            </svg>     
          </div>
          <div class="ico cart">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100">
              <path id="XMLID_1732_" d="M91.8,27.3L81.1,61c-0.8,2.4-2.9,4-5.4,4H34.4c-2.4,0-4.7-1.5-5.5-3.7L13.1,19H4c-2.2,0-4-1.8-4-4
                s1.8-4,4-4h11.9c1.7,0,3.2,1.1,3.8,2.7L36,57h38l8.5-27H35.4c-2.2,0-4-1.8-4-4s1.8-4,4-4H88c1.3,0,2.5,0.7,3.2,1.7
                C92,24.7,92.2,26.1,91.8,27.3z M36.4,70.3c-1.7,0-3.4,0.7-4.6,1.9c-1.2,1.2-1.9,2.9-1.9,4.6c0,1.7,0.7,3.4,1.9,4.6
                c1.2,1.2,2.9,1.9,4.6,1.9s3.4-0.7,4.6-1.9c1.2-1.2,1.9-2.9,1.9-4.6c0-1.7-0.7-3.4-1.9-4.6C39.8,71,38.1,70.3,36.4,70.3z M72.3,70.3
                c-1.7,0-3.4,0.7-4.6,1.9s-1.9,2.9-1.9,4.6c0,1.7,0.7,3.4,1.9,4.6c1.2,1.2,2.9,1.9,4.6,1.9c1.7,0,3.4-0.7,4.6-1.9
                c1.2-1.2,1.9-2.9,1.9-4.6c0-1.7-0.7-3.4-1.9-4.6S74,70.3,72.3,70.3z"/>
            </svg>
          </div>
        </div>
      </div> 
    </div>

    <router-view />

    <div class="footer">
      <div class="container">
        <div class="notes">
          <div class="note">
            <div class="title orange">ACTIVIKA</div>
            <div class="text">
              Your premium destination for high-quality sportswear and athletic gear.
            </div>
          </div>
          <div class="note">
            <div class="title">Quick links</div>
            <div class="links">
              <router-link to="/" class="link">About us</router-link>
              <router-link to="/catalog" class="link">Catalog</router-link>
              <router-link to="/Shipping_&_returns" class="link">Shipping & returns</router-link>
              <router-link to="/Contact" class="link">Contact</router-link>
            </div>
          </div>
          <div class="note">
            <div class="title">Stay connected</div>
            <div class="text">
              Subscribe to our newsletter <br>for exclusive offers
            </div>
            <div class="icons">
              <div class="icon facebook">
                <svg viewBox="0 0 48 48"  xmlns="http://www.w3.org/2000/svg">
                  <g clip-path="url(#clip0_17_61)">
                    <path d="M24 0C10.7453 0 0 10.7453 0 24C0 35.255 7.74912 44.6995 18.2026 47.2934V31.3344H13.2538V24H18.2026V20.8397C18.2026 12.671 21.8995 8.8848 29.9194 8.8848C31.44 8.8848 34.0637 9.18336 35.137 9.48096V16.129C34.5706 16.0694 33.5866 16.0397 32.3645 16.0397C28.4294 16.0397 26.9088 17.5306 26.9088 21.4061V24H34.7482L33.4013 31.3344H26.9088V47.8243C38.7926 46.3891 48.001 36.2707 48.001 24C48 10.7453 37.2547 0 24 0Z"/>
                  </g>
                  <defs>
                    <clipPath id="clip0_17_61">
                      <rect width="48" height="48"/>
                    </clipPath>
                  </defs>
                </svg>
              </div>
              <div class="icon instagram">
                <svg viewBox="0 0 48 48" xmlns="http://www.w3.org/2000/svg">
                  <g clip-path="url(#clip0_17_63)">
                    <path d="M24 4.32187C30.4125 4.32187 31.1719 4.35 33.6938 4.4625C36.0375 4.56562 37.3031 4.95938 38.1469 5.2875C39.2625 5.71875 40.0688 6.24375 40.9031 7.07812C41.7469 7.92188 42.2625 8.71875 42.6938 9.83438C43.0219 10.6781 43.4156 11.9531 43.5188 14.2875C43.6313 16.8187 43.6594 17.5781 43.6594 23.9813C43.6594 30.3938 43.6313 31.1531 43.5188 33.675C43.4156 36.0188 43.0219 37.2844 42.6938 38.1281C42.2625 39.2438 41.7375 40.05 40.9031 40.8844C40.0594 41.7281 39.2625 42.2438 38.1469 42.675C37.3031 43.0031 36.0281 43.3969 33.6938 43.5C31.1625 43.6125 30.4031 43.6406 24 43.6406C17.5875 43.6406 16.8281 43.6125 14.3063 43.5C11.9625 43.3969 10.6969 43.0031 9.85313 42.675C8.7375 42.2438 7.93125 41.7188 7.09688 40.8844C6.25313 40.0406 5.7375 39.2438 5.30625 38.1281C4.97813 37.2844 4.58438 36.0094 4.48125 33.675C4.36875 31.1438 4.34063 30.3844 4.34063 23.9813C4.34063 17.5688 4.36875 16.8094 4.48125 14.2875C4.58438 11.9437 4.97813 10.6781 5.30625 9.83438C5.7375 8.71875 6.2625 7.9125 7.09688 7.07812C7.94063 6.23438 8.7375 5.71875 9.85313 5.2875C10.6969 4.95938 11.9719 4.56562 14.3063 4.4625C16.8281 4.35 17.5875 4.32187 24 4.32187ZM24 0C17.4844 0 16.6688 0.028125 14.1094 0.140625C11.5594 0.253125 9.80625 0.665625 8.2875 1.25625C6.70312 1.875 5.3625 2.69062 4.03125 4.03125C2.69063 5.3625 1.875 6.70313 1.25625 8.27813C0.665625 9.80625 0.253125 11.55 0.140625 14.1C0.028125 16.6687 0 17.4844 0 24C0 30.5156 0.028125 31.3312 0.140625 33.8906C0.253125 36.4406 0.665625 38.1938 1.25625 39.7125C1.875 41.2969 2.69063 42.6375 4.03125 43.9688C5.3625 45.3 6.70313 46.125 8.27813 46.7344C9.80625 47.325 11.55 47.7375 14.1 47.85C16.6594 47.9625 17.475 47.9906 23.9906 47.9906C30.5063 47.9906 31.3219 47.9625 33.8813 47.85C36.4313 47.7375 38.1844 47.325 39.7031 46.7344C41.2781 46.125 42.6188 45.3 43.95 43.9688C45.2812 42.6375 46.1063 41.2969 46.7156 39.7219C47.3063 38.1938 47.7188 36.45 47.8313 33.9C47.9438 31.3406 47.9719 30.525 47.9719 24.0094C47.9719 17.4938 47.9438 16.6781 47.8313 14.1188C47.7188 11.5688 47.3063 9.81563 46.7156 8.29688C46.125 6.70312 45.3094 5.3625 43.9688 4.03125C42.6375 2.7 41.2969 1.875 39.7219 1.26562C38.1938 0.675 36.45 0.2625 33.9 0.15C31.3313 0.028125 30.5156 0 24 0Z"/>
                    <path d="M24 11.6719C17.1938 11.6719 11.6719 17.1938 11.6719 24C11.6719 30.8062 17.1938 36.3281 24 36.3281C30.8062 36.3281 36.3281 30.8062 36.3281 24C36.3281 17.1938 30.8062 11.6719 24 11.6719ZM24 31.9969C19.5844 31.9969 16.0031 28.4156 16.0031 24C16.0031 19.5844 19.5844 16.0031 24 16.0031C28.4156 16.0031 31.9969 19.5844 31.9969 24C31.9969 28.4156 28.4156 31.9969 24 31.9969Z"/>
                    <path d="M39.6937 11.1843C39.6937 12.778 38.4 14.0624 36.8156 14.0624C35.2219 14.0624 33.9375 12.7687 33.9375 11.1843C33.9375 9.59053 35.2313 8.30615 36.8156 8.30615C38.4 8.30615 39.6937 9.5999 39.6937 11.1843Z"/>
                  </g>
                  <defs>
                    <clipPath id="clip0_17_63">
                      <rect width="48" height="48"/>
                    </clipPath>
                  </defs>
                </svg>
              </div>
              <div class="icon telegram">
                <svg viewBox="0 0 48 48" xmlns="http://www.w3.org/2000/svg">
                  <g clip-path="url(#clip0_318_75)">
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M48 24C48 37.2548 37.2548 48 24 48C10.7452 48 0 37.2548 0 24C0 10.7452 10.7452 0 24 0C37.2548 0 48 10.7452 48 24ZM24.8601 17.7179C22.5257 18.6888 17.8603 20.6984 10.8638 23.7466C9.72766 24.1984 9.13251 24.6404 9.07834 25.0726C8.98677 25.803 9.90142 26.0906 11.1469 26.4822C11.3164 26.5355 11.4919 26.5907 11.6719 26.6492C12.8973 27.0475 14.5457 27.5135 15.4026 27.5321C16.1799 27.5489 17.0475 27.2284 18.0053 26.5707C24.5423 22.158 27.9168 19.9276 28.1286 19.8795C28.2781 19.8456 28.4852 19.803 28.6255 19.9277C28.7659 20.0524 28.7521 20.2886 28.7372 20.352C28.6466 20.7383 25.0562 24.0762 23.1982 25.8036C22.619 26.3421 22.2081 26.724 22.1242 26.8113C21.936 27.0067 21.7443 27.1915 21.56 27.3692C20.4215 28.4667 19.5678 29.2896 21.6072 30.6336C22.5873 31.2794 23.3715 31.8135 24.1539 32.3463C25.0084 32.9282 25.8606 33.5085 26.9632 34.2313C27.2442 34.4155 27.5125 34.6068 27.7738 34.7931C28.7681 35.5019 29.6615 36.1388 30.7652 36.0373C31.4065 35.9782 32.0689 35.3752 32.4053 33.5767C33.2004 29.3263 34.7633 20.1169 35.1244 16.3219C35.1561 15.9895 35.1163 15.5639 35.0843 15.3771C35.0523 15.1904 34.9855 14.9242 34.7427 14.7272C34.4552 14.4939 34.0113 14.4447 33.8127 14.4482C32.91 14.4641 31.5251 14.9456 24.8601 17.7179Z"/>
                  </g>
                  <defs>
                    <clipPath id="clip0_318_75">
                      <rect width="48" height="48"/>
                    </clipPath>
                  </defs>
                </svg>
              </div>
              <div class="icon mail">
                <svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
                  <path d="M4 6L10.1076 10.6123L10.1097 10.614C10.7878 11.1113 11.1271 11.3601 11.4988 11.4562C11.8272 11.5412 12.1725 11.5412 12.501 11.4562C12.8729 11.36 13.2132 11.1105 13.8926 10.6123C13.8926 10.6123 17.8101 7.60594 20 6M3 15.8002V8.2002C3 7.08009 3 6.51962 3.21799 6.0918C3.40973 5.71547 3.71547 5.40973 4.0918 5.21799C4.51962 5 5.08009 5 6.2002 5H17.8002C18.9203 5 19.4796 5 19.9074 5.21799C20.2837 5.40973 20.5905 5.71547 20.7822 6.0918C21 6.5192 21 7.07899 21 8.19691V15.8036C21 16.9215 21 17.4805 20.7822 17.9079C20.5905 18.2842 20.2837 18.5905 19.9074 18.7822C19.48 19 18.921 19 17.8031 19H6.19691C5.07899 19 4.5192 19 4.0918 18.7822C3.71547 18.5905 3.40973 18.2842 3.21799 17.9079C3 17.4801 3 16.9203 3 15.8002Z" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                </svg>
              </div>
            </div>
          </div>
        </div>

        <div class="rights">
          © 2025 Activika. All rights reserved.
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { onMounted, onBeforeUnmount } from 'vue';

const handleResize = ()=>{
  if (window.innerWidth < 1290 && window.innerWidth > 991)
    document.getElementsByTagName('html')[0].style.fontSize = `${10 * (window.innerWidth / 1290)}px`;
  else
    document.getElementsByTagName('html')[0].style.fontSize = '';
}

onMounted(()=>{
  window.addEventListener('resize', handleResize)
})

onBeforeUnmount(()=>{
  window.removeEventListener('resize', handleResize)
})
</script>

<style lang="scss" scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  padding-top: 5rem;
}

.navbar {
  display: flex;
  gap: 2rem;
}

.navbar a {
  font-weight: bold;
  color: oklch(37.3% 0.034 259.733);
  text-decoration: none;
  font-size: 1.6rem;
  line-height: 1.1;
  transition: color 0.2s ease-out;

  &:hover{
    color: #fd7645;
  }
}

.navbar a.router-link-exact-active {
  color: #ff6b35;
}

.header{
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  border-bottom: 1px solid #eee;
  background-color: #fff;

  .container{
    display: flex;
    justify-content: space-between;
    align-items: center;
    gap: 2rem;
    padding-block: 0.5rem;
  }
}

.company-name{
  font-size: 3rem;
  font-weight: 700;
  line-height: 1.3;

  text-transform: uppercase;
  color: #0077be;
}

.user-ui{
  display: flex;
  gap: 1rem;

  .ico{
    width: 4rem;
    height: 4rem;
    padding: 0.8rem;

    border-radius: 50%;
    transition: 0.2s ease-out;

    svg{
      width: 2.4rem;
      height: 2.4rem;

      fill:oklch(37.3% 0.034 259.733);
      transition: inherit;
    }

    &:hover{
      background: oklch(96.7% 0.003 264.542);
      box-shadow: 0 2px 8px 0 rgba(68,83,113,.078),0 0 6px 0 rgba(68,83,113,.039);

      svg{
        fill:#ff6b35
      }
    }
  }
}

.footer{
  padding-block: 10rem 4rem;
  background: linear-gradient(to bottom, white -10%, #374151 10%);

  .notes{
    display: flex;
    justify-content: space-between;
    gap: 2.4rem;
    margin-bottom: 3.2rem;

    .note{
      width: 28rem;
      height: 100%;
      text-align: center;

      .title{
        font-size: 2.4rem;
        line-height: 1.4;
        color: white;
        margin-bottom: 1.6rem;

        &.orange{
          color: #ff6b35;
        }
      }

      .text, .link{
        font-size: 1.6rem;
        line-height: 2.4rem;
        color: oklch(87.2% 0.01 258.338);
      }

      .text:has(+div){
        margin-bottom: 1.6rem;
      }

      .link{
        width: fit-content;
        transition: color 0.3s ease-out;

        &:hover{
          color: #ff6b35;
        }
      }

      .links{
        display: flex;
        flex-direction: column;
        gap: 0.8rem;
        align-items: center;
      }

      .icons{
        display: flex;
        gap: 1rem;
        justify-content: center;

        .icon{
          width: 2rem;
          height: 2rem;
          fill: oklch(87.2% 0.01 258.338);
          transition: 0.2s ease-out;

          &.facebook:hover, &.telegram:hover{
            fill: #0099e6;
          }
          &.instagram:hover{
            fill: #ff6b35;
          }

          &.mail{
            fill: transparent;
            stroke: white;

            &:hover{
              stroke: #ff6b35;
            }
          }
        }
      }
    }
  }

  .rights{
    border-top: 1px solid oklch(44.6% 0.03 256.802);
    color: oklch(87.2% 0.01 258.338);
    padding-top: 3.2rem;
    text-align: center;
    font-size: 1.6rem;
    line-height: 2.4rem;
  }
}
</style>

<style>
  *, ::after, ::before{
    box-sizing: border-box;
    text-decoration: none;
  }

  html{
    font-size: 10px;

    @media (max-width: 991px) {
      font-size: 10px;
    }

    .container{
      max-width: 144rem;
      padding: 0 10rem;
      width: 100%;
      margin: 0 auto;
    }

    body{
      margin: 0;
    }
  }
</style>