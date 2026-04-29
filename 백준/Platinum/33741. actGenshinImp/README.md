# [Platinum I] actGenshinImp - 33741

[문제 링크](https://www.acmicpc.net/problem/33741)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

구현, 다이나믹 프로그래밍, 백트래킹, 애드 혹

### 문제 설명

<p>In the recent few years, this game has been so popular worldwide, it has even become a meme in the competitive programming community. Why would it be a bad idea to set problems about it?</p>

<p>You are given a grid $G$ of lowercase latin alphabets. A simple path on this grid is defined as a sequence of $k \ge 1$ <strong>distinct</strong> cells $p_1,p_2,\cdots,p_k$, such that $p_{i-1}$ and $p_i$ are adjacent either vertically or horizontally. Also, for some simple path $d$ of $m$ cells, let $f(d)$ be the string of length $m$ such that $(f(d))_i$ is the letter written on the cell $d_i$ of the grid $G$.</p>

<p>Please find the number of simple paths $a$ of $13$ cells, such that $f(a)$ is a cyclic shift of <code>"genshinimpact"</code>. As the answer may be very large, you are only required to find the value modulo $998 \, 244 \, 353$.</p>

### 입력

<p>The first line contains two integers $r$ and $c$ --- the number of rows and the number of columns of $G$. ($1 \le r,c \le 500$)</p>

<p>Each of the $r$ following lines contains a string of length $c$ consisting of lowercase latin letters. The $i$-th of them is the $i$-th row of the grid $G$.</p>

### 출력

<p>Output the answer modulo $998 \, 244 \, 353$ on one line.</p>

### 힌트

<p>The grid in the sample input contains $8$ simple paths satisfying the condition. The $8$ simple paths are as follows.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33741.%E2%80%85actGenshinImp/31aca022.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33741-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 464px; height: 300px;"></p>