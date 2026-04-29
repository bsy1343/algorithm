# [Gold I] ZOAC 7 - 32648

[문제 링크](https://www.acmicpc.net/problem/32648)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 91, 맞힌 사람: 64, 정답 비율: 67.368%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p><span style="color:#e74c3c;"><code>Z</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>C</code></span>로만 이루어진 $N$행 $M$열의 2차원 격자가 있다.</p>

<p>혁준이와 친구들은 $1$행 $1$열에서 출발하여 $N$행 $M$열까지 이동하며 문자들을 수집하려고 한다.</p>

<p>한 번의 이동에 오른쪽(열 번호가 증가하는 방향) 또는 아래(행 번호가 증가하는 방향)로만 한 칸씩 이동할 수 있다.</p>

<p>또한, 현재 칸이 $a$행 $b$열일 때 딱 한 번 $c &gt; a$ <strong>혹은</strong> $d &gt; b$를 만족하는 $c$행 $d$열로 순간이동을 할 수 있다. </p>

<p>다시 말해, 아래 그림의 초록색 칸에서 순간이동하는 경우, 보라색 칸들 중 한 곳으로 이동할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32648.%E2%80%85ZOAC%E2%80%857/76e6eceb.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32648-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<blockquote>
<p>혁준: 나는 <span style="color:#e74c3c;"><code>Z</code></span>만 가져올거야!</p>

<p>익준: 그럼 나는 <span style="color:#e74c3c;"><code>O</code></span>만 가져올래.</p>

<p>동우: 나는 <span style="color:#e74c3c;"><code>A</code></span>만!</p>

<p>진우: 난 <span style="color:#e74c3c;"><code>C</code></span>만.</p>
</blockquote>

<p>혁준이와 친구들이 각각 가져올 문자들의 최대 개수를 구해보자.</p>

### 입력

<p>첫 번째 줄에 $N, M$이 주어진다. $(1 \le N,M \le 2\,000)$</p>

<p>$i+1$번째 줄에는 격자의 $i$행의 원소 $M$개가 공백을 사이에 두고 주어진다. $(1 \le i \le N)$</p>

<p>각 원소는 반드시 <span style="color:#e74c3c;"><code>Z</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>C</code></span>중 하나이다.</p>

### 출력

<p>각 문자 <span style="color:#e74c3c;"><code>Z</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>C</code></span>의 최대 수집 개수를 공백을 사이에 두고 출력한다.</p>

### 힌트

<p><strong>Python 3 사용자는 PyPy3로 제출할 것을 권장한다.</strong></p>