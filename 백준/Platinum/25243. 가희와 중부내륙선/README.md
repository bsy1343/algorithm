# [Platinum V] 가희와 중부내륙선 - 25243

[문제 링크](https://www.acmicpc.net/problem/25243)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 116, 정답: 52, 맞힌 사람: 36, 정답 비율: 40.909%

### 분류

자료 구조, 구현, 우선순위 큐, 시뮬레이션

### 문제 설명

<p>중부 내륙선은 2021년 12월 31일에 개통된 단선 철도입니다. 하행 열차는&nbsp;부발역을 출발하여 가남, 감곡장호원, 앙성온천, 충주 순으로 멈추고, 상행 열차는&nbsp;충주를 출발하여 앙성온천, 감곡장호원, 가남, 부발역 순으로 멈춥니다. 각 구간의 소요 시간은 [표 1]과 같습니다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 400px;">
	<tbody>
		<tr>
			<td style="text-align: center;">구간</td>
			<td style="text-align: center;">소요 시간</td>
		</tr>
		<tr>
			<td style="text-align: center;">부발 ~ 가남</td>
			<td style="text-align: right;">7</td>
		</tr>
		<tr>
			<td style="text-align: center;">가남 ~ 감곡장호원</td>
			<td style="text-align: right;">7</td>
		</tr>
		<tr>
			<td style="text-align: center;">감곡장호원 ~ 앙성온천</td>
			<td style="text-align: right;">8</td>
		</tr>
		<tr>
			<td style="text-align: center;">앙성온천 ~ 충주</td>
			<td style="text-align: right;">10</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 1] 각 구간의 소요 시간</strong></p>

<p>중부내륙선은 단선이어서, 구간에는 한 열차만 운행할 수 있습니다.&nbsp;하지만, 역에는 상행 열차 여러 대와 하행 열차 여러 대가 동시에 정차할 수 있습니다. 하행 열차와 상행 열차는 아래 알고리즘으로 운행됩니다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 800px;">
	<tbody>
		<tr>
			<td style="text-align: center;">순번</td>
			<td style="text-align: center;">하행</td>
			<td style="text-align: center;">상행</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">부발역에서 HH시 mm분에 문을 닫는다.</td>
			<td style="text-align: center;">충주역에서 HH시 mm분에 문을 닫는다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">구간 부발 ~ 가남을 운행한다.</td>
			<td style="text-align: center;">구간 앙성온천 ~ 충주를 운행한다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">1분간 가남역에 머무르고 문을 닫는다.</td>
			<td style="text-align: center;">1분간 앙성온천역에 머무르고 문을 닫는다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">구간 가남 ~ 감곡장호원을 운행한다.</td>
			<td style="text-align: center;">구간 감곡장호원 ~ 앙성온천을 운행한다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">1분간 감곡장호원역에 머무르고 문을 닫는다.</td>
			<td style="text-align: center;">1분간 감곡장호원역에 머무르고 문을 닫는다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">구간 감곡장호원 ~ 앙성온천을 운행한다.</td>
			<td style="text-align: center;">구간 가남 ~ 감곡장호원을 운행한다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">1분간 앙성온천역에 머무르고 문을 닫는다.</td>
			<td style="text-align: center;">1분간 가남역에 머무르고 문을 닫는다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">구간 앙성온천 ~ 충주를 운행한다.</td>
			<td style="text-align: center;">구간 부발 ~ 가남을 운행한다.</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">충주역에 도착하면 운행을 종료한다.</td>
			<td style="text-align: center;">부발역에 도착하면 운행을 종료한다.</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 2] 하행, 상행 열차의 운행 알고리즘</strong></p>

<p>표 2는 하행 열차와 상행 열차가 시발역에서 종착역까지 가기 위해서 수행하는 일들을 나타냅니다. <strong>이 중 순번 2, 4, 6, 8은 구간을 운행하는 것이므로</strong> 관제의 허가를 받아야 합니다. 허가를 받지 못하면 받을 때까지 대기했다가 수행합니다.&nbsp;하행에서의 <code>A</code>역&nbsp;다음 역이 <code>B</code>역이라고 했을 때, 관제는 구간 <code>A ~ B</code>에 대해서</p>

