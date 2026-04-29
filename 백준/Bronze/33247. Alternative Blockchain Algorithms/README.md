# [Bronze II] Alternative Blockchain Algorithms - 33247

[문제 링크](https://www.acmicpc.net/problem/33247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 216, 정답: 69, 맞힌 사람: 52, 정답 비율: 26.667%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>To reduce the amount of fraud in banking, the Financial Problems Committee (FPC) opted to use a blockchain, as they are a modern banking committee. For every account, a blockchain is kept with all the transactions that have been applied to it.</p>

<p>The FPC determined encryption and "proof of work" to be cumbersome and not worth the hassle, so the blocks are trimmed down to contain only the bare essentials needed to track back to the beginning from any block in the chain. Despite this, accidents still happen, so a reference back to the parent node is included to verify the continuity of the chain.</p>

<p>Your job is to verify the blockchain and return the balance on the account.</p>

<p>A block is bad if the parent id of the block does not match the preceding block. Your program should also check if the account does not have a transaction that might cause it to become negative.</p>

<p>The first block (aka "genesis block") should always have parent id 0.</p>

### 입력

<ul>
	<li>One line containing one integer $1 \leq N \leq 10^{6}$, the number of blocks on the chain\\</li>
	<li>$N$ lines containing three integers each: $1 \leq i \leq 10^{6}$, the block id; $1 \leq p \leq 10^{6}$, the parent id; $-10^{6} \leq m \leq 10^{6}$ the amount transferred to/from the account.</li>
</ul>

<p>All transactions can be assumed to not cause integer under- or overflows. Block ids can be assumed unique.</p>

### 출력

<p>If a transaction will result in the balance on the account being lower than 0, return <code>NO\_MONEY</code>. If a block is bad, return <code>INVALID</code>. Otherwise, output the amount of money on the account as an integer.</p>