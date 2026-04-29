# [Platinum II] 타카하시의 기차 퍼즐 놀이 2 - 34674

[문제 링크](https://www.acmicpc.net/problem/34674)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 10, 맞힌 사람: 9, 정답 비율: 39.130%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>타카하시는 컴퓨터로 기차 퍼즐 게임을 하고 있었습니다. 반복된 퍼즐 게임에 질렸던 타카하시는 여러분들에게 다음과 같은 질문을 하였습니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34674.%E2%80%85%ED%83%80%EC%B9%B4%ED%95%98%EC%8B%9C%EC%9D%98%E2%80%85%EA%B8%B0%EC%B0%A8%E2%80%85%ED%8D%BC%EC%A6%90%E2%80%85%EB%86%80%EC%9D%B4%E2%80%852/10fe556c.png" data-original-src="https://boja.mercury.kr/assets/problem/34674-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 281px; height: 276px;"></p>

<p style="text-align: center;">[그림 1] 왼쪽 위부터 시계 방향으로 $1$번, $2$번, $4$번, $3$번 블록</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34674.%E2%80%85%ED%83%80%EC%B9%B4%ED%95%98%EC%8B%9C%EC%9D%98%E2%80%85%EA%B8%B0%EC%B0%A8%E2%80%85%ED%8D%BC%EC%A6%90%E2%80%85%EB%86%80%EC%9D%B4%E2%80%852/24c8ed63.png" data-original-src="https://boja.mercury.kr/assets/problem/34674-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 287px; height: 270px;"></p>

<p style="text-align: center;">[그림 2] 덮이지 않는 공간이 하나 이상 있는 경우</p>

<blockquote>
<p>세로 길이가 $r$이고 가로 길이가 $c$인 직사각형 모양의 퍼즐이 있어. 퍼즐에는 $1$번부터 $4$번까지 회전할 수 없는 $4$가지 블록이 있고, 각 블록은 제한 없이 쓸 수 있어. 블록들을 퍼즐 영역 내부에 빈틈없이 채우려고 해. 퍼즐 영역이 커진다면, 채울 수 있는 가짓수가 많아지겠지? $4$가지 블록들을 적절히 사용해서 퍼즐 영역 내부를 빈틈없이 채울 수 있는 가짓수를 $10^{9}+7$로 나눈 나머지를 구해 줘.</p>
</blockquote>

<p>타카하시의 질문을 해결해 주세요.</p>

### 입력

<p>첫 번째 줄에 $Q$가 주어집니다.</p>

<p>두 번째 줄부터 $Q$개의 줄에 걸쳐 $r$, $c$가 공백으로 구분되어 주어집니다.</p>

### 출력

<p> $Q$개의 줄에 걸쳐 문제의 답을 아래와 같이 한 줄에 하나씩 출력해 주세요.</p>

### 제한

<ul>
<li>$1 \leq Q \leq 10^{6}$</li>
<li>$1 \leq r \leq 6$이고 $r$은 짝수입니다.</li>
<li>$1 \leq c \leq 10^{6}$</li>
</ul>