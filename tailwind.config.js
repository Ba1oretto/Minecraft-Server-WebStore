module.exports = {
  content: [
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  darkMode: 'class',
  // 添加tailwind的选择器的字首
  // prefix: 'tw-',

  // 主题配置
  theme: {
    // 规定全局样式
    screens: {
      sm: '640px',
      md: '768px',
      lg: '992px',
      xl: '1100px',
      mdm: {'max': '768px'}
    },

    // 继承默认配置
    extend: {
      // 拓展后缀
      spacing: {
        '88': '22rem',
        '100': '100px',
        '110': '110px',
        '128': '32rem',
        '144': '36rem'
      },
      gridTemplateRows: {
        'body': 'auto 1fr auto'
      },
      colors: {
        gray: {
          '500': '#b3b7bc',
          '750': '#1d2021',
          '900': '#0d0e0f'
        },
        yellow: {
          '400': '#fac021',
          '800': '#92400e',
        },
        custom: {
          '300': '#fac021',
          '400': '#ffe7c2',
          '500': '#3642a9',
          '600': '#5763c7',
          '700': '#f4b174',
          '800': '#bf6936',
          '900': '#dc8a16',
          '1000': '#a35710',
          '1100': '#ab5828',
          '1200': '#181a1b'
        },
        navigator: {
          home: '#22afdc',
          blog: '#20b966',
          help: '#f18725',
        },
        light: '#ffffff1a',
        lighten: '#ffffff4d'
      }
    }
  }
}
