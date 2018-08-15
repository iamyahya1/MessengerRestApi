# MessengerRestApi
Une API Rest avec JAX-WS et Jersey

This API is capable of handling this kind of resources :

For the message Ressource :
 - uri /MessengerRestApi/messgaes + Http Get : get all messages
 - uri /MessengerRestApi/messgaes/{messageId} + Http Get : get the message with id of messageId
 - uri /MessengerRestApi/messgaes + Http Post with the message content in the header : create a new messages
 - uri /MessengerRestApi/messgaes/messageId + Http Put with the message content in the header : update the message
 - uri /MessengerRestApi/messgaes/messageId + Http Delete : delete the message 

The Profile resource works the same as the Message resource with just one difference, we use the profileName as identifier instead of profile id. 

# TO DO
1- Use of spring as dependeny injection framework
2- Add MySql as backend 
3- Use of Hibernate and JPA for DAO layer
4- Security management 


