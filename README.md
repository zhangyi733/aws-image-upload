This project is a demo about how to upload profile image from frontend website to S3 bucket. It includes frontend(Reactive), backend(Springboot) and S3 storage.
You can find the guide video [here](https://www.youtube.com/watch?v=i-hoSg8iRG0)
# Steps to create this project:
## Spring Boot Part
1. Spring initializr
    * Java 11
2. IntelliJ and AWS SDK
3. AWS Credentials
    * class AmazonConfig
4. Amazon S3 Client
    * class AmazonConfig
5. Create S3 Bucket
    * It's better to create S3 Bucket with Terraform or Cloudformation instead of in Java code or manually
6. Saving files to S3 Bucket
    * Class FileStore
7. User Profile Model
   * Class UserProfile
   * Use Guava to overwrite equals method, it will avoid null exception. e.g. UserProfile::equals()
8. Create in-memory database
    * Class FakeUserProfileDataStore
    * For nullable attributes, it's better to set the return type of getter method to `Optional`. When user invoke the getter method, they will know to handle the null case. e.g. UserProfile::getUserProfileImageLink
9. Controller & service layers
10. Upload image API
11. Check list to upload images

## React Part
12. Facebook create-react-app
    * A [guide](https://github.com/facebook/create-react-app) to start a react app quickly
13. Components and Axios
    * Axios is library to send request to backend(npm -S i axios)
14. Rendering User Profile
15. React Dropzone
    * [Dropzone](https://github.com/react-dropzone/react-dropzone) is library to upload files to server(npm install --save react-dropzone)
16. Pexels
    * [Pexels](www.pexels.com) Good website to download free images
17. UI logic to send files to backend
18. Increase servlet max file size
    * Change `spring.servlet.multipart.max-file-size` in `application.properties`, by default the size is `1MB`
19. Exercise
20. Implement uploadUserProfileImage()
21. Test
22. Set user profile image link
23. Implement download() images
24. Implement download images on frontend
25. Final touches