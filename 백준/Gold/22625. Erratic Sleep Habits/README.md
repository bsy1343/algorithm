# [Gold IV] Erratic Sleep Habits - 22625

[문제 링크](https://www.acmicpc.net/problem/22625)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 21, 맞힌 사람: 20, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Peter is a person with erratic sleep habits. He goes to sleep at twelve o&rsquo;clock every midnight. He gets up just after one hour of sleep on some days; he may even sleep for twenty-three hours on other days. His sleeping duration changes in a cycle, where he always sleeps for only one hour on the first day of the cycle.</p>

<p>Unfortunately, he has some job interviews this month. No doubt he wants to be in time for them. He can take anhydrous caffeine to reset his sleeping cycle to the beginning of the cycle anytime. Then he will wake up after one hour of sleep when he takes caffeine. But of course he wants to avoid taking caffeine as possible, since it may affect his health and accordingly his very important job interviews.</p>

<p>Your task is to write a program that reports the minimum amount of caffeine required for Peter to attend all his interviews without being late, where the information about the cycle and the schedule of his interviews are given. The time for move to the place of each interview should be considered negligible.</p>

### 입력

<p>The input is given in the following format:</p>

<pre>
T
t<sub>1</sub> t<sub>2</sub> . . . t<sub>T</sub>
N
D<sub>1</sub> M<sub>1</sub>
D<sub>2</sub> M<sub>2</sub>
. . .
D<sub>N</sub> M<sub>N</sub></pre>

<p>T is the length of the cycle (1 &le; T &le; 30); t<sub>i</sub> (for 1 &le; i &le; T) is the amount of sleep on the i-th day of the cycle, given in hours (1 &le; t<sub>i</sub> &le; 23); N is the number of interviews (1 &le; N &le; 100); D<sub>j</sub> (for 1 &le; j &le; N) is the day of the j-th interview (1 &le; D<sub>j</sub> &le; 100); M<sub>j</sub> (for 1 &le; j &le; N) is the hour when the j-th interview starts (1 &le; M<sub>j</sub> &le; 23).</p>

<p>The numbers in the input are all integers. t<sub>1</sub> is always 1 as stated above. The day indicated by 1 is the first day in the cycle of Peter&rsquo;s sleep.</p>

### 출력

<p>Print the minimum number of times Peter needs to take anhydrous caffeine.</p>