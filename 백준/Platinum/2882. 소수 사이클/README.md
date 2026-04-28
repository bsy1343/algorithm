# [Platinum II] 소수 사이클 - 2882

[문제 링크](https://www.acmicpc.net/problem/2882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 205, 정답: 46, 맞힌 사람: 35, 정답 비율: 38.043%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>상근이와 친구들이 술자리에서 하는 게임은 소수 사이클 게임이다. 각 사람은 1번부터 N번으로 나타낸다.</p>

<p>게임을 시작하기에 앞서 동그란 의자 N-1개와 네모난 의자 1개를 준비한다. 의자는 원을 이루어서 배치한다. 먼저, 1번이 네모난 의자에 앉고, 다음 2번부터는 반시계방향으로 차례대로 의자에 앉는다. 모든 사람은 원의 중심을 바라보고 있다.</p>

<p>게임은 총 K개 라운드로 이루어져 있다. i번째 라운드 시작되면 네모에 앉은 사람이 자리에서 일어나서 &quot;내가 네모야!&quot;라고 외친다. 그 다음, 오른쪽에 있는 사람과 자리를 총 P<sub>i</sub>번 바꾸게 된다. P<sub>i</sub>는 i번째 작은 소수이다.</p>

<p>아래는 N=5, K=3인 예이다.</p>

<ol>
	<li>라운드:&nbsp;<img alt="" src="https://upload.acmicpc.net/e8e9aa2f-c2fa-4fff-ac80-81b5127a29a4/-/preview/" style="width: 321px; height: 86px;" /></li>
	<li>라운드:&nbsp;<img alt="" src="https://upload.acmicpc.net/36fcc774-3c14-4540-af54-5e4a1427e785/-/preview/" style="width: 436px; height: 85px;" /></li>
	<li>라운드:&nbsp;<img alt="" src="https://upload.acmicpc.net/c2340c41-e4e0-4b9b-be61-538fbc567fb1/-/preview/" style="width: 642px; height: 85px;" /></li>
</ol>

<p>N, K, A가 주어졌을 때, 게임이 끝난 후에 A의 이웃을 구하는 프로그램을 작성하시오.&nbsp;</p>

### 입력

<p>첫째 줄에 N, K, A가 주어진다. (3 &le; N &le; 5,000,000, 1 &le; K &le; 500,000, 1 &le; A &le; N)</p>

### 출력

<p>게임이 끝난 후에 A의 오른쪽에 있는 사람과 왼쪽에 있는 사람을 출력한다.</p>