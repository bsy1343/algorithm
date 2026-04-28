# [Platinum II] Brunhilda’s Birthday - 6291

[문제 링크](https://www.acmicpc.net/problem/6291)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 118, 정답: 31, 맞힌 사람: 27, 정답 비율: 27.000%

### 분류

수학, 다이나믹 프로그래밍, 그리디 알고리즘, 정수론

### 문제 설명

<p>Except for her affinity towards old armours, Brunhilda is a normal seven year old girl. Thus, she is planning the perfect birthday party, for which she has invented the following game: All children run around until some number k is announced. Then all children try to form groups of exactly k people. As long as at least k children are left over, further groups of k children are formed. In the end, less than k children are left over and will be eliminated (not literally of course) from the game. The game continues with further numbers announced, and ends if all children are out.</p>

<p>Brunhilda asked her father Wotan to announce the numbers in the game. Wotan does not like this game and announced &infin; when they first tried it. Brunhilda thinks this would be quite embarrassing at the party, and so she gave him a list of m prime numbers from which he can choose for each call; he may use the same number more than once.</p>

<p>Wotan would like to end the game as soon as possible since he has tickets for a match of his favourite football club FC Asgard. Unfortunately, Brunhilda does not know the number of children at her party yet. Now, for Q different numbers n<sub>1</sub>, . . . , n<sub>Q</sub> of children, Wotan wants to know in advance the least number of calls he will need to end the game.</p>

### 입력

<p>The first line contains the integers m and Q described above. The second line contains m different prime numbers p<sub>i</sub> (1 &le; i &le; m) in ascending order: the list of prime numbers Wotan can use. The following Q lines contain one integer n<sub>j</sub> (1 &le; j &le; Q) each: the number of children who might take part in the game.</p>

### 출력

<p>The output should consist of Q lines. The j-th line should contain the answer for n<sub>j</sub>: if Wotan can end the game it should contain the least number of calls he needs (an integer), otherwise the line should contain the string <code>oo</code> (two lower case letters <code>o</code>, meaning &infin;).</p>

### 제한

<ul>
	<li>1 &le; m &le; 100 000</li>
	<li>1 &le; Q &le; 100 000</li>
	<li>2 &le; p<sub>i</sub> &le; 10 000 000</li>
	<li>1 &le; n<sub>j</sub> &le; 10 000 000</li>
</ul>