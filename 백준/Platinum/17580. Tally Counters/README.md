# [Platinum I] Tally Counters - 17580

[문제 링크](https://www.acmicpc.net/problem/17580)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 29, 맞힌 사람: 25, 정답 비율: 53.191%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A number of tally counters are placed in a row. Pushing the button on a counter will increment the displayed value by one, or, when the value is already the maximum, it goes down to one. All the counters are of the same model with the same maximum value.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17580.%E2%80%85Tally%E2%80%85Counters/e3925bf1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17580.%E2%80%85Tally%E2%80%85Counters/e3925bf1.png" data-original-src="https://upload.acmicpc.net/771d1055-26c4-4ba2-9dd4-fd601a0bda12/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 407px; height: 209px;" /></p>

<p style="text-align: center;">Fig. D-1 Tally Counters</p>

<p>Starting from the values initially displayed on each of the counters, you want to change all the displayed values to target values specified for each. As you don&#39;t want the hassle, however, of pushing buttons of many counters one be one, you devised a special tool. Using the tool, you can push buttons of one or more adjacent counters, one push for each, in a single operation. You can choose an arbitrary number of counters at any position in each operation, as far as they are consecutively lined up.</p>

<p>How many operations are required at least to change the displayed values on counters to the target values?</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<i>n</i> <i>m</i>
<i>a</i><sub>1</sub> <i>a</i><sub>2</sub> ... <i>a<sub>n</sub></i>
<i>b</i><sub>1</sub> <i>b</i><sub>2</sub> ... <i>b<sub>n</sub></i>
</pre>

<p>Each dataset consists of 3 lines. The first line contains <i>n</i> (1 &le; <i>n</i> &le; 1000) and <i>m</i> (1 &le; <i>m</i> &le; 10000), the number of counters and the maximum value displayed on counters, respectively. The second line contains the initial values on counters, <i>a<sub>i</sub></i> (1 &le; <i>a<sub>i</sub></i> &le; <i>m</i>), separated by spaces. The third line contains the target values on counters, <i>b<sub>i</sub></i> (1 &le; <i>b<sub>i</sub></i> &le; <i>m</i>), separated by spaces.</p>

<p>The end of the input is indicated by a line containing two zeros. The number of datasets does not exceed 100.</p>

### 출력

<p>For each dataset, print in a line the minimum number of operations required to make all of the counters display the target values.</p>