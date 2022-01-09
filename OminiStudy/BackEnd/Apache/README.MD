
# USANDO APACHE 2.4
Breve Tutorial por Diego Mendes


### INSTALL APACHE
apt-get install apache2

### RUN APACHE
systemctl start apache2

### STATUS APACHE
systemctl start apache2

### RESTART APACHE
sudo systemctl restart apache2

### STOP APACHE
systemctl start apache2


#### (se necessário) COMANDOS PARA ATIVAR MODULOS APACHE
sudo a2enmod proxy
sudo a2enmod proxy_http
sudo a2enmod proxy_balancer
sudo a2enmod lbmethod_byrequests

#### VERIFICAR CONFIGURAÇOES
sudo apachectl -t


### CRIAR CONFIG
Fazer o include no arquivo de configuração (proximo passo) nas configuração default do apache.

##### # INCLUDE MANUAL
Include conf.d/*.conf

#### DEPOIS
Na pasta padrão do apache:
1. Criar path -> conf.d >

Em conf.d
1. criar arquivo: httpd-proxy.conf


Nesta pasta há um exemplo inicial do código de configuração que deve ser indexado neste arquivo de configuração.
