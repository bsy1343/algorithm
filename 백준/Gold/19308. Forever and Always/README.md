# [Gold I] Forever and Always - 19308

[문제 링크](https://www.acmicpc.net/problem/19308)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 13, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Consider an abstract voting procedure. For example, this might be voting for the best song of &quot;Bullet for My Valentine&quot;&nbsp;in 2019.</p>

<p>There are $n$ persons taking part in voting, and there are $m$ options to vote for. Every person has formed their own <em>preference list</em>&nbsp;which includes some of the options, in order from most preferred to least preferred. Note that some options might be missing from the preference list --- such options are not just little preferred, but unacceptable.</p>

<p>Voting is conducted in <em>iterations</em>.</p>

<p>In the first iteration, every person votes for the first option on their preference list. The number of votes for every option is counted and announced to everyone.</p>

<p>In every subsequent iteration, every person intends to vote for the option on their preference list which has received the most number of votes in the previous iteration. If there are several such options, the one that comes earlier on the preference list is chosen.</p>

<p>Before every iteration, it&#39;s asked whether anyone is going to vote differently from the previous iteration. If this is not the case, the iteration is not conducted, and the results of the last iteration are declared to be the final vote results. Otherwise, voting takes place, and similarly to the first iteration, the number of votes for every option is counted and announced to everyone again. Note that votes of the previous iterations become ignored.</p>

<p>This sort of voting procedure looks very cumbersome to you, and, most importantly, it looks like it may take forever to find out the results! To prove your point, propose values of $n$, $m$ and preference lists such that at least 100 iterations of voting will be conducted.</p>

### 입력

<p>The only line of the input contains a single integer $p$ --- the required number of iterations.</p>

<p>There are two test cases. In test case 1, $p = 2$. In test case 2, $p = 100$.</p>

### 출력

<p>Output two integers $n$ and $m$ ($1 \le n \le 10^5$; $1 \le m \le 2 \cdot 10^5$) --- the number of persons and the number of options, respectively, followed by $n$ preference lists.</p>

<p>Each preference list must be described by $k_i$ ($1 \le k_i \le m$) --- the number of options on the list, followed by $k_i$ distinct integers $a_{i, j}$ ($1 \le a_{i, j} \le m$) --- option identifiers on the list, in order from most preferred to least preferred.</p>

<p>The sum of all values of $k_i$ must not exceed $2 \cdot 10^5$.</p>

### 힌트

<p>Consider the example test case.</p>

<p>In the first iteration everyone votes for the first option on their list. Thus, the first person votes for option 1, the second and the fourth persons vote for option 2, and the third person votes for option 5.</p>

<p>In the second iteration, seeing that option 2 is now prevailing, the first person will change their vote from option 1 to option 2. Everyone else will keep their vote as is. In particular, the third person will keep his vote for option 5 since both option 5 and option 1 have had one vote in the first iteration, but option 5 is earlier on their list.</p>

<p>Finally, the third iteration is not conducted since nobody is willing to change their vote anymore. Two iterations have been conducted, which satisfies $p = 2$.</p>