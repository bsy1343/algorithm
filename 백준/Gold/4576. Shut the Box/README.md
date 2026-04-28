# [Gold I] Shut the Box - 4576

[문제 링크](https://www.acmicpc.net/problem/4576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="/upload/images2/shut-line.png" style="float:right; height:97px; width:250px" />Shut the Box is a one-player game that begins with a set of <var>N</var>&nbsp;pieces labeled from 1 to <var>N</var>. All pieces are initially &quot;unmarked&quot; (in the picture at right, the unmarked pieces are those in an upward position). In the version we consider, a player is allowed up to <var>T</var> turns, with each turn defined by an independently chosen value&nbsp;<var>V</var> (typically determined by rolling one or more dice). During a turn, the player must designate a set of currently <em>unmarked</em> pieces whose numeric labels add precisely to&nbsp;<var>V</var>, and mark them. The game continues either until the player runs out of turns, or until a single turn when it becomes impossible to find a set of unmarked pieces summing to the designated value&nbsp;<em>V</em> (in which case it and all further turns are forfeited). The goal is to mark as many pieces as possible; marking all pieces is known as &quot;shutting the box.&quot; Your goal is to determine the maximum number of pieces that can be marked by a fixed sequence of turns.</p>

<p>As an example, consider a game with 6&nbsp;pieces and the following sequence of turns: 10, 3, 4, 2. The best outcome for that sequence is to mark a total of four pieces. This can be achieved by using the value&nbsp;10 to mark the pieces 1+4+5, and then using the value of&nbsp;3 to mark piece&nbsp;3. At that point, the game would end as there is no way to precisely use the turn with value&nbsp;4 (the final turn of value&nbsp;2 must be forfeited as well). An alternate strategy for achieving the same number of marked pieces would be to use the value&nbsp;10 to mark four pieces 1+2+3+4, with the game ending on the turn with value&nbsp;3. But there does not exist any way to mark five or more pieces with that sequence.</p>

<p>Hint: avoid enormous arrays or lists, if possible.</p>

### 입력

<p>Each game begins with a line containing two integers, <var>N</var>, <var>T</var> where 1&nbsp;&le;&nbsp;<var>N</var>&nbsp;&le;&nbsp;22 represents the number of pieces, and 1&nbsp;&le;&nbsp;<var>T</var>&nbsp;&le;&nbsp;<var>N</var> represents the maximum number of turns that will be allowed. The following line contains <var>T</var> integers designating the sequence of turn values for the game; each such value&nbsp;<var>V</var> will satisify 1&nbsp;&le;&nbsp;<var>V</var>&nbsp;&le;&nbsp;22. You must read that entire sequence from the input, even though a particular game might end on an unsuccessful turn prior to the end of the sequence. The data set ends with a line containing 0 0.</p>

### 출력

<p>You should output a single line for each game, as shown below, reporting the ordinal for the game and the maximum number of pieces that can be marked during that game.</p>