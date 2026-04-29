# [Platinum V] 룩 vs 폰 - 34982

[문제 링크](https://www.acmicpc.net/problem/34982)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 346, 정답: 97, 맞힌 사람: 78, 정답 비율: 26.174%

### 분류

게임 이론, 많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<p>대신이와 오량이는 오늘도 한판 대결을 펼치고 있다. 이번에는 특별한 규칙으로 진행되는 '룩 vs 폰' 게임을 하기로 했다.</p>

<p>게임은 $8 \times K$ 크기의 체스판에서 진행된다.</p>

<ul>
<li>$2$행 $1$열부터 $2$행 $N$열까지 대신이의 폰이 한 칸에 $1$개씩 총 $N$개가 놓여있다.</li>
<li>$8$행 $M$열에 오량이의 룩 $1$개가 놓여있다.</li>
</ul>

<p>플레이어는 번갈아 가며 자신의 기물 $1$개를 골라 체스판에서 벗어나지 않게 행마법을 따라 움직인다. 행마법은 노트를 참고하자.</p>

<p>게임의 승리 조건은 다음과 같다.</p>

<ul>
<li>대신이의 어떤 폰이라도 $8$행에 도달하거나, 대신이의 폰이 오량이의 룩을 잡으면 대신이가 승리한다.</li>
<li>오량이의 룩이 대신이의 폰을 잡고, 돌아오는 대신이의 차례에 대신이가 오량이의 룩을 잡을 수 없다면 오량이가 승리한다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34982.%E2%80%85%EB%A3%A9%E2%80%85vs%E2%80%85%ED%8F%B0/9357467e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34982-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 172px; width: 400px;"></p>

<p style="text-align: center;">(그림 1) 대신이의 폰이 $8$행에 도달했다. 따라서 대신이가 승리한다.</p>

<p style="text-align: center;">(그림 2) 대신이의 폰이 오량이의 룩을 잡았다. 따라서 대신이가 승리한다.</p>

<p style="text-align: center;">(그림 3) 돌아오는 대신이의 차례에 대신이는 오량이의 룩을 잡을 수 없다. 따라서 오량이가 승리한다.</p>

<p>하지만 오량이가 너무 유리하다고 느낀 대신이는 다음 규칙을 추가했다.</p>

<ul>
<li>오량이의 룩은 기본적으로 $8$행에 머물러야 하며, 대신이의 폰을 잡을 때만 $8$행을 벗어날 수 있다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34982.%E2%80%85%EB%A3%A9%E2%80%85vs%E2%80%85%ED%8F%B0/b2104d14.png" data-original-src="https://boja.mercury.kr/assets/problem/34982-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 193px; width: 200px;"></p>

<p style="text-align: center;">(그림 4) 대신이의 폰을 잡는 움직임이다. 따라서 가능한 수이다.</p>

<p style="text-align: center;">(그림 5) 대신이의 폰을 잡는 움직임이 아니다. 따라서 불가능한 수이다.</p>

<p>모든 플레이어는 가장 빠르게 승리하기 위해 최선을 다하며, 만약 승리할 수 없다면 최대한 늦게 지도록 행동한다.</p>

<p>대신이는 오량이에게 선공을 양보했다. 양쪽 모두 최선을 다할 때, 오량이가 승리하기 위해 룩을 움직여야 하는 최소 횟수를 구해주자!</p>

### 입력

<p>첫번째 줄에 세 정수 $N, M, K$가 공백으로 구분되어 주어진다. $(1 \leq N,M \leq K;$ $1 \leq K \leq 10^{9})$</p>

### 출력

<p>첫번째 줄에 오량이가 승리하기 위해 룩을 움직여야 하는 최소 횟수를 $998\,244\,353$로 나눈 나머지를 출력한다.</p>

<p>만일 최선을 다해도 오량이가 이길 수 없다면, 대신 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

### 힌트

<p>각 기물의 행마법은 체스와 동일하며, 아래와 같다.</p>

<ul>
<li>대신이의 폰은 $2$행에 있을 경우 행이 증가하는 방향으로 $1$칸 또는 $2$칸 이동할 수 있고, 그 외에는 $1$칸만 이동한다. 전진 방향의 대각선에 오량이의 룩이 있으면 룩을 잡으며 그 위치로 이동할 수 있다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34982.%E2%80%85%EB%A3%A9%E2%80%85vs%E2%80%85%ED%8F%B0/40d3c2aa.png" data-original-src="https://boja.mercury.kr/assets/problem/34982-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 267px; width: 200px;"></p>

<p style="text-align: center;">빨간색 칸은 공격 범위, 화살표는 이동 범위를 뜻한다.</p>

<ul>
<li>오량이의 룩은 같은 행의 다른 칸 또는 같은 열의 다른 칸으로 이동할 수 있으며, 이동한 칸에 대신이의 폰이 있으면 폰을 잡을 수 있다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34982.%E2%80%85%EB%A3%A9%E2%80%85vs%E2%80%85%ED%8F%B0/abfb6ac8.png" data-original-src="https://boja.mercury.kr/assets/problem/34982-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 267px; width: 200px;"></p>

<p style="text-align: center;">화살표는 이동 범위를 뜻한다. 공격 범위는 이동 범위와 같다.</p>