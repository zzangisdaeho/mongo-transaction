mkdir mongo_keyfile

openssl rand -base64 741 > mongo_keyfile/keyfile
chmod 400 mongo_keyfile/keyfile

docker run --name mongo-container \             
-e MONGO_INITDB_ROOT_USERNAME=root \
-e MONGO_INITDB_ROOT_PASSWORD=1234 \
-p 27017:27017 \
-v /Users/issac/mongo_keyfile:/etc/mongo_keyfile \
mongo --replSet rs0 \
--setParameter authenticationMechanisms=SCRAM-SHA-1,SCRAM-SHA-256 \
--keyFile /etc/mongo_keyfile/keyfile

->

컨테이너 접속 후 mongosh 로그인

rs.initiate()

