# [Gold III] California Jones and the Gate to Freedom - 6552

[문제 링크](https://www.acmicpc.net/problem/6552)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>California Jones (the sister of famous Indiana Jones) once again faced a seemingly intractable problem. Her only hope was in you. She knew you were a computer scientist and you might have a clue.</p>

<p>Jones calls you on the video-phone and tells you the facts: she walked into a trap and now stands in front of a huge gate. On the left side strange signs can be seen while <em>n</em> stones lie on the right side. In front of the gate there are exactly <em>n/2</em> holes. Says Jones, &quot;I suppose I have to take exactly half of the stones from the right side and put them into the holes.&quot; Ancient writings confirm her conjecture. According to the writings it does not matter which hole a stone is placed into. It is only important that the right stones are chosen.</p>

<p><img alt="" src="/upload/images2/california.gif" style="float:left; height:397px; margin-right:22px; width:240px" />Nearby, Jones found a stone board, too, but was unable to interpret. It made sense to you though. It was a hint on how to sort the various possibilities of chosing <em>n/2</em> stones.</p>

<p>But you couldn&#39;t yet figure out about the zeros and the ones. So you asked Jones who replied that &quot;the same symbols I saw on the left side of the gate - only they were somewhat longer sequences. But I haven&#39;t met such a primitive civilization yet.&quot;</p>

<p>Now everything was clear to you: the symbols were the representation of a binary number - and it indicated which stones to choose. Simply ingenious! Jones was enthusiastic about you.</p>

<p>But it was impossible for Jones to calculate for a given binary number the corresponding stones. So she instructed you to write a program to solve the task and help her through the gate to freedom. Five hours later, she would call back.</p>

<p>Take a thorough look at the figure to the left depicting the stone board, as well as the sample input and output, to figure out how to solve Jones&#39; problem.</p>

### 입력

<p>The input contains several testcases. Each starts with the number of stones <em>n</em>. Input is terminated by <em>n=0</em>. Otherwise, <em>n</em> is even and <em>2&lt;=n&lt;=32</em>. The next <em>n</em> integers identify the stones. A test case is further subdivided into <em>k</em> (sub-) test cases, <em>k</em> being the next number in the input file. Then follow <em>k</em> times a bit string <em>b</em> (encoding a non-negative integer) and <em>n/2</em> distinct integers identifying the set of chosen stones. No invalid stones will be chosen and the length of <em>b</em> will not exceed <em>30</em>.</p>

### 출력

<p>For each (sub-) test case generate a line containing <code>TRUE</code>, if the chosen stones may be laid into the holes, and <code>FALSE</code> otherwise.</p>