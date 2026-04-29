# [Silver II] 나이트와 킹 - 34847

[문제 링크](https://www.acmicpc.net/problem/34847)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 143, 정답: 103, 맞힌 사람: 90, 정답 비율: 76.923%

### 분류

게임 이론, 홀짝성

### 문제 설명

<p>로하와 한양이는 ”나이트와 킹” 게임을 하고 있다. 게임의 규칙은 다음과 같다.</p>

<ul>
<li>게임은 $N$행 $M$열의 체스판 위에서 진행된다.</li>
<li>체스판의 위에서부터 $i$번째 행, 왼쪽에서부터 $j$번째 열의 칸의 위치를 $(i,j)$라고 하자.</li>
<li>게임을 시작할 때 말은 $(x_1,y_1)$에 놓여 있다.</li>
<li>로하와 한양이는 로하부터 시작해 번갈아 가며 차례를 진행한다.</li>
<li>로하의 차례에는 체스의 나이트 이동 규칙으로 말을 한 번 이동해야 한다.</li>
<li>한양이의 차례에는 체스의 킹 이동 규칙으로 말을 한 번 이동해야 한다.</li>
<li>말이 총 $10^{100}$번 이동하기 전에 $(x_2,y_2)$에 도달한다면 로하의 승리, 그렇지 않다면 한양이의 승리이다.</li>
<li>체스의 나이트와 킹의 이동 규칙은 노트를 참고하라.</li>
</ul>

<p>로하와 한양이가 최적의 전략으로 게임을 플레이한다면 누가 승리할 지 알아내라.</p>

### 입력

<p>첫째 줄에 체스판의 행의 수 $N$과 열의 수 $M$이 공백으로 구분되어 주어진다. ($4 \leq N, M \leq 1\,000$)</p>

<p>둘째 줄에 처음 말이 놓이는 위치 $x_1, y_1$과 로하가 말을 도달시켜야 하는 위치 $x_2, y_2$가 공백으로 구분되어 주어진다. 두 위치는 서로 다르다. ($1 \leq x_1, x_2 \leq N$; $1 \leq y_1, y_2 \leq M$)</p>

### 출력

<p>첫째 줄에 로하가 승리한다면 <code>LOHA</code>, 한양이가 승리한다면 <code>HANYANG</code>을 대문자로 출력한다. </p>

### 힌트

<p>체스에서 나이트와 킹은 다음과 같이 이동할 수 있다.</p>

<p>나이트는 가로로 $2$칸, 세로로 $1$칸 이동하거나 가로로 $1$칸, 세로로 $2$칸 이동할 수 있다.</p>

<p>킹은 가로, 세로, 대각선으로 인접한 칸으로 이동할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34847.%E2%80%85%EB%82%98%EC%9D%B4%ED%8A%B8%EC%99%80%E2%80%85%ED%82%B9/dba375a3.png" data-original-src="https://boja.mercury.kr/assets/problem/34847-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 403px; width: 400px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34847.%E2%80%85%EB%82%98%EC%9D%B4%ED%8A%B8%EC%99%80%E2%80%85%ED%82%B9/bad8ad74.png" data-original-src="https://boja.mercury.kr/assets/problem/34847-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 406px; width: 400px;"></p>