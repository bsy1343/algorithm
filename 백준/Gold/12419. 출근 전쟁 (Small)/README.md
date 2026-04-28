# [Gold II] 출근 전쟁 (Small) - 12419

[문제 링크](https://www.acmicpc.net/problem/12419)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

그래프 이론, 자료 구조, 최단 경로, 데이크스트라, 우선순위 큐

### 문제 설명

<p>영수는 다음 주에 첫 출근을 앞두고 있다. 서울의 대중교통은 매우 잘 되어 있지만, 모종의 이유로 모든 교통수단이 검문을 받게 되었다. 영수는 첫 출근인 만큼 지각하지 않기 위해서 미리 회사로 가는 길목의 모든 교통편에 대한 스케쥴과 지연 예상 시간 등을 수집하였다. 과연 영수는 회사까지 가는데 얼마나 걸릴까?</p>

<p>각 교통 수단은 다음과 같이 정의된다.&nbsp;</p>

<ul>
	<li>출발지에서 항상 매시&nbsp;<strong>S</strong>분에 출발하며, 도착지까지 가는데 걸리는 시간은&nbsp;<strong>R</strong>분이다.</li>
	<li>각 차량은 이동 도중 경찰의 검문을 받는다. 검문은 즉각적으로 이루어지지만&nbsp;<strong>P</strong>%의 확률로 문제가 있어서&nbsp;<strong>D</strong>분 동안 지연될 수 있다. 검문은&nbsp;<strong>D</strong>분 후에 다시 이루어지며 이때도 마찬가지로 문제가 있을 경우 또다시 지연될 수 있다. 이 검사는 통과할 때까지 무한히 반복될 수 있다.</li>
	<li>교통 수단에 탑승한 이후에는 도착지에 도착하기 전 중간에 내릴 수 없다.</li>
</ul>

<p>또한, 영수가 집에서 출발하는 시간은 0이며, 어느 길목에서든지 도착시간의 기댓값을 최소화할 수 있는 교통수단을 선택한다.</p>

### 입력

<p>입력의 첫 줄에는 테스트 케이스의 숫자&nbsp;<strong>T</strong>가 주어진다.<br />
각 테스트 케이스는 다음과 같이 주어진다.</p>

<pre>
N M H O
A<sub>0</sub> B<sub>0</sub> S<sub>0</sub> R<sub>0</sub> D<sub>0</sub> P<sub>0</sub>
...
A<sub>M-1</sub> B<sub>M-1</sub> S<sub>M-1</sub> R<sub>M-1</sub> D<sub>M-1</sub> P<sub>M-1</sub>
</pre>

<p>각 케이스의 첫 줄에는 다음과 같이 정수 4개가 주어진다.&nbsp;<strong>N</strong>은 길목의 수,&nbsp;<strong>M</strong>은 교통 수단의 수를 나타낸다. 그리고&nbsp;<strong>H</strong>는 집이 위치한 길목 번호이고,&nbsp;<strong>O</strong>는 회사가 위치한 길목 번호이다.<br />
두 번째 줄부터&nbsp;<strong>M</strong>개의 줄은 6개의 정수가 주어지며, 각각 교통 수단의 정보를 나타낸다.&nbsp;<strong>A<sub>i</sub></strong>는 교통 수단의 출발 길목 번호,&nbsp;<strong>B<sub>i</sub></strong>는 교통 수단의 도착 길목 번호이며,&nbsp;<strong>S<sub>i</sub></strong>는 출발 시간,&nbsp;<strong>R<sub>i</sub></strong>는 이동 소요 시간이다. 그리고&nbsp;<strong>D<sub>i</sub></strong>는 지연시간,&nbsp;<strong>P<sub>i</sub></strong>는 지연확률이다. 지연 확률은 % 수치이다.</p>

<h3>제한</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>H</strong>,&nbsp;<strong>O</strong>,&nbsp;<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>N</strong></li>
	<li>0 &le;&nbsp;<strong>S<sub>i</sub></strong>&nbsp;&le; 59.</li>
	<li>1 &le;&nbsp;<strong>R<sub>i</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>D<sub>i</sub></strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 100.</li>
	<li>모든&nbsp;<strong>i</strong>에 대해서&nbsp;<strong>A<sub>i</sub>&nbsp;!= B<sub>i</sub></strong>&nbsp;이다.</li>
	<li>모든 (<strong>i</strong>&nbsp;&lt;&nbsp;<strong>j</strong>) 쌍에 대해서&nbsp;<strong>A<sub>i</sub>&nbsp;!= A<sub>j</sub></strong>&nbsp;또는&nbsp;<strong>B<sub>i</sub>&nbsp;!= B<sub>j</sub></strong>&nbsp;이다.</li>
	<li>0 &le;&nbsp;<strong>M</strong>&nbsp;&le;&nbsp;<strong>N</strong>&nbsp;- 1.</li>
	<li>모든&nbsp;<strong>i</strong>에 대해서&nbsp;<strong>B<sub>i</sub></strong>&nbsp;=&nbsp;<strong>A<sub>i</sub></strong>&nbsp;+ 1 이다.</li>
</ul>

### 출력

<p>각 테스트 케이스에 대한 출력은 &quot;Case #x: y&quot; 형태로 이루어져야 한다.&nbsp;<strong>x</strong>는 1부터 시작되는 케이스 번호이고,&nbsp;<strong>y</strong>는 도착하는 데 걸리는 시간의 기댓값이다. 10<sup>-6</sup>&nbsp;범위의 절대/상대오차는 정답으로 간주된다. 만약 도착할 수 없다면 -1을 출력한다.</p>