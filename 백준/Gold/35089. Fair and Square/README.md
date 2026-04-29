# [Gold II] Fair and Square - 35089

[문제 링크](https://www.acmicpc.net/problem/35089)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘, 수학, 정수론

### 문제 설명

<p>Felix has ordered a large rectangular pizza for his birthday party. He only quickly went to the kitchen to grab some plates and cutlery, and when he came back his guests had already started helping themselves to various parts of the pizza. The pizza, which originally was made up of $h\times w$ square pieces of equal size, is now missing some of these pieces:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35089.%E2%80%85Fair%E2%80%85and%E2%80%85Square/fdfcf5c0.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35089-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 175px;"></p>

<p style="text-align: center;">Figure F.1: Illustration of the first sample case, with a division into squares of side length $2$.</p>

<p>To ensure that the distribution of the rest of the pizza proceeds in a much more orderly fashion, Felix wants to divide up the remaining pizza into larger square shaped areas. Felix can only cut along the grid lines and cannot rearrange any parts of the pizza. Each square should have the same side length, which should be as large as possible in order to minimize the number of plates needed.</p>

<p>Find this largest possible side length. Note that an answer always exists because the pizza can always be divided into $1\times 1$ squares.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $h$ and $w$ ($1 \le h,w \le 2500$), the height and width of the grid.</li>
<li>$h$ lines, each with a string of length $w$ consisting of '<code>#</code>' (denoting pizza pieces that are still there) and '<code>.</code>' (denoting pizza pieces that have already been taken).</li>
</ul>

<p>It is guaranteed that the input contains at least one '<code>#</code>'.</p>

### 출력

<p>Output an integer, the largest possible side length such that the remaining pizza can be divided into squares of that side length.</p>