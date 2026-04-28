# [Gold II] Balance Scale - 17579

[문제 링크](https://www.acmicpc.net/problem/17579)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 162, 정답: 37, 맞힌 사람: 34, 정답 비율: 26.562%

### 분류

백트래킹, 브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 구현, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>You, an experimental chemist, have a balance scale and a kit of weights for measuring weights of powder chemicals.</p>

<p>For work efficiency, a single use of the balance scale should be enough for measurement of each amount. You can use any number of weights at a time, placing them either on the balance plate opposite to the chemical or on the same plate with the chemical. For example, if you have two weights of 2 and 9 units, you can measure out not only 2 and 9 units of the chemical, but also 11 units by placing both on the plate opposite to the chemical (Fig. C-1 left), and 7 units by placing one of them on the plate with the chemical (Fig. C-1 right). These are the only amounts that can be measured out efficiently.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17579.%E2%80%85Balance%E2%80%85Scale/e548a6f3.png" data-original-src="https://upload.acmicpc.net/458379d7-ffae-41ae-9fa0-98ede53e6fa4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 140px;" /></p>

<p style="text-align: center;">Fig. C-1 Measuring 11 and 7 units of chemical</p>

<p>You have at hand a list of amounts of chemicals to measure today. The weight kit already at hand, however, may not be enough to efficiently measure all the amounts in the measurement list. If not, you can purchase one single new weight to supplement the kit, but, as heavier weights are more expensive, you&#39;d like to do with the lightest possible.</p>

<p>Note that, although weights of arbitrary positive masses are in the market, none with negative masses can be found.</p>

### 입력

<p>The input consists of at most 100 datasets, each in the following format.</p>

<pre>
<i>n m</i>
<i>a</i><sub>1</sub> <i>a</i><sub>2</sub> ... <i>a<sub>n</sub></i>
<i>w</i><sub>1</sub> <i>w</i><sub>2</sub> ... <i>w<sub>m</sub></i></pre>

<p>The first line of a dataset has <i>n</i> and <i>m</i>, the number of amounts in the measurement list and the number of weights in the weight kit at hand, respectively. They are integers separated by a space satisfying 1 &le; <i>n</i> &le; 100 and 1 &le; <i>m</i> &le; 10.</p>

<p>The next line has the <i>n</i> amounts in the measurement list, <i>a</i><sub>1</sub> through <i>a<sub>n</sub>,</i> separated by spaces. Each of <i>a<sub>i</sub></i> is an integer satisfying 1 &le; <i>a<sub>i</sub></i> &le; 10<sup>9</sup>, and <i>a<sub>i</sub></i> &ne; <i>a<sub>j</sub></i> holds for <i>i</i> &ne; <i>j</i>.</p>

<p>The third and final line of a dataset has the list of the masses of the <i>m</i> weights at hand, <i>w</i><sub>1</sub> through <i>w<sub>m</sub>,</i> separated by spaces. Each of <i>w<sub>j</sub></i> is an integer, satisfying 1 &le; <i>w<sub>j</sub></i> &le; 10<sup>8</sup>. Two or more weights may have the same mass.</p>

<p>The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each dataset, output a single line containing an integer specified as follows.</p>

<ul>
	<li>If all the amounts in the measurement list can be measured out without any additional weights, <code>0</code>.</li>
	<li>If adding one more weight will make all the amounts in the measurement list measurable, the mass of the lightest among such weights. The weight added may be heavier than 10<sup>8</sup> units.</li>
	<li>If adding one more weight is never enough to measure out all the amounts in the measurement list, <code>-1</code>.</li>
</ul>