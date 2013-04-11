A simple tomee based REST/JSON example.

Create the war with `mvn clean package`, copy generated war in webapps, deploy then execute:

```
# curl http://localhost:8080/tomee-rest-json/api/test -H "accept: application/json"
No message body writer has been found for response class List.
```

At this stage you should see an error message instead of expected JSON.
