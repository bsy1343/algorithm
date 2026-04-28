# [Gold IV] Marching Course - 16810

[문제 링크](https://www.acmicpc.net/problem/16810)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 13, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>Since members of Kitafuji High School Brass Band Club succeeded in convincing their stern coach of their playing skills, they will be able to participate in Moon Light Festival as a marching band. This festival is a prelude in terms of appealing their presence for the coming domestic contest. Hence, they want to attract a festival audience by their performance.</p>

<p>Although this festival restricts performance time up to $P$ minutes, each team can freely determine their performance course from a provided area. The provided area consists of $N$ checkpoints, numbered $1$ through $N$, and $M$ bidirectional roads connecting two checkpoints. Kitafuji Brass Band already has the information about each road: its length and the expected number of people on its roadside. Each team must start at the checkpoint $1$, and return back to the checkpoint $1$ in $P$ minutes. In order to show the performance ability of Kitafuji Brass Band to a festival audience, their stern coach would like to determine their performance course so that many people listen their march as long as possible.</p>

<p>The coach uses &quot;<samp>impression degree</samp>&quot; to determine their best course. If they play $m$ minutes on the road with length $d$ and the expected number $v$ of people, then the impression degree will be $m \times v / d$. The impression degree of a course is the sum of impression degree of their performance on the course. Marching bands must move at a constant speed during marching: $1$ unit length per $1$ minute. On the other hand, they can turn in the opposite direction at any time, any place including a point on a road. The impression degree is accumulated even if they pass the same interval two or more times.</p>

<p>Your task is to write a program to determine a course with the maximum impression degree in order to show the performance ability of Kitafuji Brass Band to an audience as much as possible.</p>

### 입력

<p>The input is formatted as follows.</p>

<pre class="mathjax">$N$ $M$ $P$<br />
$s_1$ $t_1$ $d_1$ $v_1$<br />
$\ldots$<br />
$s_M$ $t_M$ $d_M$ $v_M$</pre>

<p>The first line contains three integers $N$, $M$, and $P$: the number of checkpoints $N$ ($2 \le N \le 200$), the number of roads $M$ ($N-1 \le M \le N(N-1)/2$), and the performance time $P$ ($1 \le P \le 1{,}000$). The following $M$ lines represent the information about roads. The $i$-th line of them contains four integers $s_i$, $t_i$, $d_i$, and $v_i$: the $i$-th road bidirectionally connects between checkpoints $s_i$ and $t_i$ ($1 \le s_i, t_i \le N$, $s_i \neq t_i$) with length $d_i$ ($1 \le d_i \le 1{,}000$) and the expected number $v_i$ ($1 \le v_i \le 1{,}000$) of people.</p>

<p>You can assume that any two checkpoints are directly or indirectly connected with one or more roads. You can also assume that there are no pair of roads having the same pair of endpoints.</p>

### 출력

<p>Output the maximum impression degree of a course for a $P$-minute performance.
The absolute error should be less than $10^{-4}$.
</p>