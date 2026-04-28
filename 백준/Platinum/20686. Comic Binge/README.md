# [Platinum IV] Comic Binge - 20686

[문제 링크](https://www.acmicpc.net/problem/20686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 37, 맞힌 사람: 35, 정답 비율: 41.176%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A long vacation is coming! Andi and Budi, who are siblings, have just got a set of comic books as a gift from their uncle. As they had no plans for this vacation, they decided to stay home and read comic books.</p>

<p>There are N comic books, numbered from 1 to N. It takes A<sub>i</sub> hours for Andi to finish reading the i<sup>th</sup> book, while Budi needs B<sub>i</sub> hours to do so. Both Andi and Budi will read the comic books in ascending order of book number, one book at a time.</p>

<p>Because there is only one set of comic books, they decided to agree on the following rules:</p>

<ul>
	<li>Budi, being the older brother, may skip one book after reading a book. More precisely, after Budi has finished reading the i<sup>th</sup> book, he may start reading the (i+ 2)<sup>th</sup> book without reading the (i+ 1)<sup>th</sup> book at all.</li>
	<li>If Budi does not skip the i<sup>th</sup> book, Andi, being the younger brother, is not allowed to start reading the i<sup>th</sup> book before Budi finished reading it. If Budi skips the i<sup>th</sup> book, there is no special condition for the book.</li>
</ul>

<p>Both Andi and Budi must read the 1<sup>st </sup>book and N<sup>th</sup> book to enjoy the storyline. Also, Andi wants to read all books, while Budi might skip some books according to the above rules. Andi and Budi are considered as finished reading the comic books if and only if both Andi and Budi have finished reading the N<sup>th</sup> book.</p>

<p>Your task in this problem is to determine the shortest time in hours for Andi and Budi to finish reading the comic books.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 1000) representing the number of comic books. The second line contains N integers: A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 1000) representing the time in hours needed for Andi to read each book. The third line contains N integers: B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 10) representing the time in hours needed for Budi to read each book.</p>

### 출력

<p>Output in a line an integer representing the shortest time in hours for Andi and Budi to finish reading the comic books.</p>