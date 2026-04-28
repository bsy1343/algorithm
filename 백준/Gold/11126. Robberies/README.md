# [Gold III] Robberies - 11126

[문제 링크](https://www.acmicpc.net/problem/11126)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 87, 정답: 18, 맞힌 사람: 17, 정답 비율: 35.417%

### 분류

수학, 다이나믹 프로그래밍, 확률론, 배낭 문제

### 문제 설명

<p>The aspiring Roy the Robber has seen a lot of American movies, and knows that the bad guys usually gets caught in the end, often because they become too greedy. He has decided to work in the lucrative business of bank robbery only for a short while, before retiring to a comfortable job at a university.</p>

<p>For a few months now, Roy has been assessing the security of various banks and the amount of cash they hold. He wants to make a calculated risk, and grab as much money as possible. His mother, Ola, has decided upon a tolerable probability of getting caught. She feels that he is safe enough if the banks he robs together give a probability less than this.</p>

### 입력

<p>The first line of input gives T, the number of cases. For each scenario, the first line of input gives a floating point number P, the probability Roy needs to be below, and an integer N, the number of banks he has plans for. Then follow N lines, where line j gives an integer M<sub>j</sub> and a floating point number P<sub>j</sub>. Bank j contains M<sub>j</sub> millions, and the probability of getting caught from robbing it is P<sub>j</sub>.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0.0 &le; P &le; 1.0</li>
	<li>0 &lt; N &le; 100</li>
	<li>0 &lt; M<sub>j</sub> &le; 100</li>
	<li>0.0 &le; P<sub>j</sub> &le; 1.0</li>
	<li>A bank goes bankrupt if it is robbed, and you may assume that all probabilities are independent as the police have very low funds.</li>
</ul>

### 출력

<p>For each test case, output a line with the maximum number of millions he can expect to get while the probability of getting caught is less than the limit set.</p>