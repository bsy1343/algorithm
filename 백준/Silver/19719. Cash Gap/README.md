# [Silver V] Cash Gap - 19719

[문제 링크](https://www.acmicpc.net/problem/19719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 63, 맞힌 사람: 52, 정답 비율: 59.770%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>A recently founded &quot;NERC&quot; (New Era Russian Coders) company, of course, has an accounting department. And they are very concerned about the budget of the company. In particular, they don&#39;t want the company to experience a <em>cash gap</em> --- a condition where they need to pay more money than they have in their account now.</p>

<p>At the moment the company has $s$ euros on its account. The chief accountant has prepared a plan of transactions for $m$ following days. During this period $n$ transactions are planned.</p>

<p>For each transaction the change it makes to the company&#39;s account is known, but the exact date of the operation is unknown. Money transferred by clients may not be credited to the account immediately, and on the other hand, a claim to pay a bill can suddenly be received. For each transaction, only the range of days the transaction can happen is known in advance. If several transactions would happen on the same day, they can be performed in any order.</p>

<p>Help the accounting department to check if there exists an order of transactions such that the company will experience a cash gap.&nbsp;</p>

### 입력

<p>The first line contains integers $n$, $m$ and $s$ --- the number of payments, the number of days in the plan and the initial amount of money the company has ($1 \leqslant n, m \leqslant 1000$; $1 \leqslant s \leqslant 10^6$).</p>

<p>The $i$-th of the following $n$ lines contains a description of the $i$-th payment in the following format: &quot;$\mathtt{count}~\mathtt{from}~\mathtt{to}$&quot;, which means that on any day from $\mathtt{from}$ to $\mathtt{to}$, the amount of money will be changed by $\mathtt{count}$ euros ($-10^6 \leqslant \mathtt{count} \leqslant 10^6$; $1 \leqslant \mathtt{from} \leqslant \mathtt{to} \leqslant m$).</p>

### 출력

<p>Print &quot;<code>YES</code>&quot; if a cash gap can occur, or &quot;<code>NO</code>&quot; if such situation is impossible.</p>

### 힌트

<p>In the first example there is a single transfer from the account, and thus before it there will be at least $100$ euros available in the account, so the cash gap is impossible.</p>

<p>In the second example, it could happen that both transfers from the account (for $100$ euros and for $1$ euro) will be requested on the second day, before all other transactions. In this case by the time the second transaction occurs there will be no money left on the account --- it&#39;s a cash gap.</p>