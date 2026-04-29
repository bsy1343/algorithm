# [Bronze I] HEPC1 - 33898

[문제 링크](https://www.acmicpc.net/problem/33898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 315, 정답: 212, 맞힌 사람: 184, 정답 비율: 65.714%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p style="text-align: center;"><img alt="HEPC 전광판 설명 그림" src="%EB%B0%B1%EC%A4%80/Bronze/33898.%E2%80%85HEPC1/dbbeb526.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33898-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 300px;"></p>

<p>2016년, 당시 영과일 학회장은 첫 HEPC 대회를 홍보하기 위해 위의 예시와 같은 가로 2칸, 세로 2칸의 격자 모양 전광판을 주문 제작했다.</p>

<p>이 전광판의 각 칸에는 <span style="color:#e74c3c;"><code>H</code></span>,<span style="color:#e74c3c;"> <code>E</code></span>,<span style="color:#e74c3c;"> <code>P</code></span> 또는<span style="color:#e74c3c;"> <code>C</code></span> 중 하나의 문자가 표시되며, 학회장이 정해둔 시작 칸에서 시계 방향 또는 반시계 방향으로 칸을 따라가며 문자를 읽으면 <span style="color:#e74c3c;"><code>H</code> </span>→<span style="color:#e74c3c;"> <code>E</code> </span>→<span style="color:#e74c3c;"> <code>P</code> </span>→<span style="color:#e74c3c;"> <code>C</code></span> 순서대로 읽을 수 있도록 설계되었다.</p>

<p>그러나 9년의 세월이 지나 노후화된 전광판은 <span style="color:#e74c3c;"><code>H</code></span>,<span style="color:#e74c3c;"> <code>E</code></span>,<span style="color:#e74c3c;"> <code>P</code></span>,<span style="color:#e74c3c;"> <code>C</code></span>의 문자가 중복되거나 순서가 뒤섞여 표시될 수 있으며, 학회장이 지정했던 시작 칸도 알 수 없는 상황이 되었다.</p>

<p>재민이는 2025년 HEPC 대회를 맞이하여 이 전광판을 다시 사용하고 싶지만, 참가자들이 여전히 HEPC 대회의 전광판임을 인지할 수 있을지 걱정이 많다.</p>

<p>따라서 재민이는 시계 방향 또는 반시계 방향으로 칸에 적힌 문자를 이동하며 읽었을 때<span style="color:#e74c3c;"> <code>H</code></span>,<span style="color:#e74c3c;"> <code>E</code></span>,<span style="color:#e74c3c;"> <code>P</code></span>,<span style="color:#e74c3c;"> <code>C</code></span>가 되도록 하는 시작 칸이 존재한다면, 이 전광판을 대회의 홍보 용도로 사용하기로 했다.</p>

<p>대회를 준비하느라 바쁜 재민이를 대신해, 대회에서 이 전광판을 사용할 수 있는지 확인해 보자!</p>

### 입력

<p>입력은 총 2줄로 구성되어 있으며, 각 줄에는 <span style="color:#e74c3c;"><code>H</code></span>,<span style="color:#e74c3c;"> <code>E</code></span>,<span style="color:#e74c3c;"> <code>P</code></span> 또는<span style="color:#e74c3c;"> <code>C</code></span>의 4개의 알파벳 대문자 중 중복을 허용하여 2개의 문자가 공백 없이 주어진다.</p>

<p>각 줄은 2×2 격자의 한 행을 나타내며, 첫 번째 줄은 첫 번째 행(좌상, 우상), 두 번째 줄은 두 번째 행(좌하, 우하)에 해당한다.</p>

### 출력

<p>격자 내 하나의 칸을 시작점으로 하여 시계 방향 또는 반시계 방향으로 한 칸씩 이동하였을 때, <span style="color:#e74c3c;"><code>H</code></span>,<span style="color:#e74c3c;"> <code>E</code></span>,<span style="color:#e74c3c;"> <code>P</code></span>,<span style="color:#e74c3c;"> <code>C</code></span> 순서대로 읽을 수 있다면 <span style="color:#e74c3c;"><code>YES</code></span>를 출력하고, 그렇지 않다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

### 힌트

<p>2×2 격자 내의 칸을 위치에 따라 좌상, 우상, 좌하, 우하로 구분할 때, 좌상을 시작점으로 하는 시계 방향 및 반시계 방향의 이동은 다음과 같이 정의된다.</p>

<p>시계 방향은 좌상 → 우상 → 우하 → 좌하 → 좌상 순이며, 반시계 방향은 좌상 → 좌하 → 우하 → 우상 → 좌상 순으로 회전한다.</p>