# [Bronze II] Histogram Sequence 3 - 23175

[문제 링크](https://www.acmicpc.net/problem/23175)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 432, 정답: 315, 맞힌 사람: 251, 정답 비율: 76.524%

### 분류

구현

### 문제 설명

<p>Consider the histogram composed of $n$ squares with side lengths $a_1, a_2, \cdots, a_n$. Let&#39;s call the sequence $(a_1, a_2, \cdots, a_n)$ the <em>histogram sequence</em> of this histogram.</p>

<p>Let&#39;s consider the height of each column in this histogram. The first $a_1$ columns will each have height $a_1$, the following $a_2$ columns will each have height $a_2$, ... and the last $a_n$ columns will each have height $a_n$. Now, let us define the <em>height sequence</em> $(b_1, b_2, \cdots, b_{a_1 + a_2 + \cdots + a_n})$ where $b_j\ (1 \le j \le a_1+a_2+\cdots+a_n)$ is the height of the $j$-th column.</p>

<p>For example, the histogram with $(3, 2, 1, 4)$ as its histogram sequence has $(3, 3, 3, 2, 2, 1, 4, 4, 4, 4)$ as its height sequence.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/23175.%E2%80%85Histogram%E2%80%85Sequence%E2%80%853/fad9f6d5.png" data-original-src="https://upload.acmicpc.net/85a70af7-c46c-4204-b444-c1e076297a1a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 253px; height: 142px;" /></p>

<p>Write a program to find the histogram sequence given the height sequence.</p>

### 입력

<p>The first line contains a single integer $m\ (1 \le m \le 10^6)$ representing the length of the height sequence $\{b_i\}$ is given.</p>

<p>The second line of the input contains $m$ integers, the height sequence. Specifically, the $i$-th integer in the line is $b_i\ (1 \le b_i \le m)$.</p>

<p>The input is designed such that the provided height sequence corresponds to a valid histogram sequence.</p>

### 출력

<p>Output $n$ integers on a single line, $a_1, a_2, \cdots, a_n$ where $(a_1, a_2, \cdots, a_n)$ is the histogram sequence corresponding to the given height sequence. If there are multiple answers, any one of them will be accepted.</p>