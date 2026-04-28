# [Platinum II] EIP1559 - 24715

[문제 링크](https://www.acmicpc.net/problem/24715)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

자료 구조, 세그먼트 트리, 우선순위 큐

### 문제 설명

<p>You are an avid Ethereum researcher. Recently Ethereum passed a resolution to change the gas rate of a transaction from a value $\mathit{gasPrice}$ to a pair $(\mathit{maxFee}, \mathit{maxPriorityFee})$. The exact gas price of a transaction is calculated by $\mathit{gasPrice}=\min(\mathit{maxFee},\mathit{maxPriorityFee}+\mathit{baseFee})$, while $\mathit{baseFee}$ is a parameter that can change over time.</p>

<p>You maintain a dynamic collection of transactions. At some moments, you want to know, for a specific $\mathit{baseFee}$, what is the largest $\mathit{gasPrice}$ of a transaction in the collection.</p>

<p>Specifically, you need to maintain a collection of transactions that supports the following three operations:</p>

<ol>
	<li>Add a transaction with the gas rate $(\mathit{maxFee}, \mathit{maxPriorityFee})$ to the collection.</li>
	<li>Remove a single transaction with the gas rate $(\mathit{maxFee}, \mathit{maxPriorityFee})$ from the collection. It is guaranteed that there is at least one transaction that satisfies the condition.</li>
	<li>For a specific $\mathit{baseFee}$, find the maximum value of $\mathit{gasPrice}$ in the collection when the current base fee is $\mathit{baseFee}$. It is guaranteed that there is at least one transaction in the collection.</li>
</ol>

### 입력

<p>The first line contains an integer $t$ ($0 \leq t \leq 10^6$) representing the number of operations. For the following $t$ lines, the first integer $\mathit{type}$ on each line represents the type of the current operation.</p>

<p>If $\mathit{type}=1$, the next two integers are $\mathit{maxFee}$ and $\mathit{maxPriorityFee}$. You should add a transaction with gas rate $(\mathit{maxFee}, \mathit{maxPriorityFee})$ to the collection.</p>

<p>If $\mathit{type}=2$, the next two integers are $\mathit{maxFee}$ and $\mathit{maxPriorityFee}$. You should remove a single transaction with gas rate $(\mathit{maxFee}, \mathit{maxPriorityFee})$ from the collection.</p>

<p>If $\mathit{type}=3$, the next integer is $\mathit{baseFee}$. You should output the maximum value of $\mathit{gasPrice}$ in the collection when the current base fee is $\mathit{baseFee}$.</p>

<p>It is guaranteed that all the values of $\mathit{maxFee}$, $\mathit{maxPriorityFee}$, and $\mathit{baseFee}$ are integers in range $[0,10^6]$.</p>

### 출력

<p>For each operation with $\mathit{type}=3$, output a line with an integer representing the current largest $\mathit{gasPrice}$ when the current base fee is $\mathit{baseFee}$.</p>