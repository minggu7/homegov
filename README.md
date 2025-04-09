2025-04-09 POST문(INSERT) 성공. userRegister.jsp에서 요청. Controller부터 쭉 따라가면서 진행. 다른점은 Controller의 요청 방법. @RequestMapping(value = "/registerUser.do", method = RequestMethod.POST)
이래도 안되면 요청 url 바꿔보기. registerUser.do 처럼....


출력 jsp 파일도 잘 보기. 그래도 안되면 jdk 버전 호환성 문제일수도

위에 src로 되어있는게 최신버전 POST요청 성공
