# [Platinum V] Typing monkey - 11135

[문제 링크](https://www.acmicpc.net/problem/11135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 61, 정답: 6, 맞힌 사람: 5, 정답 비율: 17.241%

### 분류

분할 정복을 이용한 거듭제곱, 구현, 수학, 문자열

### 문제 설명

<p>You have gotten hold of a monkey which is able to use a typewriter, and it is even capable of typing letters from a specific probability distribution.</p>

<p>You believe that this monkey will eventually be able to type Shakespeare&rsquo;s complete works. Your friend Eirik, however, believes that the monkey is more capable of producing another novel in the Harry Potter saga.</p>

<p>To settle this uncertainty, you must write a program which calculates the probability of producing a certain piece of literature before another piece, here represented by single words. A word is produced if is occurs as a substring somewhere in the stream of letters typed by the monkey. The monkey is only able to type lowercase letters from the English alphabet.</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases that follow. Each test case consists of two lines. The first line contains 26 floating point values p<sub>a</sub>, p<sub>b</sub>, . . . , p<sub>z</sub>, the probabilities of the monkey typing each letter, each separated by one space. The second line contains two strings P and Q, each separated by one space. Both strings consist of lower case letters from the English alphabet. The two strings will never be equal, and the probability of the monkey being able to produce the strings is always greater than zero. There are no test cases where the monkey can produce both strings at the same time.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &le; p<sub>&alpha;</sub> &le; 1</li>
	<li>&Sigma;p<sub>&alpha;</sub> = 1</li>
	<li>0 &lt; |P|, |Q| &le; 16</li>
	<li>An absolute or relative error of up to 10<sup>&minus;7</sup> compared to the correct answer will be accepted.</li>
	<li>The monkey&rsquo;s keypresses are independent events.</li>
</ul>

### 출력

<p>For each test case, output the probability of the monkey producing the word P before the word Q.</p>