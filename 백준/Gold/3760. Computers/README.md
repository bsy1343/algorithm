# [Gold IV] Computers - 3760

[문제 링크](https://www.acmicpc.net/problem/3760)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 149, 정답: 27, 맞힌 사람: 22, 정답 비율: 18.333%

### 분류

다이나믹 프로그래밍, 문자열, 파싱

### 문제 설명

<p>Everybody is fond of computers, but buying a new one is always a money challenge. Fortunately, there is always a convenient way to deal with. You can replace your computer and get a brand new one, thus saving some maintenance cost. Of course, you must pay a fixed cost for each new computer you get.</p>

<p>Suppose you are considering a n year period over which you want to have a computer. Suppose you buy a new computer in year y, 1&lt;=y&lt;=n. Then you have to pay a fixed cost c, in the year y, and a maintenance cost m(y,z) each year you own that computer, starting from year y through the year z, z&lt;=n, when you plan to buy - eventually - another computer.</p>

<p>Write a program that computes the minimum cost of having a computer over the n year period.</p>

### 입력

<p>The program input is from a text file. Each data set in the file stands for a particular set of costs. A data set starts with the cost c for getting a new computer. Follows the number n of years, and the maintenance costs m(y,z), y=1..n, z=y..n. The program prints the minimum cost of having a computer throughout the n year period.</p>

<p>White spaces can occur freely in the input. The input data are correct and terminate with an end of file.</p>

### 출력

<p>For each set of data the program prints the result to the standard output from the beginning of a line.</p>

### 힌트

<p>An input/output sample is in the table below. There is a single data set. The cost for getting a new computer is c=3. The time period n is n=3 years, and the maintenance costs are:</p>

<ul>
	<li>For the first computer, which is certainly bought: m(1,1)=5, m(1,2)=7, m(1,3)=50,</li>
	<li>For the second computer, in the event the current computer is replaced: m(2,2)=6, m(2,3)=8</li>
	<li>For the third computer, in the event the current computer is replaced: m(3,3)=10.</li>
</ul>

<p>The result for the data set is the minimum cost 19.</p>