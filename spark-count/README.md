# spark-count
Simple spark count example that makes used of spark-cassandra-connector.

Prerequisite :

* [Docker] (https://docs.docker.com/mac/started/)
* [Docker Compose] (https://docs.docker.com/compose/install/)

In your /etc/hosts file add:


     # Mac OS X (boot2docker / docker-machine)
     localspark $(boot2docker ip)

     # Linux Distributions
     localspark 127.0.0.1

Start spark master and worker:

    ./start-docker-spark.sh

Spark UI:

* [Spark Master] (http://localspark:8080/)
* [Spark Worker] (http://localspark:8081/)


Build:

    ./build

Docker logs:

    docker-compose logs

