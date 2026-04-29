# [Platinum III] Kaz's Party - 33751

[문제 링크](https://www.acmicpc.net/problem/33751)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

수학, 확률론

### 문제 설명

<p>Kaz is inviting $n$ of his friends over for a party! He has currently prepared the cocktails for them (each friend has ordered a different drink), with friend $i$ having a preference for cocktail $i$.</p>

<p>However, Kaz is looking to pull a prank. When handing out drinks if he hands out a drink to the wrong person, he knows the following round of an 'exchange process' will occur: all partygoers who do not have their desired drinks will leave their drinks on a table. All such drinks will be shuffled and handed back in a completely random order to those still in the exchange process. Any participants who receive their desired drink will leave to enjoy the party, while those still with the wrong drink will shuffle again. </p>

<p>To maximize the humor of his prank, Kaz wants the exchange process to take the maximum expected number of rounds. Help Kaz find an assignment of drinks that will maximize this value.</p>

### 입력

<p>The input consists of a single integer $n$ ($1 \leq n \leq 1\,000$) --- the number of friends invited to the party.</p>

### 출력

<p>On the first line, output a single real number $R$ --- the maximum expected number of rounds.</p>

<p>On the second line, output $n$ distinct integers $p_1, p_2, \cdots, p_n$ ($1 \leq p_i \leq n$) --- the assignment of the drinks. Here, drink $p_i$ will be handed to friend $i$.</p>

<p>Your answer will be accepted if the output satisfies the following conditions.</p>

<ul>
	<li>The value of $R$ differs from the actual answer by at most $10^{-9}$ absolute or relative error.</li>
	<li>The value of $R$ differs from the expected number of rounds given the permutation $p$ by at most $10^{-9}$ absolute or relative error.</li>
</ul>