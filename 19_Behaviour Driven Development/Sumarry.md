# BEHAVIOUR DRIVEN DEVELOPMENT
Behavior Driven Development (BDD) adalah metodologi pengembangan perangkat lunak yang berfokus pada interaksi antara pengguna atau pelanggan dengan aplikasi atau sistem yang sedang dikembangkan. BDD bertujuan untuk membangun pemahaman yang jelas dan terukur mengenai kebutuhan pengguna dan bagaimana aplikasi harus berperilaku dalam memenuhi kebutuhan tersebut.

Dalam BDD, kebutuhan fungsional dinyatakan dalam bentuk skenario, yang disebut dengan “feature file”. Setiap skenario berisi kumpulan langkah-langkah yang harus dilakukan oleh sistem untuk memenuhi kebutuhan tersebut. Skenario dijabarkan dalam bahasa yang mudah dipahami oleh pengguna atau pelanggan, sehingga memudahkan untuk mendapatkan umpan balik dan mengubah kebutuhan jika diperlukan.

BDD menggunakan teknik pengujian otomatisasi untuk memastikan bahwa aplikasi berperilaku sesuai dengan skenario yang telah ditentukan. Dalam BDD, pengujian otomatisasi disebut dengan “automated acceptance testing”, yang dilakukan dengan menggunakan alat bantu seperti Cucumber, Behat, atau SpecFlow.

Keuntungan dari menggunakan BDD antara lain adalah meningkatkan kolaborasi antara tim pengembang dan pengguna, memastikan aplikasi yang dibangun memenuhi kebutuhan pengguna, dan mengurangi risiko kegagalan pengembangan. Selain itu, BDD juga memungkinkan pengguna dan pengembang untuk berkomunikasi dengan lebih efektif dan membangun pemahaman yang sama mengenai aplikasi yang akan dikembangkan.


## What Cucumber?
Cucumber adalah salah satu alat bantu (tool) yang digunakan dalam pengembangan perangkat lunak yang menerapkan metodologi Behavior Driven Development (BDD). Cucumber membantu dalam menguraikan kebutuhan bisnis ke dalam bentuk skenario pengujian, yang dapat dimengerti oleh stakeholder dan tim pengembang, serta dapat dieksekusi sebagai pengujian otomatis.

Cucumber menawarkan bahasa yang mudah dimengerti oleh stakeholder bisnis, seperti Bahasa Inggris, dan bahasa yang mudah dimengerti oleh tim pengembang, seperti Gherkin. Gherkin adalah bahasa yang digunakan untuk menulis skenario pengujian dalam Cucumber. Skenario yang ditulis dalam Gherkin disebut dengan "feature file", dan memiliki struktur yang terdiri dari background, scenario, step, dan data.

Dalam Cucumber, setiap skenario dipecah menjadi langkah-langkah (step) yang harus dilakukan oleh sistem untuk memenuhi kebutuhan pengguna. Setiap langkah dapat diimplementasikan dalam kode dan diuji secara otomatis untuk memastikan bahwa aplikasi berperilaku sesuai dengan skenario yang telah ditentukan.

Keuntungan menggunakan Cucumber antara lain:

Membantu dalam menguraikan kebutuhan bisnis ke dalam skenario pengujian yang dapat dimengerti oleh stakeholder dan tim pengembang.
Meningkatkan kolaborasi antara stakeholder dan tim pengembang dalam mengembangkan aplikasi.
Membantu dalam memastikan bahwa aplikasi berperilaku sesuai dengan kebutuhan pengguna.
Meningkatkan efisiensi pengujian dengan otomatisasi pengujian berbasis skenario.

## BDD Format
Format BDD umumnya terdiri dari tiga bagian yaitu: "Feature", "Scenario", dan "Step".

- Feature:
"Feature" merupakan deskripsi singkat tentang fitur atau fungsi aplikasi yang akan dikembangkan, biasanya ditulis dalam kalimat singkat dan jelas. Feature juga dapat berisi contoh kasus penggunaan atau "use case" dari fitur tersebut.
- Scenario:
"Scenario" merupakan contoh kasus penggunaan atau "use case" dari fitur atau fungsi yang ditentukan pada "Feature". Scenario ditulis dalam format yang mudah dipahami oleh pengguna atau pemangku kepentingan (stakeholder). Scenario harus mencakup semua kemungkinan penggunaan yang diperkirakan terjadi pada fitur atau fungsi yang sedang dikembangkan.
- Step:
"Step" merupakan langkah-langkah yang harus dilakukan oleh sistem untuk menyelesaikan Scenario. Setiap step harus ditulis dalam bahasa yang mudah dipahami oleh pengguna dan harus mencakup tindakan yang harus dilakukan oleh pengguna atau sistem, hasil yang diharapkan dari tindakan tersebut, dan kondisi awal dan akhir dari setiap step.

