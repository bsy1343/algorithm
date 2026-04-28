# [Platinum II] BBB - 8159

[문제 링크](https://www.acmicpc.net/problem/8159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 25, 맞힌 사람: 22, 정답 비율: 30.556%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 슬라이딩 윈도우

### 문제 설명

<p>Byteasar has an account at The Byteotian Bit Bank (BBB in short). At the beginning there were p and at the end q bythalers in the account. Each transaction was either a deposit or a withdrawal of one bythaler. The account&#39;s balance was never negative. A bank teller has prepared a bank statement: a strip of paper with a sequence of pluses and minuses in it (a plus denotes a deposit while minus a withdrawal of one bythaler). Soon it turned out, that some transactions were not entered correctly. The bank teller cannot print another statement, but has to correct the one already printed instead. The statement needs not be consistent with the truth, it will suffice if the sequence of transactions satisfies the following two conditions:</p>

<ul>
	<li>the final balance is consistent with the initial balance and the sequence of transactions in the statement,</li>
	<li>according to the sequence of transactions in the statement, the account&#39;s balance was never negative.</li>
</ul>

<p>You are to calculate the minimum amount of time the bank teller needs to correct the bank statement.</p>

<p>The bank teller can:</p>

<ul>
	<li>in x seconds turn an arbitrarily chosen transaction to its opposite, or</li>
	<li>in y seconds remove the last transaction and put it at the beginning of the statement.</li>
</ul>

<p>If, for example, p=2, q=3, then --++-+-++-+-+ is a correct statement. On the other hand the statement ---++++++ is incorrect, because the account&#39;s balance would become negative after the third transaction, and furthermore the final balance should be 3, not 5. It can be, however, corrected by turning the second to last symbol to its opposite and placing the last transaction at the beginning of the statement.</p>

<p>
Write a programme that:</p>

<ul>
	<li>reads the current bank statement for Byteasar&#39;s account (a sequence of pluses and minuses) as well as the numbers p, q, x and y from the standard input.</li>
	<li>writes out to the standard output the minimum number of seconds needed to correct the statement in a way such that the initial and final balance are consistent and that the balance is never negative.</li>
</ul>

### 입력

<p>The first line contains 5 integers n, p, q, x and y (1 &le; n &le; 1,000,000, 0 &le; p,q &le; 1,000,000, 1 &le; x,y &le; 1,000), separated by single spaces and denoting respectively: the number of transactions done by Byteasar, initial and final account balance and the number of seconds needed to perform a single turn (change of sign) and move of transaction to the beginning. The second line contains a sequence of n signs (each a plus or a minus), with no spaces in-between.</p>

<p>&nbsp;</p>

### 출력

<p>The first and last output line should contain one integer, the minimum number of seconds needed to correct the statement. If no corrections are necessary, the number is zero. You may assume that a proper sequence of modifications exists for each test data.</p>

<p>&nbsp;</p>