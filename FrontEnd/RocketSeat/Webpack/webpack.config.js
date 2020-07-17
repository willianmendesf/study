module.exports = {
  entry : './app/src/js/main.js',
  output : {
    path: __dirname + '/app/public/',
    filename : 'bundle.js',
  },
  devServer: {
    contentBase: __dirname + '/app/public'
  },
  module : {
    rules : [
      {
        test: /\.js$/,
        exclude : /node_modules/,
        use : {
          loader : 'babel-loader',
        }
      }
    ]
  } 
}