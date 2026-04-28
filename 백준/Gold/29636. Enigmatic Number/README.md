# [Gold IV] Enigmatic Number - 29636

[문제 링크](https://www.acmicpc.net/problem/29636)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 8, 맞힌 사람: 5, 정답 비율: 16.129%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>John is a junior researcher in the <em>Research Institute for the Meaning of Life</em>. Recently, he discovered that the decimal number $N$ contains knowledge that can shed light on some of the issues of the human life. However, John is selfish person and he does not want to share his discovery. So he decided to remember this number and to eat all records associated with it.</p>

<p>Unfortunately, John is a bit distracted and forgetful, so he decided to use the following way to remember the number $N$. There is a set of $K$ numbers connected with the life of John, which he remembers very well, even better than the date of his birth. All these numbers contain no more than three digits.</p>

<p>John is trying to represent the number $N$ as a concatenation of numbers from this set (e.g., a concatenation of the numbers $1$ and $2$ can give $12$ or $21$ depending on the order). No number can be used twice, on the other hand it is not obligatory to use all numbers. John wants to find (for easier remembering) a representation, containing as few numbers as possible.</p>

<p>Write a program that will find such a representation.</p>

### 입력

<p>First line of the input file contains an integer number $N$ ($1 \le N &lt; 10^{45}$). Second line contains an integer number $K$ --- size of the memorable numbers set ($1 \le K \le 1000$). Third line contains $K$ memorable numbers ($0 \le a_i &lt; 1000$). All numbers in the set are different and do not have extra leading zeroes.</p>

### 출력

<p>In the first line of the output file output an integer number $M$ --- size of the desired partition. In the following $M$ lines output the numbers forming the partition (in the order in which they need to be concatenated to obtain the number $N$).</p>

<p>If there exist multiple partitions satisfying the criteria described, output any of them. It is guaranteed that at least one desired partition of $N$ exists.</p>