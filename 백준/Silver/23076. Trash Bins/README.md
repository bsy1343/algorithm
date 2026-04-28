# [Silver IV] Trash Bins - 23076

[문제 링크](https://www.acmicpc.net/problem/23076)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 177, 정답: 107, 맞힌 사람: 66, 정답 비율: 53.226%

### 분류

수학, 문자열

### 문제 설명

<p>In the city where you live, Kickstartland, there is one particularly long street with&nbsp;$N$ houses on it. This street has length&nbsp;$N$, and the&nbsp;$N$&nbsp;houses are evenly placed along it, that is, the first house is at position&nbsp;$1$, the second house is at position&nbsp;$2$, and so on. The distance between any pair of houses&nbsp;$i$&nbsp;and&nbsp;$j$&nbsp;is&nbsp;$|i-j|$, where&nbsp;$|x|$&nbsp;denotes the absolute value of&nbsp;$x$.</p>

<p>Some of these houses have trash bins in front of them. That means that the owners of such houses do not have to walk when they want to take their trash out. However, for the owners of houses that do not have trash bins in front of them, they have to walk towards some house that has a trash bin in front of it, either to the left or to the right of their own house.</p>

<p>To save time, every house owner always takes their trash out to the trash bin that is closest to their houses. If there are two trash bins that are both the closest to a house, then the house owner can walk to any of them.</p>

<p>Given the number of houses&nbsp;$N$, and the description of which of these houses have trash bins in front of them, find out what is the sum of the distances that each house owner has to walk to take their trashes out. You can assume that at least one house has a trash bin in front of it.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow. Each test case consists of two lines.</p>

<p>The first line of each test case contains an integer&nbsp;$N$, denoting the number of houses on the street.</p>

<p>The second line of each test case contains a string&nbsp;$S$&nbsp;of length&nbsp;$N$, representing which houses have trash bins in front of them. If the&nbsp;$i$-th character in string&nbsp;$S$&nbsp;is equal to&nbsp;$1$, then it means that the&nbsp;$i$-th house has a trash bin in front of it. Otherwise, if it is equal to&nbsp;$0$, then it means that the&nbsp;$i$-th house does not have a trash bin in front of it.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;$x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the sum of the distances that each house owner has to walk to take their trashes out.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>The length of $S$&nbsp;is equal to&nbsp;$N$.</li>
	<li>Each character of&nbsp;$S$&nbsp;is either&nbsp;$0$&nbsp;or&nbsp;$1$.</li>
	<li>There is at least one character&nbsp;$1$&nbsp;in&nbsp;$S$.</li>
</ul>

### 힌트

<p>For the first test case, every house has a trash bin in front of it, and therefore none of the house owners will have to walk to take their trashes out.</p>

<p>For the second test case, the first and the fourth house owners have trash bins in front of their houses, and therefore will not have to walk. The second house owner will walk towards the first house, and the distance will be equal to&nbsp;$1$. The third, fifth, and sixth house owners will walk towards the fourth house, and the distances will be equal to $1$,&nbsp;$1$, and&nbsp;$2$, respectively.</p>