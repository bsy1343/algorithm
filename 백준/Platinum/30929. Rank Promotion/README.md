# [Platinum V] Rank Promotion - 30929

[문제 링크](https://www.acmicpc.net/problem/30929)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 107, 정답: 69, 맞힌 사람: 60, 정답 비율: 76.923%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Quiz Solver is a popular online computer game. Each time a player opens the mobile application of the game, a new quiz is displayed. The player submits an answer to the quiz, and then it is judged either as correct or incorrect, which is accumulated in the database. When the player shows high accuracy for a number of quizzes, the <em>rank</em> of the player in the game is promoted.</p>

<p>Player ranks are non-negative integers, and each player starts the game at the rank $0$. The player will be promoted to the next rank when the player achieves a high ratio of correct answers during a sufficiently long sequence of quizzes. More precisely, the rank promotion system is defined by two parameters: an integer $c$, and a rational number $p/q$. After finishing the $e$-th quiz, the player&rsquo;s rank is immediately incremented by one if there exists an integer $s$ satisfying the following conditions.</p>

<ul>
	<li>$1 &le; s &le; e - c + 1$.</li>
	<li>The player was already at the current rank before starting the $s$-th quiz.</li>
	<li>The ratio of correct answers of the quizzes from the $s$-th through the $e$-th is higher than or equal to $p/q$.</li>
</ul>

<p>Otherwise, the rank stays the same.</p>

<p>One day, the administrator of Quiz Solver realized that the rank data of the players were lost due to a database failure. Luckily, the log of quiz solving records was completely secured without any damages. Your task is to recompute the rank of each player from the solving records for the player.</p>

### 입력

<p>The input consists of a single test case in the following format.</p>

<blockquote>
<p>$n$ $c$ $p$ $q$</p>

<p>$S_1$ $\cdots$ $S_n$</p>
</blockquote>

<p>The first line consists of four integers satisfying the following constraints: $1 &le; n &le; 5 \times 10^5$, $1 &le; c &le; 200$, and $1 &le; p &le; q &le; 5 \times 10^5$. The first integer $n$ is the number of quizzes answered by a single player. The meanings of the parameters $c$, $p$, and $q$ are described in the problem statement.</p>

<p>$S_1$ $\cdots$ $S_n$ is a string describing the quiz solving records of the player. Each $S_i$ is either <code>Y</code> meaning that the player&rsquo;s answer for the $i$-th quiz was correct, or <code>N</code> meaning incorrect.</p>

### 출력

<p>Output the final rank of the player after finishing the $n$-th quiz in one line.</p>

### 힌트

<p>In Sample Input 1, the player is promoted to the rank $1$ after finishing the fourth quiz, because the ratio of the correct answers 3$/4$ is higher than $p/q = 4/7$. Note that, the promotion didn&rsquo;t happen at the third quiz because only three quizzes had been answered, which is less than $c = 4$. Then, after the eleventh quiz, the player is promoted to the rank $2$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30929.%E2%80%85Rank%E2%80%85Promotion/d8c5a2ab.png" data-original-src="https://upload.acmicpc.net/808efe4f-5f68-4874-9d41-87f53ef69dd9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 342px; height: 55px;" /></p>

<p style="text-align: center;">Figure B.1. The timings of rank promotions of Sample Input 1</p>