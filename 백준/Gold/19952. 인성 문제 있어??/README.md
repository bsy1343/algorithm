# [Gold IV] 인성 문제 있어?? - 19952

[문제 링크](https://www.acmicpc.net/problem/19952)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2590, 정답: 567, 맞힌 사람: 441, 정답 비율: 22.546%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>인성이는 인싸가 되기 위해서 인싸트 특별과정에 참가했다. 훈련 첫날 인성이는 험난한 미로에서 목적지에&nbsp;도달해야 하는 훈련을 받고 있다. 제한 시간 안에 미로를 통과하지 못하면 명기 교관 님에게 욕을 듣기에 인성이는 최선을 다해 미로를 통과하려고 한다.</p>

<p>미로는 가로 길이&nbsp;<em>W</em>,<em>&nbsp;</em>세로 길이&nbsp;<em>H</em>의<em>&nbsp;</em>격자 형태를 가지며, 인성이는 한 번에 격자 상의 상, 하, 좌, 우로&nbsp;한칸 씩&nbsp;움직일 수 있다.&nbsp; 매 이동이 완료될 시에&nbsp;인성이의 남은 힘은 1씩 감소하고, 남은 힘이 0이하인 경우에는 더 이상 움직이지 못하게 된다.</p>

<p>미로의 각 격자에는 장애물이 있는데, 각각의 장애물은 높이 정보를 가지고 있다. 장애물이 없는 위치는 전부 높이가 0 이다.&nbsp;인성이가 이동할 때, 현재 위치보다 이동할 위치의 높이가 더 낮으면 아무런 제약을 갖지 않고 이동할&nbsp;수 있다. 더 높은 곳으로&nbsp;이동할 때는&nbsp;점프를 할 수 있는데, 점프해야 하는 높이는 (이동할 곳의 높이 - 현재 위치한 곳의 높이) 이다.&nbsp;이때&nbsp;남아있는&nbsp;힘이&nbsp;점프해야 하는&nbsp;높이보다 크거나 같으면&nbsp;이동할 수 있고, 그렇지 않으면 이동하지 못한다.</p>

<p>인성이는 신체적 한계를 극복하고 무사히 목적지에 도달해서 명기 교관님의 욕설을 듣지 않을 수 있을까?</p>

### 입력

<p>첫째 줄에 테스트 케이스 <em>T</em>가 주어진다. 각 테스트 케이스는 다음과 같이 주어진다.</p>

<p>첫째 줄에 미로의 세로길이 <em>H</em>, 가로길이 <em>W</em>, 장애물의 개수 <em>O</em>, 초기 힘&nbsp;<em>F, </em>출발지의 좌표 정보<em> X<sub>s</sub></em>(행),<em> Y<sub>s</sub></em>(열)목적지의&nbsp;좌표정보 <em>X<sub>e</sub></em>(행), <em>Y<sub>e</sub>(</em>열)&nbsp;가 주어진다.</p>

<p>둘째 줄부터 <em>O</em>개의 줄에 장애물의 좌표 정보 <em>X</em>(행), <em>Y</em>(열)&nbsp;와 높이 정보 <i>L이</i>&nbsp;주어진다. 모든 장애물은 서로 다른 위치에 존재한다.</p>

### 출력

<p><em>T</em>개의 줄에 인성이가&nbsp;목적지에 도착할 수 있을 때 &quot;잘했어!!&quot;, 목적지에 도착할 수 없을 때 &quot;인성 문제있어??&quot; 를 출력한다.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<em>T&nbsp;</em>&le; 10</li>
	<li>2&nbsp;&le; <em>H, W&nbsp;</em>&le; 100</li>
	<li>0 &le; <em>O&nbsp;</em>&le; H x&nbsp;W</li>
	<li>0 &le; <em>F&nbsp;</em>&le; 10,000,&nbsp;<em>F </em>는&nbsp;정수이다.</li>
	<li>1 &le; <i>L</i>&nbsp;&le; 50,&nbsp;<em>L</em>은 정수이다.</li>
	<li>1&nbsp;&le; <em>X</em>,<em>&nbsp;X<sub>s</sub></em><sub>,</sub><em><sub>&nbsp;</sub>X<sub>e</sub></em>&nbsp;&le; <em>H</em></li>
	<li>1&nbsp;&le; Y<em>,&nbsp;</em><em>Y<sub>s</sub></em><sub>,&nbsp;</sub><em>Y<span style="font-size: 10.8333px;">e</span></em>&nbsp;&le; <em>W</em></li>
	<li>시작 위치와 목적지에는 장애물이 존재하지 않는다.</li>
</ul>