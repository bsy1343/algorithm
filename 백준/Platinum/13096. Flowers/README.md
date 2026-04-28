# [Platinum I] Flowers - 13096

[문제 링크](https://www.acmicpc.net/problem/13096)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 26, 맞힌 사람: 20, 정답 비율: 31.746%

### 분류

쌍대성, 그리디 알고리즘, 배낭 문제, 선형 계획법, 수학, 삼분 탐색

### 문제 설명

<p>We have planted N flower seeds, all of which come into different flowers. We want to make all the flowers come out together.</p>

<p>Each plant has a value called vitality, which is initially zero. Watering and spreading fertilizers cause changes on it, and the i-th plant will come into flower if its vitality is equal to or greater than th<sub>i</sub>. Note that th<sub>i</sub> may be negative because some flowers require no additional nutrition.</p>

<p>Watering effects on all the plants. Watering the plants with W liters of water changes the vitality of the i-th plant by W&times;vwi for all i (1&le;i&le;n), and costs W&times;pw yen, where W need not be an integer. vwi may be negative because some flowers hate water.</p>

<p>We have N kinds of fertilizers, and the i-th fertilizer effects only on the i-th plant. Spreading F<sub>i</sub> kilograms of the i-th fertilizer changes the vitality of the i-th plant by F<sub>i</sub>&times;vf<sub>i</sub>, and costs F<sub>i</sub>&times;pf<sub>i</sub> yen, where F<sub>i</sub> need not be an integer as well. Each fertilizer is specially made for the corresponding plant, therefore vf<sub>i</sub> is guaranteed to be positive.</p>

<p>Of course, we also want to minimize the cost. Formally, our purpose is described as &quot;to minimize W &times; pw + &sum;<sup>N</sup><sub>i=1</sub>(F<sub>i</sub>&times;pf<sub>i</sub>) under W &times; vw<sub>i</sub> + F<sub>i</sub> &times; vf<sub>i</sub> &ge; th<sub>i</sub>, W &ge; 0, and F<sub>i&nbsp;</sub>&ge; 0 for all i (1 &le; i &le; N)&quot;. Your task is to calculate the minimum cost.</p>

### 입력

<p>The input consists of multiple datasets. The number of datasets does not exceed 100, and the data size of the input does not exceed 20MB. Each dataset is formatted as follows.</p>

<pre>
N
pw
vw<sub>1</sub> pf<sub>1</sub> vf<sub>1</sub> th<sub>1</sub>
:
:
vw<sub>N</sub> pf<sub>N</sub> vf<sub>N</sub> th<sub>N</sub></pre>

<p>The first line of a dataset contains a single integer N, number of flower seeds. The second line of a dataset contains a single integer pw, cost of watering one liter. Each of the following N lines describes a flower. The i-th line contains four integers, vw<sub>i</sub>, pf<sub>i</sub>, vf<sub>i</sub>, and th<sub>i</sub>, separated by a space.</p>

<p>You can assume that 1 &le; N &le; 10<sup>5</sup>, 1 &le; pw &le; 100, &minus;100 &le; vw<sub>i</sub> &le; 100, 1 &le; pf<sub>i</sub> &le; 100, 1 &le; vf<sub>i </sub>&le; 100, and &minus;100 &le; th<sub>i</sub> &le; 100.</p>

<p>The end of the input is indicated by a line containing a zero.</p>

### 출력

<p>For each dataset, output a line containing the minimum cost to make all the flowers come out. The output must have an absolute or relative error at most 10<sup>&minus;4</sup>.</p>

<p>&nbsp;</p>