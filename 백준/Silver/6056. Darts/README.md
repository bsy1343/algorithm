# [Silver IV] Darts - 6056

[문제 링크](https://www.acmicpc.net/problem/6056)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 32, 맞힌 사람: 22, 정답 비율: 64.706%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Many nations (including Germany) have a strange tradition of throwing small arrows at round flat targets (usually, these small arrows are called darts and so is the game).&nbsp;</p>

<p>In a darts game, the target consists of a flat circle which is divided into slices and rings. The slices are numbered from 1 to 20 and the rings are called double or treble ring (see Figure 5). The center part of the board is called the bull&rsquo;s eye which is further subdivided into an inner part (the real bull&rsquo;s eye) and an outer part (called the bull, see Fig. 5).&nbsp;</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6056.%E2%80%85Darts/37541fd7.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/6056.%E2%80%85Darts/37541fd7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6056/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:351px; width:306px" /></p>

<p style="text-align:center">Figure 5: Layout of a dart board.</p>

<p>Players take turns in throwing the darts at the board. Their score depends on the areas they hit with their darts. Hitting the 20 slice in the double ring scores 2 * 20 = 40 points. Hitting the treble ring multiplies the score by 3. The inner part of the bull&rsquo;s eye counts 50, the outer part 25 points.&nbsp;</p>

<p>Every turn consists of 3 darts being thrown at the dartboard by a player and his score is the sum of the scores of all darts which hit the dartboard in one of the numbered areas.&nbsp;</p>

<p>Your friends have played darts yesterday and from their match the scores are still on the blackboard in your room. From reading the scores, you would like to know, how the individual players threw their darts and where they could have hit the dartboard. You are to write a program which, given the score of a turn,reconstructs the number of possible distinct combinations of hits of the three darts on the dartboard ignoring the order in which the darts are thrown.&nbsp;</p>

<p>As an example, consider the overall score of 3 of a player. This could have happened as follows:&nbsp;</p>

<pre>
3 = 0 +    0 +    1*3    one dart hits slice 3
3 = 0 +    0 +    3*1    one dart hits slice 1 in treble ring
3 = 0 +    1*1 +  1*2    one dart hits slice 1 and one dart hits slice 2
3 = 0 +    1*1 +  2*1    one dart hits slice 1 and one dart hits slice 1 in double ring
3 = 1*1 +  1*1 +  1*1    all three darts hit slice 1</pre>

<p>The resulting sum of possible distinct combinations is 5.&nbsp;</p>

<p>A more complex example is score 9:&nbsp;</p>

<pre>
9 = 0 +    0 +    1*9    one dart hits slice 9
9 = 0 +    0 +    3*3    one dart hits slice 3 in treble ring
9 = 0 +    1*1 +  1*8    one dart hits slice 1 and one dart hits slice 8
9 = 0 +    1*1 +  2*4    one dart hits slice 1 and one dart hits slice 4 in double ring
...
9 = 0 +    3*2 +  1*3    one dart hits slice 2 in treble ring and one dart hits slice 3
9 = 1*1 +  1*1 +  1*7    two darts hit slice 1 and one dart hits slice 7
...
9 = 2*1 +  3*1 +  2*2    one dart hits slice 1 in double ring, one dart hits slice 1 in treble ring and one dart hits slice 2 in double ring
9 = 1*3 +  1*3 +  1*3    three darts hit slice 3
9 = 1*3 +  1*3 +  3*1    two darts hit slice 3 and one dart hits slice 1 in treble ring
9 = 1*3 +  3*1 +  3*1    one dart hits slice 3 and two darts hit slice 1 in treble ring
9 = 3*1 +  3*1 +  3*1    three darts hit slice 1 in treble ring</pre>

<p>What is the number of combinations? Write a program to find out.</p>

### 입력

<p>The first line contains the number of scenarios.&nbsp;</p>

<p>For each scenario, you are give a dart score as a single positive integer on a line by itself.</p>

### 출력

<p>The output for every scenario begins with a line containing &quot;Scenario #i:&quot;, where i is the number of the scenario starting at 1. Then print the number of possible dart score combinations on a line by itself.Finish the output of every scenario with a blank line.</p>

<p>&nbsp;</p>