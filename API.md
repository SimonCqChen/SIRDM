##API文档

###API根路径
`http://218.193.191.67:8880`  
所有POST、PUT方法都需要header  
```
{Content-Type: application/json}
``` 


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

####返回所有推文 GET
`/tweet`
response
```
{
    "_embedded": {
        "tweets": [
            {
                "userId": 1,
                "content": "first tweet",
                "postTime": "2019-05-20T00:56:48.000+0000",
                "_links": {
                    "self": {
                        "href": "http://218.193.191.67:8880/tweet/1"
                    },
                    "tweet": {
                        "href": "http://218.193.191.67:8880/tweet/1"
                    }
                }
            }
        ]
    }
}
```

####根据id获取推文 GET
`/tweet/{tweetId}`  
response
```
{
    "userId": 1,
    "content": "first tweet",
    "postTime": "2019-05-20T00:56:48.000+0000",
    "_links": {
        "self": {
            "href": "http://218.193.191.67:8880/tweet/1"
        },
        "tweet": {
            "href": "http://218.193.191.67:8880/tweet/1"
        }
    }
}
```

####生成新推文 POST
`/tweet`  
body
```
{
    "userId": 1,
    "content": "fourth tweet",
    "postTime": "2019-05-20T00:56:48.000+0000"
}
```
response
```
{
    "userId": 1,
    "content": "fourth tweet",
    "postTime": "2019-05-20T00:56:48.000+0000",
    "_links": {
        "self": {
            "href": "http://218.193.191.67:8880/tweet/11"
        },
        "tweet": {
            "href": "http://218.193.191.67:8880/tweet/11"
        }
    }
}
```

####修改推文 PUT
`/tweet/{tweetId}`  
body  
同生成新推文  
response  
同生成新推文

####删除推文 DELET
`/tweet/{tweetId}`   
无response

