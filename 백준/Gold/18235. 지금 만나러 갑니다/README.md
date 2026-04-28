# [Gold III] 지금 만나러 갑니다 - 18235

[문제 링크](https://www.acmicpc.net/problem/18235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2049, 정답: 622, 맞힌 사람: 447, 정답 비율: 29.603%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>여행을 마치고 꽉꽉나라로 돌아가던 중 오리와 육리는 서로를 잃어버렸다. 현재 오리는 점 <em>A</em>에 있고, 육리는 점 <em>B</em>에 있다.</p>

<p>오리와 육리는 서로를 찾기 위해 무조건 하루에 한 번씩&nbsp;점프를 한다.&nbsp;1일차에는 1만큼&nbsp;점프하고 하루가 지날 때마다 서로가 더욱 보고 싶은 나머지 두 배씩 더 멀리 점프한다. 즉, 현재 위치가 <em>X</em>이고 서로를 찾기 시작한 지 <em>y</em>일차라면&nbsp;점 <em>X</em> + 2<em><sup>y-1</sup></em>&nbsp;또는&nbsp;점 <em>X</em> -&nbsp;2<em><sup>y-1</sup></em>로 점프한다. 0 이하의 점들과 <em>N+1&nbsp;</em>이상의 점들은 디딜&nbsp;땅이 없기 때문에&nbsp;그곳으로 점프한다면 오리와 육리는 영원히 만나지&nbsp;못한다.</p>

<p>아래 그림은 <em>N&nbsp;</em>= 10, <em>A&nbsp;</em>= 4, <em>B&nbsp;</em>= 10일 때의 예시이다. 화살표는 점프 가능한 위치를 나타낸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18235.%E2%80%85%EC%A7%80%EA%B8%88%E2%80%85%EB%A7%8C%EB%82%98%EB%9F%AC%E2%80%85%EA%B0%91%EB%8B%88%EB%8B%A4/13b9070c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18235.%E2%80%85%EC%A7%80%EA%B8%88%E2%80%85%EB%A7%8C%EB%82%98%EB%9F%AC%E2%80%85%EA%B0%91%EB%8B%88%EB%8B%A4/13b9070c.png" data-original-src="https://upload.acmicpc.net/17882260-669e-4a3b-87ab-321b05c5879b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 697px; width: 600px;" /></p>

<p>오리와 육리의 위치가 주어졌을 때, 둘이 만날 수 있는 최소 일수를 구해보자. <strong>같은 날&nbsp;같은 점의 땅에 도착했을&nbsp;때</strong>&nbsp;오리와 육리가 만난 것으로 간주한다.</p>

### 입력

<p>첫 번째 줄에 세 정수 <em>N</em>, <em>A</em>, <em>B</em>가 주어진다.&nbsp;(2 &le; <em>N </em>&le;&nbsp;500,000, 1 &le;&nbsp;<em>A</em>, <em>B</em> &le; <em>N</em>, <em>A</em> &ne; <em>B</em>)</p>

### 출력

<p>첫 번째 줄에 오리와 육리가 만날 수 있는 최소 일수를 출력한다. 만약 오리와 육리가 영원히&nbsp;만날 수 없다면&nbsp;-1을 출력한다.</p>