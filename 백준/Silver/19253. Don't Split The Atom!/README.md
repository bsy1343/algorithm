# [Silver II] Don't Split The Atom! - 19253

[문제 링크](https://www.acmicpc.net/problem/19253)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 73, 맞힌 사람: 60, 정답 비율: 69.767%

### 분류

수학, 게임 이론

### 문제 설명

<p>Two mad (and evil) scientists, Professor Zoom and Doctor Horrible, have just obtained $n$ atoms of a very rare element, which they want to share between themselves. They have decided to play the following game:</p>

<p>First, Professor divides the atoms into two non-empty groups. Next, Doctor takes one group and uses it for his evil purposes, and splits the other into two non-empty parts. Then, Professor takes one of the parts, and divides the other one again into two, returning it to Doctor. The game goes on -- with every turn, a scientist taking one of the parts, and splitting the other -- until one of the players is forced to split a single atom. This results in an explosion, and the unlucky splitter loses the game (probably with his life).</p>

<p>Knowing the number of atoms $n$ determine which one of the villains survives the game.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cab782bd-9d12-4933-80a1-954b33d11acc/-/preview/" style="width: 333px; height: 264px;" /></p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 50$). The descriptions of the test cases follow.</p>

<p>Every test case consists of one integer $n$ ($1 \leq n \leq 1\,000\,000$) -- the initial number of atoms.</p>

### 출력

<p>For each test case output a line containing a single character: &#39;<code>A</code>&#39; if Professor wins the game, &#39;<code>B</code>&#39; if Doctor wins.</p>