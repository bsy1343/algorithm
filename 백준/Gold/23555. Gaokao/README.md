# [Gold III] Gaokao - 23555

[문제 링크](https://www.acmicpc.net/problem/23555)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 67, 정답: 41, 맞힌 사람: 37, 정답 비율: 62.712%

### 분류

수학, 조합론

### 문제 설명

<p>Roundgod is about to attend Gaokao (National Unified Examination for Admissions to General Universities and Colleges) and his dream school is Zhejiang University. He sees an interesting problem while he is studying Math, which is a problem related to Pascal&#39;s Triangle.</p>

<p>The definition of Pascal&#39;s Triangle is given below:</p>

<p>The first element and the last element of each row in Pascal&#39;s Triangle is $1$, and the $m_{th}$ element of the $n_{th}$ row equals to the sum of the $m_{th}$ and the ($m-1$)$_{th}$ element of the ($n-1$)$_{th}$ row. Here&#39;s an example of a 5 levels Pascal&#39;s Triangle .</p>

<p>$$1$$ $$1\quad 1$$ $$1 \quad2\quad 1$$ $$1 \quad3 \quad3\quad 1$$ $$1 \quad4\quad 6\quad 4 \quad1$$</p>

<p>In the task, Roundgod is required to calculate how many elements in the $126_{th}$ row of Pascal&#39;s Triangle are odd numbers.</p>

<p>After solving it, Roundgod thinks of a harder version of this problem. He gives you many requests about similar questions but the row number will be bigger. Please calculate that how many elements in the $k_{th}$ row of Pascal&#39;s Triangle are odd numbers.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 \le T \le 500$), indicating the number of test cases. For each test case:</p>

<p>The first and only line contains an integer $K$$(K\leq 10^{18})$, indicating the required row number in Pascal&#39;s Triangle.</p>

### 출력

<p>For each test case, output the number of odd numbers in the $k_{th}$ line.</p>