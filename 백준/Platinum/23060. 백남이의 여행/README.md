# [Platinum V] 백남이의 여행 - 23060

[문제 링크](https://www.acmicpc.net/problem/23060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 238, 정답: 54, 맞힌 사람: 45, 정답 비율: 42.857%

### 분류

그래프 이론, 그래프 탐색, 해 구성하기, 깊이 우선 탐색

### 문제 설명

<p>체스판의 세계에는 귀여운 백마인 백남이가 살고 있다. 백남이는 방학을 맞아 체스판 여행을 떠나려고 한다.</p>

<p>백남이가 생각 중인 계획은 다음과 같은 규칙을 따른다.</p>

<ul>
	<li>체스판의 총 크기는 $N\times N$이다.</li>
	<li>체스판에 있는 모든 칸을 방문해야 한다.</li>
	<li>같은 칸을 여러 번 방문할 수 있다.&nbsp;하지만 칸을 방문한 총 횟수는 $2N^2$ 이하여야 한다.</li>
	<li>백남이가 이동하는 방법의 수는 8가지이며, 다음과 같다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23060.%E2%80%85%EB%B0%B1%EB%82%A8%EC%9D%B4%EC%9D%98%E2%80%85%EC%97%AC%ED%96%89/778b213e.png" data-original-src="https://upload.acmicpc.net/45018cb8-9d12-4c7e-939f-3783a46873bf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 500px; width: 500px;" /><br />
&nbsp;</p>

<p>MBTI가 N(직관형)인 백남이는 모든 계획을 짜지 않고는 여행을 시작할 수 없다!</p>

<p>계획 수립에 골머리를 앓고 있는 백남이를 도와 백남이의 여행 계획을 짜주자!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23060.%E2%80%85%EB%B0%B1%EB%82%A8%EC%9D%B4%EC%9D%98%E2%80%85%EC%97%AC%ED%96%89/80b0f705.png" data-original-src="https://upload.acmicpc.net/0810dc2d-46ab-45cc-b29a-670da7ca12c2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 286px;" /><br />
&nbsp;</p>

### 입력

<p>첫 줄에 격자판의 행의 수이자 열의 수인 $N$ 이 주어진다. ($1\leq N \leq 500$)</p>

<p>둘째 줄에는 현재 백남이의 좌표를 나타내는 정수 r, c가 주어진다. 이는 r번째 행, c번째 열에 위치한 칸을 의미한다.</p>

### 출력

<p>만약 여행이 불가능하다고 판단되면, -1을 출력하고,</p>

<p>여행이 가능하면, 첫째 줄에 칸을 방문한 총 횟수 $K$를 출력하고, 이후 $K$개의 줄에 한 줄에 하나씩 백남이가&nbsp;방문한 칸의 좌표를 차례대로 출력한다.</p>