# [Platinum V] 영우의 기숙사 청소 - 15806

[문제 링크](https://www.acmicpc.net/problem/15806)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2352, 정답: 320, 맞힌 사람: 221, 정답 비율: 16.542%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 홀짝성

### 문제 설명

<p>통학이 너무나도 하기 싫었던 영우는 결국 학교의 기숙사에 들어갔다. 통학의 고통에서 해방된 기쁨도 잠시, 학교 기숙사에서는 일정 기간마다 청소 검사를 한다는 사실을 알게 되었다. 청소 검사에서 나쁜 점수를 받으면 벌점을 받게 되고, 벌점이 많이 쌓이면 기숙사에서 퇴사 해야 한다. 영우는 어떤 경우에 벌점을 받는지 궁금하여 기숙사에서 진행하는 청소 검사 시스템에 대해 자세히 조사해 보았다. 기숙사 청소 검사 시스템은 오늘로부터 정확히 t 일이 지나고 검사를 하며, 검사 시간 단축을 위해 방의 특정 부분만 검사한다. 하지만 검사하는 특정 부분 중 한 곳이라도 더럽다면 영우는 벌점을 받게 된다. 영우가 사는 방은 N * N 정사각형 방이며, 기숙사 방바닥에는 곰팡이가 서식하고 있다. 곰팡이는 1 일이 지날 때마다 특이한 방식으로 증식하는데, 그림 1(a)의 곰팡이는 1 일이 지나면 그림 1(b)와 같이 8 군데로 증식되고, 원래의 곰팡이는 사라진다. 만약 곰팡이가 증식해야 하는 부분이 벽으로 막혀 있다면, 그곳으로는 증식하지 못한다. 그림 2 는 두 군데의 곰팡이가 1 일이 지난 후 모습이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15806.%E2%80%85%EC%98%81%EC%9A%B0%EC%9D%98%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EC%B2%AD%EC%86%8C/0b4a4c86.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15806/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 422px; height: 157px;" /></p>

<p style="text-align: center;">그림 1(a)&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;그림 1(b)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15806.%E2%80%85%EC%98%81%EC%9A%B0%EC%9D%98%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EC%B2%AD%EC%86%8C/1eb1d536.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15806/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 392px; height: 147px;" /></p>

<p style="text-align: center;">그림 2(a)&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;그림 2(b)</p>

<p>대학원을 준비하느라 바쁜 영우는 청소 검사에서 벌점을 받지 않는다면, 굳이 청소하지 않으려고 한다. 바쁜 영우를 위해 여러분이 영우가 청소를 해야 하는지 아닌지를 알려주자.</p>

### 입력

<p>프로그램의 입력은 표준 입력으로 받는다. 첫 줄에 영우의 방의 크기, 방에 있는 곰팡이의 개수, 청소 검사 시스템이 검사하는 방바닥 좌표의 개수, 청소 검사가 실시 되기까지 남은 일수인 N M K t 가 주어진다. (1 &le; N &le; 300, 0 &le; M &le; N<sup>2</sup>, 0 &le; K &le; N<sup>2</sup>, 1 &le; t &le; 10000)</p>

<p>둘째 줄부터 M 개의 줄에 걸쳐 영우의 방에 있는 곰팡이의 위치인 M<sub>x</sub> M<sub>y</sub>가 주어진다.(1 &le; M<sub>x</sub>, M<sub>y</sub> &le; N)</p>

<p>다음 줄부터 K 개의 줄에 걸쳐 검사관이 검사하는 방바닥의 위치인 K<sub>x</sub> K<sub>y</sub>가 주어진다.(1 &le; K<sub>x</sub>, K<sub>y</sub> &le; N)</p>

### 출력

<p>프로그램의 출력은 표준 출력으로 한다. 영우가 청소를 해야 한다면 &lsquo;YES&rsquo;, 청소를 하지 않아도 된다면 &lsquo;NO&rsquo;를 출력하자.</p>