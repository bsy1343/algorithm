# [Platinum III] Audience Queue - 25530

[문제 링크](https://www.acmicpc.net/problem/25530)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

수학, 애드 혹, 정수론, 누적 합, 조합론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p>You are working as a staff member at a concert venue, organizing the audience queue. Everyone in the queue holds one ticket with a seat number printed. The seat numbers are integers from 1 to <i>n</i> without duplicates. Since this is a very popular concert, all the seats are reserved and exactly <i>n</i> people are in a single line.</p>

<p style="text-align: right;"><img alt="" src="https://upload.acmicpc.net/18f1bbcb-a1d5-46df-a59b-a39d6e66e9a2/-/preview/" style="width: 409px; height: 71px;" /></p>

<p style="text-align: center;">Figure D-1: An example of the audience queue (The first dataset in Sample Input)</p>

<p>Your job is to split the line at some points and navigate each of the sublines to a distinct entrance gate. The audience are so polite that the order in each of the sublines is kept. There are <i>k</i> entrance gates, and thus you can split the line into <i>k</i> or less sublines. Sublines may have widely varying lengths, but empty sublines are not allowed. In the example of the figure below, the original line [4 2 3 5 1] has been split into three sublines, [4 2], [3 5], and [1].</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4d0219a2-8e8e-412c-a41c-97412c35f167/-/preview/" style="width: 368px; height: 364px;" /></p>

<p style="text-align: center;">Figure D-2: An example of splitting the line</p>

<p>Although up to <i>k</i> lines are formed, the audience can enter the hall one at a time. Among those who head the lines, one with the smallest seat number enters the hall first. In the example figure below, among the heads 4, 3, and 1 of the lines, one with the smallest seat number, 1, enters the hall first. Subsequent entrance order is decided in the same way. Among those who head the lines at the time, one with the smallest seat number is the next to enter the hall.</p>

<p><img alt="" src="https://upload.acmicpc.net/d87cd497-daab-4b46-b664-48f6b134d955/-/preview/" style="width: 460px; height: 330px;" /></p>

<p style="text-align: center;">Figure D-3: An example of the order of the entrance</p>

<p>The order of entrance depends on how you split the audience line. Different ways of splitting may result in the same order. For the example above, splitting into [4 2], [3], [5], and [1] results in the same order.</p>

<p>Given the initial order in the queue and the final entrance order of the audience, please compute how many different ways of splitting the line result in the given final entrance order. For the same partitioning of the line, different assignments of sublines to gates are not counted separately.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<i>n</i> <i>k</i>
<i>s</i><sub>1</sub> ... <i>s<sub>n</sub></i>
<i>t</i><sub>1</sub> ... <i>t<sub>n</sub></i></pre>

<p>Integers <i>n</i> and <i>k</i> satisfies 1 &le; <i>k</i> &le; <i>n</i> &le; 10<sup>4</sup>. The number of the people in the audience line is represented by <i>n</i>, and the number of the gates is represented by <i>k</i>. The sequence <i>s</i><sub>1</sub> ... <i>s<sub>n</sub></i> is a permutation of the integers 1 through <i>n</i>, which describes the initial order of the audience in the queue. The sequence <i>t</i><sub>1</sub> ... <i>t<sub>n</sub></i> is also a permutation of the integers 1 through <i>n</i>, which describes the final entrance order.</p>

<p>The end of the input is indicated by a line &quot;0 0&quot;. The number of datasets does not exceed 50.</p>

### 출력

<p>For each dataset, output in a line the number of ways to split the line as described in the problem statement. Since the number can be very large, the output should be the number modulo the prime number 998&thinsp;244&thinsp;353.</p>