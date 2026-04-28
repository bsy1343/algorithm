# [Platinum II] Cunning Friends - 15402

[문제 링크](https://www.acmicpc.net/problem/15402)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 69, 정답: 33, 맞힌 사람: 32, 정답 비율: 62.745%

### 분류

게임 이론

### 문제 설명

<p>Anthony and his friends Ben and Chris decided to play a game. They have N piles of stones such that the i th-pile contains A<sub>i</sub> stones. In one move a player chooses one pile and may take any non-zero number of stones from it. The players take turns. Anthony goes first then Ben and then Chris. If some player cannot make a move (no more stones exist) he loses. Ben colluded with Chris so their goal is to make Anthony lose. But Anthony doesn&#39;t want to lose. You have to find out if Anthony can avoid defeat if all players play optimally</p>

### 입력

<p>The first line contains one integer N (1 &le; N &le; 10<sup>5</sup>).</p>

<p>The next line contains N integers A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Print &quot;Lose&quot; if Anthony will lose in this game and &quot;Win&quot; otherwise.</p>