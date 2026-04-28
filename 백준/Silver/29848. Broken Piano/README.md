# [Silver II] Broken Piano - 29848

[문제 링크](https://www.acmicpc.net/problem/29848)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>MIDI (Musical Instrument Digital Interface) is a technical standard for describing musical pieces, where each note is represented by an integer from the range $0 \ldots 1\,023$. You have a piano with $1\,024$ keys and you want to play a piece given in the MIDI format. The leftmost key on the piano corresponds to MIDI code $0$, the second key from the left to MIDI code $1$, etc.</p>

<p>Unfortunately, the piano is very old and some keys are broken. You are familiar with the piano, and know, which keys work and which don&#39;t. You can assume that no working key will break during the palying of this one piece, and also no broken key will suddenly start working.</p>

<p>Write a program to find</p>

<ul>
	<li>the number of notes in the piece that cannot be played on the piano; and</li>
	<li>the minimal transposition needed to play the piece on the piano.</li>
</ul>

<p>Transposition means shifting all the notes in a piece up or down by the same amount. When transposing the piece up by a half-tone, instead of any key designated by the original piece, its right-hand neighbor will be played on the piano. Similarly, when transposing down by a half-tone, the left-hand neighbor of the original key will be played. When transposing by two half-tones, the next but one key will be played, etc. Note that when a piece is transposed up by a half-tone, the note with the MIDI code $1\,023$ cannot be played, because there is no corresponding key on the piano.</p>

### 입력

<p>The first line contains $N$, the number of broken keys on the piano ($1 \le N \le 1\,024$). The second line contains $N$ distinct integers $A_i$ ($0 \le A_i \le 1\,023$): the MIDI codes of the broken keys. The third line contains $M$, the number of notes in the piece ($1 \le M \le 10^6$). The fourth line contains $M$ integers $B_i$ ($0 \le B_i \le 1\,023$): the MIDI codes of the notes in the piece.</p>

### 출력

<p>Output two lines. The first line should contain a single integer, the number of notes in the piece that cannot be played on the piano. The second line should contain the number of half-tones by which the piece must be transposed so that it can be played on the piano. If the piece could be transposed in several ways, output the transposition with the minimal absolute value. If the piece cannot be played with any transposition, the second line should contain &#39;<code>X</code>&#39;. If your solution does not find the transpostion amount, output &#39;<code>E</code>&#39; on the second line.</p>