<ol>
	<li>구간 <code>A ~ B</code>를 운행하는 열차가 있는 경우, 다른 열차가 구간 <code>A ~ B</code>에 접근하는 것을 허용하지 않습니다.</li>
	<li>그렇지 않은 경우
	<ol>
		<li><code>A</code>역에서 구간 <code>A ~ B</code>를 운행하려고 하는 하행 열차 <code>h</code>만 있다면, <code>h</code>가 구간 <code>A ~ B</code>를 운행하는 것을 허용합니다.</li>
		<li><code>B</code>역에서 구간 <code>A ~ B</code>를 운행하려고 하는 상행 열차 <code>s</code>만 있다면, <code>s</code>가 구간 <code>A ~ B</code>를 운행하는 것을 허용합니다.</li>
		<li>그렇지 않은 경우
		<ol>
			<li><strong>시발역에서 먼저 운행을 시작한 열차</strong>가 구간<code>A ~ B</code>를 운행하는 것을 허용합니다.</li>
			<li>2 - 3 - 1로도 결정할 수 없다면, <strong>편성 번호가 더 낮은 열차</strong>가 구간 <code>A ~ B</code>를 운행하는 것을 허용합니다.</li>
		</ol>
		</li>
	</ol>
	</li>
</ol>

<p>충주로 향하는 하행 열차 <em>C</em>편성, 부발로 향하는 상행 열차 <em>H</em>편성이 있을 때, 각 편성이 종착역에 도착하는 시각을 구해 주세요.&nbsp;</p>

### 입력

<p>첫 번째 줄에 <em>C</em>와 <em>H</em>가 공백을 구분으로 해서 주어집니다.</p>

<p>다음 <em>C</em>개의 줄에는 충주로 향하는 하행 열차의 번호와, 해당 열차가&nbsp;시발역에서 운행을 시작한&nbsp;시각이 <code>HH:mm</code>형식으로 주어집니다.</p>

<p>다음 <em>H</em>개의 줄에는 부발로 향하는 상행 열차의 번호와, 해당 열차가 시발역에서 운행을 시작한&nbsp;시각이 <code>HH:mm</code>형식으로 주어집니다.</p>

### 출력

<p>각 열차가 종착&nbsp;(상행선의 경우 부발, 하행선의 경우 충주)역에 도착하는 시각을 열차 번호 오름차순으로 출력해 주세요. 시각은 <code>HH:mm</code>형식으로 출력해 주세요.</p>

<p>자정이 넘어 도착하는 경우, 다음날 <code>HH:mm</code> 에 도착했다고 출력해 주세요.</p>

### 제한

<ul>
	<li><em>H</em>와 <em>C</em>는 1 이상 20 이하의 정수입니다.</li>
	<li>주어지는 열차 번호는 다음 조건을 따릅니다.
	<ul>
		<li>3자리로 주어집니다.</li>
		<li>상행선의 열차 번호는 끝자리가 짝수로, 하행선의 열차 번호는 끝자리가 홀수로 주어집니다.</li>
		<li>같은 목적지로 향하는 열차에 대해, 먼저 출발한 열차의 열차 번호는 나중에 출발한 열차의 번호보다 작습니다.</li>
	</ul>
	</li>
	<li>시발역에서 방향이 같은 둘 이상의 열차가 동시에 출발하지 않습니다.</li>
	<li>시각은 <code>HH:mm</code>형식입니다. 이때,&nbsp;<code>HH</code>는 0 이상 23 이하의 정수로, <code>mm</code>은 0 이상 59 이하의 정수로 주어집니다. <code>HH</code>와 <code>mm</code>은&nbsp;10보다 작으면 앞에 0이 붙습니다.</li>
</ul>

### 힌트

<ul>
	<li>시발역은 열차가 운행을 시작하는 역이고, 종착역은 열차가 운행을 마치는 역입니다.</li>
	<li>문제의 단순화를 위해 아래의 요소들은 무시하셔도 좋습니다.
	<ul>
		<li>앙성온천 ~ 충주 구간에 있는 <strong>금가 신호장</strong></li>
		<li>부발역 근처에서 <strong>경강선 전철과의 경합</strong></li>
		<li>부발 기지에 속해 있는 이음 편성의 수</li>
	</ul>
	</li>
</ul>