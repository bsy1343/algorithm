# [Platinum II] Karaoke Compression - 32605

[문제 링크](https://www.acmicpc.net/problem/32605)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 146, 정답: 34, 맞힌 사람: 28, 정답 비율: 25.225%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 라빈–카프, 문자열, 해싱

### 문제 설명

<p>Next week, you will be hosting the Biannual Acoustic Popsong Convention. Of course, this convention also needs to include a karaoke night, featuring all your favourite acoustic pop songs! To impress all attendees, you have decided to prepare by learning the lyrics of all the songs by heart. But there is a problem: these lyrics are very long, so you will not have enough time left to learn all of this! However, you have noticed that a lot of the songs contain quite some repetitions. This gives you the idea of first compressing the lyrics, and then only learning the compressed version.</p>

<p>The compression scheme you will use works as follows. Let $s$ be the string to compress. You select exactly one nonempty substring $t$ of the lyrics, and replace as many occurrences of $t$ in $s$ as possible by a new character that did not occur in $s$ before. Call the result of this $s'$. Now you only need to remember the substring $t$ and the compressed string $s'$. You would like to know the minimal total length of these two strings, if you compress the lyrics in this manner.</p>

<p>As an example, consider the first sample case. In this case, you want to compress the lyrics "<code>nanananananananabatman</code>". If you replace the substring "<code>na</code>" by the character "<code>X</code>", the compressed string becomes "<code>XXXXXXXXbatman</code>". The total length of the substring and compressed string in this case is $2 + 14 = 16$. However, if you instead choose to replace the substring "<code>nana</code>", then the compressed string is "<code>XXXXbatman</code>" and the total length is $4 + 10 = 14$, which is optimal.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with a string $s$ $(1 \leq |s| \leq 5000)$, the lyrics to compress. The string only consists of English lowercase letters (<code>a-z</code>).</li>
</ul>

### 출력

<p>Output the minimal total length of the replaced substring and the compressed string.</p>