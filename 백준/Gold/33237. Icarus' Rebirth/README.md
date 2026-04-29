# [Gold V] Icarus' Rebirth - 33237

[문제 링크](https://www.acmicpc.net/problem/33237)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 23, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>In an attempt to escape from Crete's highest tower, where they were imprisoned, Icarus and his father Daedalus made two pairs of wings, with which they could fly away to Athens. During their flight, all was well until Icarus' hubris led him to fly too close to the sun, causing his wings to melt and him to drown in the Mediterranean Sea. Mourning the loss of his child, Daedalus now undertakes a perilous journey through the underworld to find Hades -- the god of the dead. He meets Hades and begs him to give back his son.</p>

<p>"Your request shall be granted, craftsman, but only if you prove yourself worthy by solving this task," says Hades. "I shall give you a word in the language of the gods. You see, the way we gods measure a word's length is different from the method you humans use. We measure the length of a word by calculating the minimum number of steps that need to be taken from the first character, to reach the last one. In a step, starting from the character with value $x$ at position $i$, you may either go to a character with position $i-1$ or $i+1$, or you can go to the closest character with value $x$ to the left or to the right." Daedalus is a smart man, and knowing he can not solve this problem for enormous words, he asks you to write a computer program that calculates the length of any word on your magical stone tablet.</p>

<p>Given some word in the language of the gods, calculate its length according to the gods' way of measuring, so Daedalus can take back his beloved son Icarus.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with a single word $w$ ($1\leq |w|\leq 10^5$). The word contains only lowercase letters from the English alphabet ('<code>a-z</code>').</li>
</ul>

### 출력

<p>Output a single number, the length of the word $w$, according to the gods' way of measuring.</p>