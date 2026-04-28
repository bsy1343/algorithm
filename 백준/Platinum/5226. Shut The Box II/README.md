# [Platinum V] Shut The Box II - 5226

[문제 링크](https://www.acmicpc.net/problem/5226)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>http://www.cs.umd.edu/Outreach/hsContest12/questions/all.pdf</p>

### 입력

<p>The Avengers are still bored on their way to the Collector&rsquo;s hiding place, and are continuing to play Shut the Box. Unfortunately for Dr. Banner, the strategy that he was using with your help is not turning out to be a very good one, and he is losing most of the games. He is halfway to transforming into the Hulk, and you need to calm him down by finding the best move at any given point, defined to be the one that maximizes the probability of eventually shutting the box.</p>

<p>Assume that the dice are fair (i.e., with two dice, all of the 36 possibilities are equally likely). Keep in mind the twist mentioned earlier: when the total of the open cards is &le; 6, only one die is used.</p>

<p>For example, say the current open cards are: 1, 2, and 3, and the rolled total = 3. There are 2 moves:</p>

<ul>
	<li>Shut 1 and 2: In this case, we are left with 3. The probability that we will shut the box is then equal to the probability that we roll a 3 on the next try. Assuming fair dice (and keeping in mind we are only using 1 die), the probability = 1/6 = 0.166666.</li>
	<li>Shut 3: Then we are left with 1 and 2, and the analysis is a bit more complicated. However, we can show the probability of eventually shutting the box to be somewhat higher in this case. We state the computation here without derivation: 1/6 + 2/6 * 1/6 = 0.2222222. We should choose this move.</li>
</ul>

### 출력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case: the first entry on each line is the rolled total (called target), and the next entry is the number of open cards n. The following n entries denote the open cards in the ascending order.</p>

### 제한

<p>For each test case, you are to output the move that maximizes the probability of eventually shutting the box, or output that there is no legal move. If there is a move, you also need to list out the probability of shutting the box moving forward. The exact form is shown below.</p>