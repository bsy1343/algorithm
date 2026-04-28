# [Platinum III] Partitions - 20719

[문제 링크](https://www.acmicpc.net/problem/20719)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 10, 맞힌 사람: 10, 정답 비율: 50.000%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>Brian has found the Legendary Set of Numbers, a fabled set of positive integers that is said to have mysterious properties. However, being a very kind person, he decides to share the set with his two closest friends, Abhilash and Kevin. Having known his friends for a very long time, he knows that they will squabble at the least provocation, so he knows he needs to split the set in an equitable way.</p>

<p>He knows that Abhilash loves the LCM, or the least common multiple. The LCM of an set is defined as the smallest positive integer that is divisible by all of the elements of the set. He also knows that Kevin loves the GCD, or the greatest common divisor. The GCD of a set is defined as the largest positive integer that divides all of the elements of the set.</p>

<p>Brian decides a good way to split the set is to partition it into two parts such that the LCM of the part of the set he gives Abhilash is the same as the GCD of the part he gives to Kevin. He quickly looks through the Legendary Set of Numbers, and, luckily, he finds such a partition. In fact, playing around some more, he realizes that there are exactly $42$ ways to do so!</p>

<p>Brian doesn&#39;t think this is a coincidence. After all, this is the Legendary Set of Numbers. He wonders if the Set is the smallest one such that there are $42$ partitions where the LCM of one part is the GCD of the other. Being a mathematician, he wonders about the answer for numbers other than $42$. In particular, what is the smallest number $n$ such that there exists some set with $n$ distinct positive integers which can be partitioned in exactly $k$ ways such that the LCM of one part is the GCD of the other?</p>

<p>Further, demonstrate to Brian that this answer is correct by supplying some such set. Since the numbers might get rather large, give them factored into their prime factors and in sorted, increasing order.</p>

<p>Here, a partition of an set $S$ is defined as two nonempty sets $A$, $B$, such that $A\subset S$, $B\subset S$, $A\cup B = S$, $A\cap B = \emptyset$. For the sample input below, the smallest set is $\{1, 4, 5\}$, and the only possible partition is $\{1\}$ and $\{4, 5\}$, where the LCM of $\{1\}$ equals the GCD of $\{4, 5\}$, and both are equal to $1$.</p>

### 입력

<p>The input is a single line containing a single integer, $k$ ($1 \leq k \leq 10^4$).</p>

### 출력

<p>Output one line with an integer, $n$, the smallest size of an set as described above.</p>

<p>Then, output $n$ lines, where the $i$th line describes the $i$th smallest number in the set. Each line must be of the form $f\ p_1\ q_1\ p_2\ q_2\ \dots\ p_f\ q_f$, where each pair of adjacent numbers is space separated, $f$ is the number of prime factors of this number, and, for $1\le i \le f$, $p_i$ is one of the prime factors and $q_i$ is its multiplicity. They must satisfy $0 \leq f \leq 10^3$, $2\leq p_i \leq 2 \cdot 10^3$, $1 \leq q_i \leq 10^5$.</p>