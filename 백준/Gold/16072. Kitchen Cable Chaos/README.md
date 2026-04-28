# [Gold I] Kitchen Cable Chaos - 16072

[문제 링크](https://www.acmicpc.net/problem/16072)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 40, 맞힌 사람: 37, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>You started your new project: installing a home automation system. You already bought all the components and in your local electronic shop you found a promotion set with a bunch of cables of different lengths. Now you want to connect your controller with your smart sandwich maker that is several meters away, but you are lacking a cable that is long enough.</p>

<p>To solve this problem you have to connect some of your cables to form a long one. You measure the lengths of every cable you own. Exactly 5 centimeters of isolation are stripped on both ends of every cable. To connect two cables, you overlap and twist the stripped ends. It is enough for the cables to touch each other with an overlap of 0. You cannot have an overlap of more than 5 centimeters, but the connection quality increases with longer overlaps. On both ends &ndash; the controller and the sandwich maker &ndash; you also have 5 centimeters of stripped end, to which you have to connect your newly created cable in the same way. The connection quality of your link is determined by the smallest overlap used and your goal is to maximize this value.</p>

<p>The problem would be really easy, but your perfectionist roommate hates unnecessary use of cables. Therefore, the cable has to form a straight line, without any loops or detours. And cutting the cables is no option, obviously.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16072.%E2%80%85Kitchen%E2%80%85Cable%E2%80%85Chaos/dcb3f098.png" data-original-src="https://upload.acmicpc.net/bb8d51be-e68b-4cae-9e26-79e4109b2be8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 493px; height: 52px;" /></p>

<p>Figure K.1: Four cables of different lengths connect the controller with the sandwich maker, with different overlaps. Connection 1 has the maximal overlap, connection 2 the minimal overlap and all other connections are in between. The quality of this setup is 0.</p>

<p>Considering all possible arrangements of cables, find the one with the best quality.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers n, g (1 &le; n &le; 60, 11 &le; g &le; 1 000), the number of cables and the distance to be covered in centimeters, measured between the casings of the controller and the sandwich maker;</li>
	<li>n lines, each with an integer d (11 &le; d &le; 1 000), giving the lengths of the cables (including the stripped ends).</li>
</ul>

<p>Each of the n cables can be used at most once.</p>

### 출력

<p>Output one number, the best achievable quality. The quality must be accurate up to a relative or absolute error (whichever is lower) of 10<sup>&minus;7</sup>. If no arrangement fits your needs, output impossible.</p>