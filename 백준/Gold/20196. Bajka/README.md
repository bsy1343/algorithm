# [Gold II] Bajka - 20196

[문제 링크](https://www.acmicpc.net/problem/20196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 35, 맞힌 사람: 28, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 최단 경로

### 문제 설명

<p>Little Fabijan got bored with picture books, so he decided to read his first fairytale. Unfortunately, Fabijan often encounters a word that scares him. To overcome his fear, he will play a game he invented.</p>

<p>The scary word can be represented as an array of n lowercase letters. To start the game, Fabijan puts his finger on some position of the array and writes the letter from that position on a piece of paper. He then performs one of the following moves an arbitrary number of times:</p>

<ul>
	<li>He moves the finger to a position that is one place to the left or to the right of the current position, if that position exists. Also, Fabijan will then write the letter from the new position on the paper, after the last written letter.</li>
	<li>He moves the finger to any position with the same letter as the current one. Fabijan will not write anyhing on the paper in this case.</li>
</ul>

<p>It takes him |x &minus; y| seconds to move the finger from position x to position y.</p>

<p>Fabijan will overcome his fear of the word if, at the end of the game, his favourite word is written on the paper. He wants to finish the fairytale as soon as possible, so he asks you to tell him the minimum number of seconds it will take him to overcome his fear of the given scary word.</p>

### 입력

<p>The first line contains integers n and m (1 &le; n, m &le; 300).</p>

<p>The second line contains n lowercase letters, the word that scares Fabijan.</p>

<p>The third line contains m lowercase letters, Fabijan&rsquo;s favourite word.</p>

### 출력

<p>Print the shortest possible time in seconds Fabijan needs to write his favourite word on the paper, or &minus;1 if that is not possible.</p>

### 힌트

<p>Clarification of the third example:</p>

<p>Fabijan will first put his finger on position 7 and write down the letter &rsquo;b&rsquo;. He will then move the finger two times to the left, and each time write down the letter &rsquo;o&rsquo;. In the next step, he will move the finger&nbsp;to position 6 using the second type of move. Finally, he will again move the finger two times to the left, and write down the letters &rsquo;o&rsquo; and &rsquo;k&rsquo;. It took him five seconds in total, one second per move.</p>