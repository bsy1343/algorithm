# [Gold IV] Kim’s Quest - 33025

[문제 링크](https://www.acmicpc.net/problem/33025)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 22, 맞힌 사람: 21, 정답 비율: 95.455%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>In the long-forgotten halls of Kombinatoria's ancient academy, a gifted mathematician named Kim is faced with an unusual challenge. They found an old sequence of integers, which is believed to be a cryptic message from the legendary Kombinatoria's Oracle, and Kim wants to decipher its hidden meaning.</p>

<p>Kim's mission is to find specific patterns within the sequence, known as <em>Harmonious Subsequences</em>. These are extraordinary subsequences where the sum of every three consecutive numbers is even, and each subsequence must be at least three numbers in length.</p>

<p>Given a sequence $a_i$ ($1 \le i \le n$) of length $n$, its <em>subsequence</em> of length $m$ is equal to $a_{b_1}, a_{b_2}, \ldots, a_{b_m}$ and is uniquely defined by a set of $m$ indices $b_j$, such that $1 \le b_1 &lt; b_2 &lt; \ldots &lt; b_m \le n$. Subsequences given by different sets of indices $b_j$ are considered different.</p>

<p>There's a twist in Kim's quest: the number of these Harmonious Subsequences could be overwhelming. To report the findings effectively, Kim must calculate the total number of these subsequences, presenting the answer as a remainder after dividing by the number $998\,244\,353$.</p>

### 입력

<p>The first line contains a single integer $n$ --- the length of the sequence ($3 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ space-separated integers $a_i$ --- the elements of the sequence ($1 \le a_i \le 2 \cdot 10^5$).</p>

### 출력

<p>Output one number --- the number of Harmonious Subsequences, modulo $998\,244\,353$.</p>

### 힌트

<p>In the provided input data for the fifth sample, the sequence of numbers is split into three separate lines for clarity, but it should be understood that in the actual test data, the sequence is given in one line. The actual number of Harmonious Subsequences in this example is $4\,991\,221\,765 = 5 \times 998\,244\,353$, hence the output is zero as a result of finding its remainder after dividing by the number $998\,244\,353$.</p>