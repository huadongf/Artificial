## API 接口文档

### 人脸检测

#### Request
- Method: **POST**
- URL:  `http://huadongfintell.vaiwan.com/detectFaces`
- Headers：
- Body:
```json
{
	"image": <image base64>
}
```

#### Response
- Body
```json
{
    "code": 0,
    "msg": "success",
    "data": [
        {
            "rect": {
                "left": 208,
                "top": 33,
                "right": 490,
                "bottom": 315
            },
            "orient": 1,
            "faceId": 0,
            "age": 23,
            "gender": 1,
            "liveness": 1
        }
    ]
}
```

### 人脸对比

#### Request
- Method: **POST**
- URL:  `http://huadongfintell.vaiwan.com/compareFaces`
- Headers：
- Body:
```json
{
	"image1": <image base64>,
	"image2": <image base64>
}
```

#### Response
- Body
```json
{
    "code": 0,
    "msg": "success",
    "data": 0.98655826
}
```

### 人脸识别

#### Request
- Method: **POST**
- URL:  `http://huadongfintell.vaiwan.com/faceRecognition`
- Headers：
- Body:
```json
{
	"image": <image base64>
}
```

#### Response
- Body
```json
{
    "code": 0,
    "msg": "success",
    "data": [
        {
            "rect": {
                "left": 500,
                "top": 111,
                "right": 740,
                "bottom": 351
            },
            "name": "杨紫",
            "similar": 0.9594054
        },
        {
            "rect": {
                "left": 217,
                "top": 135,
                "right": 445,
                "bottom": 363
            },
            "name": "赵丽颖",
            "similar": 0.9706738
        }
    ]
}
```