Contoh:
Feature: Login Page
  As a user
  I want to be able to log in
  So that I can access my account

  Scenario: Successful Login
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the dashboard

  Scenario: Unsuccessful Login
    Given I am on the login page
    When I enter invalid credentials
    Then I should see an error message
    
Dalam contoh di atas, "Feature" adalah halaman login, dengan tujuan untuk memungkinkan pengguna untuk masuk ke akun mereka. "Scenario" mencakup dua kasus penggunaan, yaitu "Successful Login" dan "Unsuccessful Login", yang masing-masing terdiri dari tiga "Step" yang harus dilakukan oleh sistem.

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Dillinger is a cloud-enabled, mobile-ready, offline-storage compatible,
AngularJS-powered HTML5 Markdown editor.

- Type some Markdown on the left
- See HTML in the right
- ✨Magic ✨

## Features

- Import a HTML file and watch it magically convert to Markdown
- Drag and drop images (requires your Dropbox account be linked)
- Import and save files from GitHub, Dropbox, Google Drive and One Drive
- Drag and drop markdown and HTML files into Dillinger
- Export documents as Markdown, HTML and PDF

Markdown is a lightweight markup language based on the formatting conventions
that people naturally use in email.
As [John Gruber] writes on the [Markdown site][df1]

> The overriding design goal for Markdown's
> formatting syntax is to make it as readable
> as possible. The idea is that a
> Markdown-formatted document should be
> publishable as-is, as plain text, without
> looking like it's been marked up with tags
> or formatting instructions.

This text you see here is *actually- written in Markdown! To get a feel
for Markdown's syntax, type some text into the left window and
watch the results in the right.

## Tech

Dillinger uses a number of open source projects to work properly:

- [AngularJS] - HTML enhanced for web apps!
- [Ace Editor] - awesome web-based text editor
- [markdown-it] - Markdown parser done right. Fast and easy to extend.
- [Twitter Bootstrap] - great UI boilerplate for modern web apps
- [node.js] - evented I/O for the backend
- [Express] - fast node.js network app framework [@tjholowaychuk]
- [Gulp] - the streaming build system
- [Breakdance](https://breakdance.github.io/breakdance/) - HTML
to Markdown converter
- [jQuery] - duh

And of course Dillinger itself is open source with a [public repository][dill]
 on GitHub.

## Installation

Dillinger requires [Node.js](https://nodejs.org/) v10+ to run.

Install the dependencies and devDependencies and start the server.

```sh
cd dillinger
npm i
node app
```

For production environments...

```sh
npm install --production
NODE_ENV=production node app
```

## Plugins

Dillinger is currently extended with the following plugins.
Instructions on how to use them in your own application are linked below.

| Plugin | README |
| ------ | ------ |
| Dropbox | [plugins/dropbox/README.md][PlDb] |
| GitHub | [plugins/github/README.md][PlGh] |
| Google Drive | [plugins/googledrive/README.md][PlGd] |
| OneDrive | [plugins/onedrive/README.md][PlOd] |
| Medium | [plugins/medium/README.md][PlMe] |
| Google Analytics | [plugins/googleanalytics/README.md][PlGa] |

## Development

Want to contribute? Great!

Dillinger uses Gulp + Webpack for fast developing.
Make a change in your file and instantaneously see your updates!

Open your favorite Terminal and run these commands.

First Tab:

```sh
node app
```

Second Tab:

```sh
gulp watch
```

(optional) Third:

```sh
karma test
```

#### Building for source

For production release:

```sh
gulp build --prod
```

Generating pre-built zip archives for distribution:

```sh
gulp build dist --prod
```

## Docker

Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the
Dockerfile if necessary. When ready, simply use the Dockerfile to
build the image.

```sh
cd dillinger
docker build -t <youruser>/dillinger:${package.json.version} .
```

This will create the dillinger image and pull in the necessary dependencies.
Be sure to swap out `${package.json.version}` with the actual
version of Dillinger.

Once done, run the Docker image and map the port to whatever you wish on
your host. In this example, we simply map port 8000 of the host to
port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart=always --cap-add=SYS_ADMIN --name=dillinger <youruser>/dillinger:${package.json.version}
```

> Note: `--capt-add=SYS-ADMIN` is required for PDF rendering.

Verify the deployment by navigating to your server address in
your preferred browser.

```sh
127.0.0.1:8000
```

## License

MIT

**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
