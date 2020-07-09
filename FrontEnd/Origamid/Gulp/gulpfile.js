const gulp = require("gulp");
// const watch = require("gulp-watch");
const sass = require("gulp-sass");
const pug = require("gulp-pug");
const minify = require("uglify-es");
const cssnano = require("cssnano");
const autoprefixer = require("gulp-autoprefixer");
const GulpClient = require("gulp");
const browserSync = require("browser-sync").create();

// PATHS
const public = "./app/public";
const src = "./app/src";

// PUG ENGINE TEMPLATE
gulp.task("html", function () {
  return gulp.src(`${src}/pug/**/*.pug`).pipe(pug()).pipe(gulp.dest(public));
});

// SASS
gulp.task("compileSass", function () {
  return gulp
    .src(`${src}/sass/**/*.scss`)
    .pipe(
      sass({
        outputStyle: "compressed",
      })
    )
    .pipe(
      autoprefixer({
        browsers: ["last 2 versions"],
        cascade: false,
      })
    )
    .pipe(gulp.dest(`${public}/css`));
});

gulp.task("browserSync", function () {
  browserSync.init({
    server: {
      baseDir: "./app/public",
    },
  });
});

gulp.task("default", function () {
  gulp.watch(`${src}/sass/*.scss`, gulp.series("html", "compileSass"));
});
