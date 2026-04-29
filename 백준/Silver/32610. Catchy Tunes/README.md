# [Silver II] Catchy Tunes - 32610

[문제 링크](https://www.acmicpc.net/problem/32610)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 38, 맞힌 사람: 25, 정답 비율: 78.125%

### 분류

구현, 문자열, 우선순위 큐, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Summer holidays are approaching, and Kate has to decide how to spend her time for two months. She was walking on the university campus, listening to music on her headphones, when suddenly she had an idea. When listening to her favourite playlist on shuffle, Kate noticed that sometimes the songs were not as shuffled as she would like them to be. She suddenly realised why this was happening: sometimes two songs from the same artist would be played in a row. "This is unacceptable," she thought, and asks you to write a program that would shuffle the songs in a way that consecutive songs played are from different artists.</p>

<p>Kate is not like any other listener: she likes diverse music. It is guaranteed that at least half of the songs in her playlist are from a unique artist (in other words, the artist of such a song has no other songs in the playlist).</p>

<p>Output the names of the songs in a well-shuffled playlist, where no two songs from the same artist are played in a row.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with integer $n$ ($1\leq n\leq 10^5$), the number of songs in Kate's playlist.</li>
	<li>$n$ lines, each with two space-separated strings $a$ and $s$, the artist and the name of the song.</li>
</ul>

<p>The artist and song names have length between $1$ and $20$ characters, and only consist of English lowercase letters (<code>a-z</code>) and numbers (<code>0-9</code>).</p>

<p>The names of the songs are globally unique.</p>

### 출력

<p>Output $n$ strings, the names of the songs in a well-shuffled playlist.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>