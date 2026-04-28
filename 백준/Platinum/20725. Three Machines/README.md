# [Platinum I] Three Machines - 20725

[문제 링크](https://www.acmicpc.net/problem/20725)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 정수론, 소수 판정, 폴라드 로, 밀러–라빈 소수 판별법

### 문제 설명

<p>In Spaceman Spoof&#39;s Functions, Abhilash, Brian, and you, Spaceman Spoof, were able to escape from the evil Zargons. However, there wasn&#39;t room for Aditya, the fourth member of their team, leaving him in a precarious situation. He is locked in a Zargon jail cell with three strange machines and a single unmarked card. To get out of the room, he needs to pass through a series of $n$ locked doors, each of which require a card with a specific pair of numbers written on it to unlock. Now, Aditya is allowed to write a pair of integers $(a,b)$ on his card such that $1 \leq a &lt; b \leq m$ for some positive integer $m$. After he does this, he can make use of three different machines in his cell, each of which take in one or two cards and print out a new card, <strong>in addition to returning all of the original cards put in</strong>:</p>

<ol>
	<li>The first machine takes in a card with $(x,y)$ on it and prints a card with $(x + 1, y + 1)$ on it.</li>
	<li>The second takes in a card with $(x,y)$ and, if both $x$ and $y$ are even, prints a card with $(x/2, y/2)$ on it. Otherwise, the machine refuses to print a new card.</li>
	<li>The last takes in two cards with $(x,y)$ and $(y,z)$ on them and prints a card with $(x, z)$ on it.</li>
</ol>

<p>Aditya has unlimited time so he can use each of these machines as many times as he needs to. The Zargons are very talkative so Aditya was able to learn from his captors that the $i$th locked door can be unlocked by a card with $(1, a_i)$ printed on it. Given the array of integers $[a_1, a_2, \dots, a_n]$, for how many of the pairs of integers $(a,b)$ that Aditya writes on his original card would Aditya eventually manage to escape his cell?</p>

### 입력

<p>The first line of the input consist of two space-separated integers $n$ and $m$ $(1 \leq n \leq 10^5, 2 \leq m \leq 10^{15}$), the number of locked doors guarding Aditya&#39;s cell, and the maximum value Aditya can write on his original card, respectively.</p>

<p>The next line contains $n$ space-separated integers $a_1$ through $a_n$ with $2 \leq a_i \leq 10^{15}$. Aditya must manufacture a card with $(1,a_i)$ written on it in order to unlock the $i$th door. (The $a_i$ are not necessarily unique.)</p>

### 출력

<p>Print the number of starting cards $(a,b)$, with $1\leq a &lt; b \leq m$, for which Aditya would be able to manufacture all of the cards needed to escape. It is guaranteed that the answer will fit in a C++ long long.</p>