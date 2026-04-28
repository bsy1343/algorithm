# [Platinum I] Longest Lyndon Prefix - 23495

[문제 링크](https://www.acmicpc.net/problem/23495)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 76, 정답: 32, 맞힌 사람: 23, 정답 비율: 45.098%

### 분류

자료 구조, 문자열, 접미사 배열과 LCP 배열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>A word $w$ is a lyndon word if and only if it is strictly smaller than all its proper suffixes. For example, <code>aab</code> is a lyndon word, while <code>aa</code> is not a lyndon word.</p>

<p>Chiaki has a string $s_1s_2\dots s_n$ of length $n$. She would like to know $l_i$, that is the length of the longest prefix of $s_i s_{i + 1} \dots s_{n}$ which is a lyndon word.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 \le T \le 10^5$), indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \leq n \leq 10^5$). The second line contains a string $s_1 s_2 \dots s_n$ consists of lowercase characters.</p>

<p>The sum of all $n$ does not exceed $10^5$.</p>

### 출력

<p>For each test case, output $n$ integers denoting $l_1, l_2, \dots, l_n$.</p>