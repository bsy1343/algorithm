# [Gold II] Finding Seats - 5736

[문제 링크](https://www.acmicpc.net/problem/5736)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 12, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

이분 탐색, 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>A group of K friends is going to see a movie. However, they are too late to get good tickets, so they are looking for a good way to sit all nearby. Since they are all science students, they decided to come up with an optimization problem instead of going on with informal arguments to decide which tickets to buy.</p>

<p>The movie theater has R rows of C seats each, and they can see a map with the currently available seats marked. They decided that seating close to each other is all that matters, even if that means seating in the front row where the screen is so big it&rsquo;s impossible to see it all at once. In order to have a formal criteria, they thought they would buy seats in order to minimize the extension of their group.</p>

<p>The extension is defined as the area of the smallest rectangle with sides parallel to the seats that contains all bought seats. The area of a rectangle is the number of seats contained in it. They&rsquo;ve taken out a laptop and pointed at you to help them find those desired seats.</p>

### 입력

<p>Each test case will consist on several lines. The first line will contain three positive integers R, C and K as explained above (1 &le; R, C &le; 300, 1 &le; K &le; R &times; C). The next R lines will contain exactly C characters each. The j-th character of the i-th line will be &lsquo;X&rsquo; if the j-th seat on the i-th row is taken or &lsquo;.&rsquo; if it is available. There will always be at least K available seats in total.</p>

<p>Input is terminated with R = C = K = 0.</p>

<p>The input must be read from standard input.</p>

### 출력

<p>For each test case, output a single line containing the minimum extension the group can have.</p>

<p>The output must be written to standard output.</p>