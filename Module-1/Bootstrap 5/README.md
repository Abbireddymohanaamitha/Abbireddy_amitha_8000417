# Bootstrap 5 Master Practice Project

A beginner-friendly Bootstrap 5 practice project with a modern UI, responsive examples, Sass customization, and interactive JavaScript features.

## Project Overview

This project is designed to teach Bootstrap 5 concepts through hands-on exercises. It includes pages for grid layouts, forms, buttons, navbars, cards, utilities, JavaScript plugins, Sass customization, and more.

## Features

- Responsive Bootstrap 5 layout
- Sticky navbar and hero section
- Dashboard and pricing sections
- Dark / light mode toggle
- Smooth scrolling and scroll-to-top button
- Form validation and toast notifications
- Modal, accordion, collapse, tooltip, and toast components
- Sass customization with local Bootstrap source
- Bootstrap Icons integration

## Technologies Used

- HTML5
- CSS3
- Sass
- Bootstrap 5
- Bootstrap Icons
- JavaScript

## Bootstrap Concepts Covered

- Grid system and responsive columns
- Flexbox utilities and alignment
- Typography and spacing utilities
- Buttons, navbars, cards, and utilities
- JavaScript plugins: modal, accordion, collapse, tooltip, toast
- Sass variable overrides and compiled Bootstrap

## Folder Structure

```text
Bootstrap5-Exercises/
│
├── index.html
├── grid.html
├── forms.html
├── buttons.html
├── navbar.html
├── cards.html
├── utilities.html
├── plugins.html
├── sass-customization.html
│
├── css/
│   ├── style.css
│   ├── custom.css
│   └── bootstrap.min.css
│
├── js/
│   ├── script.js
│   └── bootstrap.bundle.min.js
│
├── sass/
│   ├── custom.scss
│   ├── _variables.scss
│   └── bootstrap.scss
│
├── icons/
├── images/
│   ├── profile.jpg
│   ├── banner.jpg
│   └── sample1.jpg
│
├── node_modules/
├── package.json
└── README.md
```

## Installation Steps

1. Open the project folder in VS Code.
2. Run `npm install` to install Bootstrap, Bootstrap Icons, and Sass.
3. Run `npm run build:css` to compile Sass to `css/style.css`.
4. Open `index.html` in your browser or run `npm start`.

## npm Commands

- `npm install` - install dependencies
- `npm run build:css` - compile Sass to CSS
- `npm run watch:css` - watch Sass files and compile automatically
- `npm start` - open the main page

## Sass Compilation Steps

1. Edit `sass/_variables.scss` to customize Bootstrap theme variables.
2. Edit `sass/custom.scss` for project-specific styles.
3. Run `npm run build:css`.
4. Use `css/style.css` as the compiled theme for the project.

## Screenshots

Add screenshots of the pages after running the project:

- `index.html` hero and dashboard
- `grid.html` responsive grid examples
- `forms.html` registration and login forms
- `buttons.html` button styles and toggle groups
- `navbar.html` responsive navigation

## Future Improvements

- Add more component examples like carousels and offcanvas
- Add advanced utilities and layout exercises
- Add accessibility testing notes
- Add live code playground integration
