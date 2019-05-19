##API文档

###API根路径
`http://218.193.191.67:8880`

###API列表
####获取所有用户 GET
`/user`  
response  
```
{
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
     "auth": 1
   }
```

####添加新用户 POST
`/user`  
headers  
```
{Content-Type: application/json}
```  
body
```
{
    "userName": "test1", //不可重复
    "password": "111111",
    "email": "1@222", //不可重复
    "auth": 0
}
```
response
```
{
    "userName": "test1",
    "password": "111111",
    "email": "111@22",
    "auth": 0
}
```

####修改用户 PUT
`/user/{userId}`  
headers  
```
{Content-Type: application/json}
```  
body
```
{
    "userName": "test1", //不可重复
    "password": "111111",
    "email": "1@222", //不可重复
    "auth": 0
}
```
response
```
{
    "userName": "test1",
    "password": "111111",
    "email": "111@22",
    "auth": 0
}
```

####删除用户 DELETE
`/user/{userId}`  
无response  

