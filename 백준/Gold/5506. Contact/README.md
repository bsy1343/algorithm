# [Gold II] Contact - 5506

[문제 링크](https://www.acmicpc.net/problem/5506)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 183, 정답: 35, 맞힌 사람: 17, 정답 비율: 20.482%

### 분류

정렬, 비트마스킹

### 문제 설명

<p>Dr. Astro Insky works at a radiotelescope centre. Recently, she noticed a very curious microwave pulsing emission sent right from the centre of the galaxy. Is the emission transmitted by some extraterrestrial form of intelligent life? Or is it nothing but the usual heartbeat of the stars?</p>

<p>You must help Dr. Insky to find out the truth by providing a tool to analyse bit patterns in the files she records. Dr. Insky wants to find the patterns of length between (and including) A and B that repeat themselves most often in the data file of each day. In each case, the greatest N distinct frequencies (that is, number of occurrences) are sought. Pattern occurrences may overlap, and only patterns that occur at least once are taken into account.</p>

### 입력

<ul>
	<li>First line - The integer A indicating the minimum pattern length.</li>
	<li>Second line - The integer B indicating the maximum pattern length.</li>
	<li>Third line - The integer N indicating the number of distinct frequencies.</li>
	<li>Fourth line - A sequence of 0 and 1 characters, terminated by a 2 character.</li>
</ul>

### 출력

<p>A report in standard output with at most N lines, listing the at most N greatest frequencies and corresponding patterns. The listing must be produced in decreasing order of pattern frequency, and consists of lines formatted like <code>frequency pattern pattern ... pattern</code> where frequency is the number of occurrences of the patterns that follow. The patterns in each line must appear in decreasing order of length. Patterns of equal length must be listed in reverse numerical order. In case there are less than N distinct frequencies, the output listing will have less than N lines.</p>

### 제한

<ul>
	<li>0 &lt; N &le; 20</li>
	<li>0 &lt; A &le; B &le; 20</li>
</ul>