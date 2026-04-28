# [Silver IV] Nash Equilibrium - 7693

[문제 링크](https://www.acmicpc.net/problem/7693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 26, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

구현, 게임 이론

### 문제 설명

<p>A two-player normal form game between two individuals A and B is completely specified by</p>

<ul>
	<li>{a<sub>1</sub>, . . . , a<sub>m</sub>}, a set of actions for player A,</li>
	<li>{b<sub>1</sub>, . . . , b<sub>n</sub>}, a set of actions for player B,</li>
	<li>PA, an m &times; n payoff matrix for player A, and</li>
	<li>PB, an m &times; n payoff matrix for player B.</li>
</ul>

<p>In such a game, both players simultaneously select actions to be played (say ai and bj for players A and B, respectively). Then payoffs for each player are determined according to the payoff matrices (PA[i,j] and PB[i,j] for players A and B, respectively). The goal of each player is to maximize his or her payoff.</p>

<p>For player A, the set of best responses to a particular action b<sub>j</sub> by player B consists of any action a<sub>i</sub> which maximizes A&rsquo;s payoff, that is, whose payoff is max<sub>i&#39;</sub>PA[i&#39;,j]. Similarly, for player B, the set of best responses to a particular action a<sub>i</sub> by player A is any action b<sub>j</sub> whose payoff is max<sub>j&#39;</sub>PB[i,j&#39;]. A pair of strategies (a<sub>i</sub>, b<sub>j</sub>) is said to be a pure strategy Nash equilibrium if a<sub>i</sub> is a best response to b<sub>j</sub> and b<sub>j</sub> is a best response to a<sub>i</sub>.</p>

<p>In this problem, you are given the payoff matrices for two players A and B, and your task is to find and list all pure strategy Nash equilibria.</p>

### 입력

<p>The input test file will contain multiple test cases. Each test case begins with a single line containing two integers, m and n, where 1 &le; m, n &le; 20. The next m lines specify the m rows of payoff matrix PA. The m lines after that specify the m rows of payoff matrix PB. All payoff matrix values will be integers between -100 and 100, inclusive. The end-of-file is marked by a test case with m = n = 0 and should not be processed.</p>

### 출력

<p>For each input case, suppose that N is the number of Nash equilibria for the described normal form game. Then, the output of the program consists of (1) a line containing the single integer N, and (2) N lines containing two integers i and j, where (a<sub>i</sub>, b<sub>j</sub>) is the corresponding Nash equilibrium. Note that the program must list all Nash equilibria in lexicographical order, i.e., (a<sub>i<sub>1</sub></sub>, b<sub>j<sub>1</sub></sub>) is listed before (a<sub>i<sub>2</sub></sub>, b<sub>j<sub>2</sub></sub>) if i<sub>1</sub> &lt; i<sub>2</sub> or if i<sub>1</sub> = i<sub>2</sub> and j<sub>1</sub> &lt; j<sub>2</sub>.</p>

### 힌트

<p>Consider the following two-player game in which A and B each have two possible actions, and the payoff matrices are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7693.%E2%80%85Nash%E2%80%85Equilibrium/ba092c9a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/7693.%E2%80%85Nash%E2%80%85Equilibrium/ba092c9a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7693/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:65px; width:238px" /></p>

<p>Here, if player A chooses a<sub>1</sub>, then choosing b<sub>1</sub> allows player B to maximize his payoff (PB[1, 1] = 1 &gt; 0 = PB[1, 2]). Similarly, if player B choose b<sub>1</sub>, then choosing a<sub>1</sub> allows player A to maximize his payoff (PA[1, 1] = 1 &gt; 0 = PA[2, 1]). Thus, a<sub>1</sub> is the best response for b<sub>1</sub> and vice versa, so (a<sub>1</sub>, b<sub>1</sub>) is a pure strategy Nash equilibrium of this game. However, note that (a<sub>2</sub>, b<sub>2</sub>) is not a Nash equilibrium; if player A chooses action a<sub>2</sub>, b<sub>1</sub> is the best response since PB[2, 1] = 5 &gt; 3 = PB[2, 2].</p>