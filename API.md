##API文档

###API根路径
`http://218.193.191.67:8880`

###API列表
####获取所有用户 GET
`/user`  
response  
```
{
  "_embedded": {
    "users": [
      {
        "userName": "ccq",
        "password": "111111",
        "email": "111@222",
        "auth": 1,
        "_links": {
          "self": {
            "href": "http://218.193.191.67:8880/user/1"
          },
          "user": {
            "href": "http://218.193.191.67:8880/user/1"
          }
        }
      }
    ]
  }
```

####根据userId获取用户 GET
`/user/{userId}`  
response
```
{
     "userName": "ccq",
     "password": "111111",
     "email": "111@222",
     "auth": 1,
     "_links": {
       "self": {
         "href": "http://218.193.191.67:8880/user/1"
       },
       "user": {
         "href": "http://218.193.191.67:8880/user/1"
       }
     }
   }
```