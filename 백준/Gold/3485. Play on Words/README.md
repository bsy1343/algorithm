# [Gold III] Play on Words - 3485

[문제 링크](https://www.acmicpc.net/problem/3485)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 15, 정답 비율: 40.541%

### 분류

그래프 이론, 그래프 탐색, 오일러 경로

### 문제 설명

<p>Some of the secret doors contain a very interesting word puzzle. The team of archaeologists has to solve it to open that doors. Because there is no other way to open the doors, the puzzle is very important for us.</p>

<p>There is a large number of magnetic plates on every door. Every plate has one word written on it. The plates must be arranged into a sequence in such a way that every word begins with the same letter as the previous word ends. For example, the word &quot;ac<u>m</u>&quot; can be followed by the word &quot;<u>m</u>otorola&quot;. Your task is to write a computer program that will read the list of words and determine whether it is possible to arrange all of the plates in a sequence (according to the given rule) and consequently to open the door.</p>

### 입력

<p>The input consists of T test cases. The number of them (T) is given on the first line of the input file. Each test case begins with a line containing a single integer number N that indicates the number of plates (1 &lt;= N &lt;= 100000). Then exactly Nlines follow, each containing a single word. Each word contains at least two and at most 1000 lowercase characters, that means only letters &#39;a&#39; through &#39;z&#39; will appear in the word. The same word may appear several times in the list.</p>

### 출력

<p>Your program has to determine whether it is possible to arrange all the plates in a sequence such that the first letter of each word is equal to the last letter of the previous word. All the plates from the list must be used, each exactly once. The words mentioned several times must be used that number of times.</p>

<p>If there exists such an ordering of plates, your program should print the sentence &quot;Ordering is possible.&quot;. Otherwise, output the sentence &quot;The door cannot be opened.&quot;.</p>