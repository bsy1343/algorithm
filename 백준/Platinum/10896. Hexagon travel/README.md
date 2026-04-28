# [Platinum II] Hexagon travel - 10896

[문제 링크](https://www.acmicpc.net/problem/10896)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 32 MB

### 통계

제출: 62, 정답: 23, 맞힌 사람: 19, 정답 비율: 48.718%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>육각형 모양의 타일로 이루어진 벌집 모양의 판이 있다. 타일에는 빨강색, 녹색, 파란색 중 하나의 색을 칠할 수 있는데, 변이 인접한 타일끼리는 같은 색을 칠할 수 없다. 우리는 앞의 조건을 만족하는 판들 중 아래의 판을 사용하도록 하겠다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10896.%E2%80%85Hexagon%E2%80%85travel/83836bd5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10896/pic1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:318px; width:355px" /></p>

<p>이 판의 어느 파란 타일의 정 중앙에 오른쪽을 바라보는 로봇이 올려져 있다. 로봇에게는 세가지 명령이 있는데, <code>LEFT</code>, <code>RIGHT</code>, <code>MOVE</code> 이다. 각 명령을 자세히 정의하기 위해 칸의 중앙에 위치한 로봇이 보고 있는 방향을 숫자로 나타내보자. (처음에 로봇은 오른쪽 방향인 0을 바라보고 있는 것이다.)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10896.%E2%80%85Hexagon%E2%80%85travel/ce2be2ee.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10896/pic2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:71px; width:94px" /></p>

<p>그리고 이제 로봇의 세가지 동작을 정의하면 아래와 같다.</p>

<ul>
	<li><span style="font-family:monospace">LEFT</span> : 현재 로봇이 바라보는 방향이 x라면 <span style="font-family:monospace">LEFT</span> 동작이 수행되고 난 후에는 바라보는 방향이 x&minus;1이 된다. x가 0이었던 경우 방향은 5가 된다.</li>
	<li><span style="font-family:monospace">RIGHT</span> : 현재 로봇이 바라보는 방향이 x라면 <span style="font-family:monospace">RIGHT</span> 동작이 수행되고 난 후에는 바라보는 방향이 x+1이 된다. x가 5였던 경우 방향은 0이 된다.</li>
	<li><span style="font-family:monospace">MOVE</span> : 현재 바라보고 있는 방향으로 변을 한 번 넘어 다른 타일의 정중앙으로 간다. 로봇이 바라보고 있는 방향은 그대로 유지된다.</li>
</ul>

<p>로봇이 어떤 동작을 할지는 아직 정해져 있지 않지만, <span style="font-family:monospace">LEFT</span> 동작을 L번, <span style="font-family:monospace">RIGHT</span> 동작을 R번, <span style="font-family:monospace">MOVE</span> 동작을 M번 할 것임은 정해져 있다. 그러므로 로봇은 총</p>

<p>\(\frac{(L+R+M)!}{L!R!M!}\)</p>

<p>가지의 서로 순서가 다른 동작을 수행할 수 있는 것이다. L, R, M이 주어질 때 로봇이 각 색깔의 타일에 멈출 경우의 수를 구하는 프로그램을 작성하라.</p>

### 입력

<p>로봇이 <code>LEFT</code> 동작을 할 횟수 L, <code>RIGHT</code> 동작을 할 횟수 R, <code>MOVE</code> 동작을 할 횟수 M이 공백으로 구분되어 주어진다. (0 &le; L, R, M &le; 2,000)</p>

### 출력

<p>세 줄에 걸쳐서 출력을 한다. 첫 번째 줄에는 로봇이 멈춘 타일의 색이 빨강색일 경우 의 수, 두 번째 줄에는 로봇이 멈춘 타일의 색이 초록색일 경우의 수, 세 번째 줄에는 로 봇이 멈춘 타일의 색이 파란색일 경우의 수를 출력한다. 답이 매우 커질 수 있으므로 답을 1,000,000,007로 나눈 나머지를 출력한다.</p>