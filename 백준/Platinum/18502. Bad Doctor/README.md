# [Platinum II] Bad Doctor - 18502

[문제 링크](https://www.acmicpc.net/problem/18502)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 34, 맞힌 사람: 30, 정답 비율: 44.776%

### 분류

누적 합, 스위핑

### 문제 설명

<p>Alex got sick. He went to a clinic and visited n doctors. The i-th doctor said that starting with the day l<sub>i</sub> and ending with the day r<sub>i</sub> Alex must take k<sub>i</sub> medicines: a<sub>1</sub>, a<sub>2</sub>, . . ., a<sub>k<sub>i</sub></sub>, one pill a day of each. Medicines are numbered from 1 to m.</p>

<p>Of course, if several doctors tell Alex to take the same medicine at the same day, he will take only one pill of this medicine that day. At least, this is how people act in real life.</p>

<p>One pill of the medicine j costs c<sub>j</sub> roubles. But Alex has a doubt: the rumors say that one of the doctors in the clinic is really bad. He doesn&rsquo;t know which doctor is bad, but he decided to ignore this doctor&rsquo;s prescription.</p>

<p>Your task is to find n numbers t<sub>i</sub>: know how much money Alex will spend on the pills if the i-th doctor is bad.</p>

### 입력

<p>The first line contains two integers n and m: the number of doctors and the number of medicines (1 &le; n &le; 500 000, 1 &le; m &le; 500 000).</p>

<p>The second line contains m integers c<sub>j</sub>: the cost of one pill of the j-th medicine (1 &le; c<sub>j</sub> &le; 1 000 000).</p>

<p>Each of the next n lines describes doctors. The i-th of them starts with three integers l<sub>i</sub>, r<sub>i</sub>, k<sub>i</sub>: the start and end days in the i-th doctor&rsquo;s prescription and the number of medicines he told Alex to take (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; 1 000 000, 1 &le; k<sub>i</sub> &le; m). Then follow k<sub>i</sub> distinct integers a<sub>1</sub>, a<sub>2</sub>, . . ., a<sub>k<sub>i</sub></sub>, each from 1 to m: the medicines in the prescription.</p>

<p>The sum of all k<sub>i</sub> in the input doesn&rsquo;t exceed 1 000 000.</p>

### 출력

<p>Output n integers t<sub>1</sub>, t<sub>2</sub>, . . ., t<sub>n</sub>: how much money Alex will spend on the pills if he ignores the i-th doctor&rsquo;s prescription.</p>