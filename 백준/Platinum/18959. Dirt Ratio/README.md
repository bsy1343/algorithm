# [Platinum I] Dirt Ratio - 18959

[문제 링크](https://www.acmicpc.net/problem/18959)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 13, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

이분 탐색, 자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>In an ACM ICPC contest, the <em>dirt ratio</em>&nbsp;of a team is calculated in the following way. First, let us ignore all the problems the team did not accept. Assume the team accepted $X$ problems during the contest, and made a total of $Y$ submissions for these problems. Then the dirt ratio is measured as $\frac{X}{Y}$. If the dirt ratio of a team is too low, the team tends to get more penalty, which is usually bad for the ranking.</p>

<p>Little Q is a coach, and he is now staring at the submission list of his students&#39; team. The list contains only problem IDs and does not tell which submission is wrong and which is accepted. However, he assumed that all the problems occurring in the list were eventually solved by the team during the contest.</p>

<p>Little Q calculated the team&#39;s dirt ratio and felt very angry because the ratio was low. He wants to have a talk with them. To make the matter look more serious, he wants to choose a continuous subsequence of the list. He will then consider only the problems and submissions occurring in the subsequence at least once, and assume that, for each of these problems, the last submission was right, while all previous ones were wrong. Then Little Q will calculate the dirt ratio based just on the chosen continuous subsequence.</p>

<p>Your task is to write a program to find a subsequence which will give the lowest dirt ratio.</p>

### 입력

<p>The first line of the input contains an integer $n$, the length of the submission list ($1 \leq n \leq 6 \cdot 10^4$).</p>

<p>The next line contains $n$ positive integers $a_1$, $a_2$, $\ldots$, $a_n$: the problem IDs of each submission ($1 \leq a_i \leq n$).</p>

### 출력

<p>Print a single line containing a single real number: the lowest possible dirt ratio.</p>

<p>The answer must be printed with an absolute error of at most $10^{-4}$.</p>