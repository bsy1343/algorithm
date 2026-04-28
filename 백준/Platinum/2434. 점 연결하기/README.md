# [Platinum II] 점 연결하기 - 2434

[문제 링크](https://www.acmicpc.net/problem/2434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 22, 맞힌 사람: 17, 정답 비율: 45.946%

### 분류

많은 조건 분기, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>3 &times; N개의 점이 찍혀있는 직사각형 그리드가 있다. 그리드 상의 모든 점은 최대 8개의 이웃한 점을 가지고 있다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2463aeeb-ccc7-4bea-975c-6080bd85fafb/-/preview/" style="width: 106px; height: 105px;" /></p>

<p>그리드 상의 점을 연결해서 만들 수 있는 다각형의 개수를 구하려고 한다. 다각형은 아래와 같은 조건을 만족해야 한다.</p>

<ol>
	<li>꼭짓점은 3 &times; N개 모두로 이루어져 있어야 한다.</li>
	<li>다각형에서 인접한 꼭짓점은 그리드상에서 이웃한 점이어야 한다.</li>
	<li>단순 다각형이어야 한다. 즉, 변이 교차하며 안 된다.</li>
</ol>

<p>아래 그림은 N=6인 경우에 가능한 두 가지 다각형이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a7ee11de-3edc-4a6d-a6c3-db307d5c17c1/-/preview/" style="width: 545px; height: 105px;" /></p>

<p>N이 주어졌을 때, 만들 수 있는 다각형의 개수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에는 양의 정수 N이 주어진다. (N &le; 1,000,000,000).</p>

### 출력

<p>다각형의 만드는 방법의 수를 &nbsp;1,000,000,000로 나눈 나머지를 출력한다.</p>