# [Platinum V] Klee in Solitary Confinement - 31177

[문제 링크](https://www.acmicpc.net/problem/31177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 213, 정답: 65, 맞힌 사람: 44, 정답 비율: 26.506%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Since the traveler comes, People in Monstadt suddenly raise great interest in computer programming and algorithms, including Klee, the Spark Knight of the Knights of Favonius.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31177.%E2%80%85Klee%E2%80%85in%E2%80%85Solitary%E2%80%85Confinement/bcf8ca12.png" data-original-src="https://upload.acmicpc.net/4f6b1d1f-09a2-42cb-8315-b4e9b2420535/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 310px;" /></p>

<p style="text-align: center;">Source: Genshin Impact Official</p>

<p>Being sent to solitary confinement by Jean again, Klee decides to spend time learning the famous Mo&#39;s algorithm, which can compute with a time complexity of $\mathcal{O}(n^{1.5})$ for some range query problem without modifications.</p>

<p>To check whether Klee has truly mastered the algorithm (or in fact making another bombs secretly), Jean gives her a problem of an integer sequence $a_1, a_2, \cdots, a_n$ along with some queries $[l_i, r_i]$ requiring her to find the mode number in the contiguous subsequence $a_{l_i}, a_{l_i + 1}, \cdots, a_{r_i}$. The mode number is the most common number (that is to say, the number which appears the maximum number of times) in the subsequence.</p>

<p>With the help of Mo&#39;s algorithm, Klee solves that problem without effort, but another problem comes into her mind. Given an integer sequence $a_1, a_2, \cdots, a_n$ of length $n$ and an integer $k$, you can perform the following operation at most once: Choose two integers $l$ and $r$ such that $1 \le l \le r \le n$ and add $k$ to every $a_i$ where $l \le i \le r$. Note that it is OK not to perform this operation. Compute the maximum occurrence of the mode number of the whole sequence if you choose to perform (or not perform) the operation optimally.</p>

### 입력

<p>There is only one test case in each test file.</p>

<p>The first line of the input contains two integers $n$ and $k$ ($1 \le n \le 10^6$, $-10^6 \le k \le 10^6$) indicating the length of the sequence and the additive number.</p>

<p>The second line of the input contains $n$ integers $a_1, a_2, \cdots, a_n$ ($-10^6 \le a_i \le 10^6$) indicating the original sequence.</p>

### 출력

<p>Output one line containing one integer indicating the maximum occurrence of the mode number of the whole sequence after performing (or not performing) the operation.</p>

### 힌트

<p>For the first sample test case, choose $l = 1$ and $r = 2$ and we&#39;ll result in the sequence $\{4, 4, 4, 4, 4\}$. The mode number is obviously $4$ which appears $5$ times.</p>

<p>For the second sample test case, choose $l = 4$ and $r = 6$ and we&#39;ll result in the sequence $\{3, 2, 3, 3, 3, 3, 3\}$. The mode number is $3$ which appears $6$ times.</p>

<p>For the fourth sample test case, choose not to perform the operation. The mode number is $1$ and $-2$ which both appear $3$ times.</p>