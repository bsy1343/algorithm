# [Platinum IV] Vlak - 20508

[문제 링크](https://www.acmicpc.net/problem/20508)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 24, 맞힌 사람: 20, 정답 비율: 83.333%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 게임 이론, 트리, 트라이

### 문제 설명

<p>Nina and Emilija are playing a game on a piece of paper. Initially, the paper is empty. In one move a player appends a letter to the end of the word that is currently written on the paper. They alternate turns, and Nina plays first.</p>

<p>Players must choose the letters in such a way that the following condition is met: the word that is written <strong>after</strong> the player&rsquo;s move must be a prefix of some word in that players favourite song. If the player can&rsquo;t make a move, she loses.</p>

<p>If both players play optimally, determine who wins.</p>

### 입력

<p>The first line contains a positive integer n, the number of words in Nina&rsquo;s favourite song. Each of the following n lines contains a word from Nina&rsquo;s favourite song.</p>

<p>The following line contains a positive integer m, the number of words in Emilija&rsquo;s favourite song. Each of the following m lines contains a word from Emilija&rsquo;s favourite song.</p>

<p>Words in input contain only lowercase letters, and the sum of the lengths of all words is at most 200 000.</p>

### 출력

<p>Output <code>Nina</code> or <code>Emilija</code>, the name of the winner.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>If Nina first writes <code>b</code>, Emilija must write <code>b</code>, and then Nina can write <code>b</code>. The current word is <code>bbb</code>, and Emilija can&rsquo;t make a move, so Nina wins.</p>

<p>If Nina would first write <code>a</code>, Emilija could write <code>b</code>. The word would be <code>ab</code>, and Nina wouldn&rsquo;t be able to make a move, and she would lose.</p>