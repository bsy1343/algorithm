# [Platinum I] Destabilized Drone - 20348

[문제 링크](https://www.acmicpc.net/problem/20348)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 24, 맞힌 사람: 21, 정답 비율: 27.273%

### 분류

애드 혹, 기하학, 이분 탐색

### 문제 설명

<p>Your brand new drone company is planning to beat the competition with an amazing new piece of software, called the Bank And Pitch Controller. This software will make sure the drone is always horizontal, a must have feature for high end drones. In order to do so, it needs to measure the <em>bank</em> and <em>pitch</em> of the drone. Since the drone already has a front facing camera, this will be used to measure these numbers.</p>

<p>Given a single frame (image) from this camera, the software runs a highly advanced machine learning model to determine whether each pixel in the frame is sky, sea, or exactly on the horizon. The machine learning model is rather slow and can process only $900$ pixels before the next video frame comes in. To stabilize the drone quickly enough, you need to create an efficient algorithm that can find the horizon by querying at most $900$ pixels. Using this information, the rest of the BAPC will be able to compute the bank and pitch.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20348.%E2%80%85Destabilized%E2%80%85Drone/797fd0c9.png" data-original-src="https://upload.acmicpc.net/9be68fd4-491d-4c0e-9243-680d59bdee5f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 250px;" /></p>

<p style="text-align: center;">Figure D.1: Visualisation of Sample 1 showing the queried pixels, including two pixels on the horizon marked in white.</p>

<p>It is given that the horizon can be modelled by an exact straight line, and that at least two pixels in the image will be classified as horizon. Furthermore, the drone is usually flying roughly horizontal, so you may assume that the top row of the picture is always sky and that the bottom row of the picture only contains sea pixels.</p>

<p>A visualisation of the first sample can be seen in Figure D.1.</p>

### 입력



### 출력

