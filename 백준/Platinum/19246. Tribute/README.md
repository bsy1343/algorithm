# [Platinum V] Tribute - 19246

[문제 링크](https://www.acmicpc.net/problem/19246)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 38, 맞힌 사람: 34, 정답 비율: 56.667%

### 분류

수학, 자료 구조, 그리디 알고리즘, 집합과 맵, 생성 함수

### 문제 설명

<p>The Son of Heaven, our beloved emperor, has commanded you, his First Minister, to extort tribute from $n$ neighbouring kingdoms. Each of the tributaries has been assigned a number of silver coins to pay -- for the $i$-th kingdom, the number is $a_i$. To show His infinite grace, the emperor decided to only take money from some of the countries, sparing the rest. Your overzealous finance minister, after writing down all $a_i$&#39;s, has already produced all possible $2^n - 1$ income values -- the sums of the non-empty subsets of tributaries. Unfortunately, the minister lost the paper sheet with original tribute values in the process. For this infraction, as well as improper calligraphy, he was promptly executed.</p>

<p>Now you only have $2^n - 1$ sums, written rather badly. Can you recover the tribute values from them?</p>

### 입력

<p>The first line of input contains the number of test cases $z$ $(1 \leq z \leq 200)$. The descriptions of the test cases follow.</p>

<p>Every test case consists of two lines: the first contains a number $n$ $(1 \le n \le 20)$, the second -- $2^n -1$ integers not exceeding $2 \cdot 10^9$, denoting all the possible sums of tributes. Assume that the tribute values were all positive integers. The total number of sums in all test cases does not exceed $10^7$.</p>

### 출력

<p>For each test case output the recovered values of $a_i$ for $i = 1, 2, \ldots, n$, in increasing order. If there are no values that fit the input, or if there are multiple possibilities, simply write ``\texttt{NO}&#39;&#39; instead -- you cannot execute anyone twice.</p>