# [Silver IV] Rainbow Beads - 17164

[문제 링크](https://www.acmicpc.net/problem/17164)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 633, 정답: 291, 맞힌 사람: 238, 정답 비율: 49.275%

### 분류

문자열, 두 포인터

### 문제 설명

<p>Jaehyun has a bead which consists of&nbsp;$N$&nbsp;jewels arranged from left to right. Each jewel is in one of the three colors: Red, Blue, and Violet, which is represented as a single character&nbsp;<code>R</code>,&nbsp;<code>B</code>,&nbsp;<code>V</code>. As one of the committees in an important contest, Jaehyun wants to use it as a souvenir for some participant.</p>

<p>Jaehyun likes a bead with diverse colors, so he defines a bead&nbsp;beautiful&nbsp;if every adjacent jewel has different colors. For example,&nbsp;<code>RBVBV</code>&nbsp;is a beautiful bead because every adjacent jewel has a different color.&nbsp;<code>V</code>&nbsp;is a beautiful bead because it does not have adjacent pairs. However, <code>RBBV</code> is not a beautiful bead, because two&nbsp;<code>B</code>&nbsp;is adjacent in the string.</p>

<p>Not only Jaehyun likes a bead with diverse colors, but he likes a contest with diversity. This time, Jaehyun wants to make a bead that is also colorful to colorblind people. For convenience, we will only consider three kinds of people in this problem.</p>

<ul type="disc">
	<li>Non-colorblind people, who can tell all three colors.</li>
	<li>Red-colorblind people (<em>Protanopia</em>), who can&#39;t tell apart red and violet: They consider violet jewels as red jewels.</li>
	<li>Blue-colorblind people (<em>Tritanopia</em>), who can&#39;t tell apart <s>red</s> blue and violet: They consider violet jewels as blue jewels.</li>
</ul>

<p>In this case, the string&nbsp;<code>RVB</code>&nbsp;is colorful for non-colorblind people, but it is not colorful for red-colorblind people as red and violet jewels are adjacent, and it is also not colorful for blue-colorblind people as violet and blue jewels are adjacent.</p>

<p>Jaehyun wants to pick some contiguous part of the bead and cut it out to give as a souvenir. The part Jaehyun cuts should be colorful to all three kinds of people. Note that, if the whole bead is beautiful, then Jaehyun does not necessarily cut it out, but just give the whole bead. What is the length of the longest bead he can give?</p>

### 입력

<p>The first line contains an integer&nbsp;$N$, denoting the length of the bead.</p>

<p>The next line contains string of length $N$, where every character is either&nbsp;<code>R</code>,&nbsp;<code>B</code>, or&nbsp;<code>V</code>.</p>

### 출력

<p>Print the maximum possible length of contiguous beads, which is colorful for all three kinds of people.</p>

### 제한

<ul>
	<li>$1 \le N \le 250\,000$</li>
</ul>