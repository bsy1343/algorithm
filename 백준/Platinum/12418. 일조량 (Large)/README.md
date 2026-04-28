# [Platinum III] 일조량 (Large) - 12418

[문제 링크](https://www.acmicpc.net/problem/12418)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 7, 맞힌 사람: 7, 정답 비율: 20.000%

### 분류

이분 탐색, 기하학, 수학, 매개 변수 탐색

### 문제 설명

<p>근래의 신혼부부들의 가장 큰 걱정은 집을 마련하는 것이다. 그런데 도시에 살기 원하는 사람은 많고, 집은 굉장히 비싸기 때문에 원하는 집을 구하기가 쉽지 않다. 곧 결혼 예정인 A씨는 다행스럽게도 충분한 돈이 있어서 집을 사는데 큰 문제가 없다. 하지만 A씨에게도 고민이 있다. 살고자하는 집에 해가 충분한 시간동안 들기를 원하기 때문이다. 해는 아침 6시에 동쪽에서 떠서 반원형을 그리며 12시간 후에 서쪽으로 진다. 하지만, 도시에는 건물이 많아서 특정 시간에는 다른 건물에 가려 해가 들지 않는 집들이 많기 때문에 A씨가 원하는만큼 해가 드는 집을 찾는게 쉽지 않다. 도시에 A씨가 원하는 집이 얼마나 될 지 알아보자.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/12418.%E2%80%85%EC%9D%BC%EC%A1%B0%EB%9F%89%E2%80%85(Large)/5536ec4f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12417/images-44.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<p>해는 위의 그림에 나와있는 반원 형태의 경로를 따라서 동쪽에서 서쪽으로 일정한 속도로 움직인다. 그림에서 빨간색으로 나타난 것이 건물이며, 파란색으로 표시된 영역이 가운데 건물의 가장 아래에 위치한 집에 해가 들어오는 시간 영역을 나타낸다. 각 건물에는 동일한 형태의 무한히 많은 집이 존재하며 각 집은 한 건물내에서 같은 높이에 위치하지 않는다. 건물의 넓이는 0이며, 동일한 위치에 건물이 여러채가 있을 수 없다.</p>

### 입력

<p>입력의 첫 줄에는 테스트 케이스의 숫자&nbsp;<strong>T</strong>가 주어진다.<br />
각 테스트 케이스는 다음과 같이 주어진다.</p>

<pre>
N R H
X<sub>0</sub> Y<sub>0</sub>
...
X<sub>N-1</sub> Y<sub>N-1</sub>
</pre>

<p>각 케이스의 첫 줄에는 다음과 같이 정수 3개가 주어진다.&nbsp;<strong>N</strong>은 건물의 수,&nbsp;<strong>R</strong>은 태양 이동 경로의 반지름, 그리고&nbsp;<strong>H</strong>는 A씨가 생각하는 최소 일조시간이다.<br />
두 번째 줄부터&nbsp;<strong>N</strong>개의 줄은 2개의 정수가 주어지며, 각각 건물의 정보를 나타낸다.&nbsp;<strong>X<sub>i</sub></strong>는 건물의 위치 이며,&nbsp;<strong>Y<sub>i</sub></strong>는 건물의 높이이다. 건물의 위치는 반원의 가운데를 기준으로 상대적인 위치를 나타낸다.</p>

<h3>제한</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>100 &le;&nbsp;<strong>R</strong>&nbsp;&le; 1000.</li>
	<li>0 &lt;&nbsp;<strong>H</strong>&nbsp;&le; 12.</li>
	<li><strong>Y</strong>&nbsp;&gt; 0</li>
	<li><strong>X<sup>2</sup></strong>&nbsp;+&nbsp;<strong>Y<sup>2</sup></strong>&nbsp;&lt;&nbsp;<strong>R<sup>2</sup></strong></li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 200.</li>
</ul>

### 출력

<p>각 테스트 케이스에 대한 출력은 &quot;Case #x: y&quot; 형태로 이루어져야 한다. x는 1부터 시작되는 케이스 번호이고, y는 조건을 만족하는 집의 비율이다. 10<sup>-4</sup>범위의 절대/상대오차는 정답으로 간주된다.</p>