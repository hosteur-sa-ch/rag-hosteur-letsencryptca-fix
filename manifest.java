{
    "version": 0.1,
    "type": "update",
    "id": "letencryptfix092021-addon",
    "name": "Fix for Let's Encrypt CA expiration 09-2021",
    "categories": [
      "apps/dev-and-admin-tools"
    ],
    "targetNodes": {
      "nodeType": [
        "tomcat6",
        "tomcat7",
        "tomcat8",
        "tomcat85",
        "tomcat9",
        "tomcat",
        "tomee",
        "tomee-dockerized",
        "glassfish3",
        "glassfish4",
        "glassfish",
        "jetty",
        "jetty6",
        "apache",
        "apache2",
        "nginxphp",
        "apache2-ruby",
        "nginx-ruby",
        "nginx-dockerized",
        "nginxphp-dockerized",
        "nodejs",
        "apache-ruby",
        "apache-python",
        "nginxruby",
        "litespeedphp",
        "litespeedadc",
        "lemp",
        "llsmp"
      ]
    },
    "homepage": "https://github.com/hosteur-sa-ch/rag-hosteur-letsencryptca-fix",
    "baseUrl": "https://raw.githubusercontent.com/hosteur-sa-ch/rag-hosteur-letsencryptca-fix/main/",
    "logo": "images/logo-hosteur_ico_2021.png",
    "description": {
      "text": "Fix for Let's Encrypt CA expiration 09-2021",
      "short": "Fix local CA database on node who need to pull SSL from Let's Encrypt certificates"
    },
    "globals": {
      "env": "${env.name}",
      "nodeID": "${targetNodes.id}"
    },
    "onInstall": [
      "fix-ca-trust"
    ],
    "success": "fix applied",
    "actions": {
      "fix-ca-trust": {
        "cmd[${globals.nodeID}]": "trust dump --filter \"pkcs11:id=%c4%a7%b1%a4%7b%2c%71%fa%db%e1%4b%90%75%ff%c4%15%60%85%89%10\" | openssl x509 | sudo tee /etc/pki/ca-trust/source/blacklist/DST-Root-CA-X3.pem\nupdate-ca-trust extract",
        "user": "root"
      }
    }
  }