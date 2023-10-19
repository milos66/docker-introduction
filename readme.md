# Dockerfile
1) Ukázat projekt
2) Overit ze nejede db
3) Ukazat, ze aplikace nenastartuje
4) Cilem příkladu je ukázat, jak používat docker...

> Nezapominat buildit projekt, musí existovat jar...

1) vysvětlit docker file
2) `docker build -f Dockerfile -t docker-example-app:dockerfile .`
3) `docker image ls` ukázat že image exituje

nejdrive ukazat bez configu v docker compose

docker ps
docker container ls
# Docker container
1) Pustit DB `docker run -d -p 5432:5432 --name postgres-database -e POSTGRES_PASSWORD=postgres -e POSTGRES_PASSWORD=postgres postgres`
2) Pustit aplicaci a ukazat ulozeni DB a následné načtení.
3) Odstranit container - `docker container rm <id>`
3) Odstranit image - `docker ima rm <id>`
4) Pustit DB znova
5) Ukazat, ze předchozí data nejsou uložena
6) Pustit aplikaci - ` docker run -d --name testapp -p 8085:8085 docker-example-app:dockerfile` - detach mode, exposing port, musí jet DB

# Docker compose
> Na začátku stopnout vytvořené containery... a odstranit image...

1) nejdrive pustit DB a vysvetlit:
   * docker compose 
   * volume 
   * pustit db s volume - predvest, ze se ulozi z localhostu
2) Pustit aplikaci v dockeru:
   * vysvetlit docker compose 
   * exposing ports 
   * docker ps 
   * ukazat env. variables 
   * vysvetlit load balancing 
   * vysvetlit a ukazat site