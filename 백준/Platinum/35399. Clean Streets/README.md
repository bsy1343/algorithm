# [Platinum I] Clean Streets - 35399

[문제 링크](https://www.acmicpc.net/problem/35399)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

세그먼트 트리, 자료 구조

### 문제 설명

<p>One more year of Virada Cultural in São Paulo. The city is full of people, and the streets are full of life. People from all over the city go to the streets to enjoy a night of cultural events and a lot of music.</p>

<p>Oswaldo, an employee at the city hall, was assigned the task of hiring cleaners to clean the $S$ streets of São Paulo, in no more than $K$ hours after this big event. He was given by his boss a list of $N$ cleaners he could hire, numbered from $1$ to $N$, along with information related to how fast they work and the payment they accept. According to the list, cleaner $i$ can clean any street in $H_i$ hours, and accepts as payment anything between $L_i$ and $U_i$ for cleaning each street.</p>

<p>Oswaldo must hire a subset $C$ of the cleaners that are in the list. For each hired cleaner $i \in C$ he must assign $s_i$ streets for them to clean and a payment $p_i$ per street, taking into account the following guidelines:</p>

<p>• Each number of streets $s_i$ must be a positive integer and the sum $\sum_{i \in C} s_i$ must be exactly $S$, because every street must be cleaned and no street can be cleaned by more than one cleaner.</p>

<ul>
<li>Note that each hired cleaner $i$ will take $s_i \cdot H_i$ hours to clean their assigned streets. Since the cleaners can work in parallel, the cleaning job will take, in total, $\max_{i \in C}(s_i \cdot H_i)$ hours to be completed. This total time must be at most $K$ hours.</li>
<li>The payment per street $p_i$ must be a rational number between $L_i$ and $U_i$ (that is, $L_i \le p_i \le U_i$).</li>
<li>To ensure a fair hiring process, the payment per hour of work $\frac{p_i}{H_i}$ must be the same for all hired cleaners.</li>
</ul>

<p>Notice that the above restrictions do not apply to the cleaners that are not hired.</p>

<p>Hired cleaner $i$ will receive $s_i \cdot p_i$ as payment, being the total payment $\sum_{i \in C} s_i \cdot p_i$. Help Oswaldo determine the minimum total payment for cleaning the streets honoring the given guidelines, or tell him that those requirements cannot be satisfied.</p>

### 입력

<p>The first line contains three integers $N$, $S$ and $K$ ($1 \le N, S \le 10^5$ and $1 \le K \le 10^9$), indicating respectively the number of available cleaners, the number of streets to be cleaned, and in how many hours the job must be completed. Each cleaner is identified by a distinct integer from $1$ to $N$.</p>

<p>The $i$-th of the next $N$ lines describes cleaner $i$ with three integers $H_i$ ($1 \le H_i \le 10^5$), $L_i$ and $U_i$ ($1 \le L_i \le U_i \le 100$), indicating that the cleaner can clean any street in $H_i$ hours, and accepts as payment any value in the range $[L_i, U_i]$.</p>

### 출력

<p>If the given guidelines can be satisfied, output a single line with two positive integers $x$ and $y$, such that $\frac{x}{y}$ is an irreducible fraction indicating the minimum total payment for cleaning the streets according to those guidelines.</p>

<p>If the requirements cannot be fulfilled, output a line with the character “<code>*</code>” (asterisk) instead.</p>