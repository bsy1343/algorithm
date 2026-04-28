# [Platinum II] Yahtzee - 9305

[문제 링크](https://www.acmicpc.net/problem/9305)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 26, 맞힌 사람: 17, 정답 비율: 21.250%

### 분류

구현, 다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>As a child, Colleen loved the game &ldquo;Yahtzee&rdquo;. In Yahtzee, a player rolls 13 sets of five dice and assigns each set to various categories, which give points towards a cumulative total. This is a one-to-one matching, meaning that each set can only count for a single category and each category can only contribute points from a single set. This means that each category will be used exactly once, and each set of rolls will be used exactly once.</p>

<p>Now that Colleen has become an experienced programmer, she wants to determine the maximum possible score that she could achieve from a given set of dice rolls. Often times in Yahtzee, a player is allowed to select dice to re-roll; Colleen chose to ignore this rule to make things easier for herself.</p>

<p>The categories to assign dice roll sets in standard Yahtzee are as follows.</p>

<ul>
	<li><strong>Ones</strong>: Multiply the number of ones on the dice by 1. Example: (1 2 3 4 5 = 1 point)</li>
	<li><strong>Twos</strong>: Multiply the number of twos on the dice by 2. Example: (3 1 1 5 6 = 0 points)</li>
	<li><strong>Threes</strong>: Multiply the number of threes on the dice by 3. Example: (4 1 3 3 3 = 9 points)</li>
	<li><strong>Fours</strong>: Multiply the number of fours on the dice by 4. Example: (4 1 1 6 5 = 4 points)</li>
	<li><strong>Fives</strong>: Multiply the number of fives on the dice by 5. Example: (2 1 6 5 5 = 10 points)</li>
	<li><strong>Sixes</strong>: Multiply the number of sixes on the dice by 6. Example: (6 2 1 6 3 = 12 points)</li>
</ul>

<p>If the sum of the above six categories is at least 63, an additional 35-point bonus is added to the total.</p>

<ul>
	<li><strong>Chance</strong>: Sum up all of the dice. Example: (1 2 3 4 5 = 15 points)</li>
	<li><strong>Three of a Kind</strong>: If there are at least three of a single dice roll, sum up all of the dice. Example: (1 1 1 5 6 = 14 points, 1 2 3 4 5 = 0 points)</li>
	<li><strong>Four of a Kind</strong>: If there are at least four of a single dice roll, sum up all of the dice. Example: (1 1 1 1 6 = 10 points, 1 2 3 4 5 = 0 points)</li>
	<li><strong>Short Straight</strong>: 25 points if at least four of the dice form a sequence. Example: (1 2 3 4 1 = 25 points, 1 2 3 1 2 = 0 points)</li>
	<li><strong>Long Straight</strong>: 35 points if all five of the dice form a sequence. Example: (1 2 3 4 5 = 35 points, 1 2 3 4 1 = 0 points)</li>
	<li><strong>Full House</strong>: 40 points if three of the dice are equal and the other two dice are also equal. Example: (5 2 5 5 2 = 40 points, 5 2 5 5 1 = 0 points)</li>
	<li><strong>Yahtzee</strong>: 50 points if all of the dice are equal. Example: (1 1 1 1 1 = 50 points, 1 1 1 1 2 = 0 points)</li>
</ul>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case contains 13 lines of 5 integers each, where each line represents the five dice rolled in a single set. Each dice roll is between 1 and 6, indicating the value that appeared on that die.</p>

### 출력

<p>For each case output &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by a space, followed by the maximum Yahtzee score possible with these dice roll sets.</p>