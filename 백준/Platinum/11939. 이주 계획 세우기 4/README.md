# [Platinum I] 이주 계획 세우기 4 - 11939

[문제 링크](https://www.acmicpc.net/problem/11939)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 17, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

해 구성하기, 기하학, 그래프 이론, 휴리스틱

### 문제 설명

<p>21XX년, 당신이 사는 행성은&nbsp;큰 위기를 맞았고&nbsp;행성의 대표인 당신은 FTL (Faster Than Light) 엔진을 이용하여&nbsp;최근에 발견된 &quot;BOJ-1014&quot; 행성으로 사람들을 이주시킬 계획을 세우고 있다.</p>

<p>당신이 사는 행성에는 N개의 나라가 있으며 M개의 우호적 관계가 있고&nbsp;&quot;BOJ-1014&quot; 행성에는 L (L &ge; N)&nbsp;개의 거주지역이 있다. 거주지역은 2차원 좌표평면에 나타내었을 때&nbsp;i번&nbsp;거주 지역은&nbsp;P<sub>i</sub>(X<sub>i</sub>, Y<sub>i</sub>) (1 &le; i &le; L)&nbsp;에 있다. 각 거주지역에는 오직 한 나라만 들어설 수 있다.</p>

<p>어떤 두 나라가 우호적 관계에 있으면 그 두 나라를 잇는 철도를 건설해야 한다. 철도는 두 나라를 잇는 선분이며 한 철도가 다른 철도와 교차하는 상황이&nbsp;발생할 수 있다. 철도가 서로 교차하는&nbsp;점이&nbsp;있을 때 위험할 수 있고 건설 비용도 더 많이 들어가므로&nbsp;가능한 교차하는 철도의 쌍을 최소화 하고자 한다.</p>

<p>당신의 행성의 나라와 우호적 관계 그리고 이주할 행성의 정보가 주어졌을&nbsp;때 나라들을 잘 배치하여 교차하는 철도의 쌍의 개수를&nbsp;가능한 적게 만드는 프로그램을 작성하자.</p>

### 입력

<p>총 5개의 부분 문제로 구성되어 있으며 한&nbsp;개의 부분문제는 한&nbsp;개의 입력 데이터를 가진다. (밑의&nbsp;힌트 부분을&nbsp;참조)</p>

<p>입력&nbsp;파일의 형식은 다음과 같다.</p>

<ul>
	<li>첫&nbsp;번째 줄에는 N과 M이 주어진다. N은 나라의 수를,&nbsp;M은 M개의 우호적 관계가 있음을&nbsp;뜻한다.</li>
	<li>다음 j&nbsp;(1 &le; j &le; M)&nbsp;번째&nbsp;줄에 2개의 정수 A<sub>j</sub>와&nbsp;B<sub>j</sub>가 주어지는데 이는 A<sub>j</sub>번&nbsp;나라와 B<sub>j</sub>번&nbsp;나라가 우호관계에 있음을 나타낸다.</li>
	<li>다음 줄에는 거주지역의 개수 L이 주어진다.</li>
	<li>다음 i (1 &le; i &le; L)&nbsp;번째 줄에는 2개의 정수&nbsp;X<sub>i</sub>와 Y<sub>i&nbsp;</sub>가 주어지는데 i번&nbsp;거주지역 P<sub>i</sub>(X<sub>i,&nbsp;</sub>Y<sub>i</sub>)&nbsp;의 위치를 나타낸다.&nbsp;</li>
</ul>

<p>모든 입력 데이터는 다음 조건을 만족한다.</p>

<ul>
	<li>1 &le; A<sub>j</sub>&nbsp;&le; N.</li>
	<li>1 &le; B<sub>j</sub>&nbsp;&le; N.</li>
	<li>1 &le; X<sub>i</sub>&nbsp;&le; 100 000.</li>
	<li>1 &le; Y<sub>i</sub>&nbsp;&le; 100 000.</li>
	<li>거주지역 P<sub>i</sub>, P<sub>j</sub>, P<sub>k</sub>&nbsp;(1 &le; i &lt; j &lt; k &le; L)&nbsp;는 하나의 선으로 이어질 수 없다.</li>
	<li>임의의 두 도시에 대해 철도를 통해 가는 방법이 항상 존재한다.&nbsp;</li>
</ul>

### 출력

<p>입력 파일에 대하여 출력 데이터를&nbsp;제출하면 된다. 출력 데이터는&nbsp;총 N줄로 구성되어 있고 k (1 &le; k &le; N)&nbsp;번째 줄에는 k번 나라가 위치한 지역의 번호가 있어야 한다.</p>

### 힌트

<p>이 문제는&nbsp;<a href="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/data/11936.zip">압축 파일</a>의 04.txt로 채점을 합니다.</p>

<p>주의</p>

<p>나라를 배치하는 방법에 따라&nbsp;한&nbsp;점에서 2개 이상의 철도가 교차할 수 있다.</p>

<p>부분 문제</p>

<p>각 부분 문제에 대하여&nbsp;N, M, L, S, T 값은 아래의 테이블을 참조하길 바란다. 여기서 S와 T는 점수 측정을 위한 값이다.</p>

<table class="table table-bordered" style="width:329px">
	<thead>
		<tr>
			<th>Subtask</th>
			<th>N</th>
			<th>M</th>
			<th>L</th>
			<th>S</th>
			<th>T</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>30</td>
			<td>50</td>
			<td>60</td>
			<td>25</td>
			<td>100</td>
		</tr>
		<tr>
			<td>2</td>
			<td>125</td>
			<td>124</td>
			<td>300</td>
			<td>0</td>
			<td>75</td>
		</tr>
		<tr>
			<td>3</td>
			<td>200</td>
			<td>2000</td>
			<td>400</td>
			<td>110000</td>
			<td>250000</td>
		</tr>
		<tr>
			<td>4</td>
			<td>250</td>
			<td>350</td>
			<td>250</td>
			<td>400</td>
			<td>2000</td>
		</tr>
		<tr>
			<td>5</td>
			<td>300</td>
			<td>1600</td>
			<td>500</td>
			<td>72000</td>
			<td>150000</td>
		</tr>
	</tbody>
</table>

<p>점수 측정</p>

<p>이 문제는 출력 데이터를&nbsp;제출하여&nbsp;점수를 받을 수 있으며 총 5개의 부분 문제가 있다. 각 부분 문제는 한&nbsp;개의 데이터 파일로 구성되어 있으며 제출&nbsp;시 아래의 조건에 따라 점수를 받을 수 있다.</p>

<ul>
	<li>만약 출력이&nbsp;문제 조건에 만족하지&nbsp;않는 경우, 0점을 받는다.</li>
	<li>만약 출력이 문제 조건을 만족하는 경우, 점수는 각 부분 점수에 대해 정해져 있는 S와 T에 따라 점수를 받을 수 있다. 출력 데이터에서 교차하는 철도 쌍의 개수를 C라고 하자.
	<ul>
		<li>T &lt; C 이면 0점을 받는다.</li>
		<li>S &lt; C ≦ T 이면 \( \lfloor 1 + 19 \times (\frac{T-C}{T-S})&nbsp;\rfloor&nbsp;\)&nbsp;여기서&nbsp;\(&nbsp;\lfloor x \rfloor \)&nbsp;는 x보다 작거나 같은 정수 중에서 가장 큰 정수를 말한다.</li>
		<li>C &le; S 이면 20점을 받는다.</li>
	</ul>
	</li>
</ul>

<p>예제 입력과 출력</p>

<p>예제의 입력에선 총 7개의 거주지역이 있으며 아래의 그림과 같다.&nbsp;</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/11939.%E2%80%85%EC%9D%B4%EC%A3%BC%E2%80%85%EA%B3%84%ED%9A%8D%E2%80%85%EC%84%B8%EC%9A%B0%EA%B8%B0%E2%80%854/17427dfe.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11939.%E2%80%85%EC%9D%B4%EC%A3%BC%E2%80%85%EA%B3%84%ED%9A%8D%E2%80%85%EC%84%B8%EC%9A%B0%EA%B8%B0%E2%80%854/17427dfe.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11936/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:223px; width:268px" /></p>

<p>총 6개의 나라가 있으며&nbsp;다음과 같이 배치하고자 한다.</p>

<ul>
	<li>1번 나라를 1번&nbsp;지역으로 배치한다.</li>
	<li>2번 나라를 5번&nbsp;지역으로 배치한다.</li>
	<li>3번 나라를 4번&nbsp;지역으로 배치한다.</li>
	<li>4번 나라를 2번&nbsp;지역으로 배치한다.</li>
	<li>5번 나라를 7번&nbsp;지역으로 배치한다.</li>
	<li>6번 나라를 3번&nbsp;지역으로 배치한다.</li>
</ul>

<p>그다음 우호관계에 따라 철도를 건설하면 아래의 그림과 같이 된다. 총 2개의 철도&nbsp;쌍이 교차하는 것을&nbsp;알 수 있다.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/11939.%E2%80%85%EC%9D%B4%EC%A3%BC%E2%80%85%EA%B3%84%ED%9A%8D%E2%80%85%EC%84%B8%EC%9A%B0%EA%B8%B0%E2%80%854/62564f11.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11939.%E2%80%85%EC%9D%B4%EC%A3%BC%E2%80%85%EA%B3%84%ED%9A%8D%E2%80%85%EC%84%B8%EC%9A%B0%EA%B8%B0%E2%80%854/62564f11.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11936/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:229px; width:270px" /></p>

<ul>
	<li>거주지역 1번 (1번 나라가 배치된 곳) 과 거주지역 4번 (3번 나라가 배치된 곳) 을 잇는 철도와&nbsp;거주지역 2번 (4번 나라가 배치된 곳) 과 거주지역 3번 (6번 나라가 배치된 곳) 잇는 철도가 교차한다.</li>
	<li>거주지역 1번 (1번 나라가 배치된 곳) 과 거주지역 4번 (3번 나라가 배치된 곳) 을 잇는 철도와&nbsp;거주지역 2번 (4번 나라가 배치된 곳) 과 거주지역 5번 (2번 나라가 배치된 곳) 잇는 철도가 교차한다.</li>
</ul>