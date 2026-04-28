# [Silver IV] Cow Word Games - 27034

[문제 링크](https://www.acmicpc.net/problem/27034)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 21, 맞힌 사람: 17, 정답 비율: 38.636%

### 분류

구현

### 문제 설명

<p>Tired of being teased by the other farm animals for their poor vocabulary, Farmer John&#39;s cows have stolen a word game from FJ&#39;s house to use for practice.  In this particular word game, each cow receives a set of N (1 &le; N &le; 100) not necessarily unique uppercase letters (for example: &#39;V&#39;, &#39;B&#39;, &#39;O&#39;, &#39;E&#39;, &#39;I&#39;, &#39;N&#39;, &#39;O&#39;).  Each letter has a certain specified point value, and each cow&#39;s goal is to form a valid word using a subset of her letters worth the maximum number of points.  For example, if every letter is worth 1 point, the maximum number of points one can receive from the letters above is 6, using the word &#39;BOVINE&#39;.</p>

<p>The cows have also managed to steal a dictionary containing M (1 &le; M &le; 10,000) words from FJ&#39;s house, so they can check whether or not certain words are valid.  Please help his cows compute the best possible words they can form based on the letters they receive.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and M (1 &le; M &le; 10000).</li>
	<li>Lines 2..27: Each of these 26 lines contains a positive integer giving the number of points for a letter of the alphabet. The first of these lines corresponds to &#39;A&#39;; the last corresponds to &#39;Z&#39;.</li>
	<li>Lines 28..N+27: These N lines contain the letters received by a cow playing the game.   Each line contains a single uppercase letter.</li>
	<li>Lines N+28..N+M+27: These M lines each contain a word from the dictionary.  Each word consists of at most N uppercase letters.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, specifying the maximum number of points we can  receive.  If no valid words in the dictionary can be formed, output -1.</li>
</ul>

### 힌트

<p>All letters are worth 1 point except &#39;C&#39;, which is worth 10 points.  We  receive the letters &#39;D&#39;, &#39;C&#39;, &#39;O&#39;, &#39;R&#39;, and &#39;W&#39;.</p>

<p>The word &#39;COW&#39; is worth 12 points, and we can form it using a subset of the letters in our input.</p>