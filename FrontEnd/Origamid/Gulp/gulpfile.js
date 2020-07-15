//sudo npm i gulp gulp-sass gulp-pug uglify-es cssnano gulp-autoprefixer gulp-concat browser-sync
const gulp = require("gulp");
const sass = require("gulp-sass");
const pug = require("gulp-pug");
const minify = require("uglify-es");
const cssnano = require("cssnano");
const concat = require("gulp-concat");
const autoprefixer = require("gulp-autoprefixer");
const browserSync = require("browser-sync").create();

// PATHS
const public = "./app/public";
const src = "./app/src";

// PUG
function compilapug(){
  return gulp
    .src(`${src}/pug/**/*.pug`)
    .pipe(pug())
    .pipe(gulp.dest(public));
}
gulp.task("html", compilapug);

// SASS
function compilasass() {
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
    .pipe(gulp.dest(`${public}/assets/css`));
}
gulp.task("sass", compilasass);

// Javascript
function compilajs(){
  return gulp
  .src(`${src}/js/**/*.js`)
  .pipe(concat('main.js'))
  .pipe(gulp.dest(`${public}/assets/js/`))
}
gulp.task("js", compilajs)

// BrowserSync
function browser() {
  browserSync.init({
    server: {
      baseDir: "./app/public",
    },
  });
}
gulp.task("browserSync", browser);

// Watch
function watchview() {
  gulp.watch(`${src}/sass/**/*.scss`, compilasass)
  gulp.watch(`${src}/pug/**/*.pug`, compilapug)
  gulp.watch([`${src}/pug/**/*.pug`,`${src}/js/*.js`, `${src}/sass/**/*.scss`]).on("change", browserSync.reload)
}
gulp.task("watch", watchview);

// Default
gulp.task("default", gulp.parallel("watch", "browserSync"))