# [Gold I] 인덕이의 고민 - 20549

[문제 링크](https://www.acmicpc.net/problem/20549)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 269, 정답: 110, 맞힌 사람: 83, 정답 비율: 39.151%

### 분류

그래프 이론, 최단 경로, 비트마스킹, 데이크스트라, 격자 그래프

### 문제 설명

<p>오리를 좋아하는 인덕이는 오리를 바라보며 마음의 안식을 얻는다. 오리는<em> N&times;N</em>의 정사각형 모양으로 이루어진 인경호에서 유유자적하게 헤엄을 친다. 인경호는 1&times;1 크기의 칸으로 나누어져 있다.</p>

<p>각각의 칸은 (<em>X, Y</em>)로 나타내며, <em>X</em>는&nbsp;가장 위에서부터 떨어진 칸의 개수, <em>Y</em>는&nbsp;가장 왼쪽으로부터 떨어진 칸의 개수이다. X와&nbsp;Y는 0부터 시작한다.&nbsp;</p>

<p>그런 인덕이에게 요즘 큰 고민이 생겼다. 기껏 먹이를 주어도 먹이가 떠내려가서 오리가 다 먹지 못하기 때문이다.</p>

<p>고민하던 인덕이는 1학년 때&nbsp;배웠던 생명과학 과목의 내용을 활용하면 오리의 유전자에 변형을 가하여 원하는 대로 이동시킬 수 있다는 것을 알게 되었다.</p>

<p>단, 너무 오래전에 들은 과목이기 때문에, 이 방법은 아래와 같은 제한사항이 붙는다.</p>

<ul>
	<li>체스에서 각각 <strong>나이트</strong>, <strong>비숍</strong>, <strong>룩</strong>이 이동하는 방향으로만 이동시킬 수 있고, 도착 지점에 먹이가 있으면 그 지점에 있는&nbsp;먹이를 먹는다. 오리는 인경호 바깥으로 이동할 수 없다.</li>
	<li>한 번의 변형에서 이동 명령에 따라 오리의 유전자는&nbsp;과부하를&nbsp;받고,&nbsp;한번 이동하고 나면 변형이 풀린다.</li>
</ul>

<p>오리가 <strong>과부하</strong>를 많이 받으면 인덕이도 슬퍼한다.</p>

<p>오리가 모든 먹이를 먹으면서 가장<strong> 과부하</strong>를 적게 받게 만들어서 인덕이의 고민을 덜어주자!</p>

### 입력

<p>첫째 줄에&nbsp;인경호의 가로, 세로 크기&nbsp;<em>N(</em>3&nbsp;<em>&le;&nbsp;N&nbsp;&le;&nbsp;</em>50<em>)</em>이 주어진다.</p>

<p>두 번째 줄에 오리를 각각 <strong>나이트,&nbsp; 비숍, 룩</strong>이 갈 수 있는 이동으로 이동시킬 때, 오리가 받는 <strong>과부하</strong>의 양&nbsp;<em>A</em>, <em>B</em>, <em>C (</em>1<i> </i>&le;<em> A, B, C&nbsp;</em> &le;<em>&nbsp;</em>50<em>)</em>이&nbsp;차례대로 주어진다.</p>

<p>세 번째 줄에는 오리의 시작&nbsp;위치의 x좌표, y좌표에 해당하는 <em>X</em>,<em>Y(</em>0 &le;&nbsp;<em>X, Y&nbsp;</em>&le; N-1<em>)</em>가 주어진다.</p>

<p>그 다음줄에 먹이의 수 <em>M(</em>1 &le;&nbsp;<em>M&nbsp;</em>&le;<em> </em>4<em>)</em>이 주어진다</p>

<p><em>M</em>줄에 걸쳐서 먹이의 x좌표, y좌표에 해당하는&nbsp;<em>X<sub>i</sub>, Y<sub>i</sub>&nbsp;(</em>0<i> </i>&le;&nbsp;<em>X<sub>i</sub>, Y<sub>i&nbsp;</sub></em>&le;&nbsp;<em>N </em>-1<em>)&nbsp;</em>가&nbsp;차례대로 주어진다.</p>

<p>오리의 시작위치와 각 먹이의 좌표는 전부 서로 다르게 주어진다.</p>

### 출력

<p>유전자 변형을 이용해서 오리가 주어진 먹이를 모두 먹게 되었을 때 오리가 받는 과부하의 총합의 최소를 출력하자.</p>

### 힌트

<p><strong>나이트</strong>, <strong>비숍</strong>, <strong>룩</strong>이 한번의 이동으로 도달할 수 있는 칸은 각각 다음과 같다.</p>

<p><img alt="" src="https://upload.acmicpc.net/6c3ac847-3c5a-432c-b9ce-b60b64dac98d/-/preview/" style="width: 301px; height: 300px;" /></p>

<p><br />
<img alt="" src="https://upload.acmicpc.net/cef86704-40b4-4df2-aa49-1e7beed434e2/-/preview/" style="height: 300px; width: 300px;" /></p>

<p><br />
<img alt="" src="https://upload.acmicpc.net/75825a8c-6d71-4fa9-b1c3-b855b731e1fe/-/preview/" style="width: 300px; height: 300px;" /></p>

<p>그림 출처 : 위키백과(<a href="https://ko.wikipedia.org/wiki/%EB%A3%A9_(%EC%B2%B4%EC%8A%A4)">https://ko.wikipedia.org/wiki/%EB%A3%A9_(%EC%B2%B4%EC%8A%A4)</a></p>

<p><br />
위 예시는 <em>N</em>이 8일때의 예시이며, N의 크기가 증가하거나 감소함에따라 <strong>룩</strong>이나 <strong>비숍</strong>이 도달 할 수 있는 칸도 증가하거나 감소한다.</p>