/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        dark: {
          900: '#06070B',
          800: '#0C0E14',
          700: '#151821',
          600: '#202430'
        },
        sentinel: {
          red: '#EF4444',
          orange: '#F97316',
          blue: '#3B82F6'
        }
      }
    },
  },
  plugins: [],
}
