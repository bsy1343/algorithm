# [Platinum II] Data Mining - 7400

[문제 링크](https://www.acmicpc.net/problem/7400)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 9, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Dr. Tuple is working on the new data-mining application for Advanced Commercial Merchandise Inc. One of the subroutines for this application works with two arrays $P$ and $Q$ containing $N$ records of data each (records are numbered from 0 to $N-1$). Array $P$ contains hash-like structure with keys. Array $P$ is used to locate record for processing and the data for the corresponding record is later retrieved from the array $Q$.</p>

<p>All records in array $P$ have a size of $S_P$ bytes and records in array $Q$ have size of $S_Q$ bytes. Dr. Tuple needs to implement this subroutine with the highest possible performance because it is a hot-spot of the whole data-mining application. However, $S_P$ and $S_Q$ are only known at run-time of application which complicates or makes impossible to make certain well-known compile-time optimizations.</p>

<p>The straightforward way to find byte-offset of $i$-th record in array $P$ is to use the following formula: \begin{equation} \label{pofs} Pofs(i) = S_P \cdot i, \end{equation} and the following formula for array $Q$: \begin{equation} \label{qofs} Qofs(i) = S_Q \cdot i. \end{equation}</p>

<p>However, multiplication computes much slower than addition or subtraction in modern processors. Dr. Tuple avoids usage of multiplication while scanning array $P$ by keeping computed byte-offset $Pofs(i)$ of $i$-th record instead of its index $i$ in all other data-structures of data-mining application. He uses the following simple formulae when he needs to compute byte-offset of the record that precedes or follows $i$-th record in array $P$: \begin{align*} Pofs(i+1) &amp;= Pofs(i) + S_P\\ Pofs(i-1) &amp;= Pofs(i) - S_P \end{align*}</p>

<p>Whenever a record from array $P$ is located by either scanning of the array or by taking $Pofs(i)$ from other data structures, Dr. Tuple needs to retrieve information from the corresponding record in array $Q$. To access record in array $Q$ its byte-offset $Qofs(i)$ needs to be computed. One can immediately derive formula to compute $Qofs(i)$ with known $Pofs(i)$ from formulae \eqref{pofs} and \eqref{qofs}: \begin{equation} \label{qbyp} Qofs(i) = Pofs(i) / S_P \cdot S_Q \end{equation}</p>

<p>Unfortunately, this formula not only contains multiplication, but also contains division. Even though only integer division is required here, it is still an order of magnitude slower than multiplication on modern processors. If coded this way, its computation is going to consume the most of CPU time in data-mining application for ACM Inc.</p>

<p>After some research Dr. Tuple has discovered that he can replace formula \eqref{qbyp} with the following fast formula: \begin{equation} \label{qbypfast} Qofs&#39;(i) = (Pofs(i) + Pofs(i) \text{ &lt;&lt; } A) \text{ &gt;&gt; }B \end{equation} where $A$ and $B$ are non-negative integer numbers, &quot;$\text{&lt;&lt; }A$&quot; is left shift by $A$ bits (equivalent to integer multiplication by $2^A$), &quot;$\text{&gt;&gt; }B$&quot; is right shift by $B$ bits (equivalent to integer division by $2^B$).</p>

<p>This formula is an order of magnitude faster than \eqref{qbyp} to compute, but it generally cannot always produce the same result as \eqref{qbyp} regardless of the choice for values of $A$ and $B$. It still can be used if one is willing to sacrifice some extra memory.</p>

<p>Conventional layout of array $Q$ in memory (using formula \eqref{qofs}) requires $N \cdot S_Q$ bytes to store the entire array. Dr. Tuple has found that one can always choose such $K$ that if he allocates $K$ bytes of memory for the array $Q$ (where $K \ge N \cdot S_Q$) and carefully selects values for $A$ and $B$, the fast formula \eqref{qbypfast} will give non-overlapping storage locations for each of the $N$ records of array $Q$.</p>

<p>Your task is to write a program that finds minimal possible amount of memory $K$ that needs to be allocated for array $Q$ when formula \eqref{qbypfast} is used. Corresponding values for $A$ and $B$ are also to be found. If multiple pairs of values for $A$ and $B$ give the same minimal amount of memory $K$, then the pair where $A$ is minimal have to be found, and if there is still several possibilities, the one where $B$ is minimal. You shall assume that integer registers that will be used to compute formula \eqref{qbypfast} are wide enough so that overflow will never occur.</p>

### 입력

<p>The input file consists of three integer numbers $N$, $S_P$, and $S_Q$ separated by spaces ($1 \le N \le 2^{20}$, $1 \le S_P \le 2^{10}$, $1 \le S_Q \le 2^{10}$).</p>

### 출력

<p>Write to the output file a single line with three integer numbers $K$, $A$, and $B$ separated by spaces.</p>