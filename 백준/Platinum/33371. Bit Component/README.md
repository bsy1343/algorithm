# [Platinum I] Bit Component - 33371

[문제 링크](https://www.acmicpc.net/problem/33371)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 6, 맞힌 사람: 6, 정답 비율: 30.000%

### 분류

구현, 수학, 재귀, 해 구성하기

### 문제 설명

<p>Denis really likes binary representation of numbers. Once he wrote down binary representations of numbers from $1$ to $7$, in some order, one under the other, so that their rightmost digits were aligned. Then he realized that the ones in these numbers form a single connected region: if we consider the places for digits as squares on a grid, all squares containing ones are connected by sides. Now he wonders if the same thing can be done for numbers from $1$ to $n$ for different $n$.</p>

<p>You are given an integer $n$. You should find a good permutation of all integers from $1$ to $n$, or determine that there is no such permutation. A permutation is <em>good</em> if, when we write the numbers down as described above, the ones form a single connected region.</p>

### 입력

<p>The only line contains a single integer $n$ ($1 \leq n \leq 2 \cdot 10^5$).</p>

### 출력

<p>If there is no good permutation of numbers from $1$ to $n$, print a single line with the word "<code>NO</code>" (uppercase). Otherwise, print a line with the word "<code>YES</code>" (uppercase), and then another line containing the good permutation you found. If there are several possible answers, print any one of them.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33371.%E2%80%85Bit%E2%80%85Component/234ac21e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33371-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 150px;"></p>

<p style="text-align: center;">Third example</p>