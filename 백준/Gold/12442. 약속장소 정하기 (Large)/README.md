# [Gold IV] 약속장소 정하기 (Large) - 12442

[문제 링크](https://www.acmicpc.net/problem/12442)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 355, 정답: 131, 맞힌 사람: 105, 정답 비율: 41.176%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>서로 다른 도시에 사는 친구들이 급히 약속장소를 정하려고 한다. 하지만 길이 너무 복잡하고 서로 멀리 살아서, 어느 정도 시간 여유를 잡아야 할지 알아내기가 어렵다. 친구들이 한 곳에서 만나는 데 걸리는 최소한의 시간은 얼마인가?</p>

<p>약속장소를 잡기 위해 펼친 지도에는 도시와 각 도시를 잇는 도로에 대한 정보가 있다. 이것은 두 도시를 연결하는 길을 의미하는 것이 아니라, 연속된 길들의 집합으로서 여러 도시를 지나간다.</p>

<p>더욱 자세히 말하면, 각각의&nbsp;<strong>T</strong>&nbsp;개의 테스트 케이스에 대해 다음과 같은 것이 주어진다.</p>

<ul>
	<li><strong>N</strong>: 도시의 숫자</li>
	<li><strong>P</strong>: 친구의 수</li>
	<li><strong>M</strong>: 도로의 숫자</li>
</ul>

<p>각 도시는 순서대로&nbsp;<strong>1</strong>부터&nbsp;<strong>N</strong>까지의 번호가 붙여져 있다.</p>

<p>또한,&nbsp;<strong>1</strong>부터&nbsp;<strong>P</strong>까지의 번호가 붙여져 있는 각 친구&nbsp;<strong>i</strong>에 대해, 다음과 같은 것이 주어진다.</p>

<ul>
	<li><strong>X<sub>i</sub></strong>: 친구가 출발하는 도시의 번호.</li>
	<li><strong>V<sub>i</sub></strong>: 친구가 거리 1 만큼 움직이는 데 걸리는 시간.</li>
</ul>

<p>&nbsp;</p>

<p>각 도시를 잇는 도로&nbsp;<strong>j</strong>에 대해서는 다음과 같은 것이 주어진다. 도로는 단순히 두 도시를 잇는 길이 아니라, 여러 도시를 순서대로 잇는 연속된 길의 모임이다.</p>

<ul>
	<li><strong>D<sub>j</sub></strong>: 도로가 지나가는 도시들 사이의 거리. (한 도로 위에서, 인접한 도시 사이의 거리는&nbsp;<strong>D<sub>j</sub></strong>로 같다.)</li>
	<li><strong>L<sub>j</sub></strong>: 도로가 지나가는 도시들의 숫자</li>
	<li><strong>{C<sub>j,k</sub>}</strong>: 도로가 이어주는 도시의 번호가 순서대로 나열된다.</li>
</ul>

<p>&nbsp;</p>

<p>위의 정보들을 이용해서, 동시에 출발한 친구들이 한 도시에서 만나는 데 필요한 최소한의 시간을 구하시오. 만약 다들 모일 수 있는 도시가 없다면 &#39;-1&#39;을 대신 출력하시오.</p>

<p>모임은 도시에서만 이루어질 수 있으며, 먼저 도착한 친구들은 다른 친구들을 기다릴 수 있다.</p>

<p>두 도시를 바로 연결하는 도로는 둘 이상 존재할 수 없으며, 어떤 도시에 도착하였을 때, 해당 도시를 지나는 도로 간의 이동은 추가 시간 없이 자유로이 할 수 있다.</p>

### 입력

<p>입력은 다음과 같은 형식으로 주어진다.</p>

<p><br />
T<br />
N P M<br />
X1 V1<br />
X2 V2<br />
...<br />
XP VP<br />
D1 L1 C1,1 C1,2 ... C1,L1<br />
D2 L2 C2,1 C2,2 ... C2,L2<br />
...<br />
DM LM CM,1 CM,2 ... CM,LM<br />
N&#39; P&#39; M&#39;<br />
....</p>

<h3>제한</h3>

<ul>
	<li>각 테스트 케이스에 대한 답은 2147483647 이하이다.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 30.</li>
	<li>1 &le;&nbsp;<strong>V<sub>i</sub></strong>&nbsp;&le; 200.</li>
	<li>1 &le;&nbsp;<strong>D<sub>i</sub></strong>&nbsp;&le; 200.</li>
	<li>2 &le;&nbsp;<strong>L<sub>j</sub></strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10000.</li>
	<li>2 &le;&nbsp;<strong>P</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 1000.</li>
	<li>2 &le;&nbsp;<strong>L<sub>j</sub></strong>&le; 150.</li>
</ul>

### 출력

<p>각각의 테스트 케이스에 대해서, x가 1번부터 시작하는 케이스 번호라고 하고 y가 각 케이스에 해당하는 답이라고 할 때 출력 파일의 각 줄에 &quot;Case #x: y&quot;와 같은 형식으로 출력한다. 친구들이 한 도시에서 만나는 것이 불가능하다면, 최소 시간 대신 &#39;-1&#39;을 출력한다.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12442.%E2%80%85%EC%95%BD%EC%86%8D%EC%9E%A5%EC%86%8C%E2%80%85%EC%A0%95%ED%95%98%EA%B8%B0%E2%80%85(Large)/42093c63.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12441/images-40.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>