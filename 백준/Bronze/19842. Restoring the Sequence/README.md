# [Bronze I] Restoring the Sequence - 19842

[문제 링크](https://www.acmicpc.net/problem/19842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 252, 정답: 104, 맞힌 사람: 89, 정답 비율: 41.014%

### 분류

구현

### 문제 설명

<p>It&#39;s school time, and today the first graders are learning about positive integers. The teacher wrote numbers from $1$ to $n$ in ascending order on the blackboard, for demonstration.</p>

<p>Unfortunately, young hooligan Kolya from the 11-th grade ran into the classroom and ruined the beautiful sequence written on the blackboard. Standing before the principal he repented and claimed that he only erased one number from the sequence.</p>

<p>Help the teacher to figure out whether this can be true, and if it can, which number was erased by Kolya.</p>

### 입력

<p>The first line of input contains one integer $n$ --- the number of integers written by the teacher on the blackboard ($2 \le n \le 1000$).</p>

<p>The second line of input contains the number $m$ --- the number of integers on the blackboard after Kolya&#39;s actions ($1 \le m \le 1000$).</p>

<p>The third line contains $m$ integers $a_1, a_2, \ldots, a_m$ --- the integers on the blackboard after Kolya&#39;s actions, in the order they are written on the board ($1 \le a_i \le 1000$).</p>

### 출력

<p>If Kolya&#39;s explanations are plausible, and the numbers written on the blackboard could be obtained from the sequence $1, 2, \ldots, n$ by erasing exactly one number, output the word &lt;&lt;<code>Yes</code>&gt;&gt; at the first line. The next line must contain the number that was erased by Kolya.</p>

<p>Otherwise output one word &lt;&lt;<code>No</code>&gt;&gt;.</p>