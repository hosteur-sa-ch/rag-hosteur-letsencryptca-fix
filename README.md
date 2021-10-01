# Fix for Let's Encrypt CA expiration 09-2021 on Ragnarokkr nodes

Let's Encrypt new Root CA on 09-30-2021
[Article](https://letsencrypt.org/2020/09/17/new-root-and-intermediates.html)

Fixing CA Trust for Ragnarokkr nodes when using Let's Encrypt new Root CA

Correction du CA Trust pour les nodes Ragnarokkr lors de l'utilisation du nouveau Root CA Let's Encrypt

## Application du patch sur Ragnarokkr
>How to apply the patch


Dans votre (dashboard)[https://app.rag-control.hosteur.com/]: 
>From your (dashboard)[https://app.rag-control.hosteur.com/]

1 - Ouvrir l'import de JPS (open JPS Import menu)

2 - Copier l'url ci-contre (copy this url ) : 

https://raw.githubusercontent.com/hosteur-sa-ch/rag-hosteur-letsencryptca-fix/main/manifest.jps

3 - Importer le package (Import the package)

![src3](/images/src_3.png)

4 - Choisir l'environement et le noeud a patcher (Choose the env and node to patch)

![src2](/images/src_2.png)

5 - Appliquer le path (Apply the patch)

![src1](/images/src_1.png)
